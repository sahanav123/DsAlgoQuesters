Feature: Signin functionality

  @signin1
  Scenario: Verify the user is direct to Login Page
    Given The User is On the Home Page
    When User clicks on Sign in link
    Then The user should be directed to Signin page

  @signin2
  Scenario Outline: Verify the user is able to login  giving valid username and valid password when clicking on login button
    Given The user is on the Login Page
    When User enters valid username and valid password and clicks Login button "<Sheetname>" and row <RowNumber>
    Then The user is directed to Data Structure home page with message "You are logged in"

    Examples: 
      | Sheetname | RowNumber |
      | Signin    |         1 |

  @signin3
  Scenario Outline: Verify the user should not able to login  giving Invalid username and valid password when clicking on login button
    Given The user is on the Login Page
    When User enters Invalid username and valid password and clicks Login button "<Sheetname>" and row <RowNumber>
    Then The user should get a warning message "Invalid Username and Password"

    Examples: 
      | Sheetname | RowNumber |
      | Signin    |         2 |

  @signin4
  Scenario Outline: Verify the user should not able to login  giving valid username and Invalid password when clicking on login button
    Given The user is on the Login Page
    When User enters valid username and Invalid password and clicks Login button "<Sheetname>" and row <RowNumber>
    Then The user should get a warning message "Invalid Username and Password"

    Examples: 
      | Sheetname | RowNumber |
      | Signin    |         3 |

  @signin5
  Scenario Outline: Verify the user should not able to login  giving Invalid username and Invalid password when clicking on login button
    Given The user is on the Login Page
    When User enters Invalid username and Invalid password and clicks Login button "<Sheetname>" and row <RowNumber>
    Then The user should get a warning message "Invalid Username and Password"

    Examples: 
      | Sheetname | RowNumber |
      | Signin    |         4 |

  @signin6
  Scenario: Verify the user should not able to login  giving empty username and empty password when clicking on login button
    Given The user is on the Login Page
    When User clicks Login button without  entering username and password
    Then The user should get a element showing empty field "Please fill out this field."

  @signin7
  Scenario Outline: Verify the user gets error message without entering username and giving Password when clicking on login button
    Given The user is on the Login Page
    When User clicks on Login link on Login page without entering username and giving password from sheetname "<Sheetname>" and row <RowNumber>
    Then The user should get a element showing empty field "Please fill out this field."

    Examples: 
      | Sheetname | RowNumber |
      | Signin    |         5 |

  @signin8
  Scenario Outline: Verify the user gets error message entering username and without entering Password when clicking on login button
    Given The user is on the Login Page
    When User clicks on Login link on Login page entering username and without entering password from sheetname "<Sheetname>" and row <RowNumber>
    Then The user should get a element showing empty field "Please fill out this field."

    Examples: 
      | Sheetname | RowNumber |
      | Signin    |         6 |

  @signin9
  Scenario: Verify the user is able to sign out successfully
    Given The user is On the Home Page
    When User clicks Signout link
    Then The user should be redirected to home page with message "Logged out successfully"
