Feature: Checking fees for any prices


  Scenario: Creating an attraction with 2 tickes with 2 diffrent types of fees and checking them
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    And I click on my attractions
    And I click on Create attraction button
    And I input the mandatory field of a attractions with the name "Test223" and location "Cluj"
    When I click on Next button
    Then I create the first ticket with  32 and dollars "name1"
    Then I create the other ticket with 55 dollars and "name2"
