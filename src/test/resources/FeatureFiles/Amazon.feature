@All
Feature: Test Amazon Application

  Background: 
    Given Open Amazon application

  @homepage @SmokeTest
  Scenario: Test title of Home page
    When I get the title of amazon homepage
    Then Title should match with amazon homepage

  @mobilepage @Regression
  Scenario: Test title of Mobiles page
    When I Open Mobiles page
    When I get the title of mobiles page
    Then Title should  match with mobiles page

  @fashionpage @Regression @ignore
  Scenario: Test title of Fashion page
    When I Open Fashion page
    When I get the title of fashion page
    Then Title should match with fashion page

  @computerpage @Functional @ignore
  Scenario: Test title of Computers page
    When I Open Computers page
    When I get the title of Computers page
    Then Title should match with Computers page

  @bookpage @ignore
  Scenario: Test title of Books page
    When I Open Books page
    When I get the title of Books page
    Then Title should match with Books page
