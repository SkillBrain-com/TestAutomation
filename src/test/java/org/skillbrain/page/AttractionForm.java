package org.skillbrain.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    @FindBy(xpath=("//*[normalize-space(text())='Location']"))
    private WebElement locationDropDown;
    @FindBy(xpath=("//input[@name='location' and @type='text']"))
    private WebElement attractionLocationField;
    @FindBy(css="img[alt=\"Location pin\"]")
    private WebElement mapPin;
    @FindBy(css = "div[aria-label='Hartă'][role='region']")
    private WebElement map;

    public WebElement getOrderCompleteLabel() {
        return orderCompleteLabel;
    }

    public void fillAttractionName(String attractionName) {
        attractionNameField.sendKeys(attractionName);
    }

    public void clickOnLocationAccordion() {
        locationAccordion.click();
    }

    public void fillLocationName(String locationName) {
        waitForVisibility(locationNameField, Duration.ofSeconds(10));
        scrollToElement(locationNameField);
        locationNameField.sendKeys(locationName);
    }

    @Override
    public WebDriverWait getDriverWait() {
        return super.getDriverWait();
    }


    @FindBy(xpath = "//span[normalize-space()='Next'] //parent::button")
    private WebElement nextButton1;
    @FindBy(css = "input[name=\"name\"]")
    private WebElement attractionNameField1;

    public void clickOnNext() {
        nextButton.click();
        waitForVisibility(createTicketButton, Duration.ofSeconds(10));
    }

    public void clickOnCreateTicket() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(createTicketButton)).click();

        createTicketButton.click();
        waitForVisibility(ticketNameField, Duration.ofSeconds(10));
    }

    public void fillTicketName(String ticketName) {
        ticketNameField.sendKeys(ticketName);
    }

    public void fillTicketPrice(String ticketPrice) {
        ticketPriceField.clear();
        ticketPriceField.sendKeys(ticketPrice);
    }

    public void fillAttractionMandatory(String name, String location) {
        waitForText("Attraction name", Duration.ofSeconds(5));
        attractionNameField1.sendKeys(name);
        attractionNameField.sendKeys(name);
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

        try {
            waitForVisibility(iframe, Duration.ofSeconds(15));
        } catch (Exception e) {
            try {
                WebElement altIframe = driver.findElement(By.xpath("//iframe[contains(@id, 'oveit')]"));
                waitForVisibility(altIframe, Duration.ofSeconds(10));
            } catch (Exception e2) {
                try {
                    WebElement altIframe2 = driver.findElement(By.xpath("//iframe[contains(@src, 'oveit')]"));
                    waitForVisibility(altIframe2, Duration.ofSeconds(10));
                } catch (Exception e3) {
                    System.out.println("Warning: Could not find iframe after clicking Preview & Publish tab");
                }
            }
        }
    }

    public void clickOnAddButton() {
        driver.switchTo().frame(iframe);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        try {
            waitForVisibility(addButton, Duration.ofSeconds(10));
            addButton.click();
        } catch (Exception e) {
            try {
                WebElement altAddButton = driver.findElement(By.xpath("//button[contains(text(), 'Add')]"));
                altAddButton.click();
            } catch (Exception e2) {
                try {
                    WebElement altAddButton2 = driver.findElement(By.xpath("//button[@data-slot='button']"));
                    altAddButton2.click();
                } catch (Exception e3) {
                    try {
                        WebElement altAddButton3 = driver.findElement(By.xpath("//button[contains(@class, 'add') or contains(@class, 'Add')]"));
                        altAddButton3.click();
                    } catch (Exception e4) {
                        // Try to find any button that might be the Add button
                        try {
                            WebElement anyButton = driver.findElement(By.xpath("//button[position()=2]"));
                            anyButton.click();
                        } catch (Exception e5) {
                            throw new RuntimeException("Could not find Add button with any selector", e5);
                        }
                    }
                }
            }
        }
    }

    public void clickOnContinueButton() {
        try {
            waitForVisibility(continueButton, Duration.ofSeconds(10));
            continueButton.click();
        } catch (Exception e) {
            driver.switchTo().frame(iframe);
            waitForVisibility(continueButton, Duration.ofSeconds(10));
            continueButton.click();
        }

        waitForVisibility(billingLabel, Duration.ofSeconds(20));
        driver.switchTo().defaultContent();
    }

    public void fillCustomerForm(String info) {
        driver.switchTo().frame(iframe);

        String[] fields = info.split(",");
        if (fields.length >= 6) {
            emailField.sendKeys(fields[0].trim());
            nameField.sendKeys(fields[1].trim());
            stateDropdown.sendKeys(fields[2].trim());
            stateDropdown.sendKeys(Keys.ENTER);
            cityField.sendKeys(fields[3].trim());
            addressField.sendKeys(fields[4].trim());
        } else {
            emailField.sendKeys("test@example.com");
            nameField.sendKeys("Popescu Ion");
            stateDropdown.sendKeys("Alabama");
            stateDropdown.sendKeys(Keys.ENTER);
            cityField.sendKeys("Pandora");
            addressField.sendKeys("Calea Victoriei 199");
        }
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

    //MARIA
    @FindBy(xpath = "//input[@name=\"name\"]")
    private WebElement eventName;
    @FindBy(name = "location")
    private WebElement locationName;
    @FindBy(name = "name")
    private WebElement ticketName;
    @FindBy(name = "price[0]")
    private WebElement ticketPrice;
    @FindBy(xpath = "//div[@class='ripple']")
    private WebElement buttonOfPublish;
    @FindBy(xpath = "//span[normalize-space()='Go to Hub'] //parent::button")
    private WebElement buttonHub;
    @FindBy(xpath = "//h3[normalize-space()='Eveniment 1']")
    private WebElement attractionClick;
    @FindBy(xpath = "//h3[normalize-space()='Eveniment 1'] //parent::a //parent::div //following-sibling::div[@class='w-full flex justify-between items-center px-[16px] py-[12px] text-neutral-1000 font-semibold'] //a")
    private WebElement cumparaAcum;
    @FindBy(id = "voucherCode")
    private WebElement codeVInput;
    @FindBy(xpath = "//button[normalize-space()='Apply']")
    private WebElement applyButton;
    @FindBy(xpath = "//h3[normalize-space()='Test 2']")
    private WebElement clickTest2;
    @FindBy(xpath = "//h3[normalize-space()='Test 2'] //parent::a //parent::div //following-sibling::div[@class='w-full flex justify-between items-center px-[16px] py-[12px] text-neutral-1000 font-semibold'] //a")
    private WebElement buyTest2;

    public void TheNameOfEvent(String nameEvent) {
        eventName.sendKeys("Eveniment 1");
    }

    public void TheNameOfLocation(String nameLocation) {
        waitForVisibility(locationName, Duration.ofSeconds(10));
        scrollToElement(locationName);
        locationName.sendKeys("Iasi");
    }

    public void NameOfTicket(String nameTicket) {
        ticketName.sendKeys("Eveniment");
    }

    public void PriceOfTicket(Double priceTicket) {
        ticketPrice.sendKeys("50");
    }

    public void PublishButton() {
        buttonOfPublish.click();
    }

    public void GoToHubButton() {
        buttonHub.click();
    }

    public void ClickAttraction() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(attractionClick));
        attractionClick.click();
        System.out.println("Click efectuat");
    }

    public void BuyNowButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        switchToSecondWindow();
        wait.until(ExpectedConditions.visibilityOf(cumparaAcum));
        cumparaAcum.click();
        System.out.println("Buy apasat");
    }

    public void EnterCode() {
        codeVInput.sendKeys("Testare1");
        applyButton.click();
    }

    public void ClickOneAttraction() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clickTest2));
        System.out.println("Click efectuat");
        scrollToElement(clickTest2);
        clickTest2.click();
    }

    public void CumparaTest2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        switchToSecondWindow();
        wait.until(ExpectedConditions.visibilityOf(buyTest2));
        buyTest2.click();
    }

}
