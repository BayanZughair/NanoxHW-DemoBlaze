Feature: Sign up feature

  @SignUp
  Scenario Outline: Sign up user with valid input
    Given User already on demoblaze home page
    When User click sign up button in homepage
    And User input "<username>" in username field
    And User input "<password>" in password field
    And User click sign up button
    Then User should see pop up message "Sign up successful."
    Examples:
      | username | password |
      | Bayan    | 123z    |

  @SignUp
  Scenario Outline: Sign up new user with empty password field
    Given User already on demoblaze home page
    When User click sign up button in homepage
    And User input "<username>" in username field
    And User input "<password>" in password field
    And User click sign up button
    Then User should see pop up message "Please fill out Username and Password."
    Examples:
      | username | password |
      | Bayan2   |          |
