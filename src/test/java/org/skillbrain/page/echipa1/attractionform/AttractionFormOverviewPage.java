package org.skillbrain.page.echipa1.attractionform;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;

import java.time.Duration;

public class AttractionFormOverviewPage extends BasePage {

    private WebDriver driver;

    public AttractionFormOverviewPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Next'] //parent::button")
    private WebElement nextButton;
    @FindBy(css = "label[for='date-interval']")
    private WebElement dateIntervalRadioButton;

    @FindBy(xpath = "//input[@name=\"features[fields]\"]")
    private WebElement guestFormCheckBox;
    @FindBy(xpath = "//input[@name=\"features[customer_fields]\"]")
    private WebElement customerFormCheckBox;

    @FindBy(xpath = "//input[@name=\"start_date\"]")
    private WebElement startDateComboBox;
    @FindBy(xpath = "//input[@name=\"start_time\"]")
    private WebElement startTimeComboBox;

    @FindBy(xpath = "//span[contains(text(), 'Location')]")
    private WebElement locationAccordion;
    @FindBy(xpath = "//span[contains(text(), \"Advanced settings\")]/ancestor::div[2]")
    private WebElement advancedSettingsAccordion;

    @FindBy(xpath = "//input[@name=\"name\"]")
    private WebElement attractionNameField;
    @FindBy(xpath = "//input[@name=\"location\"]")
    private WebElement locationNameField;



    public void fillAttractionName(String name) {
        attractionNameField.sendKeys(name);
    }

    public void clickDateIntervalRadioButton() {
        dateIntervalRadioButton.click();
    }

    public void fillStartDateBox(String date) {
        startDateComboBox.sendKeys(date);
        startDateComboBox.sendKeys(Keys.ENTER);
    }

    public void fillStartTimeBox(String time) {
        startTimeComboBox.sendKeys(time);
        startTimeComboBox.sendKeys(Keys.ENTER);
    }

    public void clickOnLocationAccordion() {
        locationAccordion.click();
    }

    public void fillLocationName(String locationName) {
        waitForVisibility(locationNameField, Duration.ofSeconds(10));
        scrollToElement(locationNameField);

        locationNameField.sendKeys(locationName);
    }

    public void clickAdvancedSettings() {
        advancedSettingsAccordion.click();
    }

    public void clickGuestFormCheckbox() {
        waitForVisibility(guestFormCheckBox, Duration.ofSeconds(10));
        scrollToElement(guestFormCheckBox);
        guestFormCheckBox.click();
    }

    public void clickCustomerFormCheckbox() {
        waitForVisibility(customerFormCheckBox, Duration.ofSeconds(10));
        scrollToElement(customerFormCheckBox);
        customerFormCheckBox.click();
    }

    public void clickNextButton() {
        waitForClick(nextButton, Duration.ofSeconds(10));
        nextButton.click();
    }
}
