@googlesearch @first
Feature: Google search

  Background: user is in the google page // bu kisim background in tanimi
    Given user is in the google page

  @Teapot
  Scenario: user search teapod in google

    And user searches teapod
    Then verify result has teapot

  @Nokia
  Scenario: user searches nokia in google

    And user searches nokia
    Then verify result has nokia