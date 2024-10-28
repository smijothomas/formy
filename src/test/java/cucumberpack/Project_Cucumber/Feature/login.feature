Feature: Facebook Login with Invalid Inputs

  Scenario: User attempts to log in with an invalid username & password
    Given the user is on the Facebook login page
    When the user enters invalid username as email
    And enters invalid password
    Then clicks on the login button & shows an error message
