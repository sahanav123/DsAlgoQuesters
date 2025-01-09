Feature: DataStructure functionality

    Scenario: Verify that user isable to navigate to "DataStructure-Introduction"
 Page
    Given The user is in the Home page after sign in 
    When The user clicks on "Get Started " button in DataStructure Panel
    Then The user be directed to "Data-Structure" Introduction Page 

    Scenario: Verify that user is able to navigate to "Time Complexity" Page 
    Given The user is in the Data structures- Introduction page  
    When The user clicks on  "Time Complexity" link
    Then The user should be directed to Time Complexity Page 


    Scenario: Verify that user is able to navigate to "Try Editor" Page for Time Complexity page
    Given The user is on the Time Complexity page 
    When The user clicks "Try Here" button in Time Complexity  page
    Then The user should be redirected to a page having an try Editor with a Run button to test

    Scenario: Verify that user receives error when click on Run button without
 entering code for "Time Complexity" in "python" page

    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

    Scenario: Verify that user receives error  when click on Run button 
 for invalid python code for "Time Complexity"in  "python" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

    Scenario: Verify that user receives output when click on run button for valid python code for "Time Complexity"in "python" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

    Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Time Complexity" in "python"  page Given The user is in the Time Complexity  in python page 
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page

