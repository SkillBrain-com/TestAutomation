package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.skillbrain.page.TicketPage;
import org.skillbrain.utilities.TestContextSetup;

public class TicketFeeStepDefinition
{
    private TestContextSetup testContextSetup;
    private TicketPage ticketPage;

    public TicketFeeStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        ticketPage = testContextSetup.pageObjectFactory.getTicketPage();
    }


    @And("I click on edit an attraction")
    public void iClickOnEditAnAttraction() {
        ticketPage.EditAttraction();
    }

    @And("I click on my tickets of attraction")
    public void iClickOnMyTicketsOfAttraction() {
        ticketPage.TicketPageTab();
    }

    @Then("I create a ticket with the price {double} ron and with the name  {string} with tax not included")
    public void iCreateATicketWithThePriceRonAndWithTheNameWithTaxNotIncluded(double price, String name) {
        ticketPage.FillTicketNameAndPrice(150,"testbilet123");
    }

    @Then("I click on Preview & Publish of my aplication")
    public void iClickOnPreviewPublishOfMyAplication() {
        ticketPage.PreviewPage();
    }

    @Then("I check if ticket with the {string} appears with the price {double} and the corect fee")
    public void iCheckIfTicketWithTheAppearsWithThePriceAndTheCorectFee(String name, int price) {
        ticketPage.CheckingFee(price);
    }
}
