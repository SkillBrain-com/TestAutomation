Feature: Create attractions feature



  @cris
  Scenario: Place an Order for an Attraction, for a person, using the Autoprocess payment method.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And I click on Create attraction button
    Then I fill the Attraction name field with "Attraction name"
    Then I expand the Location accordion
    And I fill the Location field with "Location name"
    Then I click on Next button
    And I click the Create ticket button
    Then I fill the Name and Price fields with "Name & Price"
    And I click the Save button
    Then I click on Preview & Publish Tab button
    And I click the Add button
    And I click the Continue button
    Then I fill the Mandatory fields with "Info"
    Then I check if the order is completed
