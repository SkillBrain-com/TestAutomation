package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.skillbrain.page.GroupingTickets;
import org.skillbrain.utilities.TestContextSetup;

public class GroupingTicketsStepDefinition {

    private GroupingTickets groupingTickets;
    private String currentTicketName;
    private String currentTicketPrice;

    public GroupingTicketsStepDefinition(TestContextSetup testContextSetup) {
        groupingTickets = testContextSetup.pageObjectFactory.getGroupingTickets();
    }

    @When("Fill the Grouping Attraction name field with {string}")
    public void fill_the_grouping_attraction_name_field_with(String attractionName) {
        groupingTickets.fillAttractionName(attractionName);
    }

    @And("Expand the Grouping Location accordion")
    public void expand_the_grouping_location_accordion() {
        groupingTickets.expandLocationAccordion();
    }

    @And("Fill the Grouping Location address field with {string}")
    public void fill_the_grouping_location_address_field_with(String address) {
        groupingTickets.fillLocationAddress(address);
    }

    @And("Click on Grouping Next button")
    public void click_on_grouping_next_button() {
        groupingTickets.clickNextButton();
    }

    @And("Click the Create ticket button for grouping")
    public void click_the_create_ticket_button_for_grouping() {
        // This step is handled in the feature file sequence
    }

    @Then("Fill the Grouping Ticket Name field with {string}")
    public void fill_the_grouping_ticket_name_field_with(String ticketName) {
        this.currentTicketName = ticketName;
    }

    @And("Fill the Grouping Ticket Price field with {string}")
    public void fill_the_grouping_ticket_price_field_with(String price) {
        this.currentTicketPrice = price;
    }

    @And("Click the Save button for grouping ticket")
    public void click_the_save_button_for_grouping_ticket() {
        if (currentTicketName != null && currentTicketPrice != null) {
            groupingTickets.createFirstTicket(currentTicketName, currentTicketPrice);
            currentTicketName = null;
            currentTicketPrice = null;
        }
    }

    @And("Click the new ticket button")
    public void click_the_new_ticket_button() {
    }

    @And("Fill the Ticket Name field with {string} for second ticket")
    public void fill_the_ticket_name_field_with_for_second_ticket(String ticketName) {
        this.currentTicketName = ticketName;
    }

    @And("Fill the Ticket Price field with {string} for second ticket")
    public void fill_the_ticket_price_field_with_for_second_ticket(String price) {
        this.currentTicketPrice = price;
    }

    @And("Click the Save button for second ticket")
    public void click_the_save_button_for_second_ticket() {
        if (currentTicketName != null && currentTicketPrice != null) {
            groupingTickets.createSecondTicket(currentTicketName, currentTicketPrice);
            currentTicketName = null;
            currentTicketPrice = null;
        }
    }

    @And("Drag ticket B on top of ticket A to create a group")
    public void drag_ticket_b_on_top_of_ticket_a_to_create_a_group() {
        groupingTickets.dragTicketBToTicketA();
    }

    @And("Click on Grouping Preview & Publish tab button")
    public void click_on_grouping_preview_publish_tab_button() {
        groupingTickets.navigateToPreviewPublish();
    }

    @Then("Click the Publish attraction button")
    public void click_the_publish_attraction_button() {
        groupingTickets.publishAttraction();
    }

    @Then("Check if the attraction is published successfully")
    public void check_if_the_attraction_is_published_successfully() {
        groupingTickets.verifyAttractionPublished();
    }


    @When("Fill the Attraction name field with {string} for grouping tickets")
    public void fill_the_attraction_name_field_with_for_grouping_tickets(String attractionName) {
        groupingTickets.fillAttractionName(attractionName);
    }

    @When("Create first ticket with name {string} and price {string}")
    public void create_first_ticket_with_name_and_price(String ticketName, String price) {
        groupingTickets.createFirstTicket(ticketName, price);
    }

    @When("Create second ticket with name {string} and price {string}")
    public void create_second_ticket_with_name_and_price(String ticketName, String price) {
        groupingTickets.createSecondTicket(ticketName, price);
    }

    @Then("Fill the Grouping Ticket Name field with {string} for second ticket")
    public void fill_the_grouping_ticket_name_field_with_for_second_ticket(String ticketName) {
        this.currentTicketName = ticketName;
    }

    @Then("Fill the Grouping Ticket Price field with {string} for second ticket")
    public void fill_the_grouping_ticket_price_field_with_for_second_ticket(String price) {
        this.currentTicketPrice = price;
    }
}
