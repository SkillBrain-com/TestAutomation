package org.skillbrain.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.skillbrain.page.AttractionForm;
import org.skillbrain.utilities.TestContextSetup;

public class AttractionFormStepDefinition {

    private TestContextSetup testContextSetup;
    private AttractionForm attractionForm;


    public AttractionFormStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        attractionForm = testContextSetup.pageObjectFactory.getAttractionForm();
    }

    @When("I click on Next button")
    public void iClickOnNextButton() {
        attractionForm.clickOnNext();
    }

    @Then("I check the following error message is displayed {string}")
    public void iCheckTheFollowingErrorMessageIsDisplayed(String errorMessage) {
        attractionForm.checkErrorIsDisplayed(errorMessage);
    }
}
