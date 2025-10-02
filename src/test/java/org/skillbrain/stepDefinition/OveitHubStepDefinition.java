package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.BasePage;
import org.skillbrain.page.HomePage;
import org.skillbrain.page.OveitHub;
import org.skillbrain.utilities.TestContextSetup;

public class OveitHubStepDefinition {
    private TestContextSetup testContextSetup;
    private HomePage homePage;
    private OveitHub oveitHub;
    private BasePage basePage;

    public OveitHubStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        oveitHub = testContextSetup.pageObjectFactory.getOveitHub();
    }

    @And("I click on Go to Hub button")
    public void i_click_on_go_to_hub_button() {
        oveitHub.clickOveitHubButton();

    }

    @Then("I click on event title")
    public void iClickOnEventTitle() {
        oveitHub.clickEventTitle();
    }

    @And("I click on {string} button")
    public void iClickOnButton(String arg0) {
        oveitHub.iClickOnBookNowButton();
    }

    @And("I complete the email and name event fields")
    public void iCompleteTheEmailAndNameEventFields() {
        oveitHub.iCompleteEmailAndNameEvent();
    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() {
        oveitHub.clickOnSubmitButton();
    }


}



