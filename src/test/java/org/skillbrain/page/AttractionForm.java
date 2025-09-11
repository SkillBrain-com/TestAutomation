package org.skillbrain.page;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

//TODO MERGE DUPLICATE SELECTORS
public class AttractionForm extends BasePage {

    private WebDriver driver;

    public AttractionForm(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Next'] //parent::button")
    private WebElement nextButton;
    @FindBy(xpath = "//a[contains(normalize-space(.), 'Preview & Publish')]")
    private WebElement papTabButton;
    @FindBy(xpath = "//span[normalize-space()='Create ticket'] //parent::button")
    private WebElement createTicketButton;
    @FindBy(xpath = "//button[@data-label=\"Save\"][1]")
    private WebElement ticketSaveButton;
    @FindBy(xpath = "//button[@data-slot='button'][2]")
    private WebElement addButton;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    private WebElement continueButton;
    @FindBy(xpath = "//p[contains(text(), 'Autoprocess')] //parent::div")
    private WebElement autoprocButton;
    @FindBy(xpath = "//button[normalize-space()='Pay']")
    private WebElement payButton;
    @FindBy(xpath = "//span[contains(text(), 'Location')]")
    private WebElement locationAccordion;
    @FindBy(xpath = "//iframe[@id='oveit-hub-iframe']")
    private WebElement iframe;
    @FindBy(css = "input#react-select-3-input")
    private WebElement stateDropdown;
    @FindBy(xpath = "//input[@name=\"name\"]")
    private WebElement attractionNameField;
    @FindBy(xpath = "//input[@name=\"location\"]")
    private WebElement locationNameField;
    @FindBy(xpath = "//input[@placeholder=\"e.g. VIP Area, Entry ticket, etc.\"]")
    private WebElement ticketNameField;
    @FindBy(xpath = "//input[@name=\"price[0]\"]")
    private WebElement ticketPriceField;
    @FindBy(css = "input[name=\"email\"]")
    private WebElement emailField;
    @FindBy(css = "input[name=\"name\"]")
    private WebElement nameField;
    @FindBy(css = "input[name=\"city\"]")
    private WebElement cityField;
    @FindBy(css = "input[name=\"address\"]")
    private WebElement addressField;
    @FindBy(xpath = "//h2[normalize-space()=\"Tickets\"]")
    private WebElement ticketsLabel;
    @FindBy(xpath = "//h2[normalize-space()=\"My billing information\"]")
    private WebElement billingLabel;
    @FindBy(xpath = "//h2[normalize-space()='✅ Order complete']")
    private WebElement orderCompleteLabel;
    @FindBy(css = ".ticket-type-form-options")
    private WebElement advancedTicketOptions;

    public WebElement getOrderCompleteLabel() {
        return orderCompleteLabel;
    }

    public void fillAttractionName(String attractionName) {
        attractionNameField.sendKeys("Ramona_test");
    }

    public void clickOnLocationAccordion() {
        locationAccordion.click();
    }

    public void fillLocationName(String locationName) {
        waitForVisibility(locationNameField, Duration.ofSeconds(10));
        scrollToElement(locationNameField);

        locationNameField.sendKeys("Cluj");
    }


    @Override
    public WebDriverWait getDriverWait() {
        return super.getDriverWait();
    }

    @FindBy(xpath = "//span[normalize-space()='Next'] //parent::button")
    private WebElement nextButton1;
    @FindBy(css = "input[name=\"name\"]")
    private WebElement attractionNameField1;
    @FindBy(xpath = ("//*[normalize-space(text())='Location']"))
    private WebElement locationDropDown;
    @FindBy(xpath = ("//input[@name='location' and @type='text']"))
    private WebElement attractionLocationField;
    @FindBy(css = "img[alt=\"Location pin\"]")
    WebElement mapPin;
    @FindBy(css = "div[aria-label='Hartă'][role='region']")
    WebElement map;

    public void clickOnNext() {
        nextButton1.click();

        waitForVisibility(createTicketButton, Duration.ofSeconds(10));
    }

    public void clickOnCreateTicket() {
        createTicketButton.click();

        waitForVisibility(ticketNameField, Duration.ofSeconds(10));
    }

    public void fillTicketName(String ticketName) {
        ticketNameField.sendKeys("Ramona_test");
    }

    public void fillTicketPrice(String ticketPrice) {
        ticketPriceField.clear();
        ticketPriceField.sendKeys("11");
    }

    public void fillAttractionMandatory(String name, String location) {
        waitForText("Attraction name", Duration.ofSeconds(5));
        attractionNameField1.sendKeys(name);
        locationDropDown.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        attractionLocationField.sendKeys(location);
    }


    public void clickOnTicketSave() {
        ticketSaveButton.click();

        waitForVisibility(ticketsLabel, Duration.ofSeconds(10));
    }

    public void clickOnPaPTab() {
        papTabButton.click();
    }

    public void clickOnAddButton() {
        driver.switchTo().frame(iframe);
        waitForVisibility(addButton, Duration.ofSeconds(10));

        addButton.click();
    }

    public void clickOnContinueButton() {
        waitForVisibility(addButton, Duration.ofSeconds(10));

        continueButton.click();

        waitForVisibility(billingLabel, Duration.ofSeconds(20));
        driver.switchTo().defaultContent();
    }

    public void fillCustomerForm(String info) {
        driver.switchTo().frame(iframe);

        emailField.sendKeys("a@test.ro");
        nameField.sendKeys("Ramona_test");
        stateDropdown.sendKeys("Alabama");
        stateDropdown.sendKeys(Keys.ENTER);
        cityField.sendKeys("Pandora");
        addressField.sendKeys("Aleea Astrei");
    }

    public void clickOnAutoProcButton() {
        waitForVisibility(autoprocButton, Duration.ofSeconds(10));
        scrollToElement(autoprocButton);
        autoprocButton.click();
    }

    public void clickOnPayButton() {
        scrollToElement(payButton);
        payButton.click();
        driver.switchTo().defaultContent();
    }

    public void assertOrderCompleted() {
        driver.switchTo().frame(iframe);

        waitForText("✅ Order complete", Duration.ofSeconds(30));
        Assert.assertEquals(getOrderCompleteLabel().getText(), "✅ Order complete");

        driver.switchTo().defaultContent();
    }

    // RAMONA
//    @FindBy(xpath= "//span[contains(text(),'Ticket configuration')]")
    @FindBy(xpath = "//span[contains(text(),'Ticket configuration')] //parent::div")
    private WebElement ticketConfigurationButton;

    @FindBy(xpath = "//span[contains(.,'Ticket visibility')]")
    private WebElement ticketVisibilityButton;

    @FindBy(css = "input[name='visibility'][value='private']")
    private WebElement privateInvitationButton;

    @FindBy(css = "input[placeholder='e.g. CNBvXh7d']")
    private WebElement invitationCode;

    @FindBy(xpath = "//button[.//span[normalize-space()='Next']]")
    private WebElement nextButton3;


    public void clickTicketConfiguration() {
        waitForVisibility(ticketConfigurationButton, Duration.ofSeconds(10));
        scrollToElement(ticketConfigurationButton);
        setWait();
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.elementToBeClickable(ticketConfigurationButton)).click();
        try {
//            driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".ticket-type-form-options")));
            driverWait.until(ExpectedConditions.visibilityOfAllElements(advancedTicketOptions));
        } catch (TimeoutException e) {
            driverWait.until(ExpectedConditions.elementToBeClickable(ticketConfigurationButton)).click();
        }
//        ticketConfigurationButton.click();
    }

    public void clickOnTicketVisibility() {
        scrollToElement(ticketVisibilityButton);
        ticketVisibilityButton.click();
    }

    public void clickOnPrivateInvitation() {
        waitForVisibility(privateInvitationButton, Duration.ofSeconds(10));
        setWait();
        WebDriverWait driverWait = getDriverWait();
        privateInvitationButton.click();
    }

    public void fillTheInvitationCode() {
        waitForVisibility(invitationCode, Duration.ofSeconds(10));
        setWait();
        WebDriverWait driverWait = getDriverWait();
        invitationCode.sendKeys("1234");
    }

    public void ClickAgainOnNextButton() {
        scrollToElement(nextButton3);
        waitForVisibility(nextButton3, Duration.ofSeconds(10));
        setWait();
        WebDriverWait driverWait = getDriverWait();
        nextButton3.click();
    }

    public void insertTheString() {

    }

    public void insertTheEmailAdress() {
    }

    public void clickOnRegistredButton() {
    }

    public void clickOnPublishAttraction() {
    }
}



