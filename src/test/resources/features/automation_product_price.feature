@ProductPrice
Feature: Automation Products Prices
  Scenario: All Price
    Given User is on the homepage
    And User click Dresses link
    And User see all product price  then to do list all product and price
    And select highest price product.
    Then Verify selected product price expensive than 40 USD
