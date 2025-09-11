Feature: Checking fees


  Scenario: Creating 2 tickets and checking Fees for an allready created attraction
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    And I click on my attractions
    And I click on Create attraction button
    And I input the mandatory field of a attractions with the name "Test223" and location "Cluj"
    And I click on edit an attraction
    And I click on my tickets of attraction
    Then I create a ticket with the price 150 ron and with the name  "name" with tax not included
    Then I click on Preview & Publish of my aplication
    Then I check if ticket with the "name" appears with the price 150 and the corect fee
    Then I publish my attraction
    Then I click share button
    And  I open AttractionPage
    Then I click buy now
    Then I check if ticket with the "name" appears with the price 150 and the corect fee in the Attraction Page
    Then I change to the home page
    And I close Share menu
    When I click on attractions sidebar
    And I click on my attractions
    Then I delete the attraction
    When I click on attractions sidebar
    And I click on my attractions
