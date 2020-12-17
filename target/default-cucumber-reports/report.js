$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/google_search_single_datatable.feature");
formatter.feature({
  "name": "Single Data table",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@datatable1"
    },
    {
      "name": "@smoketest"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TC01_ google search test",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is in the google page",
  "keyword": "Given "
});
formatter.step({
  "name": "user searches \"\u003cvalue\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify result has \"\u003cvalue\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test Data",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "value"
      ]
    },
    {
      "cells": [
        "Selenium"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC01_ google search test",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@datatable1"
    },
    {
      "name": "@smoketest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in the google page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.GoogleSearchStepDefinitions.user_is_in_the_google_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches \"Selenium\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GoogleSearchStepDefinitions.user_searches(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify result has \"Selenium\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.GoogleSearchStepDefinitions.verify_result_has(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});