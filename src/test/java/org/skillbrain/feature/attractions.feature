Feature: Create attractions feature

  @test-lsr
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

#    Data driver Test Scenario
  @demo
  Scenario Outline: Demo for multiple inputs
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And I click on Create attraction button
    Then I fill the Attraction name field with <attractionName>
    Then I expand the Location accordion
    And I fill the Location address field with <locationName>

    Examples:
      | attractionName | locationName    |
      | "#!@%^"        | "locationName1" |
      | "testName2"    | "locationName2" |
      | "testName3"    | "locationName3" |
      | "testName4"    | "locationName4" |