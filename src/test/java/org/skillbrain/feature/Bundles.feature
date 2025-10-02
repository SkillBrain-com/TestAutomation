Feature: Create a bundle tickets feature
@veronica

  Scenario: Create an event with bundle tickets and check the details
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
  Then I enter a single ticket name "Fun for One"
  And I enter the price for single ticket 300
  And I uncheck to include fees
  Then I open Ticket configuration
  And I open Numbering
  And I enter total available tickets 9
  And I save the ticket
  Then I click to create a new single ticket
  And I enter the name "Fun for Little One"
  And I enter another price of 200
  And I save the ticket
  Then I click to create a new bundle
  And I enter a bundle for two ticket name "Fun for Family"
  And I enter a bundle for two ticket price 700
  And I enter included tickets
  And I enter the bundle for two quantity 2
  And I enter another included ticket
  And I enter the bundle2 quantity 1
  And I save the bundle
  Then I go to Advanced
  And I open Checkout
  And I check to display the number of available tickets
  And I save the options
  Then I go to Preview
  And I check if "Fun for One" is in the Preview
  And I check if ticket limit "9" is in the Preview
  And I check if the single ticket has a price of 300
  And I check fee if the fee is correct for 300
  Then I check if the reduced "Fun for Little One" is in the Preview
  And I check if the Reduced quantity is unlimited in the Preview
  And I check if the reduced ticket has a price of 200
  And I check if the fee is correct for 200
  And I check if the bundle "Fun for Family" is in the Preview
  And I check if bundle price is 700
  And I check if the bundle fee is correct for 700
  And I extract the savings 300.0, 200.0, 700.0
  #Then I add 8 single tickets
  #And I check if "Sold out" appears
  #And I add 9 single tickets
  #And I check if the add button is inactive
   #And I check if if the bundle ticket "Fun for Family" has the price 700
  #And I check the fee for 700 is correct
  Then I publish the event
  #And I share the event
  #And I go to Oveit Hub
  #Then I switch to Oveit Hub
  #Then I add "10" tickets from "Fun for One"
  #And  I add "20" tickets from "Fun for Two"
  #And I check if "100" and "9" are observed
  #And I check if "Sold Out" appears when the limits were reached










