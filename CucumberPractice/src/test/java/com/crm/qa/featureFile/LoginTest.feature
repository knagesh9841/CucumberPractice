Feature: Verify user is able to login to Application.
	Description: It will Login to Application and Verify the Title of Page.
	
Scenario: Login Application.
Given User is able to login to application with valid credentials as "knagesh143s@gmail.com" and "knagesh143s".
When User Enters address Details.
 	 | Customername  |
	 | Nagesh |
Then User verifies the Address Details.
When User Deletes the Address Details.
Then Address Should not be present.
Then user logout from application.