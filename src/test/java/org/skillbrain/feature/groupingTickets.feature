Feature: Grouping Tickets feature

  @grouping
  Scenario: Create attraction with grouped tickets
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Grouping Attraction name field with "GroupingTickets"
    And Expand the Grouping Location accordion
    And Fill the Grouping Location address field with "Bucuresti"
    And Click on Grouping Next button
    And Click the Create ticket button for grouping
    Then Fill the Grouping Ticket Name field with "A"
    And Fill the Grouping Ticket Price field with "10"
    And Click the Save button for grouping ticket
    And Click the new ticket button
    Then Fill the Grouping Ticket Name field with "B" for second ticket
    And Fill the Grouping Ticket Price field with "15" for second ticket
    And Click the Save button for second ticket
    And Drag ticket B on top of ticket A to create a group
    And Click on Grouping Next button
    And Click on Grouping Next button
    And Click on Grouping Preview & Publish tab button
    Then Click the Publish attraction button
    Then Check if the attraction is published successfully