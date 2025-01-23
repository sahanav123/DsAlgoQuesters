Feature: Array functionality

Background:
Given the user is navigating to the  signin page

@Array1
Scenario: Verify that the user can navigate to the Array after signin
    Given The user is on the DSAlgo homepage after sign
    When the user clicks on the GetStarted button of Array section
    Then the user is navigated to the Array page

@Array2
Scenario Outline: Verify the user is able to navigate to the Operations in Array options
    Given the user is on the Array page
    When the user clicks on the Options "<Sheetname>" and <RowNumber> in Array Page
    Then the user should navigated to the Options "<Sheetname>" and <RowNumber> in Array page
    
    Examples:
    | Sheetname    | RowNumber |
    | Array              |   1       |              
    | Array              |   2       | 
    | Array              |   3       |
    |Array               |   4      |
    
@Array3
Scenario Outline: Verify that user is able to navigate to the try Editor page from different options in Array Page
    Given The user is on the Array Options "<Sheetname>" and <RowNumber> page
    When The user clicks on the Try here button on the Array Options page
    Then The user should navigate to the tryeditor page 
    
    Examples:
    | Sheetname | RowNumber |
    | Array           |   1       |              
    | Array           |   2       | 
    | Array           |   3       |
    |Array            |   4       |

@Array4 
Scenario Outline: Verify that user is able to run valid and invalid Python code in Try Editor for ArrayPage
  Given The user is on the tryeditor page of Array in python
  When The user enters code "<code>", "<Sheetname>" and <RowNumber> from tryeditor and clicks the Run button
  Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>
  Examples:
    | Sheetname     | RowNumber |code     |expectedresult      |
    | tryEditor        |  1                     | Valid   |  successouput      |           
    | tryEditor        |  1                     | Invalid |alertmessageoutput  |
   
   @Array5
Scenario Outline: Verify that user is able to run valid Python code in Try Editor for Array page
  Given The user is on the tryeditor page of Array Using List
  When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
  Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>
  Examples:
    | Sheetname    | RowNumber |code       |expectedresult      |
    | tryEditor        |  1                    | Valid    |  successouput      |           
    | tryEditor        |  1                    | Invalid |alertmessageoutput  |
    
@Array6
Scenario Outline: Verify that user is able to run valid Python code in Try Editor for Array Page
  Given The user is on the tryeditor page of Basic Operation in List
  When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
  Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>
  Examples:
    | Sheetname    | RowNumber |code     |expectedresult      |
    | tryEditor       |  1                    | Valid    |  successouput      |           
    | tryEditor       |  1                    | Invalid |alertmessageoutput  |

@Array7
Scenario Outline: Verify that user is able to run valid Python code in Try Editor for Array Page
  Given The user is on the tryeditor page of Application of Array
  When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
  Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>
  Examples:
    | Sheetname    | RowNumber |code     |expectedresult      |
    | tryEditor       |  1                    | Valid    |  successouput      |           
    | tryEditor       |  1                    | Invalid |alertmessageoutput  |

@Array8
Scenario: Verify the user is able to navigate to the Practice Questions  mentioned under Array "Array in python"Page
    Given the user is on the Array in python page 
    When the user clicks on the Practice Questions link of Array in python page
    Then the user should navigated to the Practice Questions page 

@Array9
Scenario: Verify the user see list of Practice Questions in Practice Questions Page 
    Given the user is on the Array in python page 
    When the user clicks on the Practice Questions link of Array in python page
    Then the user should see list of all Practice Questions in Practice Questions Page
       
