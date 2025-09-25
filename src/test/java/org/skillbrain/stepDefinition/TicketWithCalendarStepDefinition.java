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

    @Then("I click on Next")
    public void iClickOnNext() {
        ticketWithCalendar.getClickOnNext();
    }

    @Then("I click on New Ticket")
    public void iClickOnNewTicket() {
        ticketWithCalendar.clickOnNewTicket();
    }

    @Then("I put a name for New Ticket {string}")
    public void iPutANameForNewTicket(String Name) {
        ticketWithCalendar.putAName(Name);
    }

    @Then("I click on Ticket Visibility")
    public void iClickOnTicketVisibility() {
        ticketWithCalendar.clickOnTicketVisibility();
    }

    @Then("I click on Private Invitation")
    public void iClickOnPrivateInvitation() {
        ticketWithCalendar.clickOnPrivateInvitation();
    }

    @Then("I put a Private Code {string}")
    public void iPutAPrivateCode(String PrivateCode) {
        ticketWithCalendar.getPrivateCode(PrivateCode);
    }

    @And("I click the Save")
    public void iClickTheSave() {
        ticketWithCalendar.clickOnSaveButton();
    }


    @Then("I fill the Private Code Field {string}")
    public void iFillThePrivateCodeField(String Code) {
        ticketWithCalendar.privateCodeGetUsed(Code);
    }


    @Then("Click the Add button From Private Ticket")
    public void clickTheAddButtonFromPrivateTicket() {
        ticketWithCalendar.getPrivateTicket();
    }

    @And("I click the Continue")
    public void iClickTheContinue() {
        ticketWithCalendar.clickOnContinue();
    }


    @Then("I fill with Email {string}")
    public void iFillWithEmail(String Email) {
        ticketWithCalendar.setEmail(Email);
    }


    @Then("I fill with Name {string}")
    public void iFillWithName(String Name) {
        ticketWithCalendar.setName(Name);
    }

    @Then("I fill with State {string}")
    public void iFillWithState(String State) {
        ticketWithCalendar.setState(State);
    }

    @Then("I fill with City {string}")
    public void iFillWithCity(String City) {
        ticketWithCalendar.setCity(City);
    }

    @And("I fill with Address {string}")
    public void iFillWithAddress(String Address) {
        ticketWithCalendar.setAddress(Address);
    }

}


