Feature: Verify user is able to login to Application.
	Description: It will Login to Application and Verify the Title of Page.
	
#Scenario: Login Application.
#Given User is able to login to application with valid credentials as "knagesh143s@gmail.com" and "knagesh143s".
#When User Enters address Details.
# 	 | Customername  |
#	 | Nagesh |
#Then User verifies the Address Details.
#When User Deletes the Address Details.
#Then Address Should not be present.
#Then user logout from application.

#Scenario Outline: Successful Login with Valid Credentials.
#Given User is able to login to application with valid credentials as "<username>" and "<password>".
#Then user logout from application.
#Examples:
#    | username              | password    |
#    | knagesh143s@gmail.com | knagesh143s |
#    | knagesh143s@gmail.com | knagesh143s |


Background: Verify Background.
Given User is able to login to application with valid credentials as "knagesh143s@gmail.com" and "knagesh143s".


@End2EndTest @SmokeTest
Scenario: Verify Address
When User Enters address Details.
	 | Customername  |
	 | Nagesh |
Then User verifies the Address Details.
When User Deletes the Address Details.
Then Address Should not be present.
Then user logout from application.

@SmokeTest
Scenario: Login To Application
Then user logout from application.
