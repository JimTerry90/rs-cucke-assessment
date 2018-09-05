$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("can_i_buy_something.feature");
formatter.feature({
  "line": 1,
  "name": "Product checkout",
  "description": "This feature allows users proceed to checkout with their products",
  "id": "product-checkout",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3286616090,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Search for a new Pneumatic Component and proceed to checkout",
  "description": "",
  "id": "product-checkout;search-for-a-new-pneumatic-component-and-proceed-to-checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I browse to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to new products",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I select Pneumatic Compnents",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I add the first new Pneumatic product to my basket",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Open my basket",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should be able to proceed to checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.iBrowseToTheWebsite()"
});
formatter.result({
  "duration": 1994973145,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iClickTheSubmitButton()"
});
formatter.result({
  "duration": 1786544671,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iSelectPneumaticCompnents()"
});
formatter.result({
  "duration": 1888922084,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iAddTheFirstProductToMyBasket()"
});
formatter.result({
  "duration": 534461168,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.openMyBasket()"
});
formatter.result({
  "duration": 2059596141,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iShouldBeAbleToProceedToCheckout()"
});
formatter.result({
  "duration": 549311474,
  "status": "passed"
});
formatter.after({
  "duration": 186207916,
  "status": "passed"
});
formatter.before({
  "duration": 1402120149,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Search for a new Diagnostic VideoScope and proceed to checkout",
  "description": "",
  "id": "product-checkout;search-for-a-new-diagnostic-videoscope-and-proceed-to-checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I browse to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I navigate to new products",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select Diagnostic VideoScopes",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I add the first new Videosope product to my basket",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Open my basket",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should be able to proceed to checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.iBrowseToTheWebsite()"
});
formatter.result({
  "duration": 1764885740,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iClickTheSubmitButton()"
});
formatter.result({
  "duration": 1771232534,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iSelectDiagnosticVideoScopes()"
});
formatter.result({
  "duration": 1885641422,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iAddTheFirstNewVideosopeProductToMyBasket()"
});
formatter.result({
  "duration": 395555203,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.openMyBasket()"
});
formatter.result({
  "duration": 1391932707,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iShouldBeAbleToProceedToCheckout()"
});
formatter.result({
  "duration": 488028276,
  "status": "passed"
});
formatter.after({
  "duration": 100953859,
  "status": "passed"
});
formatter.uri("can_i_search_something.feature");
formatter.feature({
  "line": 1,
  "name": "Product Search",
  "description": "This feature allows users to search for a product by term",
  "id": "product-search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Search for a specific product and recieve results",
  "description": "",
  "id": "product-search;search-for-a-specific-product-and-recieve-results",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I browse to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter a valid search \u003cterm\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click the submit button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see relevant product \u003cresults\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "product-search;search-for-a-specific-product-and-recieve-results;",
  "rows": [
    {
      "cells": [
        "term",
        "results"
      ],
      "line": 10,
      "id": "product-search;search-for-a-specific-product-and-recieve-results;;1"
    },
    {
      "cells": [
        "\"Raspberry Pi\"",
        "\"Raspberry Pi\""
      ],
      "line": 11,
      "id": "product-search;search-for-a-specific-product-and-recieve-results;;2"
    },
    {
      "cells": [
        "\"Resistor\"",
        "\"Resistor\""
      ],
      "line": 12,
      "id": "product-search;search-for-a-specific-product-and-recieve-results;;3"
    },
    {
      "cells": [
        "\"Radio\"",
        "\"Radio\""
      ],
      "line": 13,
      "id": "product-search;search-for-a-specific-product-and-recieve-results;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1142573996,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Search for a specific product and recieve results",
  "description": "",
  "id": "product-search;search-for-a-specific-product-and-recieve-results;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I browse to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter a valid search \"Raspberry Pi\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click the submit button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see relevant product \"Raspberry Pi\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.iBrowseToTheWebsite()"
});
formatter.result({
  "duration": 2042665699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Raspberry Pi",
      "offset": 24
    }
  ],
  "location": "SearchSteps.iEnterAValidSearchTerm(String)"
});
formatter.result({
  "duration": 626907724,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.iClickTheSubmitButton()"
});
formatter.result({
  "duration": 1938677815,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Raspberry Pi",
      "offset": 31
    }
  ],
  "location": "SearchSteps.iShouldSeeRelevantProductResults(String)"
});
formatter.result({
  "duration": 479875479,
  "status": "passed"
});
formatter.after({
  "duration": 91945184,
  "status": "passed"
});
formatter.before({
  "duration": 1282827311,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Search for a specific product and recieve results",
  "description": "",
  "id": "product-search;search-for-a-specific-product-and-recieve-results;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I browse to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter a valid search \"Resistor\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click the submit button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see relevant product \"Resistor\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.iBrowseToTheWebsite()"
});
formatter.result({
  "duration": 1855963744,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Resistor",
      "offset": 24
    }
  ],
  "location": "SearchSteps.iEnterAValidSearchTerm(String)"
});
formatter.result({
  "duration": 593118191,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.iClickTheSubmitButton()"
});
formatter.result({
  "duration": 2167792415,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Resistor",
      "offset": 31
    }
  ],
  "location": "SearchSteps.iShouldSeeRelevantProductResults(String)"
});
formatter.result({
  "duration": 47249575,
  "status": "passed"
});
formatter.after({
  "duration": 90402532,
  "status": "passed"
});
formatter.before({
  "duration": 1195780822,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Search for a specific product and recieve results",
  "description": "",
  "id": "product-search;search-for-a-specific-product-and-recieve-results;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I browse to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter a valid search \"Radio\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click the submit button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see relevant product \"Radio\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.iBrowseToTheWebsite()"
});
formatter.result({
  "duration": 2897330226,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Radio",
      "offset": 24
    }
  ],
  "location": "SearchSteps.iEnterAValidSearchTerm(String)"
});
formatter.result({
  "duration": 564012649,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.iClickTheSubmitButton()"
});
formatter.result({
  "duration": 2312918322,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Radio",
      "offset": 31
    }
  ],
  "location": "SearchSteps.iShouldSeeRelevantProductResults(String)"
});
formatter.result({
  "duration": 40220597,
  "status": "passed"
});
formatter.after({
  "duration": 90091577,
  "status": "passed"
});
});