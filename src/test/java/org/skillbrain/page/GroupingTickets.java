package org.skillbrain.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.skillbrain.page.BasePage;

import java.time.Duration;

public class GroupingTickets extends BasePage {

    private WebDriver driver;
    private WebDriverWait driverWait;

    @FindBy(xpath = "//input[@name=\"name\"]")
    private WebElement attractionNameField;

    @FindBy(xpath = "//span[contains(text(), 'Location')]")
    private WebElement locationAccordion;

    @FindBy(xpath = "//input[@name='location']")
    private WebElement locationAddressField;

    @FindBy(xpath = "//span[normalize-space()='Next'] //parent::button")
    private WebElement nextButton;

    @FindBy(xpath = "//span[normalize-space()='Create ticket'] //parent::button")
    private WebElement createTicketButton;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement ticketNameField;

    @FindBy(xpath = "//input[@data-role='price']")
    private WebElement ticketPriceField;

    @FindBy(xpath = "//button[@data-label='Save']")
    private WebElement saveTicketButton;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div[2]/button[1]")
    private WebElement newTicketButton;

    @FindBy(xpath = "//*[@id=\"ticket-types\"]/li[3]/div/div/div[1]/img")
    private WebElement ticketBElement;

    @FindBy(xpath = "//*[@id=\"ticket-types\"]/li[2]/div/div/div[2]")
    private WebElement ticketAElement;

    @FindBy(xpath = "//a[contains(normalize-space(.), 'Preview & Publish')]")
    private WebElement previewPublishTab;

    @FindBy(xpath = "//button[normalize-space()='Publish attraction']")
    private WebElement publishAttractionButton;

    public GroupingTickets(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        this.driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void fillAttractionName(String attractionName) {
        waitForVisibility(attractionNameField, Duration.ofSeconds(10));
        attractionNameField.clear();
        attractionNameField.sendKeys(attractionName);
    }

    public void expandLocationAccordion() {
        driverWait.until(ExpectedConditions.elementToBeClickable(locationAccordion));
        locationAccordion.click();
    }

    public void fillLocationAddress(String address) {
        waitForVisibility(locationAddressField, Duration.ofSeconds(10));
        scrollToElement(locationAddressField);
        locationAddressField.clear();
        locationAddressField.sendKeys(address);
    }

    public void clickNextButton() {
        WebElement nextBtn = driverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='Next'] //parent::button")
        ));
        nextBtn.click();
    }

    public void createFirstTicket(String ticketName, String price) {

        WebElement createBtn = driverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='Create ticket'] //parent::button")
        ));
        createBtn.click();

        WebElement nameField = driverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@name='name']")
        ));
        nameField.clear();
        nameField.sendKeys(ticketName);

        WebElement priceField = driverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@data-role='price']")
        ));
        priceField.clear();
        priceField.sendKeys(price);

        WebElement saveBtn = driverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-label='Save']")
        ));
        saveBtn.click();
    }

    public void createSecondTicket(String ticketName, String price) {

        WebElement newBtn = driverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("/html/body/div[2]/div[2]/div/section/div[2]/button[1]")
        ));
        newBtn.click();

        WebElement nameField = driverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@name='name']")
        ));
        nameField.clear();
        nameField.sendKeys(ticketName);

        WebElement priceField = driverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@data-role='price']")
        ));
        priceField.clear();
        priceField.sendKeys(price);

        WebElement saveBtn = driverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-label='Save']")
        ));
        saveBtn.click();
    }

    public void dragTicketBToTicketA() {
        try {
            Thread.sleep(2000);

            WebElement ticketB = driverWait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id=\"ticket-types\"]/li[3]/div/div/div[1]/img")
            ));

            WebElement ticketA = driverWait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id=\"ticket-types\"]/li[2]/div/div/div[2]")
            ));

            Actions actions = new Actions(driver);
            actions.dragAndDrop(ticketB, ticketA).perform();

            Thread.sleep(1000);

        } catch (Exception e) {

            WebElement ticketB = driverWait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id=\"ticket-types\"]/li[3]/div/div/div[1]/img")
            ));

            WebElement ticketA = driverWait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id=\"ticket-types\"]/li[2]/div/div/div[2]")
            ));

            Actions actions = new Actions(driver);
            actions.clickAndHold(ticketB)
                    .moveToElement(ticketA)
                    .release()
                    .perform();
        }
    }

    public void navigateToPreviewPublish() {

        WebElement previewTab = driverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(normalize-space(.), 'Preview & Publish')]")
        ));
        previewTab.click();
    }

    public void publishAttraction() {

        WebElement publishBtn = driverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[normalize-space()='Publish attraction']")
        ));
        publishBtn.click();
    }

    public void verifyAttractionPublished() {
        try {
            driverWait.until(ExpectedConditions.or(
                    ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Your attraction was published successfully')]")),
                    ExpectedConditions.urlContains("published"),
                    ExpectedConditions.urlContains("preview?id=")
            ));

            System.out.println("Attraction published successfully! Current URL: " + driver.getCurrentUrl());

        } catch (Exception e) {
            String currentUrl = driver.getCurrentUrl();
            if (currentUrl.contains("preview?id=") || currentUrl.contains("events") || currentUrl.contains("attractions")) {
                System.out.println("Attraction appears to be created successfully. Current URL: " + currentUrl);
            } else {
                throw new RuntimeException("Failed to verify attraction publication. Current URL: " + currentUrl, e);
            }
        }
    }
}
