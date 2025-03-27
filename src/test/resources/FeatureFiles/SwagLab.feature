Feature: Test SwagLab application

  Background: 
    Given Open SwagLab application


  Scenario: verify title of application
    When user get the actual title
    Then title should match with Swag Labs

  Scenario: Test login fuctionality with valid credentials
    When user enter "standard_user" and enters "secret_sauce"
    And user click on Login button
    Then user should navigate to InventoryPage
