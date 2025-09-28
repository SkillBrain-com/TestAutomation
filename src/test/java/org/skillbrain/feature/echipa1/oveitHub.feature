@oveitHub
Feature: Oveit hub feature

  @cris @regression
  Scenario: Language switch to Korean, with priced Attractions available.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_OH_001"
    And Expand the Location accordion
    Then Fill the Location address field with "Calea Eroilor nr. 127"
    Then Click on Next button
    And Click the Create ticket button
    Then Fill the Ticket Name field with "Skyline Adventure Pass"
    And Fill the Ticket Price field with 35
    Then Click the Save ticket button
    And Click on Preview & Publish tab button
    Then Click the Publish attraction button
    And Click the Share button
    Then Click the Redirect button
    And Click the More button
    And Select Korean item from the language dropdown
    Then Check if the hub language is set to Korean, and the "From" text is translated correct

  @cris
  Scenario: Sharing an Attraction.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_OH_002"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Orzari nr. 123"
    Then Click on Next button
    And Click the Create ticket button
    Then Fill the Ticket Name field with "Quantum Realm Experience Pass"
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Publish attraction button
    Then Click the Share button
    And Click the Redirect button
    Then Click the More button
    And Click the Share attraction button
    Then The modal with sharing options appear

  @cris @regression
  Scenario: Buy more than 20 tickets.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_OH_003"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Vânători nr. 1A"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "General Entry Pass"
    Then Fill the Ticket Price field with 35
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Publish attraction button
    Then Click the Share button
    And Click the Redirect button
    Then Click the Buy Now button
    And Click the Add button for 20 times
    Then Check the ticket quantity, the add button must not be disabled

  @cris
  Scenario: Ordering without a ticket.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_OH_004"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Nuvelei nr. 45"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Special Entry Pass"
    Then Fill the Ticket Price field with 23
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Publish attraction button
    Then Click the Share button
    And Click the Redirect button
    And Click the Buy Now button
    Then Check the continue and subtract buttons, they must be disabled

  @cris
  Scenario: Total check, for an order of 20 tickets.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_OH_005"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Matei Corvin nr. 123"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Main Entry"
    Then Fill the Ticket Price field with 12
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Publish attraction button
    Then Click the Share button
    And Click the Redirect button
    Then Click the Buy Now button
    And Click the Add button for 20 times
    And Click the simple Continue button
    Then Check order summary, for the order with 20 tickets

  @cris
  Scenario: Place an Order, using the Card method.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_OH_006"
    And Expand the Location accordion
    Then Fill the Location address field with "Bd. Basarabiei nr. 112"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "VIP Entry"
    Then Fill the Ticket Price field with 59
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Publish attraction button
    Then Click the Share button
    And Click the Redirect button
    Then Click the Buy Now button
    And Click the simple Add button
    Then Click the simple Continue button
    And Fill the simple Mandatory fields with:
      | email                           | name                      | country           | state              | city                | address                            |
      | dan.diaconescu121@gmail.com     | Dan Diaconescu            | Romania           | Timis              | Timisoara           | Bulevardul Revolutiei 23, Ap. 5    |
    Then Click the simple Pay button
    And Fill all Payment fields with:
      | email                         | card nr                   | card expiry     | card cvc  | cardholder name            | country                   | zip      |
      | dan.diaconescu121@gmail.com   | 4242424242424242          | 0130            | 235       | Dan Diaconescu             | US                        | 432112   |
    And Click the Pay Payment button
    Then Check if the simple order is completed

  @cris
  Scenario: Place an Order, for a person that buys 10 tickets, using the Autoprocess method.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_OH_007"
    And Expand the Location accordion
    Then Fill the Location address field with "Calea Victoriei nr. 134"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Special Entry"
    Then Fill the Ticket Price field with 45
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Publish attraction button
    Then Click the Share button
    And Click the Redirect button
    Then Click the Buy Now button
    And Click the Add button for 10 times
    Then Click the simple Continue button
    And Fill the simple Mandatory fields with:
      | email                           | name                        | country           | state              | city                | address                              |
      | parvulescu.ema105@gmail.com     | Ema  Parvulescu             | Romania           | Timis              | Timisoara           | Bulevardul Revolutiei 35, Ap. 3      |
    Then Click the simple Autoprocess radio button
    And Click the simple Pay button
    Then Check if the simple order is completed

  @cris
  Scenario: Place an Order, for a company that buys 2 tickets (1 free + 1 priced) and 1 bundle of 10 priced tickets, using the Card method.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_OH_008"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Revolutiei nr. 221"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Priced Entry"
    Then Fill the Ticket Price field with 23
    And Click the Save ticket button
    Then Click the New Ticket button
    And Fill the Ticket Name field with "Free Entry"
    And Click the Save ticket button
    Then Click the New bundle button
    And Fill the Bundle Name field with "Bundle of Tickets"
    Then Fill the Bundle Price field with 47
    And Click the Add ticket button
    Then Pick the priced ticket item, within the Name dropdown
    And Fill the Quantity field with 10
    Then Click the Save bundle button
    Then Click on Preview & Publish tab button
    And Click the Publish attraction button
    Then Click the Share button
    And Click the Redirect button
    Then Click the Buy Now button
    And Click the simple Add button
    Then Click the simple Second Add button
    And Click the simple Third Add button
    Then Click the simple Continue button
    And Fill the simple Mandatory fields with:
      | email                           | name                      | country           | state              | city                | address                            |
      | dan.diaconescu121@gmail.com     | Dan Diaconescu            | Romania           | Timis              | Timisoara           | Bulevardul Revolutiei 23, Ap. 5    |
    Then Click the simple Pay button
    And Fill all Payment fields with:
      | email                         | card nr                   | card expiry     | card cvc  | cardholder name            | country                   | zip      |
      | dan.diaconescu121@gmail.com   | 4242424242424242          | 0130            | 235       | Dan Diaconescu             | US                        | 432112   |
    And Click the Pay Payment button
    Then Check if the simple order is completed

  @cris
  Scenario: Place an Order, for a person, that is asked to fill 6 unique custom fields of different importance, using the Autoprocess method.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_OH_009"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Crizantemei nr. 151"
    And Expand the Advanced settings accordion
    Then Click the Enable Customer Form checkbox
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Special VIP Secret Entry"
    Then Fill the Ticket Price field with 55
    And Click the Save ticket button
    Then Click the Customer form tab button
    And Fill the First Custom Name Field with "Phone Number"
    Then Click the Mandatory checkbox
    And Click the New field button
    Then Click the Second Field Type dropdown, pick the Multi-line text field item
    And Fill the Second Custom Name Field with "Observations"
    Then Click the New field button
    And Click the Third Field Type dropdown, pick the Email address item
    Then Fill the Third Custom Name Field with "Alternative Email Address"
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
    And Click the Publish attraction button
    Then Click the Share button
    And Click the Redirect button
    Then Click the Buy Now button
    And Click the simple Add button
    Then Click the simple Continue button
    And Fill the simple Mandatory fields with:
      | email                       | name                | country     | state     | city        | address               | phone number      | observations          | alt email                           | booking date  | professions | smoking |
      | maria.ionescu@gmail.com     | Maria Ionescu       | Romania     | Botosani  | Botosani    | Str. Victoriei 24     | +40 723 456 789   | Prefer phone call     | maria.ionescu.work@gmail.com        | 10122025      | Engineer    | Yes     |
    Then Click the simple Pay button
    And Fill all Payment fields with:
      | email                         | card nr                   | card expiry     | card cvc  | cardholder name             | country                   | zip      |
      | maria.ionescu@gmail.com       | 4242424242424242          | 0130            | 235       | Maria Ionescu               | US                        | 432112   |
    And Click the Pay Payment button
    Then Check if the simple order is completed

  @cris
  Scenario: Registering for a free Attraction.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_OH_010"
    And Expand the Location accordion
    Then Fill the Location address field with "Bd. Dreptatii nr. 551"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Free Entry Pass"
    Then Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Click the Publish attraction button
    Then Click the Share button
    And Click the Redirect button
    And Click Reserve now button
    Then Fill the Email Address Field with "dan.diaconescu121@gmail.com"
    And Click Register button
    Then Check registration results

