package org.skillbrain.page.echipa1.merchant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.skillbrain.page.BasePage;

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

}