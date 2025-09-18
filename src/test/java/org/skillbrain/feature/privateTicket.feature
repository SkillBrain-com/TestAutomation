Feature: Create a private invitation ticket so that only invited users can purchase it

  @test-lsr
  Scenario: Create a private invitation ticket and buy it
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
    Then I click the Ticket configuration button
    And I click on Ticket visibility
    Then I click on Private invitation
    And I fill the Invitation code with "Invitation code"
    Then I click the Save button
    And I click on Next button
    Then I click again on Next button
    And I insert the "Invitation code"
    Then I click on "Apply button"
    Then I insert an e-mail address "E-mail address"
    And I click on Register button
    Then I click on Publish attraction
