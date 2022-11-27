Feature:Grid Settings functionality
  User Story : As a user, I should be able to arrange vehicle table columns via "grid settings" under Fleet-Vehicles page


  Scenario Outline: AC - 1 User can see Grid Settings when user clicks on gear icon
    Given user is on the log in page
    When user enters "<username>" and "<password>"
    And user clicks to fleet dropdown
    And user clicks to the vehicles option
    And user clicks on gear icon
    Then Grid Settings should be visible


    Examples: entries for 3 users
      | username        | password    |
      | user1           | UserUser123 |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |


  Scenario:AC - 2 Column names in grid settings should be visible in order
    Given user is on the log in page
    When user enters username and password
    And user clicks to fleet dropdown
    And user clicks to the vehicles option
    And user clicks on gear icon
    Then column names should be visible in order



  Scenario Outline:AC - 3 User can find any column by typing the column name on Quick Search input box
    Given user is on the log in page
    When user enters username and password
    And user clicks to fleet dropdown
    And user clicks to the vehicles option
    And user clicks on gear icon
    Then user types "<column names>" on Quick Search input box and find any column <index>


    Examples:
      | column names              | index |
      | Id                        | 0      |
      | License Plate             | 1     |
      | Tags                      | 2     |
      | Driver                    | 3     |
      | Location                  | 4     |
      | Chassis Number            | 5     |
      | Model Year                | 6     |
      | Last Odometer             | 7     |
      | Immatriculation Date      | 8     |
      | First Contract Date       | 9     |
      | Catalog Value (VAT Incl.) | 10     |
      | Seats Number              | 11    |
      | Doors Number              | 12    |
      | Color                     | 13    |
      | Transmission              | 14    |
      | Fuel Type                 | 15    |
      | CO2 Emissions             | 16    |
      | Horsepower                | 17    |
      | Horsepower Taxation       | 18    |
      | Power (KW)                | 19    |


  @turgayWip
  Scenario:AC - 4 User can select any column by clicking the column name
    Given user is on the log in page
    When user enters username and password
    And user clicks to fleet dropdown
    And user clicks to the vehicles option
    And user clicks on gear icon
    And user click click on select all button
    Then user can select any column by clicking the column name


