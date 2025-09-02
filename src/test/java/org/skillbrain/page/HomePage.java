package org.skillbrain.page;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage extends BasePage {

    @FindBy(xpath = ("//a[contains(normalize-space(),'Vouchers')]"))
    WebElement voucherButton;
    private final WebDriver driver;
    @FindBy(xpath = "//span[normalize-space()='Create attraction']")
    private WebElement createEventButton;
    @FindBy(xpath = "//p[normalize-space()='Attractions'] //parent::div")
    private WebElement attractionsSidebar;
    @FindBy(xpath = "//a[normalize-space()='My attractions']")
    private WebElement myAttractions;
    @FindBy(xpath = "//span[normalize-space()='Create attraction'] //parent::button")
    private WebElement createAttraction;


    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickAttractionSidebar() {

        attractionsSidebar.click();
    }

    public void clickMyAttractions() {
        for (int i = 0; i < 3; i++) {
            try {
                waitForText("My attractions", Duration.ofSeconds(5));
                myAttractions.click();
                break;
            } catch (ElementNotInteractableException e) {
                continue;
            }
        }

    }

    public void createAttraction() {
        createAttraction.click();
    }

    public void checkUserIsLoggedIn() {
        waitForText("My attractions", Duration.ofSeconds(10));
        Assert.assertTrue(createEventButton.isDisplayed());
    }
    public void clickVouchers() {
        voucherButton.click();
    }

}
