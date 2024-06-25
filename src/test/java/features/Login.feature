Feature: Login

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
      | username  | password |
      | testuser  | password123 |
    And the user clicks on the login button
    Then the user should be redirected to the dashboard page
    And a welcome message should be displayed

  Scenario: Unsuccessful login with invalid credentials
    Given the user is on the login page
    When the user enters invalid credentials
      | username  | password |
      | testuser  | wrongpass |
    And the user clicks on the login button
    Then an error message should be displayed
    And the user should remain on the login page

  Scenario: Unsuccessful login with empty fields
    Given the user is on the login page
    When the user leaves the username and password fields empty
    And the user clicks on the login button
    Then an error message should be displayed
    And the user should remain on the login page

  Scenario: Unsuccessful login with only username
    Given the user is on the login page
    When the user enters only username
      | username  |
      | testuser  |
    And the user clicks on the login button
    Then an error message should be displayed
    And the user should remain on the login page

  Scenario: Unsuccessful login with only password
    Given the user is on the login page
    When the user enters only password
      | password  |
      | password123 |
    And the user clicks on the login button
    Then an error message should be displayed
    And the user should remain on the login page
