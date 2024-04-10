Feature: Login Feature testing in DemoSite - TestAutomation Website
  Scenario: Login scenario
    Given User is on Login page of TestAutomation Online
    When the user should be able to enter the Valid Username : "student" and Password : "Password123"
    And clicks on the submit button
    Then user should be able to view the home page once after loggedin.