@Array10
 Scenario Outline: Verify that user receives output on running valid python code for "Search the array" question
    Given The user is on the tryeditor page of  SearchTheArray question
  When The user enters code "<Sheetname>" and <RowNumber> clicks the Run button
  Then The user should see an result for question in console for "<Sheetname>" and <RowNumber> 
  
  Examples:
    |Sheetname                         | RowNumber |
    |SearchTheArray                 | 1                     |   

    @Array11
   Scenario Outline: Verify that user receives output on running Invalid python code for "Search the array" question
   Given The user is on the tryeditor page of  SearchTheArray question
  When The user enters code "<Sheetname>" and <RowNumber> clicks the Run button
  Then The user should able to see an error message in alert window "<Sheetname>" and <RowNumber> 
  
  Examples:
    | Sheetname          | RowNumber |
    | SearchTheArray  |  2                    |   
    
    @Array12
 Scenario Outline: Verify that user receives output on submitting valid python code for "Search the array" question
   Given The user is on the tryeditor page of  SearchTheArray question
   When The user enters code "<Sheetname>" and <RowNumber> clicks the Submit button
  Then The user should see an output for question in console for "<Sheetname>" and <RowNumber> 
  
  Examples:
    | Sheetname          | RowNumber |
    | SearchTheArray  |  3                   |   
    
 @Array13
 Scenario Outline: Verify that user receives output on running valid python code for "Max Consecutive Ones" question
   Given The user is on the tryeditor page of  Max Consecutive Ones
  When The user enters code "<Sheetname>" and <RowNumber> clicks the Run button
  Then The user should see an result for question in console for "<Sheetname>" and <RowNumber> 
  
  Examples:
    |Sheetname                    | RowNumber |
    |MaxConsecutiveOnes   | 1                     |   
 
  
  
  
  
  
  
  
  
    #Scenario: Verify that user receives error on running invalid python code for "Search the array" question
    #Given The user is on the practice question editor
    #When The user write the invalid code in Editor and Click the Run Button
    #Then The user should able to see an error message in alert window
#
   
#
    #Scenario: Verify that user receives error on submitting invalid python code for "Search the array" question
    #Given The user is on the practice question editor
    #When The user write the invalid code in Editor and Click the Submit Button
    #Then The user see an error message "Error occurred during submission"
#
    #Scenario: Verify that user receives output on submitting valid python code for "Search the array" question
    #Given The user is on the practice question editor
    #When The user write the valid code in Editor and Click the Submit Button
    #Then The user see success message "Submission successful"
#
    #Scenario: Verify that user is able to navigate to "Max Consecutive Ones" Page from Practice question page of "Arrays in Python" page
    #Given The user is on the "Arrays in Python" page
    #When The user clicks the "Max Consecutive Ones" link from Practice question page
    #Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons
#
    #Scenario: Verify that user receives error on running invalid python code for "Max Consecutive Ones" question
    #Given The user is on the practice question editor
    #When The user write the invalid code in Editor and Click the Run Button
    #Then The user should able to see an error message in alert window
#
    #Scenario: Verify that user receives output on running valid python code for "Max Consecutive Ones" question
    #Given The user is on the practice question editor
    #When The user write the valid code in Editor and Click the Run Button
    #Then The user should able to see output in the console
#
    #Scenario: Verify that user receives error on submitting invalid python code for "Max Consecutive Ones" question
    #Given The user is on the practice question editor
    #When The user write the invalid code in Editor and Click the Submit Button
    #Then The user see an error message "Error occurred during submission"
#
    #Scenario: Verify that user receives output on submitting valid python code for "Max Consecutive Ones" question
    #Given The user is on the practice question editor
    #When The user write the valid code in Editor and Click the Submit Button
    #Then The user see success message "Submission successful"
#
    #Scenario: Verify that user is able to navigate to "Find Numbers with Even Number of Digits" Page from Practice question page of "Arrays in Python" page
    #Given The user is on the "Arrays in Python" page
    #When The user clicks the "Max Consecutive Ones" link from Practice question page
    #Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons
#
    #Scenario: Verify that user receives error on running invalid python code for "Find Numbers with Even Number of Digits" question
    #Given The user is on the practice question editor
    #When The user write the invalid code in Editor and Click the Run Button
    #Then The user should able to see an error message in alert window
#
    #Scenario: Verify that user receives output on running valid python code for "Find Numbers with Even Number of Digits" question
    #Given The user is on the practice question editor
    #When The user write the valid code in Editor and Click the Run Button
    #Then The user should able to see output in the console
#
    #Scenario: Verify that user receives error on submitting invalid python code for "Find Numbers with Even Number of Digits" question
    #Given The user is on the practice question editor
    #When The user write the invalid code in Editor and Click the Submit Button
    #Then The user see an error message "Error occurred during submission"
#
    #Scenario: Verify that user receives output on submitting valid python code for "Find Numbers with Even Number of Digits" question
    #Given The user is on the practice question editor
    #When The user write the valid code in Editor and Click the Submit Button
    #Then The user see success message "Submission successful"
#
    #Scenario: Verify that user is able to navigate to "Squares of a Sorted Array" Page from Practice question page of "Arrays in Python" page
    #Given The user is on the "Arrays in Python" page
    #When The user clicks the "Squares of a Sorted Array" link from Practice question page
    #Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons
#
    #Scenario: Verify that user receives error on running invalid python code for "Squares of a Sorted Array" question
    #Given The user is on the practice question editor
    #When The user write the invalid code in Editor and Click the Run Button
    #Then The user should able to see an error message in alert window
