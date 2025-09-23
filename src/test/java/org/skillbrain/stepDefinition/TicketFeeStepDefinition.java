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
        ticketPage.FillTicketNameAndPrice(price,name);
    }

    @Then("I click on Preview & Publish of my application")
    public void iClickOnPreviewPublishOfMyAplication() {
        ticketPage.PreviewPage();
    }

    @Then("I check if ticket with the {string} appears with the price {double} and the corect fee")
    public void iCheckIfTicketWithTheAppearsWithThePriceAndTheCorectFee(String name, int price) {
        ticketPage.CheckingFee(price);
    }

    public void iCheckIfTicketWithTheAppearsWithThePriceAndTheCorectFee(String name, double price) {
        ticketPage.CheckingFee(price);
    }

    @Then("I publish my attraction")
    public void iPublishMyAttraction() {
        ticketPage.publishAttraction();
    }

    @Then("I delete the attraction")
    public void iDeleteTheAttraction() {
        ticketPage.deleteAttraction();
    }

    @Then("I click share button")
    public void iClickShareButton() {
        ticketPage.shareAttractionMenu();
    }

    @And("I open AttractionPage")
    public void iOpenAttractionPage() {
       ticketPage.RedirectToAttractionPage();
    }

    @Then("I click buy now")
    public void iClickCumparaAcum() {
        ticketPage.BuyNow();
    }

    @Then("I check if ticket with the {string} appears with the price {double} and the corect fee in the Attraction Page")
    public void iCheckIfTicketWithTheAppearsWithThePriceAndTheCorectFeeInTheAttractionPage(String name, double price) {
        ticketPage.CheckingFeeAttractionPage(price);
    }

    @Then("I change to the home page")
    public void iChangeToTheHomePage() {
        ticketPage.ChangeToHomePage();
    }

    @And("I close Share menu")
    public void iCloseShareMenu() {
        ticketPage.closeShareMenu();
    }


    @Then("I create a ticket with the price {int} ron and with the name  {string} with tax  included")
    public void iCreateATicketWithThePriceRonAndWithTheNameWithTaxIncluded(int price, String name) {
        ticketPage.FillTicketNameAndPrice(price,name);
        ticketPage.includefeeInPrice();

    }

    @Then("I check if the tax is included")
    public void iCheckIfTheTaxIsIncluded() {
        ticketPage.CheckIfTaxIsIncluded();

    }

    @Then("I create a ticket with the price {int} ron and with the name  {string} with tax  included v2")
    public void iCreateATicketWithThePriceRonAndWithTheNameWithTaxIncludedAndNotSave(int price, String name) {
        ticketPage.FillTicketNameAndPriceAndNotSave(price,name);
        ticketPage.includefeeInPrice();
        ticketPage.SaveTicket();
    }

    @Then("click save ticket")
    public void clickSaveTicket() {
        ticketPage.SaveTicket();
    }
}
