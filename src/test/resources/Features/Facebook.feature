
Feature: Facebook login validation

Background:

 Given Open the facebook pages
  
 
@datatable
Scenario: Facebook login with Invalid username and password
   
    When Enter the username and password
    |username|durga.karthik1328@gmail.com|
    |password|Sreshta@20|
    
    Then Validate the login username	
    



    