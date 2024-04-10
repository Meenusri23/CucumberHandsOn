Feature: Login Feature for TestAutomation Website
  Scenario: Login scenario covering Positive flow
    Given User is on the Login page of Orange HRM
    When the user enters the Valid Username and Password
    And clicks on the login button
    Then user should be able to sucessfully view the home page

