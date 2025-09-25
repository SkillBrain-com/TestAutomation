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
        bundlesPages = testContextSetup.pageObjectFactory.getBundlesPages();}

    @And("I check if Events page is displayed")
    public void i_check_if_events_page_is_displayed() {
        eventsPage.CheckEventsLogged();}

    @And("I click on Create event button")
    public void i_click_on_create_event_button() {
        eventsPage.clickCreateEvent();}

    @And("I enter the Event name")
    public void i_enter_the_event_name() {
        eventsPage.enterEventName();}

    @And("I enter the Start date")
    public void iEnterTheStartDate() {
        eventsPage.enterStartDate();}

    @And("I enter Start time")
    public void iEnterStartTime() {
        eventsPage.enterStartTime();}

    @And("I enter the End date")
    public void iEnterTheEndDate() {
        eventsPage.enterEndDate();}

    @And("I enter the End time")
    public void iEnterTheEndTime() {
        eventsPage.enterEndTime();}

    @And("I open Location drop-down")
    public void iOpenLocation() {
        eventsPage.clickLocation();}

    @And("I enter the Location")
    public void iEnterTheLocation() {
        eventsPage.iEnterTheLocation();}

    @And("I click Save event")
    public void iClickSaveEvent() {
        eventsPage.saveEvent();}

    @Then("I click Next")
    public void iClickNext() {
        eventsPage.nextEvent();}

    @Then("I go to Tickets tab")
    public void goToTicketsTab() {
        bundlesPages.goToTickets();}

    @And("I click on New Ticket")
    public void iCreateNewTicket() {
        bundlesPages.clickNewTicket();}

    @Then("I enter a single ticket name {string}")
    public void iEnterNormalTicket(String Name1) {
        bundlesPages.enterTicketName(Name1);}

    @And("I enter the price for single ticket {double}")
    public void iEnterSinglePrice(double Price1){
        bundlesPages.enterPrice(Price1);
    }
    @And("I uncheck to include fees")
    public void doNotIncludeFees() {
        bundlesPages.excludeFees();}

    @Then("I open Ticket configuration")
    public void iOpenTicketConfiguration() {
        bundlesPages.openTicketConfiguration();}

    @And("I open Numbering")
    public void iOpenNumbering() {
        bundlesPages.openNumbering();}

    @And("I enter total available tickets {int}")
    public void iEnterTotalTickets(int Number1) {
        bundlesPages.totalAvailableTickets(Number1);}

    @And("I enter maximum tickets per order {int}")
    public void iEnterTicketPerOrder(int Number2) {
        bundlesPages.orderLimit(Number2);}

    @And("I save the ticket")
    public void iClickOnSave() throws AWTException {
        bundlesPages.iSaveTicket();}
    @Then ("I click to create a new single ticket")
    public void newSingle(){bundlesPages.createAnotherSingle();
    }
    @And ("I enter the name {string}")
    public void iCreateNewSingle(String Name3){bundlesPages.enterTicketName3(Name3);
    }
    @And ("I enter another price of {double}")
    public void anotherPrice (double Price3){bundlesPages.enterPrice3(Price3);}

    @Then("I click to create a new bundle")
    public void iCreateBundleForTwo() {
        bundlesPages.createNewBundle();}

    @And("I enter a bundle for two ticket name {string}")
    public void bundleForTwo(String Name2) {
        bundlesPages.enterTicketNameBundle(Name2);}

    @And("I enter a bundle for two ticket price {double}")
    public void enterPriceBundleTwo(double Price2) {
        bundlesPages.enterTicketPriceBundle(Price2);}

    @And("I enter included tickets")
    public void includedTickets(){
        bundlesPages.includedTicketsBundle();}

    @And("I enter the bundle for two quantity {int}")
    public void includeQty(int Qty1) {
        bundlesPages.includedQuantity(Qty1);}

    @And ("I enter another included ticket")
    public void includeTheOther(){
        bundlesPages.includeMore();
    }
    @And ("I enter the bundle quantity {int}")
    public void qtyOther(int Qty2){
        bundlesPages.includedQuantity2(Qty2);
    }

    @And("I save the bundle")
    public void iSaveBundle() throws AWTException {
        bundlesPages.saveBundle();}

    @Then("I go to Advanced")
    public void goAdvanced(){bundlesPages.advancedTab();}

    @And ("I open Checkout")
    public void iOpenCheckout(){bundlesPages.goToCheckout();}

    @And("I check to display the number of available tickets")
    public void iDisplayTickets(){bundlesPages.displayNumberOfTickets();}

    @And ("I save the options")
    public void iSaveAvail() throws AWTException {bundlesPages.saveAvailClick();}

    @Then("I go to Preview")
    public void goPreview(){bundlesPages.nextPreview();}

    @And ("I check if {string} is in the Preview")
    public void ticket1InPreview(String Name1){bundlesPages.assertTicket1name(Name1);}
    @And("I check if ticket limit {string} is in the Preview")
    public void iAssertLimit(String Number1){bundlesPages.assertLimit(Number1);}

    @And ("I check if the single ticket has a price of {double}")
    public void checkSinglePrice(double Price1){bundlesPages.assertPriceSingle(Price1);}

    @And ("I check fee if the fee is correct for {double}")
    public void iAssertFirstFee(double Price1){bundlesPages.assertFirstFee(Price1);}

    @And ("I check if bundle {string} is in the Preview")
    public void iCheckName2(String Name2){bundlesPages.assertTicket2(Name2);}

}



