@privateInvitation
Feature: Private invitation feature

#  @TR
  Scenario: Invite code validity, for customers.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_PI_001"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Lalelelor nr. 115"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Simple Ticket Entry"
    Then Fill the Ticket Price field with 23
    And Expand the Ticket configuration accordion
    Then Expand the Ticket visibility accordion
    And Click the Private Invitation radio button
    Then Fill the Invitation code field with "INV010101"
    And Click the Save ticket button
    Then Click on Next button
    And Click on Next button
    Then Fill the Code field, meant for customers, with the previously entered invitation "INV010101"
    And Click the Apply button
    Then Check if the ticket has the "Private" tag

#  @TR
  Scenario: Invite code validity, for guests.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_PI_002"
    And Expand the Location accordion
    Then Fill the Location address field with "Splaiul Unirii nr. 683"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Generic Entry"
    Then Expand the Ticket configuration accordion
    And Expand the Ticket visibility accordion
    Then Click the Private Invitation radio button
    And Fill the Invitation code field with "INV020202"
    Then Click the Save ticket button
    And Click on Next button
    Then Click on Next button
    And Fill the Code field, meant for guests, with the previously entered invitation "INV020202"
    And Click the Apply button
    Then Check the toast for the "Private invitation applied" message

#  @TR
  Scenario: Invite code validity, for customers, on the Oveit Hub.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_PI_003"
    And Expand the Location accordion
    Then Fill the Location address field with "Bd. Iuliu Maniu nr. 14"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "VIP Entry"
    Then Fill the Ticket Price field with 20
    And Expand the Ticket configuration accordion
    Then Expand the Ticket visibility accordion
    And Click the Private Invitation radio button
    Then Fill the Invitation code field with "INV030303"
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    Then Click the Publish attraction button
    And Click the Share button
    Then Click the Redirect button
    And Click the Register now button
    Then Fill the simple Code field, meant for customers, with the previously entered invitation "INV030303"
    And Click the simple Apply button
    Then Check if the simple ticket has the "Private" tag

#  @TR
  Scenario: Invite code validity, for guests, on the Oveit Hub.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_PI_004"
    And Expand the Location accordion
    Then Fill the Location address field with "Șoseaua Alexandria nr. 152"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Secret Backdoor Entry"
    Then Expand the Ticket configuration accordion
    And Expand the Ticket visibility accordion
    Then Click the Private Invitation radio button
    And Fill the Invitation code field with "INV040404"
    Then Click the Save ticket button
    And Click on Preview & Publish tab button
    And Click the Publish attraction button
    Then Click the Share button
    And Click the Redirect button
    Then Click the Register now button
    And Fill the simple Code field, meant for guests, with the previously entered invitation "INV040404"
    And Click the simple Apply button
    Then Check the toast for the simple "Private invitation applied" message

#  @TR
  Scenario: Invite code validity, for customers, on the Default Hub.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_PI_005"
    And Expand the Location accordion
    Then Fill the Location address field with "Bd. Metalurgiei nr. 240"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Standard Customer Entry"
    Then Fill the Ticket Price field with 20
    And Expand the Ticket configuration accordion
    Then Expand the Ticket visibility accordion
    And Click the Private Invitation radio button
    Then Fill the Invitation code field with "INV050505"
    And Click the Save ticket button
    Then Click on Next button
    And Click on Next button
    Then Click the Publish attraction button
    And Click the Share button
    Then Click the Default radio button
    And Click the old Redirect button
    Then Fill the old Code field, with the previously entered invitation "INV050505"
    And Click the old Apply button
    Then Check if the ticket has the old "The invitation code has been successfully applied." tag

#  @TR
  Scenario: Invite code validity, for guests, on the Default Hub.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_PI_006"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Remetea nr. 12"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Special VIP Entry"
    Then Expand the Ticket configuration accordion
    And Expand the Ticket visibility accordion
    Then Click the Private Invitation radio button
    And Fill the Invitation code field with "INV060606"
    Then Click the Save ticket button
    And Click on Next button
    Then Click on Next button
    And Click the Publish attraction button
    Then Click the Share button
    And Click the Default radio button
    Then Click the old Redirect button
    And Fill the old Code field, with the previously entered invitation "INV060606"
    And Click the old Apply button
    Then Check the toast for the old "The invitation code has been successfully applied." message

