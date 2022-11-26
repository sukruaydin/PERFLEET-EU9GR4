@kvk
Feature: As a user, I should be able to filter vehicle table, in Fleet-Vehicle page

  Scenario Outline: AC-1 When user clicks on filter icon, "Manage Filter" button should be visible
    Given user can be logged in as "<userType>"
    And goes to fleet-vehicles page
    And user clicks to filter icon
    Then user should see manage filters button

    Examples:
      | userType     |
      | driver       |
      | storemanager |
      | salesmanager |

  Scenario Outline: AC-2 User can apply filters by clicking on filter name, through 'Manage Filters' menu.
    Given user can be logged in as "<userType>"
    And goes to fleet-vehicles page
    When user clicks to filter icon
    And user clicks to manage filters button
    And user clicks randomly one filter name inside the manage filter
    Then user should see changing of the total number

    Examples:
      | userType     |
      | driver       |
      | storemanager |
      | salesmanager |

  Scenario Outline: AC-3 User can find filters by typing the filter name, through 'Manage Filters' menu.
    Given user can be logged in as "<userType>"
    And goes to fleet-vehicles page
    When user clicks to filter icon
    And user clicks to manage filters button
    And user types "Tags" inside the manage filter
    Then user should see changing of the total number

    Examples:
      | userType     |
      | driver       |
      | storemanager |
      | salesmanager |


  Scenario Outline: AC-4 User can apply multiple filters at the same time
  AC-5 User can remove all filters by clicking on the reset icon, under 'Fleet-Vehicles' page
    Given user can be logged in as "<userType>"
    And goes to fleet-vehicles page
    When user clicks to filter icon
    And user clicks to manage filters button
    And user types "Licence" ands clicks to choose filter name randomly inside the manage filter
    Then user should see changing of the total number
    And user clicks the reset icon
    Then user should see all filters can be removed
    Examples:
      | userType     |
      | driver       |
      | storemanager |
      | salesmanager |
