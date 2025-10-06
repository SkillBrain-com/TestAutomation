package org.skillbrain.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.skillbrain.utilities.TestContextSetup;

import java.io.File;
import java.io.IOException;

public class Hooks {

    private TestContextSetup testContextSetup;

    public Hooks(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @After
    public void afterScenario() {
        testContextSetup.getDriver().quit();
    }

    @AfterStep
    public void takeScreenshot(Scenario scenario) {
        WebDriver webDriver = testContextSetup.getDriver();
        if (scenario.isFailed()) {
            File source = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
            try {
                byte [] bytes = FileUtils.readFileToByteArray(source);
                scenario.attach(bytes, "image/png", "image");
            } catch (IOException e) {
                e.printStackTrace();
            }
//testContextSetup.getDriver().quit();
        }
    }

}
