
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