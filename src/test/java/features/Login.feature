Feature: Login

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user submit valid credentials
    Then the user should be redirected to the dashboard page

