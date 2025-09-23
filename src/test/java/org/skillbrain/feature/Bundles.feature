Feature: Create a bundle tickets feature
@veronica

  Scenario: Create an event
  Given User navigates to login page
  When User logs in with valid credentials
  And I check if Events page is displayed
  And I click on Create event button
  And I enter the Event name
  And I enter the Start date
  And I enter Start time
  And I enter the End date
  And I enter the End time
  And I open Location drop-down
  And I enter the Location
  And I click Save event
  Then I click Next
  And I go to Tickets tab
  And I click on New Ticket
  Then I enter a single ticket name "Gigel"
  And I enter the price for single ticket "Price1"
  And I uncheck to include fees
  Then I open Ticket configuration
  And I open Numbering
  And I enter total available tickets "Number1"
  And I enter maximum tickets per order "Number2"
  And I save the ticket
  #Then I go to Tickets tab
  Then I click to create a new bundle
  And I enter a bundle for two ticket name "Name2"
  And I enter a bundle for two ticket price "Price2"
  And I enter included tickets
  And I enter the bundle for two quantity "Qty1"
  And I save the bundle
  Then I go to Advanced
  And I open Checkout
  And I check to display the number of available tickets
  And I save the options
  Then I go to Preview
  #And I check if the single ticket name is in the Preview
  #And I check if the ticket "Name1" has the price "Price1"
  #And I check the fee "Fee1"
  #And I check if if the ticket "Name2" has the price "Price2"
  #And I check the fee "Fee2" is for "Qty1"
  #Then I add "Number 3" tickets from "Name1"
  #And  I add "Number4" tickets from "Name2"
  #And I check if "Number1" and "Number2" are observed
  #And I check "Message1" when the tickets are sold out
  #And I publish the event
  #Then I share the event
  #And I go to Default Hub








