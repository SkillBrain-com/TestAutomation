package org.skillbrain.utilities;

import org.openqa.selenium.WebDriver;

public class TestContextSetup {

    public WebDriver driver;
    public WebDriverConfig webDriverConfig;
    public PageObjectFactory pageObjectFactory;


    public TestContextSetup() {
        webDriverConfig = new WebDriverConfig();
        driver = webDriverConfig.getDriver();
        pageObjectFactory = new PageObjectFactory(driver);
    }


    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverConfig getWebDriverConfig() {
        return webDriverConfig;
    }
}
