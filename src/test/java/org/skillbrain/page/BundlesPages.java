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
import org.testng.Assert;

import java.awt.*;
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
    @FindBy(xpath = "//div[contains(@class,'selectize-control') and contains(@class,'single')] //div[contains(@class,'selectize-input')]/following::div[contains(@class,'selectize-input')]")
    private WebElement selectizeBundle2;
    @FindBy(xpath = "//div[text()='Fun for Little One']/following::div[text()='Fun for Little One']")
    private WebElement selectLittle;
    @FindBy(xpath = "//input[@type = 'number']")
    private WebElement bundleQuantity;
    @FindBy(xpath = "//input[@type = 'number']/following::input[@type = 'number']")
    private WebElement bundleQuantity2;
    @FindBy(xpath = "//h2[normalize-space()=\"Tickets\"]")
    private WebElement ticketsWait;
    @FindBy(xpath = "(//span[contains(text(),'Save')])[4]/parent::button")
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
    @FindBy(xpath = "//iframe[@id='oveit-hub-iframe']")
    private WebElement iframe;
    @FindBy(css = "h3[class='title-xs mb-[4px] max-w-[180px] md:max-w-[240px]']")
    private WebElement ticket1Preview;
    @FindBy(xpath = "//p[contains(normalize-space(.), 'tickets available')]")
    private WebElement limitPreview;
    @FindBy(css = "p[class='p2-semibold']")
    private WebElement displayedSingle;
    @FindBy(css = "p[class='p4-regular ml-[4px] text-neutral-800 lowercase']")
    private WebElement feeAmountSingle;
    @FindBy(xpath = "//h3[contains(@class, 'title-xs') and contains(@class, 'mb-[4px]')]/following::h3[contains(@class, 'title-xs') and contains(@class, 'mb-[4px]')]")
    private WebElement displayedReduced;
    @FindBy(xpath = "//span[@class='neutral-label']")
    private WebElement noLimit;
    @FindBy(xpath = "(//p[@class='p2-semibold'])[2]")
    private WebElement displayedReducedPrice;
    @FindBy(xpath = "(//p[contains(@class, 'p4-regular ml-[4px] text-neutral-800')])[2]")
    private WebElement feeAmountReduced;
    @FindBy(xpath = "//h3[contains(@class, 'p1-medium') and contains(@class, 'mb-[4px]')] //parent::div")
    private WebElement displayedBundle;
    @FindBy(xpath = "(//p[@class='p2-semibold'])[3]")
    private WebElement displayedBundlePrice;
    @FindBy(xpath = "(//p[contains(@class, 'p4-regular ml-[4px] text-neutral-800')])[3]")
    private WebElement displayedBundleFee;
    @FindBy(xpath = "//span[contains(normalize-space(.), 'You save')]//parent::div")
    private WebElement displayedSavings;
    @FindBy(xpath = "(//button[@data-slot='button'])[2] //parent::div")
    private WebElement addTicketButton;
    @FindBy(xpath = "//p[normalize-space()='Sold out']//parent::div")
    private WebElement soldOut;

    @FindBy(xpath = "//span[contains(normalize-space(.), 'Publish event')] //parent::button")
    private WebElement publishButton;
    //@FindBy(xpath = "//span[contains(normalize-space(.), 'Share')] //parent::button")
    //private WebElement shareButton;
    //@FindBy(xpath = "//a[@class='event-link-redirect']")
    //private WebElement goToOveitHub;


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

    public void enterTicketName(String SingleFull) {
        Actions actions = new Actions(driver);
        actions.moveToElement(ticketNameField);
        waitForVisibility(ticketNameField, Duration.ofSeconds(10));
        ticketNameField.click();
        ticketNameField.clear();
        ticketNameField.sendKeys(SingleFull);
    }

    public void enterPrice(double PriceFull) {
        ticketPriceField.clear();
        ticketPriceField.sendKeys(String.valueOf(PriceFull));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

    public void createAnotherSingle() {
        setWait();
        WebDriverWait driverWait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitForVisibility(newSingleTicket, Duration.ofSeconds(5));
        newSingleTicket.click();
    }

    public void enterTicketName3(String SingleReduced) {
        Actions actions = new Actions(driver);
        actions.moveToElement(ticketNameField);
        waitForVisibility(ticketNameField, Duration.ofSeconds(10));
        ticketNameField.click();
        ticketNameField.clear();
        ticketNameField.sendKeys(SingleReduced);
    }

    public void enterPrice3(double PriceReduced) {
        ticketPriceField.clear();
        ticketPriceField.sendKeys(String.valueOf(PriceReduced));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

    public void includedTicketsBundle() {
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

    public void includeMore() throws AWTException {
        includeAnother.click();
        selectizeBundle2.click();
        setWait();
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.visibilityOf(selectLittle));

        selectLittle.click();
    }

    public void includedQuantity2(int Qty2) {
        scrollToElement(bundleQuantity2);
        bundleQuantity2.sendKeys(String.valueOf(Qty2));
    }

    public void saveBundleClick() throws AWTException {
        saveBundle.click();
        waitForVisibility(ticketsWait, Duration.ofSeconds(10));

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

    public void assertTicket1name(String SingleFull) {
        driver.switchTo().frame(iframe);
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.visibilityOf(ticket1Preview));
        Assert.assertEquals(getTicket1Preview().getText(), SingleFull);
        System.out.println("Single ticket name found!");
    }

    public WebElement getDisplayedSingle() {
        return this.displayedSingle;
    }

    public double extractPriceSingle() {
        String singlePriceString = displayedSingle.getText();
        return Double.parseDouble(singlePriceString.replaceAll("[^0-9,]", "").replace(",", "."));
    }

    public void assertPriceSingle(double PriceFull) {
        double displayedSingle = extractPriceSingle();
        Assert.assertEquals(displayedSingle, PriceFull);
        System.out.println("Single price OK!");
    }

    public WebElement getLimitPreview() {
        return this.limitPreview;
    }

    public void assertLimit(String Number1) {
        setWait();
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.visibilityOf(limitPreview));
        scrollToElement(limitPreview);
        Assert.assertTrue(limitPreview.getText().contains(String.valueOf(Number1)));
        System.out.println("Total ticket amount OK!");
    }

    public WebElement getFeeAmountSingle() {
        return this.feeAmountSingle;
    }

    public double extractDoubleFirstTicket() {
        String feeSingleString = feeAmountSingle.getText();
        return Double.parseDouble(feeSingleString.replaceAll("[^0-9,]", "").replace(",", "."));
    }

    public void assertFirstFee(Double Price1) {
        double firstFee = extractDoubleFirstTicket();
        double expectedFee = Price1 * 0.03;
        if (expectedFee < 4.31) {
            expectedFee = 4.31;
        }
        Assert.assertEquals(firstFee, expectedFee);
        System.out.println("Tax OK!");
    }

    public WebElement getDisplayedReduced() {
        return this.displayedReduced;
    }

    public void assertTicket2(String SingleReduced) {
        scrollToElement(displayedReduced);
        waitForVisibility(displayedReduced, Duration.ofSeconds(10));
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.visibilityOf(displayedReduced));
        System.out.println("Reduced ticket found!");

    }

    public WebElement getNoLimit() {
        return this.noLimit;
    }

    public void assertUnlimited() {
        Assert.assertEquals(noLimit.getText(), "Unlimited");
        System.out.println("Unlimited verified!");
    }

    public WebElement getDisplayedReducedPrice() {
        return this.displayedReducedPrice;
    }

    public double extractReducedPrice() {
        String reducedPriceString = displayedReducedPrice.getText();
        return Double.parseDouble(reducedPriceString.replaceAll("[^0-9,]", "").replace(",", "."));
    }

    public void assertReducedPrice(double PriceReduced) {
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.visibilityOf(displayedReducedPrice));
        double displayedReducedPrice = extractReducedPrice();
        Assert.assertEquals(displayedReducedPrice, PriceReduced);
        System.out.println("Reduced price OK!");
    }

    public WebElement getFeeAmountReduced() {
        return this.feeAmountReduced;
    }

    public double extractReducedFee() {
        String feeAmountReducedString = feeAmountReduced.getText();
        return Double.parseDouble(feeAmountReducedString.replaceAll("[^0-9,]", "").replace(",", "."));
    }

    public void assertReducedFee(Double PriceReduced) {
        double secondFee = extractReducedFee();
        double expectedReducedFee = PriceReduced * 0.03;
        if (expectedReducedFee < 4.31) {
            expectedReducedFee = 4.31;
        }
        Assert.assertEquals(secondFee, expectedReducedFee);
        System.out.println("Reduced tax OK!");
    }

    public WebElement getDisplayedBundle() {
        return this.displayedBundle;
    }

    public void assertBundlename(String bundleName) {
        scrollToElement(displayedBundle);
        waitForVisibility(displayedBundle, Duration.ofSeconds(10));
        setWait();
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.visibilityOf(this.displayedBundle));
        Assert.assertTrue(getDisplayedBundle().getText().contains(bundleName));
        System.out.println("Bundle name found!");
    }

    public WebElement getBundlePrice() {
        return this.bundlePrice;
    }

    public WebElement getDisplayedBundlePrice() {
        return this.displayedBundlePrice;
    }

    public double extractDisplayedBundlePrice() {
        String reducedPriceString = displayedBundlePrice.getText();
        return Double.parseDouble(reducedPriceString.replaceAll("[^0-9,]", "").replace(",", "."));
    }

    public void assertDisplayedBundlePrice(double Price2) {
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.visibilityOf(displayedBundlePrice));
        double displayedBundledPrice = extractDisplayedBundlePrice();
        Assert.assertEquals(displayedBundledPrice, Price2);
        System.out.println("Bundle price OK!");
    }

    public WebElement getDisplayedBundleFee() {
        return this.displayedBundleFee;
    }

    public double extractBundleFee() {
        String bundleFeeString = displayedBundleFee.getText();
        return Double.parseDouble(bundleFeeString.replaceAll("[^0-9,]", "").replace(",", "."));
    }

    public void assertBundleFee(Double Price2) {
        double bundleFee = extractBundleFee();
        double expectedBundleFee = Price2 * 0.03;
        if (expectedBundleFee < 4.31) {
            expectedBundleFee = 4.31;
        }
        Assert.assertEquals(bundleFee, expectedBundleFee);
        System.out.println("Bundle tax OK!");
    }

    public double extractBundleSavings() {
       String savingsBunsleString = displayedSavings.getText();
       return Double.parseDouble(savingsBunsleString.replaceAll("[^0-9,]", "").replace(",", "."));
         }


   public double assertBundleSavings(double Price1, double PriceReduced, double Price2) {
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.visibilityOf(displayedSavings));
        double bundleFee = extractBundleFee();
        double displayedBundleSavings = extractBundleSavings();
        double expectedSavingsWithoutTax = ((Price1 * 2) + PriceReduced) - Price2;
        double expectedSavingsFee=expectedSavingsWithoutTax*0.03;
        double expectedSavingWithTax=expectedSavingsWithoutTax+expectedSavingsFee;
        Assert.assertEquals(displayedBundleSavings, expectedSavingWithTax);
        System.out.println("Savings OK!");
        return expectedSavingWithTax;
         }

    //public void clickAddButton1(int clicks){
    //    WebDriverWait driverWait = getDriverWait();
    //    driverWait.until(ExpectedConditions.elementToBeClickable(addTicketButton));
    //    for (int i = 0; i < clicks; i++) {
    //        addTicketButton.click();
    //    }}

    //public void checkMessagePresent(){
     //   WebDriverWait driverWait = getDriverWait();
     //   driverWait.until(ExpectedConditions.visibilityOf(soldOut));
      //  Assert.assertEquals(soldOut.getText(), "Sold out");
     //   System.out.println("Limit reached!");
    //}


    public void clickPublishButton() {
        driver.switchTo().defaultContent();
        scrollToElement(publishButton);
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.visibilityOf(publishButton));
        publishButton.click();
    }
}









