Feature: Signin functionality

  Scenario: Verify the user is direct to Login Page
    Given The User is On the Home Page
    When User clicks on Sign in link
    Then The user should be directed to Login page

  Scenario Outline: Verify the user is able to login  giving valid username and valid password when clicking on login button
    Given The user is on the Login Page
    When User enters valid username and valid password and clicks Login button from sheetname "<Sheetname>" and row <RowNumber>
    Then The user is directed to Data Structure home page with message "You are Logged in"

    Examples: 
      | Sheetname | RowNumber |
      | Signin    |         0 |

  Scenario Outline: Verify the user gets error message giving invalid username and invalid Password when clicking on login button
    Given The user is on the Login Page
    When User enters invalid username and invalid password and clicks Login button from sheetname "<Sheetname>" and row <RowNumber>
    Then The user should get error message "Invalid Username and Password" is displayed in Login screen

    Examples: 
      | Sheetname | RowNumber |
      | Signin    |         1 |

  Scenario Outline: Verify the user gets error message giving valid username and invalid Password when clicking on login button
    Given The user is on the Login Page
    When User enters valid username and invalid password and clicks Login button from sheetname "<Sheetname>" and row <RowNumber>
    Then The User should get error message "Invalid Username and Password" is displayed in Login screen

    Examples: 
      | Sheetname | RowNumber |
      | Signin    |         2 |

  Scenario Outline: Verify the user gets error message giving invalid username and valid Password when clicking on login button
    Given The user is on the Login Page"
    When User enters invalid username and valid password  and clicks Login button from sheetname "<Sheetname>" and row <RowNumber>
    Then The user should get Error Message "Invalid Username and Password" is displayed in Login screen

    Examples: 
      | Sheetname | RowNumber |
      | Signin    |         3 |

  Scenario Outline: Verify the user gets error message giving username without entering Password when clicking on login button
    Given The user is on the Login Page
    When User clicks on Login link on Login page giving username without entering password from sheetname "<Sheetname>" and row <RowNumber>
    Then The user Should get error message "Please fill out this field" is displayed in Password textbox

    Examples: 
      | Sheetname | RowNumber |
      | Signin    |         4 |

  Scenario Outline: Verify the user gets error message without entering username and giving Password when clicking on login button
    Given The user is on the Login Page
    When User clicks on Login link on Login page without entering username and giving password from sheetname "<Sheetname>" and row <RowNumber>
    Then The user should get error message "Please fill out this field" is displayed in Password Textbox

    Examples: 
      | Sheetname | RowNumber |
      | Signin    |         5 |

  Scenario Outline: Verify the user gets error message without entering Username and Password when clicking on login button
    Given The user is on the Login Page
    When The user clicks login button after leaving the Username textbox and Password textbox empty from sheetname "<Sheetname>" and row <RowNumber>
    Then The user should get error message "Please fill out this field" is displayed in username textbox

    Examples: 
      | Sheetname | RowNumber |
      | login     |         6 |

  Scenario: Verify that user is able to see logged in ID and sign out links on top corner of the home page
    Given The user Is On the Login Page
    When After the user enters the valid username , password  and clicks "Login" button
    Then The user shoud be able to see logged in ID and sign out links on top corner of the home page

  Scenario: Verify the user is able to direct to Home page
    Given: The User Is On The Login Page
    When After the user enters the valid username , password  and clicks Login button
    Then The user should be able to direct Data Structure Home Page with message "You are logged in"
    
    
 Scenario: Verify the user is Directly clicking signin without Registration
   Given The user is on the Home Page
    When User clicks on Sign in without registration
   Then The user should get the error message "Invalid Username and Password" in signin page

 Scenario Outline: Verify that the user sees six options under the Data Structure dropdown after signin
    Given the user is On The DSAlgo homepage
    When After the user Enters the valid username , password  and clicks "Login" button
    Then the user clicks on the Data Structure button and should see six options: "<option1>","<option2>","<option3>","<option4>","<option5>", and "<option6>" under the Data Structure dropdown
    Examples:
    | option1 | option2 | option3 | option4 | option5 | option6 |
    | Arrays | Linked List | Stack | Queue | Tree | Graph |

Scenario: Verify the user is able to sign out successfully
Given The user is on the Home page 
When User clicks "Signout" link
Then The user should be redirected to home page with message "Logged out successfully" 

