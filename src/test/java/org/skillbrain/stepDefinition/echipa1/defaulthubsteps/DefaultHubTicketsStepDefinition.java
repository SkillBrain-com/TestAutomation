package org.skillbrain.stepDefinition.echipa1.defaulthubsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.echipa1.defaulthub.DefaultHubTicketsPage;
import org.skillbrain.utilities.TestContextSetup;

public class DefaultHubTicketsStepDefinition {

    private TestContextSetup testContextSetup;
    private DefaultHubTicketsPage defaultHubTicketsPage;

    public DefaultHubTicketsStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        defaultHubTicketsPage = testContextSetup.pageObjectFactory.getDefaultHubTickets();
    }

    @And("Fill the old Code field, with the previously entered invitation {string}")
    public void fillTheOldCodeFieldWithThePreviouslyEnteredInvitation(String code) {
        defaultHubTicketsPage.fillOldCustomerPrivateInviteCodeField(code);
    }

    @And("Click the old Apply button")
    public void clickTheOldApplyButton() {
        defaultHubTicketsPage.clickOldApplyButton();
    }

    @Then("Check if the ticket has the old {string} tag")
    public void checkIfTheTicketHasTheOldTag(String tag) {
        defaultHubTicketsPage.checkOldPrivateLabel(tag);
    }

    @Then("Check the toast for the old {string} message")
    public void checkTheToastForTheOldMessage(String toast) {
        defaultHubTicketsPage.checkOldToastMessage(toast);
    }

    @And("Click the Reserve tickets button")
    public void clickTheReserveTicketsButton() {
        defaultHubTicketsPage.clickReserveTicketsButton();
    }
}