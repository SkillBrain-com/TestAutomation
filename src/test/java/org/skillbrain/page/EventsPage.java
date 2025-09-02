package org.skillbrain.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class EventsPage extends BasePage {

    private final WebDriver driver;

    //@FindBy(xpath = ("//p[normalize-space()='Events'] //parent::div"))
    //private WebElement eventsSidebar;
    //@FindBy(xpath = "//a[normalize-space()='My events']")
    //private WebElement myEvents;

    @FindBy(xpath = "//span[normalize-space()='Create event'] //parent::button")
    private WebElement createEventButton;
    @FindBy(css = ("div[class='ripple']"))
    WebElement createButton;
    @FindBy(css = "input[name = \"name\"]")
    WebElement enterEventName;


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

    public void enterEventName(){
        waitForText("Event name", Duration.ofSeconds(5));
        enterEventName.sendKeys("Fun for Two!");
    }
    }





