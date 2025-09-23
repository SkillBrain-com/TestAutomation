package org.skillbrain.stepDefinition.echipa1.attractionformsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.echipa1.attractionform.AttractionFormCustomerFormPage;
import org.skillbrain.utilities.TestContextSetup;

public class AttractionFormCustomerFormStepDefinition {

    private TestContextSetup testContextSetup;
    private AttractionFormCustomerFormPage attractionFormCustomerForm;

    public AttractionFormCustomerFormStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        attractionFormCustomerForm = testContextSetup.pageObjectFactory.getAttractionFormCustomerForm();
    }

    @And("Click the Customer form tab button")
    public void clickTheCustomerFormTabButton() {
        attractionFormCustomerForm.clickCustomerFormTabButton();
    }

    @And("Click the New field button")
    public void clickTheNewFieldButton() {
        attractionFormCustomerForm.clickNewCustomFieldButton();
    }

    @Then("Fill the First Custom Name Field with {string}")
    public void fillTheFirstCustomFieldNameWith(String name) {
        attractionFormCustomerForm.fillFirstCustomTextField(name);
    }

    @And("Fill the Second Custom Name Field with {string}")
    public void fillTheSecondFieldNameWith(String name) {
        attractionFormCustomerForm.fillSecondCustomTextField(name);
    }

    @And("Fill the Third Custom Name Field with {string}")
    public void fillTheThirdFieldNameFieldWith(String name) {
        attractionFormCustomerForm.fillThirdCustomTextField(name);
    }

    @And("Fill the Forth Custom Name Field with {string}")
    public void fillTheForthFieldNameFieldWith(String name) {
        attractionFormCustomerForm.fillForthCustomTextField(name);
    }

    @And("Fill the Fifth Custom Name Field with {string}")
    public void fillTheFifthFieldNameFieldWith(String name) {
        attractionFormCustomerForm.fillFifthCustomTextField(name);
    }

    @And("Fill the Sixth Custom Name Field with {string}")
    public void fillTheSixthFieldNameFieldWith(String name) {
        attractionFormCustomerForm.fillSixthCustomTextField(name);
    }

    @And("Click the Second Field Type dropdown, pick the Multi-line text field item")
    public void clickTheSecondFieldTypeDropdownPickTheMultiLineTextFieldItem() {
        attractionFormCustomerForm.clickSecondCustomFieldDropdown();
    }

    @And("Click the Third Field Type dropdown, pick the Email address item")
    public void clickTheThirdFieldTypeDropdownPickTheEmailAddressItem() {
        attractionFormCustomerForm.clickThirdCustomFieldDropdown();
    }

    @And("Click the Forth Field Type dropdown, pick the Date item")
    public void clickTheForthFieldTypeDropdownPickTheDateItem() {
        attractionFormCustomerForm.clickForthCustomFieldDropdown();
    }

    @And("Click the Fifth Field Type dropdown, pick the Dropdown list item")
    public void clickTheFifthFieldTypeDropdownPickTheDropdownListItem() {
        attractionFormCustomerForm.clickFifthCustomFieldDropdown();
    }

    @And("Click the Sixth Field Type dropdown, pick the Checkbox item")
    public void clickTheSixthFieldTypeDropdownPickTheCheckboxItem() {
        attractionFormCustomerForm.clickSixthCustomFieldDropdown();
    }

    @And("Click the Multiple selection button, alongside filling the Values multi-line field with:")
    public void clickTheMultipleSelectionButtonAlongsideFillingTheValuesMultiLineFieldWith(String multiLineText) {
        attractionFormCustomerForm.clickMultipleSelectCheckBox();
        attractionFormCustomerForm.fillMultiLineValuesField(multiLineText);
    }

    @And("Click the Mandatory checkbox")
    public void clickTheMandatoryCheckbox() {
        attractionFormCustomerForm.clickMandatoryCheckBox();
    }

    @And("Click the Third Mandatory button")
    public void clickTheThirdMandatoryButton() {
        attractionFormCustomerForm.clickMiddleMandatoryButton();
    }

    @And("Click the Fifth Mandatory button")
    public void clickTheFifthMandatoryButton() {
        attractionFormCustomerForm.clickLastMandatoryButton();
    }

}