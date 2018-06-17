Feature: CreateLead in LeafTaps
Scenario Outline: CreateLead LeafTaps
#Given Invoke LeafTap application
And Enter the username as <userName>
And Enter the password as <password> 
And click on login button
And click crmsfa link
And click createLead
And Enter companyName as <companyname>
And Enter FirstName as <firstname>
And Enter lastName as <lastname>
When Click createLeadbutton
Then Viewlead Is shown 
Examples:
|userName|password|companyname|firstname|lastname|
|DemoSalesManager|crmsfa|infy|mohan|raj|
|DemoCSR|crmsfa|mettler|mohanraj|selvaraj|