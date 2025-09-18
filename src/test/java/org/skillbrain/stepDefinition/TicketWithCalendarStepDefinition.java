package org.skillbrain.stepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.TicketWithCalendar;
import org.skillbrain.utilities.TestContextSetup;

public class TicketWithCalendarStepDefinition {
    private TestContextSetup testContextSetup;
    private TicketWithCalendar ticketWithCalendar;

    public TicketWithCalendarStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.ticketWithCalendar = testContextSetup.pageObjectFactory.getTicketWithCalendar();
    }

    @Then("I click on date interval")
    public void iClickOnDateInterval() {
        ticketWithCalendar.clickOnDateInterval();
    }

    @And("I fill {string}")
    public void iFill(String DataAndTime) {
        ticketWithCalendar.fillDataAndTime(DataAndTime);

    }

    @Then("I click on Availability Schedule")
    public void iClickOnAvailabilitySchedule() {
        ticketWithCalendar.clickOnAvailabilitySchedule();

    }

    @And("I fill {string} ticket availability")
    public void iFillTicketAvailability(String AvailableDateAndTimeTicket) {
        ticketWithCalendar.clickDateWhenTicketCanBeBuy(AvailableDateAndTimeTicket);
    }

    @Then("I click on Specific Weekend")
    public void iClickOnSpecificDates() {
        ticketWithCalendar.clickOnSpecificWeekend();
    }


    @Then("I add {string} when the ticket can be buy")
    public void iAddWhenTheTicketCanBeBuy(String Data) {
        ticketWithCalendar.getSpecificWeekend(Data);
    }

    @Then("Click on Monday")
    public void clickOnMonday() {
        ticketWithCalendar.getTicketMonday();
    }

    @Then("Click on Friday")
    public void clickOnFriday() {
        ticketWithCalendar.getTicketFriday();
    }
}
