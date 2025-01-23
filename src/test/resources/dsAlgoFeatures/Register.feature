Feature: Register functionality

  @Register1
  Scenario: Verify the user is able to land on Register Page
    Given The User is On The Home Page
    When User clicks Register link on the Home page
    Then The user should be redirected to Register form

  @Register2
  Scenario Outline: Verify that user gets error message giving username without entering password and password confirmation when clicking on
    register button

    Given The user is on the register page
    When The user enters the username and clicks Register button "<Sheetname>" and <RowNumber>
    Then The user should get error message "Please fill out this field" is displayed in Password Confirmation textbox

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         1 |

  @Register3
  Scenario Outline: : Verify that user gets error message giving username and password without entering password confirmation when
    clicking on register button

    Given The user is on the register page
    When The user enters the username and password and clicks Register button "<Sheetname>" and <RowNumber>
    Then The user should get error message " Please fill out this field" is displayed in Password Confirmation textbox

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         2 |

  @Register4
  Scenario Outline: Verify that user gets error message without entering username , password and password confirmation when clicking on
    register button

    Given The user is on the register page
    When The user clicks Register button on the Register page without entering username ,password and password confirmation "<Sheetname>"and <RowNumber>
    Then The user should get error message " Please fill out this field" is displayed in Password Confirmation textbox

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         3 |

  @Register5
  Scenario Outline: Verify that user gets error message giving username and entering password and password confirmation different when
    clicking on register button

    Given The user is on the register page
    When The user enters the username and password different and clicks Register button from sheet "<Sheetname>" and row <RowNumber>
    Then The user should get error message "password_mismatch:The two password fields didn’t match." in register page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         4 |

  @Register6
  Scenario Outline: Verify that user gets error mesage when entering only numeric when clicking on register button
    Given The user is on the register page
    When The user enters the Password only numeric and clicks Register button from sheet "<Sheetname>" and row <RowNumber>
    Then The user should get error message "password_mismatch:The two password fields didn’t match." in register page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         5 |

  @Register7
  Scenario Outline: Verify that user gets error message giving invalid username like %,$,& (Example: Tom$, Tom%) when clicking on register
    button

    Given The user is on the register page
    When The user enters the invalid username like %,$,& and clicks Register button from sheet "<Sheetname>" and row <RowNumber>
    Then The user should get error message "password_mismatch:The two password fields didn’t match." in register page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         6 |

  @Register8
  Scenario Outline: Verify that user gets error message while entering the password less than 8 characters when clicking on register button
    Given The user is on the register page
    When The user enters the password less than eight characters and clicks Register button from sheet "<Sheetname>" and row <RowNumber>
    Then The user should get error message "password_mismatch:The two password fields didn’t match." in register page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         7 |

  @Register9
  Scenario: Verify that user is able to see Register and sign in linkswhen clicking on signout link
    Given The User is On The Home Page
    When The user clicks Signout link
    Then The user should be able to see Register and sign in links at the top corner of the home page

  @Register10
  Scenario: Verify that user is able to login to DSAlgo after doing successful registration
    Given The User is On The Home Page
    When The user clicks login button
    Then The user should be able to redirect to the home page of DsAlgo after Signin
