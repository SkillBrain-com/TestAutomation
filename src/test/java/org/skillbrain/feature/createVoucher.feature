
Feature: Testing voucher page
  Scenario: Create attraction without filling in mandatory fields
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    And I input voucher's name of "ADRIAN"
    And I input voucher's discount of 22
    And I input a "code" manually
    When I click on Save button
    Then I check if the "VOUCHERTEST22142" appears in list
    Then Delete the voucher
    And I click on Create voucher button
    And I input voucher's name of "Adrian"
    And I input voucher's name
    And I input voucher's discount of 22
    Then I Open Generator
    And I input number of codes
    And I input code lenght
    Then I Generate codes
    When I click on Save button
    Then I check if the "VOUCHERTEST22142" appears in list
    Then Delete the voucher

  @maria
  Scenario: Create a voucher for a specific event only
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    And I click on my attractions
    And I click on Create attraction button
    Then Enter the name of the event with "Eveniment 1"
    Then I expand the Location accordion
    And Enter the name of location address with "Iasi"
    Then I click on Next button
    And I click the Create ticket button
    Then Enter the name of ticket with "Eveniment"
    And I choose the price field with 50
    Then I click the Save button
    And I click on Preview & Publish tab button
    Then I click the Publish Attraction button
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    Then I Enter the name of the voucher
    And I input voucher discount
    Then Select the attraction for which the voucher applies
    And Add a code
    Then I click on Save button
    Then I check if the "Testare4" appears in list
    #And I click on my attractions
    #Then I click on GoToHub button

