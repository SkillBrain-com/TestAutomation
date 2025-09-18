package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.AttractionForm;
import org.skillbrain.utilities.TestContextSetup;

public class CustomerFormStepDefinition {
    private TestContextSetup testContextSetup;
    private AttractionForm customerForm;

    public CustomerFormStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        customerForm = testContextSetup.pageObjectFactory.getAttractionForm();
        }

    @Then("Fill the Attraction name field with {string}")
    public void fill_the_attraction_name_field_with(String attractionName) {
        customerForm.fillAttractionNameField(attractionName);
    }
    @Then("Expand location Accordion")
    public void expandLocationAccordion() {
        customerForm.expandlocation();
    }

    @And("Fill {string} Field")
    public void fill_location_field(String location) {

        customerForm.fillLocationName2(location);
    }


    @Then("Expand Advanced settings Field")
    public void expandAdvancedSettingsField() {
        customerForm.expandAdvancedSettingsField();
    }

    @And("Click {string} Checkbox")
    public void clickCheckbox(String enableCustomerForm) {
        customerForm.enableCustomerForm();
    }

    @Then("Click {string} Button")
    public void clickButton(String clickOnNextButton) {
        customerForm.clickOnNextButtonOverview();
    }

    @And("Click On Create Ticket Button")
    public void clickOnCreateTicketButton() {
        customerForm.clickOncreateTicketButton();
    }
}



//    And Fill "Location/address"Field
//    Then Expand "Advanced settings".
//    And Click "Enable Customer Form"Checkbox
//    Then Click "Next Button"Button
//    And Click "Create ticket"Button
//    Then Fill "Name"Field .
//    And Clik "Create ticket"
//    Button to create the second ticket
//    Then Fill "Name"Field .
//    And Fill "Price"Field, with value "10".
//    Then Click "Save"Button .
//    And Click "Customer form" Button.
//    Then Click "Field Name"Field .
//    And Click "Mandatory"Checkbox .
//    Then Click "Next"Button .
//    And Click "+"Button .
//    Then Click "Continue" Button.
//            And Check


