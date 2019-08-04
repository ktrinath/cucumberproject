Feature: Adding customer details
  I want to use this template for my feature file


  Background: 
    Given User is in Telephone Home page
    And User clicks on add customer details

  Scenario: One dimensional List
    When User fill all fields
      | Krishna | T | krishna@gmail.com | Hyd | 9090808126 |
    And User clicks on submit button
    Then User get unique id of confirmation

  Scenario: One dimensional Map
    When User fill all fields.
      | fname | Krishna           |
      | lname | T                 |
      | email | krishna@gmail.com |
      | addr  | Hyd               |
      | phno  |        9090808126 |
    And User clicks on submit button
    Then User get unique id of confirmation

  Scenario: Two dimensional List
    When User fill all fieldss
      | Krishna  | T | krishna@gmail.com | Hyd | 9090808126 |
      | Karthick | r | karthi@gmail.com  | MAS | 8989876435 |
      | deelip   | s | deelip@gmail.com  | BGL | 7981971323 |
    And User clicks on submit button
    Then User get unique id of confirmation

  Scenario: Two dimensional Map
    When User fill all fields..
      | fname    | lname | email             | addr | phno       |
      | Krishna  | T     | krishna@gmail.com | Hyd  | 9090808126 |
      | Karthick | r     | karthi@gmail.com  | MAS  | 8989876435 |
      | deelip   | s     | deelip@gmail.com  | BGL  | 7981971323 |
    And User clicks on submit button
    Then User get unique id of confirmation

  Scenario Outline: 
    When User fill all fieldss.."<fname>","<lname>","<email>","<addr>","<phno>"
    And User clicks on submit button
    Then User get unique id of confirmation

    Examples: 
      | fname    | lname | email             | addr | phno       |
      | Krishna  | T     | krishna@gmail.com | Hyd  | 9090808126 |
      | Karthick | r     | karthi@gmail.com  | MAS  | 8989876435 |
      | deelip   | s     | deelip@gmail.com  | BGL  | 7981971323 |
