Feature: Create 2 tickets (one free and one 10 RON) that contains a mandatory custom text field of e-mail address.
@ramona
  Scenario: Create 2 tickets (one free and one 10 RON) that contains a mandatory custom text field of e-mail address.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "Attraction 2"
    Then Expand location Accordion
    And Fill the Location address field with "Location 2"
    Then Expand Advanced settings Field
    And Click the Enable Customer Form checkbox
#    And Click "Enable Customer Form" Checkbox
    Then Click on Next button
    And Click the Create ticket button
    Then Fill the Ticket Name field with "Ticket de test"
    And Fill the Ticket Price field with "10"
    Then Click the Save ticket button
    Then Click the New Ticket button
    And Fill the Ticket Name field with "Al II-lea ticket de test"
    Then Fill the Ticket Price field with "0"
    And Click the Save ticket button
    Then Click the Customer form tab button
    And Fill the First Custom Name Field with "1@2.com"
    And Click the Mandatory checkbox
    Then Click on Preview & Publish tab button

#    And Click "Customer form" Tab Button
#    Then Click "Field Name" Field
#    And Click "Mandatory" Checkbox
#    Then Click "Next" Button
#    And Click "+" Button
#    Then Click "Continue" Button
#    And Check "Customer" Form