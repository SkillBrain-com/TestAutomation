package org.skillbrain.page.echipa1.defaulthub;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;
import org.testng.Assert;

import java.time.Duration;
import java.util.Map;

public class DefaultHubCustomerFormPage extends BasePage {

    private WebDriver driver;

    public DefaultHubCustomerFormPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(css = "input[name=\"email\"]")
    private WebElement emailField;
    @FindBy(css = "input[name=\"billing[name]\"]")
    private WebElement nameField;
    @FindBy(css = "input[name=\"billing[address][address]\"]")
    private WebElement addressField;
    @FindBy(css = "select[name=\"billing[address][id_country]\"]")
    private WebElement countryDropdown;
    @FindBy(css = "select[name=\"billing[address][id_state]\"]")
    private WebElement stateDropdown;
    @FindBy(css = "input[name=\"billing[address][city]\"]")
    private WebElement cityField;

    @FindBy(xpath = "(//button[normalize-space()='Continue'])[3]")
    private WebElement oldContinueButton;
    @FindBy(xpath = "//button[normalize-space()='Autoprocess']")
    private WebElement oldAutoProcButton;

    @FindBy(xpath = "//p[normalize-space()='Registration Confirmed - Welcome Aboard!']")
    private WebElement defaultHubOrderLabel;

    public void fillOldCustomerForm(Map<String, String> data) {
        waitForClick(emailField, Duration.ofSeconds(10));

        emailField.sendKeys(data.get("email"));
        nameField.sendKeys(data.get("name"));
        addressField.sendKeys(data.get("address"));
        countryDropdown.sendKeys(data.get("country"));
        countryDropdown.sendKeys(Keys.ENTER);
        stateDropdown.sendKeys(data.get("state"));
        stateDropdown.sendKeys(Keys.ENTER);
        cityField.sendKeys(data.get("city"));
    }

    public void clickOldContinueButton() {
        waitForClick(oldContinueButton, Duration.ofSeconds(10));
        oldContinueButton.click();
    }

    public void clickOldAutoProcRadioButton() {
        waitForClick(oldAutoProcButton, Duration.ofSeconds(10));
        oldAutoProcButton.click();
    }

    public void assertDefaultOrderCompleted() {
        String expectedMessage = "Registration Confirmed - Welcome Aboard!";
        waitForText(expectedMessage, Duration.ofSeconds(10));
        Assert.assertEquals(defaultHubOrderLabel.getText(),expectedMessage, "Order failed!");
    }
}