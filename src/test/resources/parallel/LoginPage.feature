Feature: Login page feature

@smoke
Scenario: Login page title
Given user is at the landing page
When user get the title of page
Then page title should have "Shopping"

@regression
Scenario: Verify cart section is display
Given user is at the landing page
Then cart icon should get display

@functional
Scenario: Login to application
Given user is at the landing page
When user enters the username as "8176867662"
And user enters the password as "123456"
And user confirm the signin