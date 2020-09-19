$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AllFeatures.feature");
formatter.feature({
  "name": "Verifying the adactin functionalities",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify user can able to book the hotel with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the adactin page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should login using \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should verify the login page",
  "keyword": "Then "
});
formatter.step({
  "name": "user should search using \"\u003clocation\u003e\",\"\u003chotel\u003e\",\"\u003croomtype\u003e\"",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "Roomno",
        "adultroom",
        "childroom"
      ]
    },
    {
      "cells": [
        "1 - One",
        "1 - One",
        "0 - None"
      ]
    },
    {
      "cells": [
        "2 - Two",
        "2 - Two",
        "1 - One"
      ]
    },
    {
      "cells": [
        "3 - Three",
        "2 - Two",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "4 - Four",
        "4 - Four",
        "3 - Three"
      ]
    },
    {
      "cells": [
        "5 - Five",
        "3 - Three",
        "4 - Four"
      ]
    },
    {
      "cells": [
        "6 - Six",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "7 - Seven",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "8 - Eight",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "9 - Nine",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "10 - Ten",
        "3 - Three",
        "2 - Two"
      ]
    }
  ]
});
formatter.step({
  "name": "user should verify the search hotel page",
  "keyword": "Then "
});
formatter.step({
  "name": "user should select the first hotel",
  "keyword": "And "
});
formatter.step({
  "name": "user should book hotel using \"\u003cfirstname\u003e\",\"\u003clastname\u003e\",\"\u003caddress\u003e\",\"\u003ccardnum\u003e\"",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "cardtype",
        "month",
        "year",
        "cvv"
      ]
    },
    {
      "cells": [
        "American Express",
        "June",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "VISA",
        "March",
        "2021",
        "456"
      ]
    },
    {
      "cells": [
        "Master Card",
        "July",
        "2021",
        "123"
      ]
    },
    {
      "cells": [
        "Other",
        "July",
        "2023",
        "456"
      ]
    }
  ]
});
formatter.step({
  "name": "user should verify the book hotel page",
  "keyword": "Then "
});
formatter.step({
  "name": "user can check the booking confirmation order in the page",
  "keyword": "And "
});
formatter.step({
  "name": "user can cancel the booked hotel",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "hotel",
        "roomtype",
        "firstname",
        "lastname",
        "address",
        "cardnum"
      ]
    },
    {
      "cells": [
        "divyamathi",
        "BKX9A5",
        "New York",
        "Hotel Creek",
        "Standard",
        "divya",
        "m",
        "kanchi",
        "4251123521453659"
      ]
    },
    {
      "cells": [
        "kalaivinitha",
        "W24133",
        "Sydney",
        "Hotel Creek",
        "Double",
        "kalaivinitha",
        "m",
        "bangalore",
        "4251123521453659"
      ]
    },
    {
      "cells": [
        "edwinraj",
        "edwin@123",
        "New York",
        "Hotel Creek",
        "Deluxe",
        "edwin",
        "m",
        "karnataka",
        "1235411125252142"
      ]
    },
    {
      "cells": [
        "sssaravinth30",
        "Aravinth",
        "New York",
        "Hotel Creek",
        "Super Deluxe",
        "sssaravinth30",
        "m",
        "pondi",
        "1235411125252142"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify user can able to book the hotel with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "DataStepDefinition.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should login using \"divyamathi\" and \"BKX9A5\"",
  "keyword": "When "
});
formatter.match({
  "location": "DataStepDefinition.user_should_login_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "DataStepDefinition.user_should_verify_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should search using \"New York\",\"Hotel Creek\",\"Standard\"",
  "rows": [
    {
      "cells": [
        "Roomno",
        "adultroom",
        "childroom"
      ]
    },
    {
      "cells": [
        "1 - One",
        "1 - One",
        "0 - None"
      ]
    },
    {
      "cells": [
        "2 - Two",
        "2 - Two",
        "1 - One"
      ]
    },
    {
      "cells": [
        "3 - Three",
        "2 - Two",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "4 - Four",
        "4 - Four",
        "3 - Three"
      ]
    },
    {
      "cells": [
        "5 - Five",
        "3 - Three",
        "4 - Four"
      ]
    },
    {
      "cells": [
        "6 - Six",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "7 - Seven",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "8 - Eight",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "9 - Nine",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "10 - Ten",
        "3 - Three",
        "2 - Two"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_should_search_using(String,String,String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "DataStepDefinition.user_should_verify_the_search_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the first hotel",
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_should_select_the_first_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should book hotel using \"divya\",\"m\",\"kanchi\",\"4251123521453659\"",
  "rows": [
    {
      "cells": [
        "cardtype",
        "month",
        "year",
        "cvv"
      ]
    },
    {
      "cells": [
        "American Express",
        "June",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "VISA",
        "March",
        "2021",
        "456"
      ]
    },
    {
      "cells": [
        "Master Card",
        "July",
        "2021",
        "123"
      ]
    },
    {
      "cells": [
        "Other",
        "July",
        "2023",
        "456"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_should_book_hotel_using(String,String,String,String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the book hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "DataStepDefinition.user_should_verify_the_book_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can check the booking confirmation order in the page",
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_can_check_the_booking_confirmation_order_in_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can cancel the booked hotel",
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_can_cancel_the_booked_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user can able to book the hotel with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "DataStepDefinition.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should login using \"kalaivinitha\" and \"W24133\"",
  "keyword": "When "
});
formatter.match({
  "location": "DataStepDefinition.user_should_login_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "DataStepDefinition.user_should_verify_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should search using \"Sydney\",\"Hotel Creek\",\"Double\"",
  "rows": [
    {
      "cells": [
        "Roomno",
        "adultroom",
        "childroom"
      ]
    },
    {
      "cells": [
        "1 - One",
        "1 - One",
        "0 - None"
      ]
    },
    {
      "cells": [
        "2 - Two",
        "2 - Two",
        "1 - One"
      ]
    },
    {
      "cells": [
        "3 - Three",
        "2 - Two",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "4 - Four",
        "4 - Four",
        "3 - Three"
      ]
    },
    {
      "cells": [
        "5 - Five",
        "3 - Three",
        "4 - Four"
      ]
    },
    {
      "cells": [
        "6 - Six",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "7 - Seven",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "8 - Eight",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "9 - Nine",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "10 - Ten",
        "3 - Three",
        "2 - Two"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_should_search_using(String,String,String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "DataStepDefinition.user_should_verify_the_search_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the first hotel",
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_should_select_the_first_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should book hotel using \"kalaivinitha\",\"m\",\"bangalore\",\"4251123521453659\"",
  "rows": [
    {
      "cells": [
        "cardtype",
        "month",
        "year",
        "cvv"
      ]
    },
    {
      "cells": [
        "American Express",
        "June",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "VISA",
        "March",
        "2021",
        "456"
      ]
    },
    {
      "cells": [
        "Master Card",
        "July",
        "2021",
        "123"
      ]
    },
    {
      "cells": [
        "Other",
        "July",
        "2023",
        "456"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_should_book_hotel_using(String,String,String,String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the book hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "DataStepDefinition.user_should_verify_the_book_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can check the booking confirmation order in the page",
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_can_check_the_booking_confirmation_order_in_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can cancel the booked hotel",
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_can_cancel_the_booked_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user can able to book the hotel with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "DataStepDefinition.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should login using \"edwinraj\" and \"edwin@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "DataStepDefinition.user_should_login_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "DataStepDefinition.user_should_verify_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should search using \"New York\",\"Hotel Creek\",\"Deluxe\"",
  "rows": [
    {
      "cells": [
        "Roomno",
        "adultroom",
        "childroom"
      ]
    },
    {
      "cells": [
        "1 - One",
        "1 - One",
        "0 - None"
      ]
    },
    {
      "cells": [
        "2 - Two",
        "2 - Two",
        "1 - One"
      ]
    },
    {
      "cells": [
        "3 - Three",
        "2 - Two",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "4 - Four",
        "4 - Four",
        "3 - Three"
      ]
    },
    {
      "cells": [
        "5 - Five",
        "3 - Three",
        "4 - Four"
      ]
    },
    {
      "cells": [
        "6 - Six",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "7 - Seven",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "8 - Eight",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "9 - Nine",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "10 - Ten",
        "3 - Three",
        "2 - Two"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_should_search_using(String,String,String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "DataStepDefinition.user_should_verify_the_search_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the first hotel",
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_should_select_the_first_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should book hotel using \"edwin\",\"m\",\"karnataka\",\"1235411125252142\"",
  "rows": [
    {
      "cells": [
        "cardtype",
        "month",
        "year",
        "cvv"
      ]
    },
    {
      "cells": [
        "American Express",
        "June",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "VISA",
        "March",
        "2021",
        "456"
      ]
    },
    {
      "cells": [
        "Master Card",
        "July",
        "2021",
        "123"
      ]
    },
    {
      "cells": [
        "Other",
        "July",
        "2023",
        "456"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_should_book_hotel_using(String,String,String,String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the book hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "DataStepDefinition.user_should_verify_the_book_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can check the booking confirmation order in the page",
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_can_check_the_booking_confirmation_order_in_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can cancel the booked hotel",
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_can_cancel_the_booked_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user can able to book the hotel with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "DataStepDefinition.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should login using \"sssaravinth30\" and \"Aravinth\"",
  "keyword": "When "
});
formatter.match({
  "location": "DataStepDefinition.user_should_login_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "DataStepDefinition.user_should_verify_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should search using \"New York\",\"Hotel Creek\",\"Super Deluxe\"",
  "rows": [
    {
      "cells": [
        "Roomno",
        "adultroom",
        "childroom"
      ]
    },
    {
      "cells": [
        "1 - One",
        "1 - One",
        "0 - None"
      ]
    },
    {
      "cells": [
        "2 - Two",
        "2 - Two",
        "1 - One"
      ]
    },
    {
      "cells": [
        "3 - Three",
        "2 - Two",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "4 - Four",
        "4 - Four",
        "3 - Three"
      ]
    },
    {
      "cells": [
        "5 - Five",
        "3 - Three",
        "4 - Four"
      ]
    },
    {
      "cells": [
        "6 - Six",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "7 - Seven",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "8 - Eight",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "9 - Nine",
        "3 - Three",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "10 - Ten",
        "3 - Three",
        "2 - Two"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_should_search_using(String,String,String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "DataStepDefinition.user_should_verify_the_search_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the first hotel",
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_should_select_the_first_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should book hotel using \"sssaravinth30\",\"m\",\"pondi\",\"1235411125252142\"",
  "rows": [
    {
      "cells": [
        "cardtype",
        "month",
        "year",
        "cvv"
      ]
    },
    {
      "cells": [
        "American Express",
        "June",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "VISA",
        "March",
        "2021",
        "456"
      ]
    },
    {
      "cells": [
        "Master Card",
        "July",
        "2021",
        "123"
      ]
    },
    {
      "cells": [
        "Other",
        "July",
        "2023",
        "456"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_should_book_hotel_using(String,String,String,String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the book hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "DataStepDefinition.user_should_verify_the_book_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can check the booking confirmation order in the page",
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_can_check_the_booking_confirmation_order_in_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can cancel the booked hotel",
  "keyword": "And "
});
formatter.match({
  "location": "DataStepDefinition.user_can_cancel_the_booked_hotel()"
});
formatter.result({
  "status": "passed"
});
});