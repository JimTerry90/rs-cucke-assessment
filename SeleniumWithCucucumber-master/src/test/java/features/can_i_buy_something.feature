Feature: Product checkout
  This feature allows users proceed to checkout with their products

  Scenario: Search for a new Pneumatic Component and proceed to checkout
    Given I browse to the website
    And I navigate to new products
    And I select Pneumatic Compnents
    When I add the first new Pneumatic product to my basket
    And Open my basket
    Then I should be able to proceed to checkout

  Scenario: Search for a new Diagnostic VideoScope and proceed to checkout
    Given I browse to the website
    And I navigate to new products
    And I select Diagnostic VideoScopes
    When I add the first new Videosope product to my basket
    And Open my basket
    Then I should be able to proceed to checkout