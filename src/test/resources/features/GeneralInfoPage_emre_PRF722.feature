Feature: General Information Page Functionality
  User Story: As a user, I should be able to see detailed information of a
  specific vehicle, under Fleet Vehicle module


  @AC1
  Scenario Outline: Driver User can see the "General Information" page by clicking on any vehicle (row)
    Given user is on the log in page
    When user enters "<username>" and "<password>"
    And user clicks to fleet dropdown
    And user clicks to the vehicles option
    And user clicks on anywhere on one of the rows
    Then user should be on the general information page

    Examples: entries for 3 users
      | username        | password    |
      | user1           | UserUser123 |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |

  @AC2
  Scenario: User can see the General info page after clicking the eye icon at the end
  of each row

    Given user is on the log in page
    When user enters username and password
    And user clicks to fleet dropdown
    And user clicks to the vehicles option
    And user moves to the three dot in the row and user clicks to eye icon in the box
    Then user should be on the general information page


  @AC3
  Scenario Outline:  Sales Manager and Store Manager should see Edit,
  Delete and Add Event buttons on the General Information"page
    Given user is on the log in page
    When user enters "<username>" and "<password>"
    And user clicks to fleet dropdown
    And user clicks to the vehicles option
    And user clicks the one of the rows
    Then user should see the add event button
    Then user should see the delete button
    Then user should see the edit button

    Examples:

      | username        | password    |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |

    @AC4
    Scenario: Driver should not see the Add Event Button in the General Info Page
      Given user is on the log in page
      When user enters username and password
      And user clicks to fleet dropdown
      And user clicks to the vehicles option
      And user clicks the one of the rows
      Then user should not see the add event button

      @AC5
      Scenario: The vehicle information on the vehicle page and general information page
        should be the same
        Given user is on the log in page
        When user enters username and password
        And user clicks to fleet dropdown
        And user clicks to the vehicles option
        Then the info in the vehicle page and info in the general info page must be same