#  @TR
  Scenario: Place an order, with a private invitation ticket.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_PI_007"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Serg. Nicolae Florescu"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Standard Ticket Entry"
    Then Fill the Ticket Price field with 20
    And Expand the Ticket configuration accordion
    Then Expand the Ticket visibility accordion
    And Click the Private Invitation radio button
    Then Fill the Invitation code field with "INV070707"
    And Click the Save ticket button
    Then Click on Preview & Publish tab button
    And Fill the Code field, meant for customers, with the previously entered invitation "INV070707"
    Then Click the Apply button
    And Click the Add button
    Then Click the Continue button
    And Fill the Mandatory fields with:
      | email                           | name                      | country           | state              | city                  | address                            |
      | ioana.popescu94@gmail.com       | Ioana Popescu             | Romania           | Cluj               | Cluj-Napoca           | Strada Eroilor 12, Bloc B, Ap. 7   |
    Then Click the Autoprocess radio button
    And Click the Pay button
    Then Check if the order is completed

#  @TR
  Scenario: Place an order, with a private invitation ticket, via the Oveit Hub.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_PI_008"
    And Expand the Location accordion
    Then Fill the Location address field with "Prelungirea Ghencea nr. 238"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "VIP Entry"
    Then Fill the Ticket Price field with 20
    And Expand the Ticket configuration accordion
    Then Expand the Ticket visibility accordion
    And Click the Private Invitation radio button
    Then Fill the Invitation code field with "INV080808"
    And Click the Save ticket button
    Then Click on Next button
    And Click on Next button
    Then Click the Publish attraction button
    And Click the Share button
    Then Click the Redirect button
    And Click the Register now button
    Then Fill the simple Code field, meant for customers, with the previously entered invitation "INV080808"
    And Click the simple Apply button
    Then Click the simple Add button
    And Click the simple Continue button
    Then Fill the simple Mandatory fields with:
      | email                           | name                      | country           | state              | city                | address                            |
      | dan.diaconescu121@gmail.com     | Dan Diaconescu            | Romania           | Timis              | Timisoara           | Bulevardul Revolutiei 23, Ap. 5    |
    And Click the simple Autoprocess radio button
    And Click the simple Pay button
    Then Check if the simple order is completed

#  @TR
  Scenario: Place an order, with a private invitation ticket, via the Default Hub.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_PI_009"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Câmpul Pipera nr. 21"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Standard Entry"
    Then Fill the Ticket Price field with 20
    And Expand the Ticket configuration accordion
    Then Expand the Ticket visibility accordion
    And Click the Private Invitation radio button
    Then Fill the Invitation code field with "INV090909"
    And Click the Save ticket button
    Then Click on Next button
    And Click on Next button
    Then Click the Publish attraction button
    And Click the Share button
    Then Click the Default radio button
    And Click the old Redirect button
    Then Fill the old Code field, with the previously entered invitation "INV090909"
    And Click the old Apply button
    Then Click the Reserve tickets button
    And Fill the six fields for the Customer Form with:
      | email                           | name                      | country           | state              | city                | address                            |
      | dan.diaconescu121@gmail.com     | Dan Diaconescu            | Romania           | Timis              | Timisoara           | Bulevardul Revolutiei 23, Ap. 5    |
    Then Click the old Continue button
    And Click the old Autoprocess radio button
    Then Check if the old order is completed

#  @TR
  Scenario: Invitation code with special characters only.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_PI_010"
    And Expand the Location accordion
    Then Fill the Location address field with "Str. Anastasie Panu nr. 1"
    And Click on Next button
    Then Click the Create ticket button
    And Fill the Ticket Name field with "Secret VIP Entry"
    Then Expand the Ticket configuration accordion
    And Expand the Ticket visibility accordion
    Then Click the Private Invitation radio button
    And Fill the Invitation code field with "@!!#%#%%#@"
    Then Click the Save ticket button
    And Click on Next button
    Then Click on Next button
    And Fill the Code field, meant for guests, with the previously entered invitation "@!!#%#%%#@"
    And Click the Apply button
    Then Check the "Invalid invitation code"
