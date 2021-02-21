Feature: Wizard

  Background: Before test
    Given Navigate to Wizard

  Scenario Outline: First Step Form
    Given Fill out <FirstName>
    Then Fill out <LastName>
    Then Click 'Next'
    Then Fill out <Street Address>
    Then Fill out <City>
    Then Fill out <State>
    Then Fill out <Zip>
    Then Click 'Next'
    Then 'Submit'
    Examples:
      | FirstName |   LastName   |   Street Address     | City     |  State | Zip   |
      |    Anna   |   Karenina   |   19504 Burbank Ave  | Burbank  |  CA    | 91505 |
      |    Tom    |   Smith      |   28934 Ventura Ave  | Tarzana  |  CA    | 93425 |
      |    John   |   Miller     |   19028 ColdWater st | Tarzana  |  CA    | 93045 |