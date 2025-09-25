package org.skillbrain.page;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
    @FindBy(xpath = "//span[normalize-space()='New ticket'] //parent::button")
    private WebElement newSingleTicket;
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
    @FindBy(xpath = "//span[normalize-space()='Add ticket'] //parent::button")
    private WebElement includeAnother;
    @FindBy(xpath = "//div[text()='Fun for One']")
    private WebElement selectTTicket;
    @FindBy(xpath = "//select[@name='fields[1][id_ticket_type]']")
    private WebElement selectizeBundle2;
    @FindBy(xpath = "//div[contains(@class,'selectize-dropdown-content')]/div[2]")
    private WebElement selectLittle;
    @FindBy(xpath = "//input[@type = 'number']")
    private WebElement bundleQuantity;
    @FindBy(css = "button[data-label='Save']")
    private WebElement saveBundle;
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
    @FindBy(xpath = "//p[contains(normalize-space(.), 'tickets available')]")
    private WebElement limitPreview;
    @FindBy(css="p[class='p2-semibold']")
    private WebElement displayedSingle;
    @FindBy(css = "p[class='p4-regular ml-[4px] text-neutral-800 lowercase']")
    private WebElement feeAmountSingle;
    @FindBy(css = "h3[class='p1-medium mb-[4px] max-w-[180px] md:max-w-[240px]']")
    private WebElement ticket2Preview;
    @FindBy(css = "p[class='p4-regular ml-[4px] text-neutral-800 lowercase'][2]")
    private WebElement feeAmountTwo;



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
    public void enterPrice(double Price1) {
        ticketPriceField.clear();
        ticketPriceField.sendKeys(String.valueOf(Price1));
        try {
            Thread.sleep(500)            ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    public void excludeFees() {
        if (feesCheckbox.isSelected()) {
            feesCheckbox.click();
        } else {

        }}

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
    public void totalAvailableTickets(int Number1) {
        waitForVisibility(totalLimitInput, Duration.ofSeconds(10));
        scrollToElement(totalLimitInput);
        totalLimitInput.click();
        totalLimitInput.clear();
        totalLimitInput.sendKeys(String.valueOf(Number1));
    }
    public void orderLimit(int Number2) {
        orderLimitInput.click();
        orderLimitInput.clear();
        orderLimitInput.sendKeys(String.valueOf(Number2));
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
    public void createAnotherSingle(){
        setWait();
        WebDriverWait driverWait1=new WebDriverWait(driver, Duration.ofSeconds(10));
        waitForVisibility(newSingleTicket, Duration.ofSeconds(5));
        newSingleTicket.click();
    }
    public void enterTicketName3(String Name3) {
        Actions actions = new Actions(driver);
        actions.moveToElement(ticketNameField);
        waitForVisibility(ticketNameField, Duration.ofSeconds(10));
        ticketNameField.click();
        ticketNameField.clear();
        ticketNameField.sendKeys(Name3);
    }
    public void enterPrice3(double Price3) {
        ticketPriceField.clear();
        ticketPriceField.sendKeys(String.valueOf(Price3));
        try {
            Thread.sleep(500)            ;
        } catch (InterruptedException e) {
            e.printStackTrace();}
            if (feesCheckbox.isSelected()) {
                feesCheckbox.click();
            } else {
            }
        }
    public void createNewBundle() {
        driver.navigate().refresh();
        scrollToElement(createBundleButton);
        driverWait.until(ExpectedConditions.visibilityOf(createBundleButton));
        createBundleButton.click();
        }
    public void enterTicketNameBundle(String Name2) {
        Actions actions = new Actions(driver);
        actions.moveToElement(ticketNameField);
        waitForVisibility(bundleName, Duration.ofSeconds(10));
        bundleName.click();
        bundleName.clear();
        bundleName.sendKeys(Name2);
    }
    public void enterTicketPriceBundle(double Price2) {
        bundlePrice.clear();
        bundlePrice.sendKeys(String.valueOf(Price2));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
           }
    public void includedTicketsBundle(){
        includeTicket.click();
        selectizeBundle.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitForVisibility(selectTTicket, Duration.ofSeconds(5));

        selectTTicket.click();
        }
    public void includedQuantity(int Qty1) {
        scrollToElement(bundleQuantity);
        bundleQuantity.sendKeys(String.valueOf(Qty1));
    }
    public void includeMore(){
        includeAnother.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitForVisibility(selectizeBundle2, Duration.ofSeconds(5));
        scrollToElement(selectizeBundle2);
        selectizeBundle2.click();
        selectLittle.click();



    }
    public void includedQuantity2(int Qty2) {
        scrollToElement(bundleQuantity);
        bundleQuantity.sendKeys(String.valueOf(Qty2));
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
    public WebElement getTicket1Preview() {
        return this.ticket1Preview;
    }
    public void assertTicket1name(String Name1) {
        driver.switchTo().frame("oveit-hub-iframe");
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.visibilityOf(ticket1Preview));
        Assert.assertEquals(getTicket1Preview().getText(),Name1);
        System.out.println("Single ticket name found!");
        }

    public WebElement getDisplayedSingle() {
        return this.displayedSingle;
    }
    public double extractPriceSingle(){
        String singlePriceString = displayedSingle.getText();
        return Double.parseDouble(singlePriceString.replaceAll("[^0-9,]","").replace(",","."));}

    public void assertPriceSingle(double Price1){
        double displayedSingle = extractPriceSingle();
        Assert.assertEquals(displayedSingle, Price1);
        System.out.println("Single price OK!");
    }

    public WebElement getLimitPreview() {
        return this.limitPreview;
    }
    public void assertLimit(String Number1){
        setWait();
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.visibilityOf(limitPreview));
        scrollToElement(limitPreview);
        Assert.assertTrue(limitPreview.getText().contains(String.valueOf(Number1)) );
        System.out.println("Total ticket amount OK!");
    }
    public WebElement getFeeAmountSingle() {
        return this.feeAmountSingle;
    }
    public double extractDoubleFirstTicket(){
        String feeSingleString = feeAmountSingle.getText();
        return Double.parseDouble(feeSingleString.replaceAll("[^0-9,]", "").replace(",", "."));}

    public void assertFirstFee(Double Price1){
        double firstFee = extractDoubleFirstTicket();
        double expectedFee = Price1*0.03;
        if (expectedFee < 4.31) {
            expectedFee = 4.31;
        }
        Assert.assertEquals(firstFee, expectedFee);
        System.out.println("Tax OK!");
    }

    public WebElement getTicket2Preview() {
        return this.ticket2Preview;
    }
    public void assertTicket2(String Name2){
        Assert.assertEquals(ticket2Preview.getText(),Name2);
        System.out.println("Bundle ticket name found!");
    }
}





