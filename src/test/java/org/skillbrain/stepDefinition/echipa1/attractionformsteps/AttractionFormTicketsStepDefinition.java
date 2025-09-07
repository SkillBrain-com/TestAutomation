package org.skillbrain.stepDefinition.echipa1.attractionformsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.echipa1.attractionform.AttractionFormTicketsPage;
import org.skillbrain.utilities.TestContextSetup;

public class AttractionFormTicketsStepDefinition {

    private TestContextSetup testContextSetup;
    private AttractionFormTicketsPage attractionFormTickets;

    public AttractionFormTicketsStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        attractionFormTickets = testContextSetup.pageObjectFactory.getAttractionFormTickets();
    }

    @And("Click the Create ticket button")
    public void iClickTheCreateTicketButton() {
        attractionFormTickets.clickOnCreateTicket();
    }

    @Then("Fill the Ticket Name field with {string}")
    public void iFillTheNameFieldWith(String ticketName) {
        attractionFormTickets.fillTicketName(ticketName);
    }

    @And("Fill the Ticket Price field with {string}")
    public void iFillThePriceFieldWith(String ticketPrice) {
        attractionFormTickets.fillTicketPrice(ticketPrice);
    }

    @And("Click the Currency dropdown")
    public void clickTheCurrencyDropdown() {
        attractionFormTickets.clickCurrencyDropdown();
    }

    @And("Select RON item")
    public void selectRONItem() {
        attractionFormTickets.selectLeuItem();
    }

    @And("Click the Save ticket button")
    public void clickSaveButton() {
        attractionFormTickets.clickTicketSaveButton();
    }

    @Then("Click the New Ticket button")
    public void clickTheNewTicketButton() {
        attractionFormTickets.clickNewTicketButton();
    }

    @And("Click the New bundle button")
    public void clickTheNewBundleButton() {
        attractionFormTickets.clickNewBundleButton();
    }

    @And("Fill the Bundle Name field with {string}")
    public void fillTheBundleNameFieldWith(String name) {
        attractionFormTickets.fillBundleNameField(name);
    }

    @And("Fill the Bundle Price field with {string}")
    public void fillTheBundlePriceFieldWith(String price) {
        attractionFormTickets.fillBundlePriceField(price);
    }

    @And("Click the Add ticket button")
    public void clickTheAddTicketButton() {
        attractionFormTickets.clickAddTicketButton();
    }

    @And("Fill the Quantity field with {string}")
    public void fillTheQuantityFieldWith(String quantity) {
        attractionFormTickets.fillQuantityField(quantity);
    }

    @And("Pick the priced ticket item, within the Name dropdown")
    public void pickThePricedTicketItemWithinTheNameDropdown() {
        attractionFormTickets.selectPricedTicketItem();
    }

    @And("Click the Save bundle button")
    public void clickTheSaveBundleButton() {
        attractionFormTickets.clickOnBundleSave();
    }

}