#
    #Scenario: Verify that user receives output on running valid python code for "Squares of a Sorted Array" question
    #Given The user is on the practice question editor
    #When The user write the valid code in Editor and Click the Run Button
    #Then The user should able to see output in the console
#
    #Scenario: Verify that user receives error on submitting invalid python code for "Squares of a Sorted Array" question
    #Given The user is on the practice question editor
    #When The user write the invalid code in Editor and Click the Submit Button
    #Then The user see an error message "Error occurred during submission"
#
    #Scenario: Verify that user receives output on submitting valid valid python code for "Squares of a Sorted Array" question
    #Given The user is on the practice question editor
    #When The user write the valid code in Editor and Click the Submit Button
    #Then The user see success message "Submission successful"
#
    #Scenario: Verify that user is able to navigate to "Arrays Using List" page
    #Given The user is in the "Array" page 
    #When The user clicks "Arrays Using List" button
    #Then The user should be redirected to "Arrays Using List" page
#
    #Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays Using List" page
    #Given The user is on the "Arrays Using List" page
    #When The user clicks "Try Here" button in Arrays Using List page
    #Then The user should be redirected to a page having an try Editor with a Run button to test
#
    #Scenario: Verify that user receives error when click on Run button without entering code for "Arrays Using List" page
    #Given The user is in the tryEditor page
    #When The user clicks the Run Button without entering the code in the Editor
    #Then The user should able to see an error message in alert window
#
    #Scenario: Verify that user receives error when click on Run button for invalid python code for "Arrays Using List" page
    #Given The user is in the tryEditor page
    #When The user write the invalid code in Editor and click the Run Button
    #Then The user should able to see an error message in alert window
#
    #Scenario: Verify that user receives output when click on Run button for valid python code for "Arrays Using List" page
    #Given The user is in the tryEditor page
    #When The user write the valid code in Editor and click the Run Button
    #Then The user should able to see output in the console
#
    #Scenario: Verify that user is able to navigate to "Basic Operations in Lists" page
    #Given The user is in the "Array" page 
    #When The user clicks "Basic Operations in Lists" button
    #Then The user should be redirected to "Basic Operations in Lists" page
#
    #Scenario: Verify that user is able to navigate to "try Editor" page for "Basic Operations in Lists" page
    #Given The user is on the "Basic Operations in Lists" page
    #When The user clicks "Try Here" button in Basic Operations in Lists page
    #Then The user should be redirected to a page having an try Editor with a Run button to test
#
    #Scenario: Verify that user receives error when click on Run button without entering code for "Basic Operations in Lists" page
    #Given The user is in the tryEditor page
    #When The user clicks the Run Button without entering the code in the Editor
    #Then The user should able to see an error message in alert window
#
    #Scenario: Verify that user receives error when click on Run button for invalid python code for "Basic Operations in Lists" page
    #Given The user is in the tryEditor page
    #When The user write the invalid code in Editor and click the Run Button
    #Then The user should able to see an error message in alert window
#
    #Scenario: Verify that user receives output when click on Run button for valid python code for "Arrays Using List" page
    #Given The user is in the tryEditor page
    #When The user write the valid code in Editor and click the Run Button
    #Then The user should able to see output in the console
#
    #Scenario: Verify that user is able to navigate to "Applications of Array" page
    #Given The user is in the "Array" page 
    #When The user clicks "Applications of Array" button
    #Then The user should be redirected to "Applications of Array" page
#
    #Scenario: Verify that user is able to navigate to "try Editor" page for "Applications of Array" page
    #Given The user is on the "Applications of Array" page
    #When The user clicks "Try Here" button in Applications of Array page
    #Then The user should be redirected to a page having an try Editor with a Run button to test
#
    #Scenario: Verify that user receives error when click on Run button without entering code for "Applications of Array" page
    #Given The user is in the tryEditor page
    #When The user clicks the Run Button without entering the code in the Editor
    #Then The user should able to see an error message in alert window
#
    #Scenario: Verify that user receives error when click on Run button for invalid python code for "Applications of Array" page
    #Given The user is in the tryEditor page
    #When The user write the invalid code in Editor and click the Run Button
    #Then The user should able to see an error message in alert window
#
    #Scenario: Verify that user receives output when click on Run button for valid python code for "Applications of Array" page
    #Given The user is in the tryEditor page
    #When The user write the valid code in Editor and click the Run Button
    #Then The user should able to see output in the console
#
