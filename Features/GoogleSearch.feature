Feature: Google search

  Scenario Outline: Single keyword search
    Given I am on Google homepage
    When I enter the technical single "<keyword>"
    And I enter Google search button
    Then I see relevant results

    Examples: 
      | keyword  |
      | Java     |
      | Selenium |