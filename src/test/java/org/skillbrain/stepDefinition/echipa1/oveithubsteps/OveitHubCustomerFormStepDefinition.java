package org.skillbrain.stepDefinition.echipa1.oveithubsteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.echipa1.oveithub.OveitHubCustomerFormPage;
import org.skillbrain.utilities.TestContextSetup;

import java.util.Map;

public class OveitHubCustomerFormStepDefinition {

    private TestContextSetup testContextSetup;
    private OveitHubCustomerFormPage oveitHubCustomerForm;

    public OveitHubCustomerFormStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        oveitHubCustomerForm = testContextSetup.pageObjectFactory.getOveitHubCustomerForm();
    }

    @Then("Check order summary, for the order with 20 tickets")
    public void checkOrderSummaryForTheOrderWithTickets() {
        oveitHubCustomerForm.checkTwentyTickets();
    }

    @And("Fill the simple Mandatory fields with:")
    public void fillTheSimpleMandatoryFieldsWith(DataTable table) {
        Map<String, String> data = table.asMaps(String.class, String.class).getFirst();

        oveitHubCustomerForm.fillSimpleCustomerForm(data);
    }

    @Then("Click the simple Pay button")
    public void clickTheSimplePayButton() {
        oveitHubCustomerForm.clickSimplePayButton();
    }

    @Then("Click the simple Autoprocess radio button")
    public void clickTheSimpleAutoprocessRadioButton() {
        oveitHubCustomerForm.clickSimpleAutoProcRadioButton();
    }
}