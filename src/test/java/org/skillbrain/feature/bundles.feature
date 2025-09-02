Feature: Create bundle tickets feature

  @cris
  Scenario: Create different bundled tickets for an event
    Given User navigates to login page
    When User logs in with valid credentials
    Then I check if Events page is displayed
    And I click on Create event button




