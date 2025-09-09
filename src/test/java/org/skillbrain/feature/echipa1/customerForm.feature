Feature: Customer form feature

  @cris
  Scenario: Successfully create an attraction with a customer form and ticket
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "Attraction name"
    And Expand the Location accordion
    Then Fill the Location address field with "Location name"
    And Expand the Advanced settings accordion
    And Click the Enable Customer Form checkbox
    Then Click on Next button
    And Click the Create ticket button
    Then Fill the Ticket Name field with "Name"
    And Fill the Ticket Price field with "Price"
    Then Click the Save button
    And Click the Customer form tab button
    Then Fill the Custom Field Name field with "Name"
    And Click the Mandatory checkbox
    Then Click on Next button
    Then Click the Add button
    And Click the Continue button
    Then Check the Custom Text Field
