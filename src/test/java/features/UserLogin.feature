Feature: User Login

  @userLogin
  Scenario: Successful login  with valid credentials
    Given User is on the login page
    When User submit valid credential
    Then User should be redirected to the dashboard