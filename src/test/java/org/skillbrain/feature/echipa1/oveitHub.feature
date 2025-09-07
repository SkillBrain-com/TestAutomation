#@oveitHub
Feature: Oveit hub feature

#  @cris @regression
  Scenario: Language switch to Korean, with priced Attractions available.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Create attraction button
    Then Fill the Attraction name field with "TC_OH_001"
    And Expand the Location accordion
    And Fill the Location address field with "Calea Eroilor Victoriei 127"
    And Click on Next button
    And Click the Create ticket button
    And Fill the Ticket Name field with "Test Ticket"
    And Fill the Ticket Price field with "35"
    And Click the Save button
    And Click on Preview & Publish tab button
    And Click the Publish attraction button
    And Click the Share button
    And Click the Redirect
    And Click the More button
    And Click the Language dropdown
    And Select Korean item from the dropdown
    Then Check if the hub language is set to Korean, and the "From" text is translated correct

#  @cris
  Scenario: Sharing an Attraction.
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    And Click the Go To Hub button
    Then Click the Share attraction button
    Then Check the modal
