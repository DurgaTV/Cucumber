Feature: User Registration details

  Scenario: User Registration with multiple datas 
  
  Given User is on the registration page
  
    When User enters the following user details with coloumns
    | Name | Lastname | Email| userid | City |
    | Karthik | MC | karthik12@gmail.com | 283328 | London |
    | Durga | TV | durga60@gmail.com | 283323 | London |
    | Sreshta | MK | Sreshta20@gmail.com | 283312 | London |
    Then User registration should be correct and successful