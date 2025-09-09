Feature: Create attractions feature

  @cris
  Scenario: Place an Order for an Attraction, for a person, using the Autoprocess payment method.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "Attraction name"
    Then Expand the Location accordion
    And Fill the Location address field with "Location name"
    Then Click on Next button
    And Click the Create ticket button
    Then Fill the Ticket Name field with "Name"
    And Fill the Ticket Price field with "Price"
    Then Click the Save button
    Then Click on Preview & Publish tab button
    And Click the Add button
    And Click the Continue button
    Then Fill the Mandatory * fields with "Customer Info"
    And Click the Autoprocess radio button
    Then Click the Pay button
    Then Check if the order is completed
