$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AirlineBooking.feature");
formatter.feature({
  "line": 1,
  "name": "In order to travel From Mumbai to Goa",
  "description": "As a traveller \r\nI want to search for the cheapest flight available on 4/1/2017 and book it for 2 adults",
  "id": "in-order-to-travel-from-mumbai-to-goa",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "",
  "id": "in-order-to-travel-from-mumbai-to-goa;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on the \"spice jet\" home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter \"Mumbai\" and \"Goa\" in the origin and destination fields",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on \"find flights\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should navigate to \"Flight Search Results\" page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "spice jet",
      "offset": 13
    }
  ],
  "location": "StepDefinitions.i_am_on_the_home_page(String)"
});
formatter.result({
  "duration": 11414138436,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mumbai",
      "offset": 9
    },
    {
      "val": "Goa",
      "offset": 22
    }
  ],
  "location": "StepDefinitions.i_enter_and_in_the_origin_and_destination_fields(String,String)"
});
formatter.result({
  "duration": 2184798518,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "find flights",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.i_click_on(String)"
});
formatter.result({
  "duration": 394816712,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Flight Search Results",
      "offset": 22
    }
  ],
  "location": "StepDefinitions.i_should_navigate_to_page(String)"
});
formatter.result({
  "duration": 10656806336,
  "status": "passed"
});
});