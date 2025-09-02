package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.AttractionForm;
import org.skillbrain.utilities.TestContextSetup;

public class PrivateTicketStepDefinition {
    private TestContextSetup testContextSetup;
    private AttractionForm privateTicket;

    public PrivateTicketStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        privateTicket = testContextSetup.pageObjectFactory.getAttractionForm();
    }

    @Then("I click the Ticket configuration button")
    public void clickTicketConfigurationButton() {
        privateTicket.clickTicketConfiguration();
    }

    @And("I click on Ticket visibility")
    public void clickOnTicketVisibility() {
        privateTicket.clickOnTicketVisibility();
    }

    @Then("I click on Private invitation")
    public void clickOnPrivateInvitation() {
        privateTicket.clickOnPrivateInvitation();
    }

    @And("I fill the Invitation code with {string}")
    public void fillTheInvitationCodeWith(String string) {
        privateTicket.fillTheInvitationCode();
    }

    @Then("I click again on Next button")
    public void ClickAgainOnNextButton() {
        privateTicket.ClickOnNextButton();
    }

    @And("I insert the {string}")
    public void InsertThe(String string) {
        privateTicket.insertTheString();
    }

    @Then("I insert an e-mail address {string}")
    public void InsertTheEmailAddress(String string) {
        privateTicket.insertTheEmailAdress();
    }

    @And("I click on Register button")
    public void ClickOnRegisterButton() {
        privateTicket.clickOnRegistredButton();
    }

    @Then("I click on Publish attraction")
    public void i_click_on_publish_attraction() {
        privateTicket.clickOnPublishAttraction();
    }
}

