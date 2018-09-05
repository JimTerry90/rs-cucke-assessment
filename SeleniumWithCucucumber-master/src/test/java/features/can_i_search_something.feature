Feature: Product Search
  This feature allows users to search for a product by term

  Scenario Outline: Search for a specific product and recieve results
    Given I browse to the website
    When I enter a valid search <term>
    And I click the submit button
    Then I should see relevant product <results>
    Examples:
      | term           | results       |
      | "Raspberry Pi" | "Raspberry Pi"|
      | "Resistor"     | "Resistor"    |
      | "Radio"        | "Radio"       |
