Feature: Automation practice functionality

  Scenario: login on the AutomationPractice application
    Given user want to launch the application
    When user click the login button
    And user enter the valid username
    And user enter the valid password
    Then user varify the valid username and password

  Scenario: purchase blouse
    Given user mouse hover on women product
    When user click the blouse
    And user mouse hover on product image
    And user click add to cart
    And user click the continue shopping
    Then the product added on the cart

  Scenario: logout on the AutomationPractice application
    Given user click the logout button
