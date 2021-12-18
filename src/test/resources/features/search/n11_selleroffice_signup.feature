Feature: n11 login
#https://so.n11.com/
@selleroffice-signup
Scenario: n11 selleroffice login
Given user launch browser and open the signup page
When user signed in sellerOffice with valid credentials
Then user signed in sellerOffice successfully
