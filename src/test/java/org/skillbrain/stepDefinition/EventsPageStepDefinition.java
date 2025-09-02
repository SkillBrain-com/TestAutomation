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
        //voucherPage = testContextSetup.pageObjectFactory.getVoucherPage();

    }

    @When("I click on Events sidebar")
    public void iClickOnEventsSidebar() {
        eventsPage.clickSidebar();
    }

   //@And("I click on Vouchers1")
    public void iClickOnVouchers() {
       attractionForm.waitForText("Vouchers", Duration.ofSeconds(5));
       eventsPage.clickVouchers();

    }

 //@And("I click on Create voucher button1")
    public void iClickOnCreateVoucherButton() {
        attractionForm.waitForText("Create voucher", Duration.ofSeconds(5));
        eventsPage.clickCreateVoucherButton();
    }



}


