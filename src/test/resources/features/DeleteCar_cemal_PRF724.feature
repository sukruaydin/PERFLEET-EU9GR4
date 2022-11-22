Feature: Delete Car User Story

  Scenario Outline: AC1 All user can see delete button
    When User goes to the login page
    And User user enters "<username>" and "<password>"
    When user clicks on fleet dropdown
    And user clicks on the vehicles option
    And user moves on the three dot in the row and user should see delete icon in the box

  Examples:
    | username        | password    |
    | storemanager51  | UserUser123 |
    | salesmanager101 | UserUser123 |


  Scenario Outline: AC2 "Delete Confirmation" pop up should be displayed
    When User goes to the login page
    And User user enters "<username>" and "<password>"
    When user clicks on fleet dropdown
    And user clicks on the vehicles option
    And user moves on the three dot in the row and user clicks delete icon in the box
    Then user should see confirmation popup

    Examples:
      | username        | password    |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |


    Scenario: AC3 "You do not have permission to perform this action." message
      When User goes to the login page
      When User logs in as driver
      When user clicks on fleet dropdown
      And user clicks on the vehicles option
      And user moves on the three dot in the row and user clicks on delete icon in the box
      And user should see confirmation popup and clicks yes delete button
      Then user should see "Item deleted" message


  @ACcemal3
  Scenario Outline: AC4 Item delet message should be displayed
    When User goes to the login page
    And User user enters "<username>" and "<password>"
    When user clicks on fleet dropdown
    And user clicks on the vehicles option
    And user moves on the three dot in the row and user clicks delete icon in the box
    And user clicks on yes delete button

    Examples:
      | username        | password    |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |