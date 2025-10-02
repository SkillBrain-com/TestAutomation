Feature: Create attractions feature

  @Raimond
  Scenario: Place an Order for an Attraction, for a person, using the Autoprocess payment method.
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
    Then I click the Save button
    Then I click on Preview & Publish tab button
    And I click the Add button
    And I click the Continue button
    Then I fill the Mandatory * fields with "Customer Info"
    And I click the Autoprocess radio button
    Then I click the Pay button
    Then I check if the order is completed

  Scenario: Buy more than 50 tickets.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "Tickets"
    And Expand the Location accordion
    Then Fill the Location address field with "Str.Tomis,nr.263"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "General Entry Pass"
    Then Fill the Ticket Price field with 15
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Publish attraction button
    Then Click the Share button
    And Click the Redirect button
    Then Click the Buy Now button
    And Click the Add button for 20 times
    Then Check the ticket quantity, the add button must not be disab