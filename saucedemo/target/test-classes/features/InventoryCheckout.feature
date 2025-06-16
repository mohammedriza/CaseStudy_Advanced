Feature: InventoryCheckout

  Scenario Outline: Add multiple products and checkout for thank you message
    Given I goto SauceDemo application
    When I login to the application using the app credentials
    Then I verify the application url contains "<inventoryUrl>"
    Then I add product "<productDescription1>" to shopping cart
    Then I add product "<productDescription2>" to shopping cart
    And I click on Shopping cart icon to goto checkout page
    Then I click on Checkout button
    And I provide checkout information using "<firstName>", "<lastName>", and "<zipCode>"
    Then I click on Continue button
    Then I click on Finish button
    Then I verify the application url contains "<checkoutUrl>"
    Then I verify the checkout message is "<checkoutMessage>"
  Examples:
    |inventoryUrl|productDescription1|productDescription2|firstName|lastName|zipCode|checkoutUrl|checkoutMessage|
    |            |                   |                   |         |        |       |checkout-complete|Thank you for your order!|