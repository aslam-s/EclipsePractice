Feature: Login

Scenario Outline: Successful Login with using different credential 

Given user have to launch browser
When user have to open url
Then user have to verify the url
When user have to maximize browser
And user have to write code for waits
When user have to enter valid credential "<user>" and "<password>"
Then user have to verify the Homepage
When user have to click logout button
And close browser

Examples:

|user|password|
|bca@gmail.com|Test123@|
|bca@gmail.com|Test123@|


