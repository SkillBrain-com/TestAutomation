package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.AttractionForm;
import org.skillbrain.page.BasePage;
import org.skillbrain.page.EventsPage;
import org.skillbrain.utilities.TestContextSetup;
import org.testng.Assert;

import java.time.Duration;

public class EventsPageStepDefinition {

    private TestContextSetup testContextSetup;
    private AttractionForm attractionForm;
    private EventsPage eventsPage;

    public EventsPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        attractionForm = testContextSetup.pageObjectFactory.getAttractionForm();
        eventsPage = testContextSetup.pageObjectFactory.getEventsPage();
    }

    @When("I click on Events sidebar")
    public void iClickOnEventsSidebar() {
        eventsPage.clickSidebar();
    }

    @And("I click on Vouchers")
    public void iClickOnVouchers() {
       // waitForText("Vouchers", Duration.ofSeconds(5));
        vouchers.click();
    }

    @And("I click on Create voucher button")
    public void iClickOnCreateVoucherButton() {
        createVoucher.click();
    }

    public void checkUserIsLoggedIn() {
       // waitForText("Vouchers", Duration.ofSeconds(10));
        Assert.assertTrue(vouchers.isDisplayed());
    }

}


