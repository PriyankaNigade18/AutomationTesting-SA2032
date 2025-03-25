Feature: Test Google application

Background:
Given Open Google application

  Scenario: Test Google application title
    #Given Open Google application
    When I get the current title of google application
    Then title should match with Google

  Scenario: Test Search feature of Google
   #Given Open Google application
    When I enter valid keyword as "Java" in search box
    Then I should get valid options from Google Search
