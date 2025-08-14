Feature: Create attractions feature

  @cris
  Scenario: Create attraction without filling in mandatory fields
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    And I click on my attractions
    And I click on Create attraction button
    When I click on Next button
    Then I check the following error message is displayed "You haven't entered the name of this attraction."
    And I check the following error message is displayed "You haven't added the location or address for the attraction."