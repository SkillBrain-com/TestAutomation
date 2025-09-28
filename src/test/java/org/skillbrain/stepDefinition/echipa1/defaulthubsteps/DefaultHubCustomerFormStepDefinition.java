package org.skillbrain.stepDefinition.echipa1.defaulthubsteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.echipa1.defaulthub.DefaultHubCustomerFormPage;
import org.skillbrain.utilities.TestContextSetup;

import java.util.Map;

public class DefaultHubCustomerFormStepDefinition {

    private TestContextSetup testContextSetup;
    private DefaultHubCustomerFormPage defaultHubCustomerFormPage;

    public DefaultHubCustomerFormStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        defaultHubCustomerFormPage = testContextSetup.pageObjectFactory.getDefaultHubCustomerForm();
    }

    @And("Fill the six fields for the Customer Form with:")
    public void fillTheSixFieldsForTheCustomerFormWith(DataTable table) {
        Map<String, String> data = table.asMaps(String.class, String.class).getFirst();

        defaultHubCustomerFormPage.fillOldCustomerForm(data);
    }

    @And("Click the old Continue button")
    public void clickTheOldContinueButton() {
        defaultHubCustomerFormPage.clickOldContinueButton();
    }

    @And("Click the old Autoprocess radio button")
    public void clickTheOldAutoprocessRadioButton() {
        defaultHubCustomerFormPage.clickOldAutoProcRadioButton();
    }

    @Then("Check if the old order is completed")
    public void checkIfTheOldOrderIsCompleted() {
        defaultHubCustomerFormPage.assertDefaultOrderCompleted();
    }
}