package org.skillbrain.page;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class BundlesPages extends BasePage {

    @FindBy(xpath = "//button[@data-role='ticket-type-add']")
    private static WebElement createTicketButton;
    @FindBy(css = "li[data-step='ticket_types'] button[name='redirect-to']")
    private WebElement goToticketsTab;
    @FindBy(xpath = "//input[@placeholder='e.g. VIP Area, Entry ticket, etc.']")
    private WebElement ticketNameField;
    @FindBy(xpath = "//input[@data-role='price']")
    private WebElement ticketPriceField;
    @FindBy(xpath = "//input[@name='absorb_fees']")
    private WebElement feesCheckbox;
    @FindBy(xpath = "//span[normalize-space()='Ticket configuration']")
    private WebElement ticketConfiguration;
    @FindBy(css = ".ticket-type-form-options")
    private WebElement ticketOptions;
    @FindBy(xpath = "//span[normalize-space()='Numbering']")
    private WebElement numberingDropDown;
    @FindBy(xpath = "//input[@name = 'limit']")
    private WebElement totalLimitInput;
    @FindBy(xpath = "//input[@name = 'max_order_quantity']")
    private WebElement orderLimitInput;
    @FindBy(css = "button[data-label='Save']")
    private WebElement saveSettings;
    @FindBy(xpath = "//button[@data-role='ticket-bundle-add']")
    private WebElement createBundleButton;
    @FindBy(id = "name")
    private WebElement bundleName;
    @FindBy(id = "price")
    private WebElement bundlePrice;
    @FindBy(xpath = "//button[@data-role='add-ticket-to-bundle']")
    private WebElement includeTicket;
    @FindBy(css = ("div[class = 'selectize-control single']"))
    private WebElement selectizeBundle;
    @FindBy(xpath = "//input[@type = 'number']")
    private WebElement bundleQuantity;
    //@FindBy(css = ".modal-footer")
    //private WebElement bundleOptions;
    //@FindBy(xpath = "//button[@type='submit'][@data-label='save']")
    //private WebElement saveBundleButton;
    @FindBy(xpath = "//span[normalize-space()='Next'] //parent::button")
    private WebElement nextStep;
    @FindBy(xpath = "//button[@data-role='open-checkout-tab']")
    private WebElement openCheckout;
    @FindBy(xpath = "//form[@id='advanced-settings-form']")
    private WebElement checkoutForm;
    @FindBy(xpath = "//form[@id='advanced-settings-form']//input[@name='display_availability']")
    private WebElement displayAvail;
    @FindBy(xpath = "//button[@type='submit'][@name='save']")
    private WebElement saveAvail;
    @FindBy(xpath = "//span[normalize-space()='Next'] //parent::button")
    private WebElement goToPreview;
    @FindBy(css = "h3[class='title-xs mb-[4px] max-w-[180px] md:max-w-[240px]']")
    private WebElement ticket1Preview;





    public BundlesPages(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public void goToTickets() {
        goToticketsTab.click();
    }

    public void clickNewTicket() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createTicketButton.click();
    }
    public void enterTicketName(String Name1) {
        Actions actions = new Actions(driver);
        actions.moveToElement(ticketNameField);
        waitForVisibility(ticketNameField, Duration.ofSeconds(10));
        ticketNameField.click();
        ticketNameField.clear();
        ticketNameField.sendKeys(Name1);
    }
    public void enterPrice(String Price1) {
        ticketPriceField.clear();
        ticketPriceField.sendKeys("1");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ticketPriceField.sendKeys("00");
    }
    public void excludeFees() {
        if (feesCheckbox.isSelected()) {
            feesCheckbox.click();
        } else {

        }
    }
    public void openTicketConfiguration() {
        waitForVisibility(ticketConfiguration, Duration.ofSeconds(5));
        scrollToElement(ticketConfiguration);
        setWait();
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.elementToBeClickable(ticketConfiguration)).click();
        try {
            driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".ticket-type-form-options")));
            driverWait.until(ExpectedConditions.visibilityOfAllElements(ticketOptions));
        } catch (TimeoutException e) {
            driverWait.until(ExpectedConditions.elementToBeClickable(ticketOptions)).click();
        }
    }
    public void openNumbering() {
        waitForVisibility(numberingDropDown, Duration.ofSeconds(10));
        scrollToElement(numberingDropDown);
        setWait();
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.elementToBeClickable(numberingDropDown)).click();
        try {
            numberingDropDown.click();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        numberingDropDown.click();
    }
    public void totalAvailableTickets(String Number1) {
        waitForVisibility(totalLimitInput, Duration.ofSeconds(10));
        scrollToElement(totalLimitInput);
        totalLimitInput.click();
        totalLimitInput.clear();
        totalLimitInput.sendKeys("100");
    }
    public void orderLimit(String Number2) {
        orderLimitInput.click();
        orderLimitInput.clear();
        orderLimitInput.sendKeys("10");
    }
    public void iSaveTicket() throws AWTException {
        waitForVisibility(saveSettings, Duration.ofSeconds(5));
        saveSettings.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void createNewBundle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitForVisibility(createBundleButton, Duration.ofSeconds(5));
        createBundleButton.click();
    }
    public void enterTicketNameBundle(String Name2) {
        Actions actions = new Actions(driver);
        actions.moveToElement(ticketNameField);
        waitForVisibility(bundleName, Duration.ofSeconds(10));
        bundleName.click();
        bundleName.clear();
        bundleName.sendKeys("Fun for two");
    }
    public void enterTicketPriceBundle(String Price2) {
        bundlePrice.clear();
        bundlePrice.sendKeys("1");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bundlePrice.sendKeys("50");
    }
    public void includedTicketsBundle() throws AWTException {
        includeTicket.click();
        selectizeBundle.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitForText("Fun for one", Duration.ofSeconds(5));
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
    }
    public void includedQuantity(String Qty1) {
        scrollToElement(bundleQuantity);
        bundleQuantity.sendKeys("2");
    }
    public void saveBundle() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    public void advancedTab() {
        scrollToElement(nextStep);
        setWait();
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.visibilityOf(nextStep));
        try {
            nextStep.click();
        } catch (Exception e) {
            driver.navigate().refresh();
            driverWait.until(ExpectedConditions.visibilityOf(nextStep));
            nextStep.click();
        }
    }
    public void goToCheckout() {
        openCheckout.click();

    }
    public void displayNumberOfTickets() {
        scrollToElement(checkoutForm);
        waitForVisibility(checkoutForm, Duration.ofSeconds(10));
        scrollToElement(displayAvail);
        waitForVisibility(displayAvail, Duration.ofSeconds(5));
        displayAvail.click();
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.visibilityOf(goToPreview));
        scrollToElement(goToPreview);
    }
    public void saveAvailClick() throws AWTException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        saveAvail.click();
    }
    public void nextPreview() {
        goToPreview.click();
    }
    //public WebElement getTicketNameField() {
        //return this.ticketNameField;
    //}
    //public WebElement getTicket1Preview() {
        //return this.ticket1Preview;
    //}
    //public void assertTicket1name(){
        //driver.switchTo().frame("oveit-hub-iframe");
        //WebDriverWait driverWait = getDriverWait();
        //driverWait.until(ExpectedConditions.visibilityOf(ticket1Preview));
        //Assert.assertEquals(getTicket1Preview().getText(), getTicketNameField().getText());
    }







