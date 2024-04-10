Feature: Login Feature testing in DemoSite - TestAutomation Website
  Scenario: Login scenario
    Given You are on Login page of TestAutomation Online
    When You should be able to enter the Valid Username and Password
    |username||password|
    |student| |Password123|
    And click on the Login button
    
