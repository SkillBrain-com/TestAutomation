package org.skillbrain.page.echipa1.merchant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.skillbrain.page.BasePage;
import org.testng.Assert;

import java.time.Duration;

public class StripePaymentPage extends BasePage {

    private WebDriver driver;

    public StripePaymentPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Pay without Link')]")
    private WebElement skipLinkButton;
    @FindBy(xpath = "//button[@data-testid=\"hosted-payment-submit-button\"]")
    private WebElement payPaymentButton;

    @FindBy(id = "email")
    private WebElement emailPaymentField;
    @FindBy(id = "cardNumber")
    private WebElement cardNrField;
    @FindBy(id = "cardExpiry")
    private WebElement cardExpiryField;
    @FindBy(id = "cardCvc")
    private WebElement cardCvcField;
    @FindBy(id = "billingName")
    private WebElement billingNameField;
    @FindBy(id = "billingCountry")
    private WebElement billingCountryDropdown;
    @FindBy(id = "billingPostalCode")
    private WebElement billingPostalCodeField;

    @FindBy(xpath = "//input[@id='one-time-code']")
    private WebElement firstDigit;
    @FindBy(xpath = "//input[@aria-label='one-time-code-input-1']")
    private WebElement secondDigit;
    @FindBy(xpath = "//input[@aria-label='one-time-code-input-2']")
    private WebElement thirdDigit;
    @FindBy(xpath = "//input[@aria-label='one-time-code-input-3']")
    private WebElement fourthDigit;
    @FindBy(xpath = "//input[@aria-label='one-time-code-input-4']")
    private WebElement fifthDigit;
    @FindBy(xpath = "//input[@aria-label='one-time-code-input-5']")
    private WebElement sixthDigit;

    @FindBy(xpath = "//h2[normalize-space()='✅ Order complete']")
    private WebElement orderCompleteLabel;

    public void fillPaymentMethod(String email, String cardNr, String cardExpiry, String cardCvc, String cardholderName, String billingCountry, String zipCode) {
        waitForClick(emailPaymentField,Duration.ofSeconds(10));
        emailPaymentField.sendKeys(email);
        cardNrField.sendKeys(cardNr);
        cardExpiryField.sendKeys(cardExpiry);
        cardCvcField.sendKeys(cardCvc);
        billingNameField.sendKeys(cardholderName);
        Select country = new Select(billingCountryDropdown);
        country.selectByValue(billingCountry);
        billingPostalCodeField.sendKeys(zipCode);
    }

    public void clickPayPaymentButton() {
        waitForClick(payPaymentButton, Duration.ofSeconds(10));
        payPaymentButton.click();
    }

    public void assertOveitOrderCompleted() {
        waitForText("✅ Order complete", Duration.ofSeconds(30));
        Assert.assertEquals(orderCompleteLabel.getText(), "✅ Order complete");
    }
}