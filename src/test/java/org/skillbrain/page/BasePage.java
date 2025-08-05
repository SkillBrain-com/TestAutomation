package org.skillbrain.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait driverWait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, driver);
    }

    public void waitForText(String text, Duration duration) {
        By xpath = By.xpath(String.format("//*[contains(text(), '%s')]", text));
        driverWait = new WebDriverWait(driver, duration);
        driverWait.until(ExpectedConditions.presenceOfElementLocated(xpath));
    }


}
