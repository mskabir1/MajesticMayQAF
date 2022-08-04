@feelinglucky
Feature: Feeling Lucky

  Scenario Outline: Random topic search
    Given I am on Google homepage
    When I enter search "<keyword>"
    When I click on the Feeling Lucky button
    Then I see relevant random result

    Examples: 
      | keyword |
      | Lottery |
