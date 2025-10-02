package org.skillbrain.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class BasePage {

    WebDriver driver;
    WebDriverWait driverWait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, driver);
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void smoothScrollToBottom(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        long lastHeight = (long) js.executeScript("return document.body.scrollHeight");

        for (int i = 0; i < lastHeight; i += 500) {
            js.executeScript("window.scrollBy(0, 500);");

            long finalLastHeight = lastHeight;
            new WebDriverWait(driver, Duration.ofSeconds(2))
                    .until((ExpectedCondition<Boolean>) d -> {
                        long newHeight = (long) js.executeScript("return document.body.scrollHeight");
                        return newHeight > finalLastHeight || ((JavascriptExecutor) d).executeScript("return window.scrollY + window.innerHeight;").equals(newHeight);
                    });

            lastHeight = (long) js.executeScript("return document.body.scrollHeight");
        }
    }

    public void waitForText(String text, Duration duration) {
        By xpath = By.xpath(String.format("//*[contains(text(), '%s')]", text));
        driverWait = new WebDriverWait(driver, duration);
        driverWait.until(ExpectedConditions.presenceOfElementLocated(xpath));
    }

    public void waitForVisibility(WebElement element, Duration duration) {
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClick(WebElement element, Duration duration) {
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void setWait() {
        if (driverWait == null) {
            driverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        }
    }

    public WebDriverWait getDriverWait() {
        return driverWait;
    }

    public void switchToSecondWindow() {
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String parentWindow = iterator.next();
        String secondWindow = iterator.next();
        driver.switchTo().window(secondWindow);
    }
}



