@fhcLogin
Feature: Login feature
  Background: user is on the fhctriplogin page
    Given user is on the fhctriplogin page

  @validTest
  Scenario: TC01_user logins with valid credentials
#    Given user is on the fhctriplogin page  ==> ortak oldugu icin Backgroud a tasidik
    And user enters valid username
    And user enters  valid password
    And user clicks login button
    Then verify login is successfull

    #HOMEWORK
  @invalidTest
  Scenario: TC01_user logins with invalid credentials
#   Given user is on the fhctriplogin page ==> ortak oldugu icin Backgroud a tasidik
   And user enters invalid username
   And user enters  invalid password
   And user clicks login button
   Then verify login is not successfull
