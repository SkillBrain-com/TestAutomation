package org.skillbrain.page.echipa1.attractionform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;

import java.time.Duration;

public class AttractionFormTicketsPage extends BasePage {

    private WebDriver driver;

    public AttractionFormTicketsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Create ticket'] //parent::button")
    private WebElement createTicketButton;
    @FindBy(xpath = "//button[@data-role=\"ticket-type-add\"]")
    private WebElement newTicketButton;
    @FindBy(xpath = "//button[@data-role=\"ticket-bundle-add\"]")
    private WebElement newBundleButton;
    @FindBy(xpath = "//button[@data-role=\"add-ticket-to-bundle\"]")
    private WebElement addTicketButton;
    @FindBy(xpath = "//button[@data-label=\"Save\"][1]")
    private WebElement ticketSaveButton;
    @FindBy(xpath = "(//span[contains(text(),'Save')])[4]/parent::button")
    private WebElement bundleSaveButton;
    @FindBy(xpath = "//span[normalize-space()=\"Ticket configuration\"] //parent::div")
    private WebElement ticketConfigButton;
    @FindBy(xpath = "//span[normalize-space()='Ticket visibility'] //parent::div")
    private WebElement ticketVisibleButton;
    @FindBy(xpath = "//input[@name=\"visibility\" and @value=\"private\"] //parent::label")
    private WebElement privateInviteButton;

    @FindBy(xpath = "//input[@placeholder=\"e.g. VIP Area, Entry ticket, etc.\"]")
    private WebElement ticketNameField;
    @FindBy(xpath = "//input[@name=\"price[0]\"]")
    private WebElement ticketPriceField;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement bundleNameField;
    @FindBy(xpath = "//input[@id='price']")
    private WebElement bundlePriceField;
    @FindBy(xpath = "(//input[@name='fields[0][quantity]'])[1]")
    private WebElement ticketQuantityField;
    @FindBy(xpath = "//input[@name=\"visibility_code\"]")
    private WebElement invitationCodeField;

    @FindBy(xpath = "(//div[@data-value='EUR'] //parent::div)[1]")
    private WebElement currencyDropdown;
    @FindBy(xpath = "//div[contains(@class,'selectize-control')]/div[contains(@class,'selectize-input')]")
    private WebElement ticketsDropdown;

    @FindBy(xpath = "//div[@data-value='RON']")
    private WebElement leuCurrencyItem;
    @FindBy(xpath = "//div[contains(@class,'selectize-dropdown-content')]/div[1]")
    private WebElement ticketItem;

    @FindBy(xpath = "//h2[normalize-space()=\"Tickets\"]")
    private WebElement ticketsLabel;
    @FindBy(xpath = "//h4[normalize-space()=\"New ticket\"]")
    private WebElement newTicketLabel;

    public void clickOnCreateTicket() {
        waitForVisibility(createTicketButton, Duration.ofSeconds(10));
        scrollToElement(createTicketButton);

        createTicketButton.click();

        waitForClick(ticketNameField, Duration.ofSeconds(10));
    }

    public void fillTicketName(String ticketName) {
        waitForVisibility(ticketNameField, Duration.ofSeconds(10));
        ticketNameField.sendKeys(ticketName);
    }

    public void fillTicketPrice(Float ticketPrice) {
        ticketPriceField.clear();
        ticketPriceField.sendKeys(String.valueOf(ticketPrice));
    }

    public void clickCurrencyDropdown() {
        waitForVisibility(currencyDropdown, Duration.ofSeconds(10));
        currencyDropdown.click();
    }

    public void selectLeuItem() {
        waitForVisibility(leuCurrencyItem, Duration.ofSeconds(10));
        leuCurrencyItem.click();
    }

    public void clickTicketSaveButton() {
        ticketSaveButton.click();

        waitForVisibility(ticketsLabel, Duration.ofSeconds(10));
    }

    public void clickOnBundleSave() {
        bundleSaveButton.click();
        waitForVisibility(ticketsLabel, Duration.ofSeconds(10));
    }

    public void clickNewTicketButton() {
        newTicketButton.click();
        waitForClick(ticketNameField, Duration.ofSeconds(50));
    }

    public void clickNewBundleButton() {
        driver.navigate().refresh();
        waitForClick(newBundleButton, Duration.ofSeconds(10));
        newBundleButton.click();
    }

    public void fillBundleNameField(String name) {
        waitForVisibility(bundleNameField, Duration.ofSeconds(10));
        bundleNameField.sendKeys(name);
    }

    public void fillBundlePriceField(Float price) {
        bundlePriceField.clear();
        bundlePriceField.sendKeys(String.valueOf(price));
    }

    public void clickAddTicketButton() {
        waitForClick(addTicketButton, Duration.ofSeconds(10));
        scrollToElement(addTicketButton);

        Actions action = new Actions(driver);
        action.moveToElement(addTicketButton)
                .pause(Duration.ofMillis(200))
                .click()
                .perform();
    }

    public void fillQuantityField(int quantity) {
        ticketQuantityField.sendKeys(String.valueOf(quantity));
    }

    public void selectPricedTicketItem() {
        waitForClick(ticketsDropdown, Duration.ofSeconds(20));
        ticketsDropdown.click();
        waitForClick(ticketItem, Duration.ofSeconds(20));
        ticketItem.click();
    }

    public void clickTicketConfigButton() {
        waitForClick(ticketConfigButton, Duration.ofSeconds(10));
        scrollToElement(ticketConfigButton);

        Actions actions = new Actions(driver);
        actions.pause(Duration.ofMillis(500))
                .moveToElement(ticketConfigButton)
                .click()
                .build()
                .perform();
    }

    public void clickTicketVisibilityButton() {
        waitForClick(ticketVisibleButton, Duration.ofSeconds(10));
        scrollToElement(ticketVisibleButton);
        ticketVisibleButton.click();
    }

    public void clickPrivateInviteButton() {
        waitForClick(privateInviteButton, Duration.ofSeconds(10));
        scrollToElement(privateInviteButton);
        privateInviteButton.click();
    }

    public void fillPrivateInviteCodeField(String code) {
        waitForClick(invitationCodeField, Duration.ofSeconds(10));
        scrollToElement(invitationCodeField);
        invitationCodeField.sendKeys(code);
    }
}
