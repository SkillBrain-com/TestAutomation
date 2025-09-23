package org.skillbrain.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class EventsPage extends BasePage {

    private final WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Create event'] //parent::button")
    private WebElement createEventButton;
    @FindBy(css = ("div[class='ripple']"))
    private WebElement createButton;
    @FindBy(xpath = "//input[@name='name']")
    private WebElement enterEventName;
    @FindBy(xpath = "//input[@name='start_date']")
    private WebElement startDateInput;
    @FindBy(xpath = "//input[@name='start_time']")
    private WebElement enterStartTime;
    @FindBy(xpath = "//input[@name='end_date']")
    private WebElement enterEndDate;
    @FindBy(xpath = "//input[@name='end_time']")
    private WebElement enterEndTime;
    @FindBy(xpath = "//span[contains(text(), 'Location')]")
    private WebElement clickLocation;
    @FindBy(xpath = "//input[@name='location']")
    private WebElement enterLocation;
    @FindBy(xpath = "//button[@value=1]")
    private WebElement saveEvent;
    @FindBy(xpath = "//span[normalize-space()='Next'] //parent::button")
    private WebElement nextPage;


    public EventsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void CheckEventsLogged() {
        waitForText("My events", Duration.ofSeconds(10));
        Assert.assertTrue(createEventButton.isDisplayed());
    }
    public void clickCreateEvent() {
        createButton.click();
    }

    public void enterEventName() {
        enterEventName.sendKeys("Fun for All");
    }
    public void enterStartDate() {
        startDateInput.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startDateInput.sendKeys("2025-10-10");
        startDateInput.sendKeys(Keys.RETURN);
    }
    public void enterStartTime() {
        enterStartTime.click();
        enterStartTime.sendKeys("2.30");
        enterStartTime.sendKeys(Keys.RETURN);
    }
    public void enterEndDate() {
        enterEndDate.click();
        enterEndDate.clear();
        enterEndDate.sendKeys("2025-10-11");
        enterEndDate.sendKeys(Keys.RETURN);
    }
    public void enterEndTime() {
        enterEndTime.click();
        enterEndTime.clear();
        enterEndTime.sendKeys("7.30");
        enterEndTime.sendKeys(Keys.RETURN);
    }
    public void clickLocation() {
        clickLocation.click();
    }
    public void iEnterTheLocation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        scrollToElement(enterLocation);
        waitForText("Address", Duration.ofSeconds(10));
        enterLocation.click();
        enterLocation.sendKeys("Bucharest");
    }
    public void saveEvent() {
        Actions actions = new Actions(driver);
        actions.moveToElement(saveEvent);
        actions.click(saveEvent);
        waitForVisibility(nextPage, Duration.ofSeconds(10));
    }
    public void nextEvent() {
        waitForVisibility(nextPage, Duration.ofSeconds(10));
        nextPage.click();
    }

}











