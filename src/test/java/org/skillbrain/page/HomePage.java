package org.skillbrain.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class HomePage extends BasePage {

    private WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Create attraction']")
    private WebElement createEventButton;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    public void checkUserIsLoggedIn() {
        waitForText("My attractions", Duration.ofSeconds(10));
        Assert.assertTrue(createEventButton.isDisplayed());
    }
}
