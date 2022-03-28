#Author: bargan@your.domain.com

Feature: TestProject
 
Scenario Outline: Automation site 
  Given user wants to login into the page"https://www.facebook.com/"
  When user entered with"<username>"
  Then click on login button
  
  Examples:
  |username|
  |bargan  |

  
  

