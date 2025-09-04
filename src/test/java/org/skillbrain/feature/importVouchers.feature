Feature: Create a voucher

  @cris
  Scenario: Create a voucher by importing a file type .txt
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And I click on Vouchers1
    And I click on Create voucher button1
    And I fill the Name box with "TC10 import vouchers"
    And I fil the value of the discount "10" in the text box Discount
    Then I fill the box for import codes with the path of the .txt files and press Import button
    And I click Save button
    Then I check if the vouchers have been saved




