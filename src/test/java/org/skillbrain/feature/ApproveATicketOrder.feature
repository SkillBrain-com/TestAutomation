Feature: Approve a Ticket Order
  @radu
    Scenario: Approve a ticket order
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in
    Then I click on reports
    Then I click on order history
    And I click on ticket number
    Then I click on approve
    And I verify if the order is approved
