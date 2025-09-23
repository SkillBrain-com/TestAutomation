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

    @And("I enter the price for single ticket {string}")
    public void iEnterSinglePrice(String Price1) {
        bundlesPages.enterPrice(Price1);}

    @And("I uncheck to include fees")
    public void doNotIncludeFees() {
        bundlesPages.excludeFees();}


    @Then("I open Ticket configuration")
    public void iOpenTicketConfiguration() {
        bundlesPages.openTicketConfiguration();}

    @And("I open Numbering")
    public void iOpenNumbering() {
        bundlesPages.openNumbering();}

    @And("I enter total available tickets {string}")
    public void iEnterTotalTickets(String Number1) {
        bundlesPages.totalAvailableTickets(Number1);}

    @And("I enter maximum tickets per order {string}")
    public void iEnterTicketPerOrder(String Number2) {
        bundlesPages.orderLimit(Number2);}

    @And("I save the ticket")
    public void iClickOnSave() throws AWTException {
        bundlesPages.iSaveTicket();}

    @Then("I click to create a new bundle")
    public void iCreateBundleForTwo() {
        bundlesPages.createNewBundle();}

    @And("I enter a bundle for two ticket name {string}")
    public void bundleForTwo(String Name2) {
        bundlesPages.enterTicketNameBundle(Name2);}

    @And("I enter a bundle for two ticket price {string}")
    public void enterPriceBundleTwo(String Price2) {
        bundlesPages.enterTicketPriceBundle(Price2);}

    @And("I enter included tickets")
    public void includedTickets() throws AWTException {
        bundlesPages.includedTicketsBundle();}

    @And("I enter the bundle for two quantity {string}")
    public void includeQty(String Qty1) {
        bundlesPages.includedQuantity(Qty1);}

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

    //@And ("I check if the single ticket name is in the Preview")
    //public void ticket1InPreview(){bundlesPages.assertTicket1name();}

    //@Then("Then I add {string} tickets from {string})
    //public void

}
