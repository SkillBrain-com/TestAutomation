package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.ApprovalTicket;
import org.skillbrain.utilities.TestContextSetup;

public class ApprovalTicketStepDefinition {
    private final TestContextSetup testContextSetup;
    private final ApprovalTicket approvalTicket;

    public ApprovalTicketStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.approvalTicket = testContextSetup.pageObjectFactory.getApprovalTicket();
    }

    @Then("I expand the Ticket Configuration")
    public void ExpandTheTicketConfiguration() {
        approvalTicket.getClickOnTicketConfig();
    }

    @Then("I click on Approval List")
    public void iClickOnApprovalList() {
        approvalTicket.clickOnApprovalList();
    }

    @And("I click on Enable button")
    public void iClickOnEnableButton() {
        approvalTicket.clickOnEnable();
    }

    @Then("I fill with an {string}")
    public void iFillWithAn(String email) {
        approvalTicket.addEmail(email);
    }

    @Then("I click on apply button")
    public void iClickOnApplyButton() {
        approvalTicket.clickApply();
    }

    @And("I check if the order is finalized")
    public void iCheckIfTheOrderIsFinalized() {
        approvalTicket.getOrderCompleted();
    }


}


