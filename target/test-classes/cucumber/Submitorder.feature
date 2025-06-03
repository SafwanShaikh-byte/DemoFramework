@Regression
Feature: Purchase the Order from E-Commerce Website
  I want to use this template for my feature file

  Background:
    Given I landed on Ecommerce Page

  @tag2
  Scenario Outline: Positive Test of Submitting the order
    Given Logged in with username "<name>" & password "<password>"
    When I want to add the product in Cart
    And Checkout the Confirmationpage
    Then "CHECKOUT CONFIRMATION" is displayed

    Examples: 
      | name       | password   |
      | Safwan123  | pbdev@123  |