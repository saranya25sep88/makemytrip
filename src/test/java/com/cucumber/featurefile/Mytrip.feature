Feature: Makemytrip End to End test case


@test1
Scenario: Verify buses search functionality

Given User launch the make my trip application
When Title of the page is 'Bus Ticket Booking, Book Confirmed Reservation Tickets @ MakeMyTrip'
Then User enters 'Mumbai' in from field 
Then User enters 'Delhi' in to field
Then User enter travel date 26Sep'19
Then User click Search button
And User verify relevant buses is displayed

Scenario: Verify login functionality

Given User launch the make my trip application
When Title of the page is 'Bus Ticket Booking, Book Confirmed Reservation Tickets @ MakeMyTrip'
Then User click Login button
Then User enters "user name" and "password"
And User click Login button in Login Page

