package org.skillbrain.stepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.EventsPage;
import org.skillbrain.utilities.TestContextSetup;

public class BundlesStepDefinition {
        private TestContextSetup testContextSetup;
        private EventsPage eventsPage;

        public BundlesStepDefinition (TestContextSetup testContextSetup) {
            this.testContextSetup = testContextSetup;
            eventsPage = testContextSetup.pageObjectFactory.getEventsPage();
        }

    @Then("I check if Events page is displayed")
    public void i_check_if_events_page_is_displayed() {eventsPage.CheckEventsLogged();}

   @And("I click on Create event button")
    public void i_click_on_create_event_button(){eventsPage.clickCreateEvent();}

   @And ("I enter the Event name")
   public void i_enter_the_event_name(){eventsPage.enterEventName();}

}
