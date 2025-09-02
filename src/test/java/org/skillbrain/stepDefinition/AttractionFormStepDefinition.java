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

    @Then("Fill the Attraction name field with {string}")
    public void iFillTheAttractionNameFieldWith(String attractionName) {
        attractionForm.fillAttractionName(attractionName);
    }

    @And("Expand the Location accordion")
    public void iExpandLocationTheAccordion() {
        attractionForm.clickOnLocationAccordion();
    }
    
    @And("Fill the Location address field with {string}")
    public void iFillTheLocationAddressFieldWith(String locationName) {
        attractionForm.fillLocationName(locationName);
    }

    @Then("Click on Next button")
    public void iClickOnNextButton() {
        attractionForm.clickOnNext();
    }

    @And("Click the Create ticket button")
    public void iClickTheCreateTicketButton() {
        attractionForm.clickOnCreateTicket();
    }

    @Then("Fill the Ticket Name field with {string}")
    public void iFillTheNameFieldWith(String ticketName) {
        attractionForm.fillTicketName(ticketName);
    }

    @And("Fill the Ticket Price field with {string}")
    public void iFillThePriceFieldWith(String ticketPrice) {
        attractionForm.fillTicketPrice(ticketPrice);
    }

    @And("Click the Save button")
    public void iClickTheSaveButton() {
        attractionForm.clickOnTicketSave();
    }

    @Then("Click on Preview & Publish tab button")
    public void iClickOnPreviewPublishTabButton() {
        attractionForm.clickOnPaPTab();
    }

    @And("Click the Add button")
    public void iClickTheAddButton() {
        attractionForm.clickOnAddButton();
    }

    @And("Click the Continue button")
    public void iClickTheContinueButton() {
        attractionForm.clickOnContinueButton();
    }

    @Then("Fill the Mandatory * fields with {string}")
    public void iFillTheMandatoryFieldsWith(String info) {
        attractionForm.fillCustomerForm(info);
    }

    @And("Click the Autoprocess radio button")
    public void iClickTheAutoprocessRadioButton() {
        attractionForm.clickOnAutoProcButton();
    }

    @Then("Click the Pay button")
    public void iClickThePayButton() {
        attractionForm.clickOnPayButton();
    }

    @Then("Check if the order is completed")
    public void iCheckIfTheOrderIsCompleted() {
        attractionForm.assertOrderCompleted();
    }

    @And("I input the mandatory field of a attractions with the name {string} and location {string}")
    public void iInputTheMandatoryFieldOfAAttractionsWithTheNameAndLocation(String name, String location) {
        attractionForm.fillAttractionMandatory(name,location);
    }

    @And("Expand the Advanced settings accordion")
    public void expandTheAccordion() {
        attractionForm.clickAdvancedSettings();
    }

    @And("Click the Enable Customer Form checkbox")
    public void clickTheEnableCustomerFormCheckbox() {
        attractionForm.clickCustomerFormCheckbox();
    }

    @And("Click the Customer form tab button")
    public void clickTheCustomerFormTabButton() {
        attractionForm.clickCustomerFormTabButton();
    }

    @Then("Fill the Custom Field Name field with {string}")
    public void fillTheCustomFieldNameFieldWith(String name) {
        attractionForm.fillCustomTextField(name);
    }

    @And("Click the Mandatory checkbox")
    public void clickTheMandatoryCheckbox() {
        attractionForm.clickMandatoryCheckBox();
    }

    @Then("Check the Custom Text Field")
    public void checkTheCustomTextField() {
        attractionForm.checkCustomTextField();
    }
}
