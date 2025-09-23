#@privateInvitation
Feature: Private invitation feature

#  @cris
  Scenario: Invite code validity, for customers.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    Then Click the Create attraction button
    Then Fill the Attraction name field with "TC_PI_001"
    And Expand the Location accordion
    Then Fill the Location address field with "Random Place Some Where Else"
    And Click on Next button
    And Click the Create ticket button
    And Fill the Ticket Name field with "Test Ticket 001"
    And Fill the Ticket Price field with "23"
    And Expand the Ticket configuration accordion
    And Expand the Ticket visibility accordion
    And Select the Private Invitation radio button
    And Fill the Invitation code field with "INV010101"
    And Click the Save button
    And Click on Next button
    And Click on Next button
    And Fill the Code field with the previously entered invitation "INV010101"
    And Click the Apply button
    Then Check the results

#  @cris
  Scenario: Invite code validity, for guests.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    Given I am on the "Attractions" page
    When I click the "Create attraction" button
    And I fill the "Attraction name" field
    And I expand the "Location" accordion
    And I fill the "Location/address" field
    And I click the "Next" button
    And I click the "Create ticket" button
    And I fill the "Name" field
    And I expand the "Ticket configuration" accordion
    And I expand the "Ticket visibility" accordion
    And I select the "Private Invitation" radio button
    And I fill the "Invitation code" field with a generated code
    And I click the "Save" button
    And I click the "Next" button
    And I click the "Next" button again
    And I fill the "Code" field with the previously entered invitation code
    And I click the "Apply" button
    Then I should see access granted only with the correct invitation code

#  @cris
  Scenario: Invite code validity, for customers, on the Oveit Hub.
    Given I am on the "Attractions" page
    When I click the "Create attraction" button
    And I fill the "Attraction name" field
    And I expand the "Location" accordion
    And I fill the "Location/address" field
    And I click the "Next" button
    And I click the "Create ticket" button
    And I fill the "Name" field
    And I fill the "Price" field with a value greater than 0
    And I expand the "Ticket configuration" accordion
    And I expand the "Ticket visibility" accordion
    And I select the "Private Invitation" radio button
    And I fill the "Invitation code" field with a generated code
    And I click the "Save" button
    And I click the "Next" button
    And I click the "Next" button again
    And I click the "Publish attraction" button
    And I click the "Share" button
    And I click the "Redirect" button under the "Attraction link" field
    And I click the "Register now" button on the new page
    And I fill the "Apply code" field with the previously entered invitation code
    And I click the "Apply" button
    Then I should see access granted only with the correct invitation code

#  @cris
  Scenario: Invite code validity, for guests, on the Oveit Hub.
    Given I am on the "Attractions" page
    When I click the "Create attraction" button
    And I fill the "Attraction name" field
    And I expand the "Location" accordion
    And I fill the "Location/address" field
    And I click the "Next" button
    And I click the "Create ticket" button
    And I fill the "Name" field
    And I expand the "Ticket configuration" accordion
    And I expand the "Ticket visibility" accordion
    And I select the "Private Invitation" radio button
    And I fill the "Invitation code" field with a generated code
    And I click the "Save" button
    And I click the "Next" button
    And I click the "Next" button again
    And I click the "Publish attraction" button
    And I click the "Share" button
    And I click the "Redirect" button under the "Attraction link" field
    And I click the "Register now" button on the new page
    And I fill the "Apply code" field with the previously entered invitation code
    And I click the "Apply" button
    Then I should see access granted only with the correct invitation code

#  @cris
  Scenario: Invite code validity, for customers, on the Default Hub.
    Given I am on the "Attractions" page
    When I click the "Create attraction" button
    And I fill the "Attraction name" field
    And I expand the "Location" accordion
    And I fill the "Location/address" field
    And I click the "Next" button
    And I click the "Create ticket" button
    And I fill the "Name" field
    And I fill the "Price" field with a value greater than 0
    And I expand the "Ticket configuration" accordion
    And I expand the "Ticket visibility" accordion
    And I select the "Private Invitation" radio button
    And I fill the "Invitation code" field with a generated code
    And I click the "Save" button
    And I click the "Next" button
    And I click the "Next" button again
    And I click the "Publish attraction" button
    And I click the "Share" button
    And I select the "Default" radio button
    And I click the "Redirect" button under the "Attraction link" field
    And I fill the "Invitation code" field with the previously entered code
    And I click the "Apply code" button
    Then I should see access granted only with the correct invitation code

