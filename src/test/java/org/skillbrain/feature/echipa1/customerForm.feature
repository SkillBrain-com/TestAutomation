@customerForm
Feature: Customer form feature

#  @TR
  Scenario: Generate a Customer Form, that contains a mandatory custom text field of "Phone Number".
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_CF_001"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Mihai Eminescu nr. 47"
    And Expand the Advanced settings accordion
    And Click the Enable Customer Form checkbox
    Then Click on Next button
    And Click the Create ticket button
    Then Fill the Ticket Name field with "Grand Fortress Entry Pass"
    And Fill the Ticket Price field with 35
    Then Click the Save ticket button
    And Click the Customer form tab button
    Then Fill the First Custom Name Field with "Phone Number"
    And Click the Mandatory checkbox
    Then Click on Next button
    Then Click the Add button
    And Click the Continue button
    Then Check the Custom Text Field label for "Phone Number"

#  @TR
  Scenario: Generate a Customer Form, with no custom fields, meant for a Company.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_CF_002"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Lalelelor nr. 27"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Skyview Observation Deck Pass"
    Then Fill the Ticket Price field with 43
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Add button
    Then Click the Continue button
    And Click the Company button
    Then Check the Customer Form for "Company name"

#  @TR
  Scenario: Place an Order for an Attraction, for a person, using the Autoprocess payment method.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_CF_003"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Vasile Alecsandri nr. 11"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Dragon’s Lair Adventure Pass"
    Then Fill the Ticket Price field with 65
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Add button
    Then Click the Continue button
    And Fill the Mandatory fields with:
      | email                   | name                  | country                 | state                 | city                  | address                   |
      | john.doe@yahoo.com      | John Doe              | United States           | California            | Los Angeles           | 123 Maple Street, Apt 4B  |
    Then Click the Autoprocess radio button
    And Click the Pay button
    Then Check if the order is completed

#  @TR @regression
  Scenario: Create a Customer Form, that displays the correct price total, of 2 tickets, of different currencies.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_CF_004"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Stefan cel Mare nr. 42"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Leu Ticket"
    Then Fill the Ticket Price field with 100
    And Click the Currency dropdown
    Then Select RON item
    And Click the Save ticket button
    Then Click the New Ticket button
    And Fill the Ticket Name field with "Euro Ticket"
    Then Fill the Ticket Price field with 100
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Add button
    Then Click the Second Add button
    And Click the Continue button
    Then Check Order summary items for "TOTAL"

#  @TR @regression
  Scenario: Place an Order for an Attraction, using the Card method.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_CF_005"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Arcu nr. 51"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Standard Entry Pass"
    Then Fill the Ticket Price field with 25
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Add button
    Then Click the Continue button
    And Fill the Mandatory fields with:
      | email                           | name                      | country           | state              | city                  | address                            |
      | ioana.popescu94@gmail.com       | Ioana Popescu             | Romania           | Cluj               | Cluj-Napoca           | Strada Eroilor 12, Bloc B, Ap. 7   |
    Then Click the Pay button
    And Fill all Payment fields with:
      | email                       | card nr                 | card expiry     | card cvc  | cardholder name            | country                   | zip      |
      | ioana.popescu94@gmail.com   | 4242424242424242        | 1234            | 567       | Ioana Popescu              | US                        | 12345    |
    And Click the Pay Payment button
    Then Check Order confirmation step for an error message called "We encountered an error while processing your request"

#  @TR
  Scenario: Create a Customer Form with 6 different Custom fields, with alternating mandatory checks.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_CF_006"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Dobreni nr. 215"
    And Expand the Advanced settings accordion
    Then Click the Enable Customer Form checkbox
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "VIP Entry Pass"
    Then Fill the Ticket Price field with 67
    And Click the Save ticket button
    Then Click the Customer form tab button
    And Fill the First Custom Name Field with "Phone Number"
    Then Click the Mandatory checkbox
    And Click the New field button
    Then Click the Second Field Type dropdown, pick the Multi-line text field item
    And Fill the Second Custom Name Field with "Observations"
    Then Click the New field button
    And Click the Third Field Type dropdown, pick the Email address item
    Then Fill the Third Custom Name Field with "Email address"
    And Click the Third Mandatory button
    Then Click the New field button
    And Click the Forth Field Type dropdown, pick the Date item
    Then Fill the Forth Custom Name Field with "Booking Date"
    And Click the New field button
    Then Click the Fifth Field Type dropdown, pick the Dropdown list item
    And Fill the Fifth Custom Name Field with "Professions"
    Then Click the Fifth Mandatory button
    And Click the Multiple selection button, alongside filling the Values multi-line field with:
      """
      Doctor
      Engineer
      Teacher
      Lawyer
      """
    Then Click the New field button
    And Click the Sixth Field Type dropdown, pick the Checkbox item
    Then Fill the Sixth Custom Name Field with "Smoking?"
    And Click on Next button
    Then Click the Add button
    Then Click the Continue button
    And Click the Pay button
    Then Check Customer form for all six custom fields

