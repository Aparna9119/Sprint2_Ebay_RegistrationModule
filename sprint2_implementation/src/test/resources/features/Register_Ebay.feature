@tag1
Feature: feature to test the register module functionality
Scenario: To validate the register functionality using personal account
Given User is on home page
And User is able to click on register link
When User clicks on register link sign up page is visible
And User able to create an account
When User clicks on Personal account radio button
And Enters required valid credentials
Then User able to register to the application successfully

@tag2
Scenario: To validate the register functionality using business account
Given User is on the home page
And User is able to click on register link on home page
When User clicks on the register link sign up page is visible
And User able to create an account on sign up page
When User clicks on Business account radio button
And Enters required valid credentials in given text box
Then User able to register to the application successfully using business account