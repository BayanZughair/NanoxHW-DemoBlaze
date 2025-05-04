Feature: Product page feature

  @ProductPage
  Scenario Outline: Verify that by clicking on add to cart button will adds the product to the cart
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
    Examples:
      | productName      |
      | Nokia lumia 1520 |

