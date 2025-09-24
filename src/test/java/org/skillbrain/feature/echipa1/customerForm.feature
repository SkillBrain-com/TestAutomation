@customerForm
Feature: Customer form feature

  @cris
  Scenario: Generate a Customer Form, that contains a mandatory custom text field of "Phone Number".
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_CF_001"
    And Expand the Location accordion
    Then Fill the Location address field with "Strada Victoriei 127"
    And Expand the Advanced settings accordion
    And Click the Enable Customer Form checkbox
    Then Click on Next button
    And Click the Create ticket button
    Then Fill the Ticket Name field with "Test Ticket"
    And Fill the Ticket Price field with "35"
    Then Click the Save ticket button
    And Click the Customer form tab button
    Then Fill the First Custom Name Field with "Phone Number"
    And Click the Mandatory checkbox
    Then Click on Next button
    Then Click the Add button
    And Click the Continue button
    Then Check the Custom Text Field label for "Phone Number"

  @cris
  Scenario: Generate a Customer Form, with no custom fields, meant for a Company.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_CF_002"
    And Expand the Location accordion
    And Fill the Location address field with "Random Place"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Test Ticket Random"
    And Fill the Ticket Price field with "43"
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Add button
    And Click the Continue button
    Then Click the Company button
    And Check the Customer Form for "Company name"

  @cris
  Scenario: Place an Order for an Attraction, for a person, using the Autoprocess payment method.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_CF_003"
    Then Expand the Location accordion
    And Fill the Location address field with "Yet Another Place"
    Then Click on Next button
    And Click the Create ticket button
    Then Fill the Ticket Name field with "Test Ticket VIP Area"
    And Fill the Ticket Price field with "65"
    Then Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Add button
    And Click the Continue button
    Then Fill the Mandatory fields with:
      | email                   | name                  | country                 | state                 | city                  | address                   |
      | john.doe@example.com    | John Doe              | United States           | California            | Los Angeles           | 123 Maple Street, Apt 4B  |
    And Click the Autoprocess radio button
    Then Click the Pay button
    Then Check if the order is completed

  @cris @regression
  Scenario: Create a Customer Form, that displays the correct price total, of 2 tickets, of different currencies.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_CF_004"
    And Expand the Location accordion
    And Fill the Location address field with "Yet Some Place Else"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Leu Ticket"
    And Fill the Ticket Price field with "100"
    And Click the Currency dropdown
    And Select RON item
    And Click the Save ticket button
    Then Click the New Ticket button
    And Fill the Ticket Name field with "Euro Ticket"
    And Fill the Ticket Price field with "100"
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Add button
    And Click the Second Add button
    And Click the Continue button
    Then Check Order summary items for "TOTAL"

  @cris @regression
  Scenario: Place an Order for an Attraction, using the Card method.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    And Fill the Attraction name field with "TC_CF_005"
    Then Expand the Location accordion
    And Fill the Location address field with "Sesame Street 122"
    And Click on Next button
    And Click the Create ticket button
    And Fill the Ticket Name field with "Standard Ticket"
    And Fill the Ticket Price field with "25"
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Add button
    And Click the Continue button
    Then Fill the Mandatory fields with:
      | email                           | name                      | country           | state              | city                  | address                            |
      | ioana.popescu94@gmail.com       | Ioana Popescu             | Romania           | Cluj               | Cluj-Napoca           | Strada Eroilor 12, Bloc B, Ap. 7   |
    And Click the Pay button
    And Fill all Payment fields with:
      | email                       | card nr                 | card expiry     | card cvc  | cardholder name            | country                   | zip      |
      | ioana.popescu94@gmail.com   | 4242424242424242        | 1234            | 567       | Ioana Popescu              | US                        | 12345    |
    And Click the Pay Payment button
    Then Check Order confirmation step for an error message called "We encountered an error while processing your request"

  @cris
  Scenario: Create a Customer Form with 6 different Custom fields, with alternating mandatory checks.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_CF_006"
    And Expand the Location accordion
    And Fill the Location address field with "Rubicon Street 23"
    And Expand the Advanced settings accordion
    And Click the Enable Customer Form checkbox
    And Click on Next button
    And Click the Create ticket button
    And Fill the Ticket Name field with "VIP Entry Ticket"
    And Fill the Ticket Price field with "67"
    And Click the Save ticket button
    And Click the Customer form tab button
    And Fill the First Custom Name Field with "Phone Number"
    And Click the Mandatory checkbox
    And Click the New field button
    And Click the Second Field Type dropdown, pick the Multi-line text field item
    And Fill the Second Custom Name Field with "Observations"
    And Click the New field button
    And Click the Third Field Type dropdown, pick the Email address item
    And Fill the Third Custom Name Field with "Email address"
    And Click the Third Mandatory button
    And Click the New field button
    And Click the Forth Field Type dropdown, pick the Date item
    And Fill the Forth Custom Name Field with "Booking Date"
    And Click the New field button
    And Click the Fifth Field Type dropdown, pick the Dropdown list item
    And Fill the Fifth Custom Name Field with "Professions"
    And Click the Fifth Mandatory button
    And Click the Multiple selection button, alongside filling the Values multi-line field with:
      """
      Doctor
      Engineer
      Teacher
      Lawyer
      """
    And Click the New field button
    And Click the Sixth Field Type dropdown, pick the Checkbox item
    And Fill the Sixth Custom Name Field with "Smoker?"
    And Click on Next button
    And Click the Add button
    And Click the Continue button
    And Click the Pay button
    Then Check Customer form for all six custom fields

  @cris
  Scenario: Place an Order for an Attraction, that contains 1 of each mandatory custom text fields, meant for customers and guests.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    And Fill the Attraction name field with "TC_CF_007"
    And Expand the Location accordion
    And Fill the Location address field with "Brandenburg Gate Street 124"
    And Expand the Advanced settings accordion
    And Click the Enable Guest Form checkbox
    And Click the Enable Customer Form checkbox
    And Click on Next button
    And Click the Create ticket button
    And Fill the Ticket Name field with "Special Entry Ticket"
    And Fill the Ticket Price field with "12"
    And Click the Save ticket button
    And Click the Customer form tab button
    And Fill the First Custom Name Field with "Phone Number"
    And Click the Mandatory checkbox
    And Click on Next button
    And Fill the First Guest Custom Name Field with "Guest Remarks"
    And Click the Mandatory checkbox
    And Click on Next button
    And Click the Add button
    And Click the Continue button
    And Fill the Guest Custom Text field with "Some guest note"
    And Click the Continue button
    Then Fill the Mandatory fields with:
      | email                           | name                      | country           | state              | city                  | address                            | phone number  |
      | ioana.popescu94@gmail.com       | Ioana Popescu             | Romania           | Cluj               | Cluj-Napoca           | Strada Eroilor 12, Bloc B, Ap. 7   | 0755332112    |
    And Click the Autoprocess radio button
    And Click the Pay button
    Then Check if the order is completed

  @cris
  Scenario: Place an Order for an Attraction, using 2 tickets (1 free and 1 priced) and 1 bundle, meant for a company, using the Autoprocess method.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    And Fill the Attraction name field with "TC_CF_008"
    And Expand the Location accordion
    And Fill the Location address field with "Calea Eroilor 15"
    And Click on Next button
    And Click the Create ticket button
    And Fill the Ticket Name field with "Priced Ticket"
    And Fill the Ticket Price field with "65"
    And Click the Save ticket button
    And Click the New Ticket button
    And Fill the Ticket Name field with "Free Pass"
    And Click the Save ticket button
    And Click the New bundle button
    And Fill the Bundle Name field with "Family Bundle"
    And Fill the Bundle Price field with "60"
    And Click the Add ticket button
    And Pick the priced ticket item, within the Name dropdown
    And Fill the Quantity field with "5"
    And Click the Save bundle button
    And Click on Preview & Publish tab button
    And Click the Add button
    And Click the Second Add button
    And Click the Third Add button
    And Click the Continue button
    And Click the Company button
    And Fill the Mandatory fields with:
      | email                           | name                      | country           | state              | city                  | address                            | tax id              |
      | ioana.popescu94@gmail.com       | Ioana Popescu             | Romania           | Cluj               | Cluj-Napoca           | Strada Eroilor 12, Bloc B, Ap. 7   | 123-45-6789         |
    And Click the Autoprocess radio button
    And Click the Pay button
    Then Check if the order is completed

  @cris @regression
  Scenario: Place an Order for an Attraction, that has expired.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When Click the Create attraction button
    And Fill the Attraction name field with "TC_CF_009"
    And Click the Date interval radio button
    And Fill the Start date combo box with "2025-07-07"
    And Fill the Start time combo box with "12:00"
    And Expand the Location accordion
    And Fill the Location address field with "Test Street 123"
    And Click on Next button
    And Click the Create ticket button
    And Fill the Ticket Name field with "General Admission"
    And Fill the Ticket Price field with "25"
    And Click the Save ticket button
    And Click on Next button
    And Click on Next button
    And Click the Add button
    And Click the Continue button
    Then Check the Customer Form for an error

  @cris
  Scenario: Place an Order for an Attraction, that is scheduled at a future date.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    When Click the Create attraction button
    And Fill the Attraction name field with "TC_CF_010"
    And Click the Date interval radio button
    And Fill the Start date combo box with "2025-10-10"
    And Fill the Start time combo box with "12:00"
    And Expand the Location accordion
    And Fill the Location address field with "Test Street 123"
    And Click on Next button
    And Click the Create ticket button
    And Fill the Ticket Name field with "General Admission"
    And Fill the Ticket Price field with "25"
    And Click the Save ticket button
    And Click on Next button
    And Click on Next button
    And Click the Add button
    And Click the Continue button
    And Fill the Mandatory fields with:
      | email                           | name                      | country           | state              | city                  | address                            |
      | ioana.popescu94@gmail.com       | Ioana Popescu             | Romania           | Cluj               | Cluj-Napoca           | Strada Eroilor 12, Bloc B, Ap. 7   |
    And Click the Autoprocess radio button
    And Click the Pay button
    Then Check if the order is completed

