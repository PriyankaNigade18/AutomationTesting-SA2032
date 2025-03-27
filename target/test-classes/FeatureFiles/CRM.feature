Feature: Tets CRM app

  Scenario: test login for CRM
    Given Open CRM application
    When I enter email  "test@gmail.com" and password "test123"
    When I click on CRM login button
    Then I should able to login in CRM