#  @TR
  Scenario: Place an Order for an Attraction, that contains 1 of each mandatory custom text fields, meant for customers and guests.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_CF_007"
    And Expand the Location accordion
    Then Fill the Location address field with "Bd. Balcescu Nicolae nr. 4"
    And Expand the Advanced settings accordion
    Then Click the Enable Guest Form checkbox
    And Click the Enable Customer Form checkbox
    Then Click on Next button
    And Click the Create ticket button
    Then Fill the Ticket Name field with "Mystic Falls Adventure Pass"
    And Fill the Ticket Price field with 12
    Then Click the Save ticket button
    And Click the Customer form tab button
    Then Fill the First Custom Name Field with "Phone Number"
    And Click the Mandatory checkbox
    Then Click on Next button
    And Fill the First Guest Custom Name Field with "Guest Remarks"
    Then Click the Mandatory checkbox
    And Click on Next button
    Then Click the Add button
    And Click the Continue button
    Then Fill the Guest Custom Text field with "Guest Notes"
    And Click the Continue button
    Then Fill the Mandatory fields with:
      | email                                 | name                        | country           | state             | city             | address                                            | phone number  |
      | claudiu.caramitru711@proton.me        | Claudiu Caramitru           | Romania           | Vaslui            | Vaslui           | Strada Mitropolitul Firmilian 13, Bloc 1, Ap. 20   | 0755332112    |
    Then Click the Autoprocess radio button
    And Click the Pay button
    Then Check if the order is completed

#  @TR
  Scenario: Place an Order for an Attraction, using 2 tickets (1 free and 1 priced) and 1 bundle, meant for a company, using the Autoprocess method.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_CF_008"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Liviu Rebreanu nr. 29"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Priced Entry"
    Then Fill the Ticket Price field with 65
    And Click the Save ticket button
    Then Click the New Ticket button
    And Fill the Ticket Name field with "Free Entry"
    Then Click the Save ticket button
    And Click the New bundle button
    Then Fill the Bundle Name field with "Family Bundle"
    And Fill the Bundle Price field with 60
    Then Click the Add ticket button
    And Pick the priced ticket item, within the Name dropdown
    Then Fill the Quantity field with 5
    And Click the Save bundle button
    Then Click on Preview & Publish tab button
    And Click the Add button
    Then Click the Second Add button
    And Click the Third Add button
    Then Click the Continue button
    And Click the Company button
    Then Fill the Mandatory fields with:
      | email                         | name                      | country           | state              | city                | address                                | tax id              |
      | vladu.simu131@gmail.com       | Simu  Vladu               | Romania           | Bucuresti          | Bucharest           | Strada Amaradiei 15, Bloc D, Ap. 10    | 123-45-6789         |
    Then Click the Autoprocess radio button
    And Click the Pay button
    Then Check if the order is completed

#  @TR @regression
  Scenario: Place an Order for an Attraction, that has expired.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_CF_009"
    And Click the Date interval radio button
    Then Fill the Start date combo box with "2025-07-07"
    And Fill the Start time combo box with "12:00"
    Then Expand the Location accordion
    And Fill the Location address field with "Str. Bratarii nr. 2"
    Then Click on Next button
    And Click the Create ticket button
    Then Fill the Ticket Name field with "Transylvania Castle Explorer Pass"
    And Fill the Ticket Price field with 25
    Then Click the Save ticket button
    And Click on Next button
    Then Click on Next button
    And Click the Add button
    And Click the Continue button
    Then Check the Customer Form for an error

#  @TR
  Scenario: Place an Order for an Attraction, that is scheduled at a future date.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_CF_010"
    And Click the Date interval radio button
    Then Fill the Start date combo box with "2025-10-10"
    And Fill the Start time combo box with "12:00"
    Then Expand the Location accordion
    And Fill the Location address field with "Bd. Iuliu Maniu nr. 536"
    Then Click on Next button
    And Click the Create ticket button
    Then Fill the Ticket Name field with "Bucharest Night Experience – Fast Track Entry"
    And Fill the Ticket Price field with 13
    Then Click the Save ticket button
    And Click on Next button
    And Click on Next button
    Then Click the Add button
    And Click the Continue button
    Then Fill the Mandatory fields with:
      | email                           | name                      | country           | state                   | city                | address                                       |
      | marku.florea110@gmail.com       | Marku  Florea             | Romania           | Timis                   | Timisoara           | Str. Nemoianu Iosif, nr. 12, Bloc C, Ap. 5    |
    Then Click the Autoprocess radio button
    And Click the Pay button
    Then Check if the order is completed

