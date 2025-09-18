package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.AttractionForm;
import org.skillbrain.utilities.TestContextSetup;

public class AttractionFormStepDefinition {

    private TestContextSetup testContextSetup;
    private AttractionForm attractionForm;

    public AttractionFormStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        attractionForm = testContextSetup.pageObjectFactory.getAttractionForm();
    }

    @Then("I fill the Attraction name field with {string}")
    public void iFillTheAttractionNameFieldWith(String attractionName) {
        attractionForm.fillAttractionName(attractionName);
    }

    @And("I expand the Location accordion")
    public void iExpandLocationTheAccordion() {
        attractionForm.clickOnLocationAccordion();
    }
    
    @And("I fill the Location address field with {string}")
    public void iFillTheLocationAddressFieldWith(String locationName) {
        attractionForm.fillLocationName(locationName);
    }

    @Then("I click on Next button")
    public void iClickOnNextButton() {
        attractionForm.clickOnNext();
    }

    @And("I click the Create ticket button")
    public void iClickTheCreateTicketButton() {
        attractionForm.clickOnCreateTicket();
    }

    @Then("I fill the Name field with {string}")
    public void iFillTheNameFieldWith(String ticketName) {
        attractionForm.fillTicketName(ticketName);
    }

    @And("I fill the Price field with {string}")
    public void iFillThePriceFieldWith(String ticketPrice) {

        attractionForm.fillTicketPrice(ticketPrice);
    }

    @And("I click the Save button")
    public void iClickTheSaveButton() {
        attractionForm.clickOnTicketSave();
    }

    @Then("I click on Preview & Publish tab button")
    public void iClickOnPreviewPublishTabButton() {
        attractionForm.clickOnPaPTab();
    }

    @And("I click the Add button")
    public void iClickTheAddButton() {
        attractionForm.clickOnAddButton();
    }

    @And("I click the Continue button")
    public void iClickTheContinueButton() {
        attractionForm.clickOnContinueButton();
    }

    @Then("I fill the Mandatory * fields with {string}")
    public void iFillTheMandatoryFieldsWith(String info) {
        attractionForm.fillCustomerForm(info);
    }

    @And("I click the Autoprocess radio button")
    public void iClickTheAutoprocessRadioButton() {
        attractionForm.clickOnAutoProcButton();
    }

    @Then("I click the Pay button")
    public void iClickThePayButton() {
        attractionForm.clickOnPayButton();
    }

    @Then("I check if the order is completed")
    public void iCheckIfTheOrderIsCompleted() {
        attractionForm.assertOrderCompleted();
    }


    @And("I input the mandatory field of a attractions with the name {string} and location {string}")
    public void iInputTheMandatoryFieldOfAAttractionsWithTheNameAndLocation(String name, String location) {
        attractionForm.fillAttractionMandatory(name,location);
    }

}
