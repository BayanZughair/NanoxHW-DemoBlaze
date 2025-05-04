Feature: Home page feature

  @HomePage
  Scenario: Verify that by clicking on the product name will redirects user to the product page
    Given User already on demoblaze home page
    When User click login in button in home page
    And User input "BayanZug" in username field in login page
    And User input "qananox" in password field in login page
    And User click login button
    Then User successfully logged in and should see Welcome "BayanZug" label at the navigation bar
    When User click on phones button in categories
    And User click on "Nokia lumia 1520"
    Then User will be redirected to the product page