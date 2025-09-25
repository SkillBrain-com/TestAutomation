Feature: Delete a ticket

  @radu1
  Scenario: Delete an existing ticket
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    Then I click on edit an attraction
    Then I click on Next
    Then I delete the existent ticket


  Scenario: Delete a created attraction
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    Then I click On More
    And Remove attraction


  Scenario: Create an Attraction and a ticket and then delete it
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
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
    Then Click on Attraction side-bar
    Then I click on my attractions
    Then I click On More
    And Remove attraction



