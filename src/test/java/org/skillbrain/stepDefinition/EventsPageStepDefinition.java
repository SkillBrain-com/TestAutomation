package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.skillbrain.page.AttractionForm;
import org.skillbrain.page.EventsPage;
import org.skillbrain.utilities.TestContextSetup;

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

   @And("I click on Vouchers1")
    public void iClickOnVouchers() {
       attractionForm.waitForText("Vouchers", Duration.ofSeconds(5));
       eventsPage.clickVouchers();

    }

    @And("I click on Create voucher button1")
    public void iClickOnCreateVoucherButton() {
        attractionForm.waitForText("Create voucher", Duration.ofSeconds(5));
        eventsPage.clickCreateVoucherButton();
    }


    @And("I click on My events")
    public void iClickOnMyEvents() {
        eventsPage.clickMyEvents();

    }

    @Then("I click on Go to Hub button")
    public void iClickOnGoToHubButton() {

        eventsPage.clickGoToHub();
    }

    @And("I click on testareBugFix event")
    public void iClickOnTestareBugFixEvent() {
        eventsPage.clickTestareBugFixEvent();
    }

    @And("I click on Buy Now button")
    public void iClickOnBuyNowButton() {
        eventsPage.clickBuyNowButton();
    }

    @Then("I fill in the code box with series from voucher created {string} and click on apply button")
    public void iFillInTheCodeBoxWithSeriesFromVoucherCreatedAndClickOnApplyButton(String arg0) {
        eventsPage.fillInTheCodeBox();
        eventsPage.clickApplyButton();

    }

    @And("I increase the qty by pressing {string} button")
    public void iIncreaseTheQtyByPressingButton(String arg0) {
        eventsPage.increasingQtyBy1();

    }


    @Then("Check if the discount is applied and value is the same as created")
    public void checkIfTheDiscountIsAppliedAndValueIsTheSameAsCreated() {
        eventsPage.checkValueOfAppliedDiscount();

    }


}


