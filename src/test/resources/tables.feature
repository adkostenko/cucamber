Feature: Test Automation for Forms

  Background:
    Given Navigate to tables

  Scenario: fillout login form
    When I check if I'm on the tables page
    Then I check the list of the elements in the Header
    And I print all the table
    When I select 10 elements on the page
    When I select 25 elements on the page
    When I select 50 elements on the page
    When I select 100 elements on the page
    Then I search for: "Jennifer Chang"
    And I get search results: " Jennifer Chang	Regional Director	Singapore	28	2010/11/14	$357,650 "
    Then I will make sure that I have ony one row in the search result
  #optional
    And I search for "Edinghburgh"
    And I`m getting  9 results
    # Extra optional
  Then I sort by salary and check if the sort is working


