package org.skillbrain.stepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.BundlesPages;
import org.skillbrain.page.EventsPage;
import org.skillbrain.utilities.TestContextSetup;

import java.awt.*;


public class BundlesStepDefinition {
    private TestContextSetup testContextSetup;
    private EventsPage eventsPage;
    private BundlesPages bundlesPages;

    public BundlesStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        eventsPage = testContextSetup.pageObjectFactory.getEventsPage();
        bundlesPages = testContextSetup.pageObjectFactory.getBundlesPages();
    }

    @And("I check if Events page is displayed")
    public void i_check_if_events_page_is_displayed() {
        eventsPage.CheckEventsLogged();
    }

    @And("I click on Create event button")
    public void i_click_on_create_event_button() {
        eventsPage.clickCreateEvent();
    }

    @And("I enter the Event name")
    public void i_enter_the_event_name() {
        eventsPage.enterEventName();
    }

    @And("I enter the Start date")
    public void iEnterTheStartDate() {
        eventsPage.enterStartDate();
    }

    @And("I enter Start time")
    public void iEnterStartTime() {
        eventsPage.enterStartTime();
    }

    @And("I enter the End date")
    public void iEnterTheEndDate() {
        eventsPage.enterEndDate();
    }

    @And("I enter the End time")
    public void iEnterTheEndTime() {
        eventsPage.enterEndTime();
    }

    @And("I open Location drop-down")
    public void iOpenLocation() {
        eventsPage.clickLocation();
    }

    @And("I enter the Location")
    public void iEnterTheLocation() {
        eventsPage.iEnterTheLocation();
    }

    @And("I click Save event")
    public void iClickSaveEvent() {
        eventsPage.saveEvent();
    }

    @Then("I click Next")
    public void iClickNext() {
        eventsPage.nextEvent();
    }

    @Then("I go to Tickets tab")
    public void goToTicketsTab() {
        bundlesPages.goToTickets();
    }

    @And("I click on New Ticket")
    public void iCreateNewTicket() {
        bundlesPages.clickNewTicket();
    }

    @Then("I enter a single ticket name {string}")
    public void iEnterNormalTicket(String SingleFull) {
        bundlesPages.enterTicketName(SingleFull);
    }

    @And("I enter the price for single ticket {double}")
    public void iEnterSinglePrice(double PriceFull) {
        bundlesPages.enterPrice(PriceFull);
    }

    @And("I uncheck to include fees")
    public void doNotIncludeFees() {
        bundlesPages.excludeFees();
    }

    @Then("I open Ticket configuration")
    public void iOpenTicketConfiguration() {
        bundlesPages.openTicketConfiguration();
    }

    @And("I open Numbering")
    public void iOpenNumbering() {
        bundlesPages.openNumbering();
    }

    @And("I enter total available tickets {int}")
    public void iEnterTotalTickets(int Number1) {
        bundlesPages.totalAvailableTickets(Number1);
    }

    @And("I enter maximum tickets per order {int}")
    public void iEnterTicketPerOrder(int Number2) {
        bundlesPages.orderLimit(Number2);
    }

    @And("I save the ticket")
    public void iClickOnSave() throws AWTException {
        bundlesPages.iSaveTicket();
    }

    @Then("I click to create a new single ticket")
    public void newSingle() {
        bundlesPages.createAnotherSingle();
    }

    @And("I enter the name {string}")
    public void iCreateNewSingle(String SingleReduced) {
        bundlesPages.enterTicketName3(SingleReduced);
    }

    @And("I enter another price of {double}")
    public void anotherPrice(double PriceReduced) {
        bundlesPages.enterPrice3(PriceReduced);
    }

    @Then("I click to create a new bundle")
    public void iCreateBundleForTwo() {
        bundlesPages.createNewBundle();
    }

    @And("I enter a bundle for two ticket name {string}")
    public void bundleForTwo(String BundleFamily) {
        bundlesPages.enterTicketNameBundle(BundleFamily);
    }

    @And("I enter a bundle for two ticket price {double}")
    public void enterPriceBundleTwo(double Price2) {
        bundlesPages.enterTicketPriceBundle(Price2);
    }

    @And("I enter included tickets")
    public void includedTickets() {
        bundlesPages.includedTicketsBundle();
    }

    @And("I enter the bundle for two quantity {int}")
    public void includeQty(int Qty1) {
        bundlesPages.includedQuantity(Qty1);
    }

    @And("I enter another included ticket")
    public void includeTheOther() throws AWTException {
        bundlesPages.includeMore();
    }

    @And("I enter the bundle2 quantity {int}")
    public void qtyOther(int Qty2) {
        bundlesPages.includedQuantity2(Qty2);
    }

    @And("I save the bundle")
    public void iSaveBundle() throws AWTException {
        bundlesPages.saveBundleClick();
    }

    @Then("I go to Advanced")
    public void goAdvanced() {
        bundlesPages.advancedTab();
    }

    @And("I open Checkout")
    public void iOpenCheckout() {
        bundlesPages.goToCheckout();
    }

    @And("I check to display the number of available tickets")
    public void iDisplayTickets() {
        bundlesPages.displayNumberOfTickets();
    }

    @And("I save the options")
    public void iSaveAvail() throws AWTException {
        bundlesPages.saveAvailClick();
    }

    @Then("I go to Preview")
    public void goPreview() {
        bundlesPages.nextPreview();
    }

    @And("I check if {string} is in the Preview")
    public void ticket1InPreview(String SingleFull) {
        bundlesPages.assertTicket1name(SingleFull);
    }

    @And("I check if ticket limit {string} is in the Preview")
    public void iAssertLimit(String Number1) {
        bundlesPages.assertLimit(Number1);
    }

    @And("I check if the single ticket has a price of {double}")
    public void checkSinglePrice(double PriceFull) {
        bundlesPages.assertPriceSingle(PriceFull);
    }

    @And("I check fee if the fee is correct for {double}")
    public void iAssertFirstFee(double PriceFull) {
        bundlesPages.assertFirstFee(PriceFull);
    }

    @And("I check if the reduced {string} is in the Preview")
    public void iCheckReduced(String SingleReduced) {
        bundlesPages.assertTicket2(SingleReduced);
    }

    @And("I check if the Reduced quantity is unlimited in the Preview")
    public void iCheckUnlimited() {
        bundlesPages.assertUnlimited();
    }

    @And("I check if the reduced ticket has a price of {double}")
    public void iCheckReducedPrice(double PriceReduced) {
        bundlesPages.assertReducedPrice(PriceReduced);
    }

    @And("I check if the fee is correct for {double}")
    public void iCheckReducedFee(double PriceReduced) {
        bundlesPages.assertReducedFee(PriceReduced);
    }

    @And("I check if the bundle {string} is in the Preview")
    public void iCheckBundledName(String bundleName) {
        bundlesPages.assertBundlename(bundleName);
    }
    @And ("I check if bundle price is {double}")
    public void iCheckBundlePrice(double Price2){bundlesPages.assertDisplayedBundlePrice(Price2);}

    @And ("I check if the bundle fee is correct for {double}")
    public void iCheckBundleFee(double Price2){}

    @And("I extract the savings {double}, {double}, {double}")
    public void extractTheSavings(double Price1, double PriceReduced, double Price2) {
    bundlesPages.assertBundleSavings(Price1, PriceReduced, Price2);
    }
    //@Then ("I add {int} single tickets")
    //public void clickLikeMad(int clicks){bundlesPages.clickAddButton1(clicks);}
    //@And ("I check if {string} appears")
    //public void iCheckSoldOut(String soldOut){bundlesPages.checkMessagePresent();}


    @Then ("I publish the event")
    public void iPublishEvent(){bundlesPages.clickPublishButton();}
    //@And ("I share the event")
    //public void iShareEvent(){bundlesPages.clickShareButoon();}
    // @And ("I go to Oveit Hub")
    //public void iGoHub(){bundlesPages.goToHubO();}
    //@Then ("I switch to Oveit Hub")
    //public void switchHub(){bundlesPages.switchToSecondWindow();}
}



