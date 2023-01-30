Feature: Login page feature
Scenario: Login page title
Given user is at the landing page
When user get the title of page
Then page title should have "Shopping"

Scenario: Verify cart section is display
Given user is at the landing page
Then cart icon should get display

Scenario: Login to application
Given user is at the landing page
When user enters the username as "8176867662"
And user enters the password as "123456"
And user confirm the signin