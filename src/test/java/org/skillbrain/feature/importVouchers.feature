Feature: Create a voucher


  Scenario Outline: : Create a voucher by importing a file type .txt
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And I click on Vouchers1
    And I click on Create voucher button1
    And I fill the Name box with <voucherName>
    And I fill the value of the discount <discount> in the text box Discount
    Then I fill the box for import codes from <file>  and press Import button
    And I click Save button
    Then The result is <voucherName>
    Examples:
      | file                   | voucherName            | discount |
      | "tc1.csv"              | "TC10 import vouchers" | "10"     |
      | "testCase1Voucher.txt" | "TC11 import vouchers" | "20"     |
      | "testCase2Voucher.txt" | "TC12 import vouchers" | "99"     |
      | "testCase3Voucher.txt" | "TC13 import vouchers" | "0.01"   |


  @cris
  Scenario: create a voucher manually
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And I click on Vouchers1
    And I click on Create voucher button1
    And I fill the Name box test with "VoucherTest1"
    And I fill the value of the discount "22.5" in the text box discount
    Then I fill the box Add code with series "123gh" and press Add button
    And I click Save button
    #Then Check if the voucher is created
    #Then I click on Events sidebar
    And I click on My events
    And I click on Go to Hub button
    And I click on testareBugFix event
    And I click on Buy Now button
    Then I fill in the code box with series from voucher created "123gh" and click on apply button
    And I increase the qty by pressing "+" button
    Then Check if the discount is applied and value is the same as created



















