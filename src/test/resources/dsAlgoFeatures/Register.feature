#Feature: Register functionality
#
    #Scenario: Verify that user is able to land on Register Page
    #Given The user is on the Home page
    #When The user clicks "Register" link on the Home page
    #Then The user should be redirected to Register form
#
    #Scenario: Verify that user gets error message without entering username , password andpassword confirmation when clicking on register button 
    #Given The user is on the register page 
    #When The user clicks "Register" button  on the Register page without entering username ,password and password confirmation
    #Then The user should get error message "Please fill out this field" is displayed in username textbox 
#
    #Scenario: Verify that user gets error message giving username without entering  password and password confirmation when clicking on register button 
    #Given The user is on the register page 
    #When The user enters the username only and clicks "Register" button
    #Then The user should get error message "Please fill out this field" is displayed in Password textbox 
#
    #Scenario: Verify that user gets error message giving username and password  without entering   password confirmation when clicking on register button 
    #Given The user is on the register page 
    #When The user enters the username and password only and clicks "Register" button
    #Then The user should get error message " Please fill out this field" is displayed in Password Confirmation textbox
#
    #Scenario: Verify that user gets error message giving username and entering password and password confirmation different when clicking on register button
    #Given The user is on the register page 
    #When The user enters the username and password different and clicks "Register" button
    #Then The user should get error message password_mismatch:The two password fields didn't match in register page 
#
    #Scenario: Verify that user gets error message giving invalid username like %,$,& (Example:  Tom$, Tom%) when clicking on register button
    #Given The user is on the register page 
    #When The user enters the invalid username like%,$,& and clicks "Register" button
    #Then The user should get error message and not redirected to the home page 
#
    #Scenario: Verify that user gets error message while entering the password less than 8 characters when clicking on register button 
    #Given The user is on the register page 
    #When The user enters the password less than 8 characters and clicks "Register" button
    #Then The user should get error message and not redirected to the home page 
#
    #Scenario: Verify that user gets erroe mesage when entering only numeric when clicking on register button
    #Given The user is on the register page 
    #When The user enters the password only numeric and clicks "Register" 
    #Then The user should get error message and not redirected to the home page 
#
    #Scenario: Verify that user is able to login after entering valid username ,password and password confirmation when clicking on register button
    #Given The user is on the register page 
    #When The user enters the valid username ,password and password confirmation and clicks "Register
    #Then The user should be able to redirect to the home page of DsAlgo . Your logged in as  <valid name> sign in 
 #
#
    #Scenario: Verify that user is able to see logged in ID and sign out links on top corner of the home page 
    #Given The user is on the Home page 
    #When After the user enters the valid username ,password and password confirmation and clicks "Register
    #Then The user should be able to see Logged ID and sign out links at the top corner of the home page 
#
    #Scenario: Verify that user is able to see Register and sign in links when clicking on signout link
#
    #Given The user is on the Home page 
    #When The user clicks 'Signout' link
    #Then The user should be able to see Register and sign in links at the top corner of the home page 
#
    #Scenario: Verify that user is able to login to DSAlgo after doing successful registration 
    #Given The user is on the Home page 
    #When The user clicks login button
    #Then The user should be able to redirect to the home page of DsAlgo with Signin ID  
#
