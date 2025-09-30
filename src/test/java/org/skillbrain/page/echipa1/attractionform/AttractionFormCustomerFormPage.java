package org.skillbrain.page.echipa1.attractionform;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;

import java.time.Duration;

public class AttractionFormCustomerFormPage extends BasePage {

    private WebDriver driver;

    public AttractionFormCustomerFormPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//li[@data-step=\"customer_fields\"]")
    private WebElement customerFormTabButton;

    @FindBy(xpath = "//button[@data-role=\"field-add\"]")
    private WebElement newCustomFieldButton;

    @FindBy(xpath = "(//input[@type=\"checkbox\"])[2]")
    private WebElement mandatoryCheckBox;
    @FindBy(xpath = "(//input[@type=\"checkbox\"])[6]")
    private WebElement mandatoryThirdCheckBox;
    @FindBy(xpath = "(//input[@type=\"checkbox\"])[10]")
    private WebElement mandatoryFifthCheckBox;

    @FindBy(xpath = "(//input[@type=\"text\"])[1]")
    private WebElement customTextField;
    @FindBy(xpath = "(//input[@type=\"text\"])[2]")
    private WebElement secondCustomTextField;
    @FindBy(xpath = "(//input[@type=\"text\"])[3]")
    private WebElement thirdCustomTextField;
    @FindBy(xpath = "(//input[@type=\"text\"])[4]")
    private WebElement forthCustomTextField;
    @FindBy(xpath = "(//input[@type=\"text\"])[5]")
    private WebElement fifthCustomTextField;
    @FindBy(xpath = "(//input[@type=\"text\"])[6]")
    private WebElement sixthCustomTextField;

    @FindBy(xpath = "(//select[@class='standard-input'])[2]/option[@value=\"textarea\"]")
    private WebElement secondCustomTextFieldDropdown;
    @FindBy(xpath = "(//select[@class='standard-input'])[3]/option[@value=\"email\"]")
    private WebElement thirdCustomTextFieldDropdown;
    @FindBy(xpath = "(//select[@class='standard-input'])[4]/option[@value=\"date\"]")
    private WebElement forthCustomTextFieldDropdown;
    @FindBy(xpath = "(//select[@class='standard-input'])[5]/option[@value=\"select\"]")
    private WebElement fifthCustomTextFieldDropdown;
    @FindBy(xpath = "(//div[@rel=\"options-select\"])[5]/textarea")
    private WebElement textAreaMultiField;
    @FindBy(xpath = "(//div[@rel=\"options-select\"])[5]//input[@type=\"checkbox\"]")
    private WebElement multiSelectionCheckBox;
    @FindBy(xpath = "(//select[@class='standard-input'])[6]/option[@value=\"checkbox\"]")
    private WebElement sixthCustomTextFieldDropdown;

    public void clickCustomerFormTabButton() {
        driver.navigate().refresh();
        waitForClick(customerFormTabButton, Duration.ofSeconds(10));
        customerFormTabButton.click();
    }

    public void clickNewCustomFieldButton() {
        waitForClick(newCustomFieldButton, Duration.ofSeconds(10));
        newCustomFieldButton.click();
    }

    public void fillFirstCustomTextField(String name) {
        waitForClick(customTextField, Duration.ofSeconds(10));
        scrollToElement(customTextField);
        customTextField.sendKeys(name);
    }

    public void fillSecondCustomTextField(String name) {
        waitForClick(secondCustomTextField, Duration.ofSeconds(10));
        scrollToElement(secondCustomTextField);
        secondCustomTextField.sendKeys(name);
    }

    public void fillThirdCustomTextField(String name) {
        waitForClick(thirdCustomTextField, Duration.ofSeconds(10));
        scrollToElement(thirdCustomTextField);
        thirdCustomTextField.sendKeys(name);
    }

    public void fillForthCustomTextField(String name) {
        waitForClick(forthCustomTextField, Duration.ofSeconds(10));
        scrollToElement(forthCustomTextField);
        forthCustomTextField.sendKeys(name);
    }

    public void fillFifthCustomTextField(String name) {
        waitForClick(fifthCustomTextField, Duration.ofSeconds(10));
        scrollToElement(fifthCustomTextField);
        fifthCustomTextField.sendKeys(name);
    }

    public void fillSixthCustomTextField(String name) {
        waitForClick(sixthCustomTextField, Duration.ofSeconds(10));
        scrollToElement(sixthCustomTextField);
        sixthCustomTextField.sendKeys(name);
    }

    public void clickSecondCustomFieldDropdown() {
        waitForVisibility(secondCustomTextFieldDropdown, Duration.ofSeconds(10));
        secondCustomTextFieldDropdown.click();
    }

    public void clickThirdCustomFieldDropdown() {
        waitForVisibility(thirdCustomTextFieldDropdown, Duration.ofSeconds(10));
        thirdCustomTextFieldDropdown.click();
    }

    public void clickForthCustomFieldDropdown() {
        waitForVisibility(forthCustomTextFieldDropdown, Duration.ofSeconds(10));
        forthCustomTextFieldDropdown.click();
    }

    public void clickFifthCustomFieldDropdown() {
        waitForVisibility(fifthCustomTextFieldDropdown, Duration.ofSeconds(10));
        fifthCustomTextFieldDropdown.click();
    }

    public void clickSixthCustomFieldDropdown() {
        waitForClick(sixthCustomTextFieldDropdown, Duration.ofSeconds(10));
        sixthCustomTextFieldDropdown.click();
    }

    public void clickMultipleSelectCheckBox() {
        waitForClick(multiSelectionCheckBox, Duration.ofSeconds(10));
        scrollToElement(multiSelectionCheckBox);
        multiSelectionCheckBox.click();
    }

    public void fillMultiLineValuesField(String multiLineText) {
        waitForClick(textAreaMultiField, Duration.ofSeconds(10));
        scrollToElement(textAreaMultiField);
        for (String line : multiLineText.split("\\R")) {
            textAreaMultiField.sendKeys(line);
            textAreaMultiField.sendKeys(Keys.ENTER);
        }
    }

    public void clickMandatoryCheckBox() {
        waitForClick(mandatoryCheckBox, Duration.ofSeconds(10));
        scrollToElement(mandatoryCheckBox);
        mandatoryCheckBox.click();
    }

    public void clickMiddleMandatoryButton() {
        waitForClick(mandatoryThirdCheckBox, Duration.ofSeconds(10));
        scrollToElement(mandatoryThirdCheckBox);
        mandatoryThirdCheckBox.click();
    }

    public void clickLastMandatoryButton() {
        waitForClick(mandatoryFifthCheckBox, Duration.ofSeconds(10));
        scrollToElement(mandatoryFifthCheckBox);
        mandatoryFifthCheckBox.click();
    }
}
