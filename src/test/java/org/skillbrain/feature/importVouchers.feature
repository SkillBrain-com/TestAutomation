Feature: Create a voucher

  @cris
  Scenario Outline: : Create a voucher by importing a file type .txt
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And I click on Vouchers1
    And I click on Create voucher button1
    And I fill the Name box with <voucherName>
    And I fil the value of the discount <discount> in the text box Discount
    Then I fill the box for import codes from <file>  and press Import button
    And I click Save button
    Then The result is <voucherName>
    Examples:
      | file                   | voucherName            | discount   |
      | "tc1.csv"              | "TC10 import vouchers" | "10"       |
      | "testCase1Voucher.txt" | "TC11 import vouchers" | "20"       |
      | "testCase2Voucher.txt" | "TC12 import vouchers" | "99"       |
      | "testCase3Voucher.txt" | "TC13 import vouchers" | "0.01"     |












