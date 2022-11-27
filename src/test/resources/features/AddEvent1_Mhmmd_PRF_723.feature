@MhMMd
Feature:  As a Store Manager and Sales Manager, I should be able to add an event

  Scenario Outline: AC - 1 User can access the "Add Event" page from the "General Information" page

    Given user logins in as "<userType>"
    When The user clicks on Fleet - Vehicles
    Then The user clicks on any raw
    Then The user should be on the General information page

    Examples:
      | userType     |
      | storemanager |
      | salesmanager |


  Scenario Outline: AC - 2 Sales Manager and Store manager can see "Add Event" button, but Driver can NOT see "Add Event" button

      Given user "<userType>" is on the Add Event page
      When Sales Manager should see Add Event button
      Then Store Manager should see Add Event button
      Then Driver should not see Add Event button

    Examples:
      | userType     |
      | salesmanager |
      | storemanager |
      | driver       |


  Scenario Outline: AC - 3 / 4 After clicking on "Add event" button, "Add Event" page should pop up.

    Given user "<userType>" is on the Add Event page
    When User is clicked Add Event button
    When The user should see Add Event page
    Then Compulsory fields should show on the pop page

    Examples:
      | userType     |
      | salesmanager |
      | storemanager |


  Scenario Outline: If any compulsory field is not filled, "This value should not be blank." message should be displayed after clicking on save button.

  Given The user "<userType>" is on the Add Event  pop up page
  When The user fills out compulsory areas and save click
  Then The user can not fill any compulsory areas
  Then The user should see warning message

  Examples:
    | userType     |
    | salesmanager |
    | storemanager |


