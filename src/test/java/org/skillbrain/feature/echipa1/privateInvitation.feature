Feature: Private invitation feature

  @cris
  Scenario: Successfully create an attraction with a private invitation ticket
    Given Click the Create attraction button
    When Fill the Attraction name field with "Attraction name"
    And Expand the Location accordion
    And Fill the Location address field with "Location name"
    And Click on Next button
    And Click the Create ticket button
    And Fill the Ticket Name field with "Name"
    And Fill the Ticket Price field with "Price"
    And Expand the Ticket configuration accordion
    And Expand the Ticket visibility accordion
    And Select the Private Invitation radio button
    And Fill the Invitation code field with "Code"
    And Click the Save button
    And Click on Next button
    And Click on Next button
    And Fill the Code field with the previously entered invitation "Code"
    And Click Apply button
    Then check the results
