Feature: Adding Tarrif plans
  I want to use this template for my feature file

  Background: 
    Given USer is in Telephone Home Page
    And User click on Add Tarrif Plan

  Scenario: One dimensional List
    When user is filling all the fields
      | 250 | 1500 | 60 | 200 | 1 | 5 | 3 |
    And user clicking on submit
    Then user should get display of congratulation you add tariff plan
    And user should displayed of home button

  Scenario: One dimensional Map
    When user is filling all the fields.
      | Mrent    |  250 |
      | Freemin  | 1500 |
      | FreeIM   |   60 |
      | Freesms  |  200 |
      | Localpmc |    1 |
      | Ipmc     |    5 |
      | Smspc    |    3 |
    And user clicking on submit
    Then user should get display of congratulation you add tariff plan
    And user should displayed of home button

  Scenario: Two dimensional List
    When user is filling all the fieldss
      | 250 | 1500 | 60 | 200 | 13 | 11 |  3 |
      | 450 | 1900 | 90 | 400 | 67 | 12 | 23 |
      | 650 | 1800 | 70 | 500 | 66 | 78 | 45 |
      | 850 | 1700 | 80 | 300 | 77 | 67 | 65 |
    And user clicking on submit
    Then user should get display of congratulation you add tariff plan
    And user should displayed of home button

  Scenario: Two dimensional Map
    When user is filling all the fields..
      | Mrent | Freemin | FreeIM | Freesms | Localpmc | Ipmc | Smspc |
      |   250 |    1500 |     60 |     200 |       13 |   11 |     3 |
      |   450 |    1900 |     90 |     400 |       67 |   12 |    23 |
      |   650 |    1800 |     70 |     500 |       66 |   78 |    45 |
      |   850 |    1700 |     80 |     300 |       77 |   67 |    65 |
    And user clicking on submit
    Then user should get display of congratulation you add tariff plan
    And user should displayed of home button

  Scenario Outline: 
    When user is filling all the fieldss.."<Mrent>","<Freemin>","<FreeIM>","<Freesms>","<Localpmc>","<Ipmc>","<Smspc>"
    And user clicking on submit
    Then user should get display of congratulation you add tariff plan
    And user should displayed of home button

    Examples: 
      | Mrent | Freemin | FreeIM | Freesms | Localpmc | Ipmc | Smspc |
      |   250 |    1500 |     60 |     200 |       13 |   11 |     3 |
      |   450 |    1900 |     90 |     400 |       67 |   12 |    23 |
      |   650 |    1800 |     70 |     500 |       66 |   78 |    45 |
      |   850 |    1700 |     80 |     300 |       77 |   67 |    65 |
