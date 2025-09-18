Feature: Create a ticket use calendar

@radu1
  Scenario: Create a ticket use calendar
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And I click on Create attraction button
    Then I fill the Attraction name field with "Attraction name"
    Then I click on date interval
    And I fill "Date and Time"
    Then I expand the Location accordion
    And I fill the Location address field with "Location name"
    Then I click on Next button
    Then I click the Create ticket button
    Then I fill the Name field with "Name"
    Then I fill the Price field with "Price"
    Then I expand the Ticket Configuration
    Then I click on Availability Schedule
    And I fill "DateAndTime" ticket availability
    Then I click the Save button
    Then I click on Preview & Publish tab button
    And I click the Add button
    Then I click the Continue button
    Then I fill the Mandatory * fields with "Customer Info"
    And I click the Autoprocess radio button
    Then I click the Pay button
    And I check if the order is completed


  Scenario: Create a ticket available just for some days
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And I click on Create attraction button
    Then I fill the Attraction name field with "Attraction name"
    Then I expand the Location accordion
    And I fill the Location address field with "Location name"
    Then I click on Next button
    And I click the Create ticket button
    Then I fill the Name field with "Name"
    And I fill the Price field with "Price"
    Then I expand the Ticket Configuration
    Then I click on Availability Schedule
    Then I click on Specific Weekend
    Then I add "Weekends" when the ticket can be buy
    Then Click on Monday
    Then Click on Friday
    Then I click the Save button
    Then I click on Preview & Publish tab button
    Then I click the Add button
    And I click the Continue button
    Then I fill the Mandatory * fields with "Customer Info"
    And I click the Autoprocess radio button
    Then I click the Pay button
    Then I check if the order is completed

