Feature: Signin functionality

    Scenario: Verify the user is direct to Login Page 
    Given The user is on the Home Page

    When User clicks on Sign in link 
    Then The user should be directed to Login page


    Scenario: Verify the user is Directly clicking signin without 
Registration
    Given The user is on the Home Page

    When User clicks on Sign in without registration
    Then The user should get the error message "Invalid Username and Password" in signin page

    Scenario: Verify the user gets error message 
without entering Username and Password when
clicking on login button
    Given The user is on the Login Page 
    When User clicks on Login link on Login page without entering username and password
    Then The user should get error message "Please fill out this field" is displayed in username textbox 

    Scenario: Verify the user gets error message giving 
username without entering Password when 
clicking on login button
    Given The user is on the Login Page 
    When User clicks on Login link on Login page giving username without entering password
    Then The user should get error message "Please fill out this field" is displayed in Password textbox 

    Scenario: Verify the user gets error message without entering 
username  and giving Password when 
clicking on login button
    Given The user is on the Login Page 
    When User clicks on Login link on Login page without entering username and giving password 
    Then The user should get error message "Please fill out this field" is displayed in Password textbox 

    Scenario: Verify the user gets error message giving invalid 
username and valid Password when 
clicking on login button
    Given The user is on the Login Page 
    When User enters invalid username and valid password  and clicks Login button
    Then The user should get error message "Invalid username and Password " is displayed in Login screen

    Scenario: Verify the user gets error message giving valid 
username and invalid Password 
when clicking on login button
    Given The user is on the Login Page 
    When User enters valid username and invalid password and clicks Login button
    Then The user should get error message "Invalid username and Password " is displayed in Login screen

    Scenario: Verify the user gets error message giving invalid 
username and invalid Password 
when clicking on login button
    Given The user is on the Login Page 
    When User enters invalid username and invalid password and clicks Login buttom
    Then The user should get error message " Invaid username and Password" is displayed in Login screen

    Scenario: Verify the user is able to login  giving valid
 username and valid password when 
clicking on login button
    Given The user is on the Login Page 
    When User enters valid username and valid password and clicks Login button
    Then The user is directed to Data Structure home page with message "You are Logged in"

    Scenario: Verify that user is able to see logged in ID and 
sign out links on top corner of the home page 
    Given The user is on the Login Page 
    When After the user enters the valid username , password  and clicks "Login" button
    Then The user shoud be able to see logged in ID and sign out links on top corner of the home page 

    Scenario: Verify the user is able to direct to Home page 
    Given The user is on the Login Page 
    When After the user enters the valid username , password  and clicks "Login" button
    Then The user should be able to direct Data Structure Home Page with message "You are logged in"

    Scenario: Verify the user is able to see DataStructures dropdown 
with the below options after signin:-
Arrays
Linked List
Stack
Queue
Tree
Graph
    Given The user is on the Home page 
    When After the user enters the valid username ,password  and clicks "Login" button
    Then The user should be able to see DataStructures dropdown with the below options

    Scenario: Verify the user is able to sign out successfully
    Given The user is on the Home page 
    When User clicks "Signout" link
    Then The user should be redirected to home page with message "Logged out successfully"



