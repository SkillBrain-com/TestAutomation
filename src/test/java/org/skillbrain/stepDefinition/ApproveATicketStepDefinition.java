package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.ApproveTicketOrder;
import org.skillbrain.utilities.TestContextSetup;

public class ApproveATicketStepDefinition {

    private TestContextSetup testContextSetup;
    private ApproveTicketOrder approveTicketOrder;

    public ApproveATicketStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.approveTicketOrder = testContextSetup.pageObjectFactory.getApproveATicketOrder();
    }

    @Then("I click on reports")
    public void iClickOnReports() {
        approveTicketOrder.clickOnReports();
    }

    @Then("I click on order history")
    public void iClickOnOrderHistory() {
        approveTicketOrder.clickOnOrders();
    }

    @And("I click on ticket number")
    public void iClickOnTicketNumber() {
        approveTicketOrder.getClickOnTicket();
    }

    @Then("I click on approve")
    public void iClickOnApprove() {
        approveTicketOrder.clickOnApprove();
    }

    @And("I verify if the order is approved")
     public void iVerifyIfTheOrderIsApproved() {
       approveTicketOrder.orderApprovedVerification();
    }
}
