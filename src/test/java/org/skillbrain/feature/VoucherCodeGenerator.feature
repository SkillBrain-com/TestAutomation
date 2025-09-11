Feature: Verifying generate codes feature

  Scenario: I create an attractions and i pattern check all 3 ways to generate codes, after i apply one of each code
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    And I input voucher's name
    And I input voucher's discount of 22
    And I generate a code with each posible combination settings
    Then I check the codes if they respect the pattern
    When I click on Save button
    Then I check if the "VOUCHERTEST22142" appears in list
    Then Delete the voucher


  Scenario: I create an attractions and i pattern check all 3 ways to generate codes, after i apply one of each code
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    And I click on Save button
    Then I check if mandatory fields error appears
    And I input voucher's name
    And I click on Save button
    Then I check if mandatory fields error appears
    And I input voucher's discount of 22
    And I click on Save button
    Then I check if mandatory fields error appears
    Then I input a "code" manually
    Then I input a "code" manually
    Then I check if the duplicate code error appears.
    Then I input voucher's discount of "asd" (STRING)
    And I click on Save button
    Then I check if mandatory fields error appears


  Scenario: Create a voucher without a name,code and discout
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    And I click on Save button
    Then I check if mandatory fields error appears


  Scenario: Create a voucher without a discount
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    Then I input voucher's name of "Adrian"
    Then I input a "code" manually
    And I click on Save button
    Then I check if mandatory fields error appears


  Scenario: I input an discount that has only letters
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    Then I input voucher's name of "Adrian"
    Then I input a "code" manually
    Then I input voucher's discount of "asd" (STRING)
    Then I click on Save button
    Then I check if mandatory fields error appears


  Scenario: I create 1 voucher with duplicate codes added manually
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    Then I input voucher's name of "Adrian"
    Then I input a "code" manually
    Then I input a "code" manually
    Then I check if the duplicate code error appears.


  Scenario: I create 1 voucher with only discount percentage
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    Then I input voucher's discount of 33
    Then I click on Save button
    Then I check if mandatory fields error appears


  Scenario: I create 1 voucher without a name
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    Then I input voucher's discount of 33
    Then I input a "code" manually
    Then I click on Save button
    Then I check if mandatory fields error appears


  Scenario: I can import codes from a file
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    Then I input voucher's name of "Adrian"
    Then I input voucher's discount of 33
    Then I import good codes from a txt file
    Then I clic ok on alert
    Then I verify if the good code is imported "2210adrian"


  Scenario: I import a code that was manually added
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    Then I input a "2210adrian" manually
    Then I import good codes from a txt file
    Then I check if the duplicate code error appears.


  Scenario: I input into the until field a past date 2025-07-07
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    Then I input a "2210adrian" manually
    Then I input voucher's discount of 22
    Then I input voucher's name of "Adrian"
    Then I input the until date to "2025-09-09"
    Then I verify if the until date changed to today's date


  Scenario: I tried to import an imagine file as code file
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    And I import a imagine to code section
    And Verify if i get the "The uploaded file must have one of the following extensions: txt, csv" error


  Scenario: I tried to import codes with not a good format
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    And I import a bad format code
    And Verify if i get the "The uploaded file contains either invalid codes or codes that already exist." error


  Scenario: I tried to generate codes with numbers of codes input as a string
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    Then I Open Generator
    Then I set number of codes to "abc"
    Then I Generate codes
    Then I check if an error appears


  Scenario: I tried to generate codes with length of codes input as a string
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    Then I Open Generator
    Then I set codes length to "abc"
    Then I Generate codes
    Then I check if an error appears