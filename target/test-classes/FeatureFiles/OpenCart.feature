Feature: Test OpenCart application

  Scenario: Test Registration process
    Given Open Regiter page of OpenCart with url "https://tutorialsninja.com/demo/index.php?route=account/register"
    When I enter required fields
      | firstname | lastname | email             | telephone | password | cpassword |
      | Rajat     | Sharma   | rajat2025@gmail.com |   7899000 | test123  | test123   |
    When I click on yes radio button
    When I click on privacy policy checkbox
    When I click on Continue button
    Then I should able to register and should get message

  Scenario: Test Login Process
    Given Open login page with url "https://tutorialsninja.com/demo/index.php?route=account/login"
    When I enter email "rajat2025@gmail.com" and  I enter password "test123"
    When I click on cart Login button
    Then I should able to login
