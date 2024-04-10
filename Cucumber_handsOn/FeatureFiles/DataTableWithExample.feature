Feature: Login Feature testing in DemoSite - TestAutomation Website
  Scenario Outline: Login scenario with DataTable example
    Given Login page in demo site
    When Enter valid "<Username>" and "<Password>"
    And click on the submit button
    
Examples:
|Username||Password|
|student||Password123|
|student||Password13|
    