#  @cris
  Scenario: Invite code validity, for guests, on the Default Hub.
    Given I am on the "Attractions" page
    When I click the "Create attraction" button
    And I fill the "Attraction name" field
    And I expand the "Location" accordion
    And I fill the "Location/address" field
    And I click the "Next" button
    And I click the "Create ticket" button
    And I fill the "Name" field
    And I expand the "Ticket configuration" accordion
    And I expand the "Ticket visibility" accordion
    And I select the "Private Invitation" radio button
    And I fill the "Invitation code" field with a generated code
    And I click the "Save" button
    And I click the "Next" button
    And I click the "Next" button again
    And I click the "Publish attraction" button
    And I click the "Share" button
    And I select the "Default" radio button
    And I click the "Redirect" button under the "Attraction link" field
    And I fill the "Invitation code" field with the previously entered code
    And I click the "Apply code" button
    Then I should see access granted only with the correct invitation code

#  @cris
  Scenario: Place an order, with a private invitation ticket.
    Given I am on the "Attractions" page
    When I click the "Create attraction" button
    And I fill the "Attraction name" field
    And I expand the "Location" accordion
    And I fill the "Location/address" field
    And I click the "Next" button
    And I click the "Create ticket" button
    And I fill the "Name" field
    And I fill the "Price" field with a value greater than 0
    And I expand the "Ticket configuration" accordion
    And I expand the "Ticket visibility" accordion
    And I select the "Private Invitation" radio button
    And I fill the "Invitation code" field with a generated code
    And I click the "Save" button
    And I click the "Next" button
    And I click the "Next" button again
    And I fill the "Apply code" field with the previously entered invitation code
    And I click the "Apply" button
    And I click the "+" button to select tickets
    And I click the "Continue" button
    And I fill all mandatory fields marked with "*"
    And I select the "Autoprocess" radio button
    And I click the "Pay" button
    Then I should see the "Order confirmation" step

#  @cris
  Scenario: Place an order, with a private invitation ticket, via the Oveit Hub.
    Given I am on the "Attractions" page
    When I click the "Create attraction" button
    And I fill the "Attraction name" field
    And I expand the "Location" accordion
    And I fill the "Location/address" field
    And I click the "Next" button
    And I click the "Create ticket" button
    And I fill the "Name" field
    And I fill the "Price" field with a value greater than 0
    And I expand the "Ticket configuration" accordion
    And I expand the "Ticket visibility" accordion
    And I select the "Private Invitation" radio button
    And I fill the "Invitation code" field with a generated code
    And I click the "Save" button
    And I click the "Next" button
    And I click the "Next" button again
    And I click the "Publish attraction" button
    And I click the "Share" button
    And I click the "Redirect" button under the "Attraction link" field
    And I click the "Register now" button
    And I fill the "Apply code" field with the previously entered invitation code
    And I click the "Apply" button
    And I click the "+" button to select tickets
    And I click the "Continue" button
    And I fill all mandatory fields marked with "*"
    And I select the "Autoprocess" radio button
    And I click the "Pay" button
    Then I should see the "Order confirmation" step

#  @cris
  Scenario: Place an order, with a private invitation ticket, via the Default Hub.
    Given I am on the "Attractions" page
    When I click the "Create attraction" button
    And I fill the "Attraction name" field
    And I expand the "Location" accordion
    And I fill the "Location/address" field
    And I click the "Next" button
    And I click the "Create ticket" button
    And I fill the "Name" field
    And I fill the "Price" field with a value greater than 0
    And I expand the "Ticket configuration" accordion
    And I expand the "Ticket visibility" accordion
    And I select the "Private Invitation" radio button
    And I fill the "Invitation code" field with a generated code
    And I click the "Save" button
    And I click the "Next" button
    And I click the "Next" button again
    And I click the "Publish attraction" button
    And I click the "Share" button
    And I select the "Default" radio button
    And I click the "Redirect" button under the "Attraction link" field
    And I fill the "Invitation code" field with the previously entered code
    And I click the "Apply" button
    And I click the "Reserve tickets" button
    And I fill the "Your email address" field
    And I fill the "Name" field
    And I fill the "Address" field
    And I select a value from the "Country" combobox
    And I select a value from the "State" combobox
    And I fill the "City" field
    And I click the "Continue" button
    And I click the "Autoprocess" button
    Then I should see the reservation confirmed

#  @cris
  Scenario Outline: Invitation code with special characters only.
    Given I am on the "Attractions" page
    When I click the "Create attraction" button
    And I fill the "Attraction name" field
    And I expand the "Location" accordion
    And I fill the "Location/address" field
    And I click the "Next" button
    And I click the "Create ticket" button
    And I fill the "Name" field
    And I expand the "Ticket configuration" accordion
    And I expand the "Ticket visibility" accordion
    And I select the "Private Invitation" radio button
    And I fill the "Invitation code" field with <InvitationCode>
    And I click the "Save" button
    And I click the "Next" button
    And I click the "Next" button again
    And I fill the Code field with <InvitationCode>
    And I click the Apply button
    Then I should see <Result>

    Examples:
      | InvitationCode  | Result        |
      | INV010101       | valid code    |
      | @!!#%#%%#@      | invalid code  |

