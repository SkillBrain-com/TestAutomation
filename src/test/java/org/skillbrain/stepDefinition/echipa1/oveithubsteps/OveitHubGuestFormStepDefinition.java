package org.skillbrain.stepDefinition.echipa1.oveithubsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.echipa1.oveithub.OveitHubGuestFormPage;
import org.skillbrain.utilities.TestContextSetup;

public class OveitHubGuestFormStepDefinition {

    private TestContextSetup testContextSetup;
    private OveitHubGuestFormPage oveitHubGuestForm;

    public OveitHubGuestFormStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        oveitHubGuestForm = testContextSetup.pageObjectFactory.getOveitHubGuestForm();
    }

    @And("Click Reserve now button")
    public void clickReserveNowButton() {
        oveitHubGuestForm.clickReserveNowButton();
    }

    @Then("Fill the Email Address Field with {string}")
    public void fillTheEmailAddressFieldWith(String email) {
        oveitHubGuestForm.fillGuestEmailField(email);
    }

    @And("Click Register button")
    public void clickRegisterButton() {
        oveitHubGuestForm.clickRegisterButton();
    }

    @Then("Check registration results")
    public void checkRegistrationResults() {
        oveitHubGuestForm.assertGuestRegistration();
    }
}