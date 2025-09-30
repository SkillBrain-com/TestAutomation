package org.skillbrain.stepDefinition.echipa1.attractionformsteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.echipa1.attractionform.AttractionFormPreviewPublishPage;
import org.skillbrain.utilities.TestContextSetup;

import java.util.Map;

public class AttractionFormPreviewPublishStepDefinition {

    private TestContextSetup testContextSetup;
    private AttractionFormPreviewPublishPage attractionFormPreviewPublish;

    public AttractionFormPreviewPublishStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        attractionFormPreviewPublish = testContextSetup.pageObjectFactory.getAttractionFormPreviewPublish();
    }

    @Then("Click on Preview & Publish tab button")
    public void iClickOnPreviewPublishTabButton() {
        attractionFormPreviewPublish.clickOnPreviewPublishTab();
    }

    @And("Click the Add button")
    public void iClickTheAddButton() {
        attractionFormPreviewPublish.clickOnAddButton();
    }

    @And("Click the Second Add button")
    public void clickTheSecondAddButton() {
        attractionFormPreviewPublish.clickOnSecondAddButton();
    }

    @And("Click the Third Add button")
    public void clickTheThirdAddButton() {
        attractionFormPreviewPublish.clickOnThirdAddButton();
    }

    @And("Click the Continue button")
    public void iClickTheContinueButton() {
        attractionFormPreviewPublish.clickOnContinueButton();
    }

    @Then("Click the Company button")
    public void clickTheCompanyButton() {
        attractionFormPreviewPublish.clickCompanyButton();
    }

    @Then("Fill the Mandatory fields with:")
    public void fillTheMandatoryFieldsWith(DataTable table) {
        Map<String, String> data = table.asMaps(String.class, String.class).getFirst();

        attractionFormPreviewPublish.fillCustomerForm(data);
    }

    @And("Fill the Guest Custom Text field with {string}")
    public void fillTheGuestCustomTextFieldWith(String note) {
        attractionFormPreviewPublish.fillGuestForm(note);
    }

    @And("Click the Autoprocess radio button")
    public void iClickTheAutoprocessRadioButton() {
        attractionFormPreviewPublish.clickOnAutoProcButton();
    }

    @Then("Click the Pay button")
    public void iClickThePayButton() {
        attractionFormPreviewPublish.clickOnPayButton();
    }

    @Then("Check the Custom Text Field label for {string}")
    public void checkTheCustomTextFieldLabelFor(String name) {
        attractionFormPreviewPublish.checkCustomTextFieldLabel(name);
    }

    @Then("Check Customer form for all six custom fields")
    public void checkCustomerFormForTheAllSixCustomFields() {
        attractionFormPreviewPublish.checkSixFieldsCustomerForm();
    }

    @Then("Check Order summary items for {string}")
    public void checkOrderSummaryItemsForTOTAL(String total) {
        attractionFormPreviewPublish.checkOrderTotal(total);
    }

    @Then("Check if the order is completed")
    public void iCheckIfTheOrderIsCompleted() {
        attractionFormPreviewPublish.assertOrderCompleted();
    }

    @Then("Check Order confirmation step for an error message called {string}")
    public void checkOrderConfirmationStepForAnErrorMessage(String expectedMessage) {
        attractionFormPreviewPublish.checkErrorMessageForPayment(expectedMessage);
    }

    @And("Check the Customer Form for {string}")
    public void checkTheCustomerFormForCompanyName(String companyName) {
        attractionFormPreviewPublish.checkCompanyName(companyName);
    }

    @Then("Check the Customer Form for an error")
    public void checkTheCustomerFormForAnError() {
        attractionFormPreviewPublish.checkErrorMessageForCustomerForm();
    }

    @And("Click the Publish attraction button")
    public void clickThePublishAttractionButton() {
        attractionFormPreviewPublish.clickOnPublishAttractButton();
    }

    @And("Click the Share button")
    public void clickTheShareButton() {
        attractionFormPreviewPublish.clickOnShareButton();
    }

    @And("Click the Redirect button")
    public void clickTheRedirectButton() {
        attractionFormPreviewPublish.handleRedirect();
    }

    @And("Click the old Redirect button")
    public void clickTheOldRedirectButton() {
        attractionFormPreviewPublish.handleOldRedirect();
    }

    @And("Click the Apply button")
    public void clickTheApplyButton() {
        attractionFormPreviewPublish.clickApplyButton();
    }

    @Then("Check if the ticket has the {string} tag")
    public void checkIfTheTicketHasTheTag(String tag) {
        attractionFormPreviewPublish.checkPrivateLabel(tag);
    }

    @Then("Check the toast for the {string} message")
    public void checkTheToastForTheMessage(String toast) {
        attractionFormPreviewPublish.checkToastMessage(toast);
    }

    @And("Click the Default radio button")
    public void clickTheDefaultRadioButton() {
        attractionFormPreviewPublish.clickDefaultHubRadioButton();
    }

    @And("Fill the Code field, meant for customers, with the previously entered invitation {string}")
    public void fillTheCodeFieldMeantForCustomersWithThePreviouslyEnteredInvitation(String code) {
        attractionFormPreviewPublish.fillCustomerInviteCodeField(code);
    }

    @And("Fill the Code field, meant for guests, with the previously entered invitation {string}")
    public void fillTheCodeFieldMeantForGuestsWithThePreviouslyEnteredInvitation(String code) {
        attractionFormPreviewPublish.fillGuestInviteCodeField(code);
    }

    @Then("Check the {string}")
    public void checkThe(String result) {
        attractionFormPreviewPublish.checkCodeValidity(result);
    }
}
