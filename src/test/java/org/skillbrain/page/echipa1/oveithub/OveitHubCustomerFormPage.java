package org.skillbrain.page.echipa1.oveithub;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;

import java.time.Duration;
import java.util.Map;

import static org.testng.Assert.assertTrue;

public class OveitHubCustomerFormPage extends BasePage {

    private WebDriver driver;

    public OveitHubCustomerFormPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//p[normalize-space()='20 x Simple Ticket']")
    private WebElement orderQuantityLabel;

    @FindBy(css = "input[name=\"email\"]")
    private WebElement emailField;
    @FindBy(css = "input[name=\"name\"]")
    private WebElement nameField;
    @FindBy(css = "input#react-select-2-input")
    private WebElement countryDropdown;
    @FindBy(css = "input#react-select-3-input")
    private WebElement stateDropdown;
    @FindBy(css = "input[name=\"city\"]")
    private WebElement cityField;
    @FindBy(css = "input[name=\"address\"]")
    private WebElement addressField;

    @FindBy(xpath = "(//input[@type=\"text\"])[7]")
    private WebElement firstCustomerCustomField;
    @FindBy(xpath = "//textarea")
    private WebElement secondCustomerCustomField;
    @FindBy(xpath = "(//input[@type=\"text\"])[8]")
    private WebElement thirdCustomerCustomField;
    @FindBy(xpath = "//input[@type=\"date\"]")
    private WebElement forthCustomerCustomField;
    @FindBy(xpath = "//input[@id='react-select-4-input']")
    private WebElement fifthCustomerCustomField;
    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    private WebElement sixthCustomerCustomField;

    @FindBy(xpath = "//button[normalize-space()='Pay']")
    private WebElement payButton;
    @FindBy(xpath = "//p[contains(text(), 'Autoprocess')] //parent::div")
    private WebElement autoProcButton;

    public void checkTwentyTickets() {
        waitForVisibility(orderQuantityLabel, Duration.ofSeconds(10));
        assertTrue(orderQuantityLabel.getText().contains("20"), "Order summary should contain '20'");
    }

    public void fillSimpleCustomerForm(Map<String, String> data) {
        waitForClick(emailField, Duration.ofSeconds(10));

        emailField.sendKeys(data.get("email"));
        nameField.sendKeys(data.get("name"));
        countryDropdown.sendKeys(data.get("country"));
        countryDropdown.sendKeys(Keys.ENTER);
        stateDropdown.sendKeys(data.get("state"));
        stateDropdown.sendKeys(Keys.ENTER);
        cityField.sendKeys(data.get("city"));
        addressField.sendKeys(data.get("address"));

        if (data.containsKey("phone number")
                && data.get("phone number") != null
                && !data.get("phone number").isBlank()) {
            try {
                scrollToElement(firstCustomerCustomField);
                waitForClick(firstCustomerCustomField, Duration.ofSeconds(10));
                fifthCustomerCustomField.sendKeys(data.get("phone number"));
            } catch (NoSuchElementException e) {
                System.out.println("Campul nu a fost gasit!");
            }
        }

        if (data.containsKey("observations")
                && data.get("observations") != null
                && !data.get("observations").isBlank()) {
            try {
                scrollToElement(secondCustomerCustomField);
                waitForClick(secondCustomerCustomField, Duration.ofSeconds(10));
                secondCustomerCustomField.sendKeys(data.get("observations"));
            } catch (NoSuchElementException e) {
                System.out.println("Campul nu a fost gasit!");
            }
        }

        if (data.containsKey("alt email")
                && data.get("alt email") != null
                && !data.get("alt email").isBlank()) {
            try {
                scrollToElement(thirdCustomerCustomField);
                waitForClick(thirdCustomerCustomField, Duration.ofSeconds(10));
                thirdCustomerCustomField.sendKeys(data.get("alt email"));
            } catch (NoSuchElementException e) {
                System.out.println("Campul nu a fost gasit!");
            }
        }

        if (data.containsKey("booking date")
                && data.get("booking date") != null
                && !data.get("booking date").isBlank()) {
            try {
                scrollToElement(forthCustomerCustomField);
                waitForClick(forthCustomerCustomField, Duration.ofSeconds(10));
                forthCustomerCustomField.sendKeys(data.get("booking date"));
            } catch (NoSuchElementException e) {
                System.out.println("Campul nu a fost gasit!");
            }
        }

        if (data.containsKey("professions")
                && data.get("professions") != null
                && !data.get("professions").isBlank()) {
            try {
                scrollToElement(fifthCustomerCustomField);
                waitForClick(fifthCustomerCustomField, Duration.ofSeconds(10));
                fifthCustomerCustomField.sendKeys(data.get("professions"));
                fifthCustomerCustomField.sendKeys(Keys.ENTER);
            } catch (NoSuchElementException e) {
                System.out.println("Campul nu a fost gasit!");
            }
        }

        if (data.containsKey("smoking")) {
            String smoking = data.get("smoking");
            if ("yes".equalsIgnoreCase(smoking)) {
                try {
                    scrollToElement(sixthCustomerCustomField);
                    waitForClick(sixthCustomerCustomField, Duration.ofSeconds(10));
                    sixthCustomerCustomField.click();
                } catch (NoSuchElementException e) {
                    System.out.println("Bifa nu a fost plasata!");
                }
            }
        }
    }

    public void clickSimplePayButton() {
        Actions actions = new Actions(driver);

        waitForClick(payButton, Duration.ofSeconds(20));
        scrollToElement(payButton);
        actions.moveToElement(payButton)
                .pause(Duration.ofMillis(200))
                .click()
                .perform();
    }

    public void clickSimpleAutoProcRadioButton() {
        waitForClick(autoProcButton, Duration.ofSeconds(10));
        scrollToElement(autoProcButton);
        autoProcButton.click();
    }
}