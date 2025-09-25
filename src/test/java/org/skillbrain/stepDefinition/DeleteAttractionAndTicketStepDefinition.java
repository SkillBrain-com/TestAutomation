package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.DeleteAttractionAndTicket;
import org.skillbrain.utilities.TestContextSetup;

public class DeleteAttractionAndTicketStepDefinition {

    private TestContextSetup testContextSetup;
    private DeleteAttractionAndTicket deleteAttractionAndTicketStepDefinition;

    public DeleteAttractionAndTicketStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.deleteAttractionAndTicketStepDefinition = testContextSetup.pageObjectFactory.getDeleteAttractionAndTicket();
    }
    @Then("I delete the existent ticket")
    public void iDeleteTheExistentTicket() {
        deleteAttractionAndTicketStepDefinition.deleteATicket();

    }

    @Then("I click On More")
    public void iClickOnMore() {
        deleteAttractionAndTicketStepDefinition.clickOnMoreAttractionSettings();
    }

    @And("Remove attraction")
    public void removeAttraction() {
        deleteAttractionAndTicketStepDefinition.clickOnRemoveAttraction();
    }

    @Then("Click on Attraction side-bar")
    public void clickOnAttractionSideBar() {
        deleteAttractionAndTicketStepDefinition.clickOnAttractionSideBar();
    }
}
