Feature: Register functionality

  Scenario: Verify the user is able to land on Register Page
    Given The User is On The Home Page
    When User clicks "Register" link on the Home page
    Then The user should be redirected to Register form

  Scenario Outline: Verify that user is able to login after entering valid username ,password and password confirmation when clicking on register button
    Given The user is on the register page
    When The user enters the valid username ,password and password confirmation and clicks "Register" button from sheetname "<sheetname>" and row <RowNumber>
    Then The user should be able to redirect to the home page of DsAlgo . Your logged in as  <valid name> sign in

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         0 |

  Scenario Outline: Verify that user gets error message giving username without entering  password and password confirmation when clicking on register button
    Given The user is on the register page
    When The user enters the username only and clicks "Register" button from sheetname "<sheetname>" and row <RowNumber>
    Then The user should get error message "Please fill out this field" is displayed in Password textbox

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         1 |

  Scenario Outline: : Verify that user gets error message giving username and password  without entering   password confirmation when clicking on register button
    Given The user is on the register page
    When The user enters the username and password only and clicks "Register" button from sheetname "<sheetname>" and row <RowNumber>
    Then The user should get error message " Please fill out this field" is displayed in Password Confirmation textbox

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         2 |

  Scenario Outline: Verify that user gets error message without entering username , password andpassword confirmation when clicking on register button
    Given The user is on the register page
    When The user clicks "Register" button  on the Register page without entering username ,password and password confirmation from "<sheetname>" and row <RowNumber>
    Then The User Should get Error Message "Please fill out this field" is displayed in username textbox

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         3 |

  Scenario Outline: Verify that user gets error message giving username and entering password and password confirmation different when clicking on register button
    Given The user is on the register page
    When The user enters the username and password different and clicks "Register" button from sheet "<sheetname>" and row <RowNumber>
    Then The user should get error message password_mismatch:The two password fields didn't match in register page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         4 |

  Scenario Outline: Verify that user gets error mesage when entering only numeric when clicking on register button
    Given The user is on the register page
    When The user enters the Password only numeric and clicks "Register" from sheetname "<sheetname>" and row <RowNumber>
    Then The user should get error message and not redirected to the home page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         5 |

  Scenario Outline: Verify that user gets error message giving invalid username like %,$,& (Example:  Tom$, Tom%) when clicking on register button
    Given The user is on the register page
    When The user enters the invalid username like%,$,& and clicks "Register" button from sheetname "<sheetname>" and row <RowNumber>
    Then The User Should get Error Message and not Redirected to the home page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         6 |

  Scenario Outline: Verify that user gets error message while entering the password less than 8 characters when clicking on register button
    Given The user is on the register page
    When The user enters the password less than 8 characters and clicks "Register" button from sheetname "<sheetname>" and row <RowNumber>
    Then The user should get error message and not redirected to The Home Page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         7 |
      


  
  Scenario: Verify that user is able to see Register and sign in links when clicking on signout link
    #
    Given The user Is on the Home Page
    When The user clicks 'Signout' link
    Then The user should be able to see Register and sign in links at the top corner of the home page

  #
  Scenario: Verify that user is able to login to DSAlgo after doing successful registration
    Given The user Is on The Home Page
    When The user clicks login button
    Then The user should be able to redirect to the home page of DsAlgo with Signin ID
#
