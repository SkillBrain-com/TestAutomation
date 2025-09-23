package org.skillbrain.page.echipa1.oveithub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;
import org.testng.Assert;

import java.time.Duration;

public class OveitHubGuestFormPage extends BasePage {

    private WebDriver driver;

    public OveitHubGuestFormPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Reserve now']")
    private WebElement reserveNowButton;
    @FindBy(xpath = "//button[normalize-space()='Register']")
    private WebElement registerButton;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement guestEmailField;

    @FindBy(xpath = "//p[normalize-space()='Registration Confirmed - Welcome Aboard!']")
    private WebElement registrationLabel;

    public void clickReserveNowButton() {
        waitForClick(reserveNowButton, Duration.ofSeconds(10));
        reserveNowButton.click();
    }

    public void fillGuestEmailField(String email) {
        waitForClick(guestEmailField, Duration.ofSeconds(10));
        guestEmailField.sendKeys(email);
    }

    public void clickRegisterButton() {
        waitForClick(registerButton, Duration.ofSeconds(10));
        registerButton.click();
    }

    public void assertGuestRegistration() {
        waitForVisibility(registrationLabel, Duration.ofSeconds(30));
        String expectedMessage = "Registration Confirmed - Welcome Aboard!";
        Assert.assertEquals(registrationLabel.getText(), expectedMessage, "The registration failed !");
    }
}