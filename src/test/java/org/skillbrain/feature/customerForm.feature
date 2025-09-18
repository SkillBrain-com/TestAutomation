Feature: Create 2 tickets (one free and one 10 RON) that contains a mandatory custom text field of e-mail address.

  @test-lsr
  Scenario: Create 2 tickets (one free and one 10 RON) that contains a mandatory custom text field of e-mail address.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And I click on Create attraction button
    Then Fill the Attraction name field with "Attraction 2"
    Then Expand location Accordion
    And Fill "Location/address" Field
    Then Expand Advanced settings Field
#    And Click "Enable Customer Form" Checkbox
#    Then Click "Next Button" Button
#    And Click "Create ticket" Button
#    Then Fill "Name" Field
#    And Click "Create ticket" Button to create the second ticket
#    Then Fill "Name" Field.
#    And Fill "Price" Field, with value "10"
#    Then Click "Save" Button
#    And Click "Customer form" Tab Button
#    Then Click "Field Name" Field
#    And Click "Mandatory" Checkbox
#    Then Click "Next" Button
#    And Click "+" Button
#    Then Click "Continue" Button
#    And Check "Customer" Form