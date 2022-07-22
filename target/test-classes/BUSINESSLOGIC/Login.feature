
Feature: Login functionality

Background: User successfully clicked on initial login window
When user open browser "chrome" with exe as "D:\\AutomationSupportnew\\chromedriver.exe"
When user enter url as "https://www.flipkart.com/"

@SmokeTest
Scenario: Login functionality with valid credentials
When user cancal initial login window
When user navigate on login button
When user click on My Profile 
When user enter "jadhav.dhanshree01@gmail.com" as username
When user enter "dhanag26" as password
When user click on Login button
Then Application shows user profile to user

   