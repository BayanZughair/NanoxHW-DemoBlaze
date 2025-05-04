Feature: Cart page feature

  @CartPage
  Scenario Outline: Verify that by clicking on Place Order button will displays the purchase form
    Given User already on demoblaze home page
    When User click login in button in home page
    And User input "BayanZug" in username field in login page
    And User input "qananox" in password field in login page
    And User click login button
    Then User successfully logged in and should see Welcome "BayanZug" label at the navigation bar
    When User click on phones button in categories
    And User click on "<productName>"
    Then User will be redirected to the product page
    When User click on add to cart button
    Then The product has been added to cart and user should see pop up with this message "Product added."
    When User click on the cart button in navigation bar
    Then User should be redirected to cart page
    When User click on Place Order button
    Then User should see purchase form
    Examples:
      | productName      |
      | Nokia lumia 1520 |

  @CartPage
  Scenario Outline: Click delete button
    Given User already on demoblaze home page
    When User click login in button in home page
    And User input "BayanZug" in username field in login page
    And User input "qananox" in password field in login page
    And User click login button
    Then User successfully logged in and should see Welcome "BayanZug" label at the navigation bar
    When User click on phones button in categories
    And User click on "<productName>"
    Then User will be redirected to the product page
    When User click on add to cart button
    Then The product has been added to cart and user should see pop up with this message "Product added."
    When User click on the cart button in navigation bar
    Then User should be redirected to cart page
    When User click on delete button
    Examples:
      | productName      |
      | Nokia lumia 1520 |
