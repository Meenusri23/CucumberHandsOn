Feature: This is to do Google Search
Scenario: Google search scenario
    Given user is entering Google.com url in search box
 	  When user is entering the search term "trichy"
    And presses the Enter key
    Then the user should be able to see search results