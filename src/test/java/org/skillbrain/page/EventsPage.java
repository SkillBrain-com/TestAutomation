package org.skillbrain.page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class EventsPage extends BasePage{

    private WebDriver driver;
    @FindBy(xpath = "//p[normalize-space()='Events'] //parent::div")
    private WebElement eventsSidebar;
    @FindBy(xpath= "//a[normalize-space()='Vouchers']")
    private WebElement vouchers;
    @FindBy(css = "button[type='button'] div[class='ripple']")
    private WebElement createVoucher;



    public EventsPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    @When("I click on Events sidebar")
    public void iClickOnEventsSidebar() {
        eventsSidebar.click();
    }

    @And("I click on Vouchers")
    public void iClickOnVouchers() {
        waitForText("Vouchers", Duration.ofSeconds(5));
        vouchers.click();
    }

    @And("I click on Create voucher button")
    public void iClickOnCreateVoucherButton() {
        createVoucher.click();
    }

    public void checkUserIsLoggedIn() {
        waitForText("Vouchers", Duration.ofSeconds(10));
        Assert.assertTrue(vouchers.isDisplayed());
    }

}


