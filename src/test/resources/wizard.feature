Feature: Wizard
  Scenario: Fillout all the steps
    Given I navigate to Wizard
    And I verify that I an on the correct Step and I see the label: "Enter first step data"
    When Fillout the first page with: "First Name" and " Last name"
    And I will wait for 5 seconds
    Then I press Next Button
    And I verify that I an on the correct Step and I see the label: "Enter second step data"
    When I fill out the second page with: "Street Address", "City", "State", "Zip"
    And I will wait for 5 seconds
    Then I press Next Button
    And I verify that I an on the correct Step and I see the label: "Finish last step"
    When I check First Name, I see: "First Name"
    #When I check Last Name, I see: "Last Name"
    #When I check Address, I see: ""







