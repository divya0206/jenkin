Feature: Verifying the adactin functionalities

  Scenario Outline: Verify user can able to book the hotel with valid credentials
    Given user is on the adactin page
    When user should login using "<username>" and "<password>"
    Then user should verify the login page
    And user should search using "<location>","<hotel>","<roomtype>"
      | Roomno    | adultroom | childroom |
      | 1 - One   | 1 - One   | 0 - None  |
      | 2 - Two   | 2 - Two   | 1 - One   |
      | 3 - Three | 2 - Two   | 2 - Two   |
      | 4 - Four  | 4 - Four  | 3 - Three |
      | 5 - Five  | 3 - Three | 4 - Four  |
      | 6 - Six   | 3 - Three | 2 - Two   |
      | 7 - Seven | 3 - Three | 2 - Two   |
      | 8 - Eight | 3 - Three | 2 - Two   |
      | 9 - Nine  | 3 - Three | 2 - Two   |
      | 10 - Ten  | 3 - Three | 2 - Two   |
    Then user should verify the search hotel page
    And user should select the first hotel
    And user should book hotel using "<firstname>","<lastname>","<address>","<cardnum>"
      | cardtype         | month | year | cvv |
      | American Express | June  | 2022 | 123 |
      | VISA             | March | 2021 | 456 |
      | Master Card      | July  | 2021 | 123 |
      | Other            | July  | 2023 | 456 |
    Then user should verify the book hotel page
    And user can check the booking confirmation order in the page
    And user can cancel the booked hotel

    Examples: 
      | username      | password  | location | hotel       | roomtype | firstname | lastname | address | cardnum          |
      | divyamathi    | BKX9A5    | New York | Hotel Creek | Standard | divya     | m        | kanchi  | 4251123521453659 |
      | kalaivinitha  | W24133    | New York | Hotel Creek | Standard | divya     | m        | kanchi  | 4251123521453659 |
      | edwinraj      | edwin@123 | New York | Hotel Creek | Standard | divya     | m        | kanchi  | 4251123521453659 |
      | sssaravinth30 | Aravinth  | New York | Hotel Creek | Standard | divya     | m        | kanchi  | 4251123521453659 |
