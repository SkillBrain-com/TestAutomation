package org.skillbrain.stepDefinition.echipa1.oveithubsteps;

import io.cucumber.java.PendingException;
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
}