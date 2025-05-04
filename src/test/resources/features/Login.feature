Feature: Log in feature

  @Login
  Scenario Outline: Login user with valid input
    Given User already on demoblaze home page
    When User click login in button in home page
    And User input "<username>" in username field in login page
    And User input "<password>" in password field in login page
    And User click login button
    Then User successfully logged in and should see Welcome "<username>" label at the navigation bar
    Examples:
      | username | password |
      | BayanZug | qananox  |

  @Login
  Scenario Outline: Login user with unregistered credentials
    Given User already on demoblaze home page
    When User click login in button in home page
    And User input "<username>" in username field in login page
    And User input "<password>" in password field in login page
    And User click login button
    Then User failed to login and should see pop up with this message "User does not exist."
    Examples:
      | username | password |
      | BayanTest1| qananox  |

  @Login
  Scenario Outline: Login user with wrong password
    Given User already on demoblaze home page
    When User click login in button in home page
    And User input "<username>" in username field in login page
    And User input "<password>" in password field in login page
    And User click login button
    Then User failed to login and should see pop up with this message "Wrong password."
    Examples:
      | username | password |
      | BayanZu | 123456    |