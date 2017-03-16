Feature: In order to travel From Mumbai to Goa 
As a traveller 
I want to search for the cheapest flight available on 4/1/2017 and book it for 2 adults

Scenario: 
Given I am on the "spice jet" home page
When I enter "Mumbai" and "Goa" in the origin and destination fields 

And I click on "find flights"
Then I should navigate to "Flight Search Results" page
