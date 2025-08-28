package org.skillbrain.stepDefinition;

import io.cucumber.java.en.When;
import org.skillbrain.page.AttractionForm;
import org.skillbrain.page.EventsPage;
import org.skillbrain.utilities.TestContextSetup;

public class EventsPageStepDefinition {

    private TestContextSetup testContextSetup;
    private AttractionForm attractionForm;
    private EventsPage eventsPage;

    public EventsPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        attractionForm = testContextSetup.pageObjectFactory.getAttractionForm();
        eventsPage = testContextSetup.pageObjectFactory.getEventsPage();
    }

    @When("I click on Events sidebar")
    public void iClickOnEventsSidebar() {
        eventsPage.clickSidebar();
    }

    public void iClickOnVouchers() {
    }

    public void iClickOnCreateVoucherButton() {
    }


}


