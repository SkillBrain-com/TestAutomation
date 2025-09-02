Feature: Create a voucher

  @cris
  Scenario: Create a voucher by importing a file type .txt
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on Events sidebar
    And I click on Vouchers
    And I click on Create voucher button


