Feature: This it our first feature
  Scenario: This out first scenario
    Given Navigate to the URL: "http://www.google.com"
    When i see the page
    Then i will enter text :"cucumber.io" to the search field
    And I press on Search button