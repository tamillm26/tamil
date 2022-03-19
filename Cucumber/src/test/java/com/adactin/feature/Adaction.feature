Feature: Booking Hotel In Adactin Application

@SmokeTest
Scenario Outline: Login functionality
Given user Must Launch The Url
When user Enter The "<username>" In The Username Field
And user Enter The "<password>" In The Password Field
Then user Click The Login Button And It Navigates To The Search Hotel Page

Examples:
[username|password]
|abc|123|
|xyz|456|
|thangavelv|1234554321|


@SanityTest
Scenario: Search Hotel functionality
When user Select The "Sydeney" Location Field 
And user Select The "Hotel Sunshine" Hotel Field
And user Select The "Super Deluxe" Room Type Field 
And user Select The "2 Two" Children Per Room field
And user Select The "2 - Two" NoOf Rooms Field 
And user Select The "3 - Three" Adult Per Room field
Then user Click The Search Button And It Navigates To The Select Hotel Page

@SanityTest
Scenario: Select Hotel Functionality
When user Click The Radio Button
Then user Click The Continue Button And It Navigates To The Booking Page


@SanityTest
Scenario: Booking functionality
When user Enter The First Name In The Firstname Field 
And user Enter The Last Name In The Lastname Field
And user Enter The Address In The Address Field
And user Enter The Credit Card No In The Credit Card No Field
And user Select The "American Express" In The Credit Card Type Field
And user Select The "5" Expiry Month field
And user Select The "2026" Expiry Year field 
And user Enter The CWV No In The CWV No Field
Then user Click The Book Now Button And It Navigates To The Logout Page
