
Feature: Create ticket with approval option


   Scenario: Create an attraction and place an order for a ticket with approval setting enable
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
    Then I expand the Ticket Configuration
    Then I click on Approval List
    And I click on Enable button
   Then I click the Save button
   Then I click on Preview & Publish tab button
   Then I fill with an "Email"
   Then I click on apply button
   And I check if the order is finalized





