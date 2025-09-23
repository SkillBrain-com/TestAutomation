package org.skillbrain.stepDefinition.echipa1.attractionformsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.echipa1.attractionform.AttractionFormOverviewPage;
import org.skillbrain.utilities.TestContextSetup;

public class AttractionFormOverviewStepDefinition {

    private TestContextSetup testContextSetup;
    private AttractionFormOverviewPage attractionFormOverview;

    public AttractionFormOverviewStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        attractionFormOverview = testContextSetup.pageObjectFactory.getAttractionFormOverview();
    }

    @Then("Click on Next button")
    public void clickNextButton() {
        attractionFormOverview.clickNextButton();
    }

    @Then("Fill the Attraction name field with {string}")
    public void fillTheAttractionNameFieldWith(String attractionName) {
        attractionFormOverview.fillAttractionName(attractionName);
    }

    @And("Click the Date interval radio button")
    public void clickTheDateIntervalRadioButton() {
        attractionFormOverview.clickDateIntervalRadioButton();
    }

    @And("Fill the Start date combo box with {string}")
    public void fillTheStartDateComboBoxWith(String date) {
        attractionFormOverview.fillStartDateBox(date);
    }

    @And("Fill the Start time combo box with {string}")
    public void fillTheStartTimeComboBoxWith(String time) {
        attractionFormOverview.fillStartTimeBox(time);
    }

    @And("Expand the Location accordion")
    public void iExpandLocationTheAccordion() {
        attractionFormOverview.clickOnLocationAccordion();
    }

    @And("Fill the Location address field with {string}")
    public void iFillTheLocationAddressFieldWith(String locationName) {
        attractionFormOverview.fillLocationName(locationName);
    }

    @And("Expand the Advanced settings accordion")
    public void expandTheAccordion() {
        attractionFormOverview.clickAdvancedSettings();
    }

    @And("Click the Enable Guest Form checkbox")
    public void clickTheEnableGuestFormCheckbox() {
        attractionFormOverview.clickGuestFormCheckbox();
    }

    @And("Click the Enable Customer Form checkbox")
    public void clickTheEnableCustomerFormCheckbox() {
        attractionFormOverview.clickCustomerFormCheckbox();
    }



}
