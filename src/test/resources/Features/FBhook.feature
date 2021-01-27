
Feature: Facebook login validation1

@smoke
Scenario: Facebook login with Invalid username and password
   Given Open the facebook pages
    When Enter the "durga.karthik1328@gmail.com" and "loggin"
   Then Validate the login username	
   
 @sanity
 Scenario: Facebook login with Invalid username and password
   Given Open the facebook pages
    When Enter the "durga.karthik1328@gmail.com" and "Sreshta@20"
   Then Validate the login username	   

    