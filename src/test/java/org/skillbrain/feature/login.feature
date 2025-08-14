@gui @login
Feature: Login feature

  Scenario: Login with valid credentials
    Given User navigates to login page
    When User logs in with valid credentials
    Then Check user is logged in