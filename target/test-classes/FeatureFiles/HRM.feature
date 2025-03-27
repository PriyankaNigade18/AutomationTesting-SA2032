Feature: Test OrangeHrm application

  Scenario Outline: Test data driven for hrm login functionality
    Given Open Orangehrm application
    When User enter "<username>" and user enter "<password>"
    And User click on Hrm login button
    Then User should navigate to dashboard page

    #data you maintains in Examples:
    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Pooja    | test123  |
      | Admin    | admin123 |
      | Sarang   | test123  |
