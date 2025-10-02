Feature: Show Oveit Hub

  @oti
  Scenario: Open the Oveit Hub
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And I click on Go to Hub button
    Then I click on event title
    And I click on "Book now" button
    And I complete the email and name event fields
    And I click on submit button

