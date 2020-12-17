@datatable01 @third
Feature: scenario outline example
  Scenario: testing the data tables web page
    Given User is on the datatables homepage
    When User clicks on new button
    And User enters first name "Hamide"
    And User enters last name "Cesit"
    And User enters position "QA"
    And User enters office "Paris"
    And User enters extension "111"
    And User enters start date "2020-08-26"
    And User enters salary "55000"
    And User clicks Create button
    And User enters first name "Hamide" to the searchbox
    Then verify that user see the first name "Hamide"  in the searchbox