@sukru
Feature: As a Store Manager and Sales Manager, I should be able to add an event


  Scenario Outline: AC - 1/2 User can access the "Add Event" page from the "General Information" page
    Given user logs in as "<userType>"
    When user clicks on Fleet - Vehicles
    Then user clicks on any raw
    Then user clicks on Add Event button
    Then Add Event page pops up

    Examples:
      | userType     |
      | storemanager |
      | salesmanager |


  Scenario Outline: AC - 3/7 User can mark the event with any color and
  user can see the event in the General information page
    Given user "<userType>" is on Add Event page
    When user fills out compulsory areas
    And user picks yellow color and clicks save button
    Then user sees the event is added with given color

    Examples:
      | userType     |
      | storemanager |
      | salesmanager |


  Scenario Outline: AC - 4 User can mark the event as "All-day event" and time (hours) field disappears
    Given user "<userType>" is on Add Event page
    When user fills out compulsory areas
    And user clicks on All-day event checkbox
    Then user sees time field disappears

    Examples:
      | userType     |
      | storemanager |
      | salesmanager |



  Scenario Outline: AC - 5/6 User can repeat the event by clicking "Repeat" checkbox and options are: Daily, Weekly, Monthly, Yearly
  User can end the event by: Never, After, By
    Given user "<userType>" is on Add Event page
    When user fills out compulsory areas
    And user clicks on Repeat checkbox
    And user sees all valid options
      | Daily   |
      | Weekly  |
      | Monthly |
      | Yearly  |
    And user selects each option respectively and sees each one's own menu
    And user can end the event by Never, After, By

    Examples:
      | userType     |
      | storemanager |
      | salesmanager |


