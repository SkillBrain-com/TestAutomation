package org.skillbrain.stepDefinition.echipa1.oveithubsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.echipa1.oveithub.OveitHubTicketsPage;
import org.skillbrain.utilities.TestContextSetup;

public class OveitHubTicketsStepDefinition {

    private TestContextSetup testContextSetup;
    private OveitHubTicketsPage oveitHubTickets;

    public OveitHubTicketsStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        oveitHubTickets = testContextSetup.pageObjectFactory.getOveitHubTickets();
    }

    @And("Click the Buy Now button")
    public void clickOnBuyNowButton() {
        oveitHubTickets.clickOnBuyNowButton();
    }

    @And("Click the Add button for {int} times")
    public void clickTheAddButtonForTimes(int nr) {
        oveitHubTickets.clickMultipleOnAddButton(nr);
    }

    @Then("Check the ticket quantity, the add button must not be disabled")
    public void checkTheTicketQuantityTheAddButtonMustNotBeDisabled() {
        oveitHubTickets.checkTicketPlus();
    }

    @Then("Check the continue and subtract buttons, they must be disabled")
    public void checkTheContinueAndSubtractButtonsTheyMustBeDisabled() {
        oveitHubTickets.checkContinueMinus();
    }

    @And("Click the simple Continue button")
    public void clickTheSimpleContinueButton() {
        oveitHubTickets.clickSimpleContinueButton();
    }

    @And("Click the simple Add button")
    public void clickTheSimpleAddButton() {
        oveitHubTickets.clickSimpleAddButton();
    }

    @Then("Click the simple Second Add button")
    public void clickTheSimpleSecondAddButton() {
        oveitHubTickets.clickSimpleSecondAddButton();
    }

    @And("Click the simple Third Add button")
    public void clickTheSimpleThirdAddButton() {
        oveitHubTickets.clickSimpleThirdAddButton();
    }

    @And("Click the Register now button")
    public void clickTheRegisterNowButton() {
        oveitHubTickets.clickOnRegisterNowButton();
    }

    @And("Fill the simple Code field, meant for customers, with the previously entered invitation {string}")
    public void fillTheSimpleCodeFieldMeantForCustomersWithThePreviouslyEnteredInvitation(String code) {
        oveitHubTickets.fillSimpleCustomerInviteCodeField(code);
    }

    @And("Fill the simple Code field, meant for guests, with the previously entered invitation {string}")
    public void fillTheSimpleCodeFieldMeantForGuestsWithThePreviouslyEnteredInvitation(String code) {
        oveitHubTickets.fillSimpleGuestInviteCodeField(code);
    }

    @And("Click the simple Apply button")
    public void clickTheSimpleApplyButton() {
        oveitHubTickets.clickSimpleApplyButton();
    }

    @Then("Check if the simple ticket has the {string} tag")
    public void checkIfTheSimpleTicketHasTheTag(String tag) {
        oveitHubTickets.checkSimplePrivateLabel(tag);
    }

    @Then("Check the toast for the simple {string} message")
    public void checkTheToastForTheSimpleMessage(String toast) {
        oveitHubTickets.checkSimpleToastMessage(toast);
    }
}