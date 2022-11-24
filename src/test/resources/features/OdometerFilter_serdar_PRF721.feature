
  Feature: Last Odometer

    User Story :

    As a user, I should be able to use "Last Odometer" filter under 'Fleet-Vehicles' page

    Acceptance Criteria:
    1- "Last Odometer" filter has the methods below:
    Between
    Not Between
    Equals
    Not Equals
    More Than
    Less Than
    Equals Or More Than
    Equals Or Less Than
    Is Empty
    Is Not Empty

    2- When user selects "Between" method with numeric values, the results should be between the specified values
    3- When user selects "Equals" method with numeric values, the results should match the specified value exactly
    4- When user selects "More than" method with numeric values, the results should be more than the specified value
    5- When user selects "Less than" method with numeric values, the results should be be less than the specified value
    6- When user selects "Is Empty" method, only empty values should be displayed.
    7- Methods ("Between","Equals","More Than","Less Than") shouldn't accept non-numeric values

    @wip
    #AC-1
    Scenario Outline:
      Given user is on the log in page
      When user enters "<username>" and "<password>"
      And the user navigates to "Fleet" - "Vehicles" module
      And the user clicks on "Filters" button from the top right menu
      And Manage filters showed up
      And the user clicks manage filters button
      And the user selects "Last Odometer" filter
      And the user clicks on methods
      Then the user must see the methods below
        | Between             |
        | Not Between         |
        | Equals              |
        | Not Equals          |
        | More Than           |
        | Less Than           |
        | Equals Or More Than |
        | Equals Or Less Than |
        | Is Empty            |
        | Is Not Empty        |
      Examples:
        | username        | password    |
    # | user1           | UserUser123 |
    #    | storemanager51 | UserUser123 |
        | salesmanager101 | UserUser123 |





