Feature: Stack functionality

Background:
Given the user is navigating to the  signin page

@stack1
Scenario: Verify that the user can navigate to the Stack page after signin
    Given The user is on the DSAlgo homepage after sign
    When the user clicks on the GetStarted button of Stack section
    Then the user is navigated to the Stack page
    
@stack2
Scenario Outline: Verify the user is able to navigate to the Operations in Stack in Graph page
    Given the user is on the Stack page
    When the user clicks on the Options "<Sheetname>" and <RowNumber> in Stack Page
    Then the user should navigated to the Options "<Sheetname>" and <RowNumber> in Stack page
    
    Examples:
    | Sheetname    | RowNumber |
    | Stack        |   1       |              
    | Stack        |   2       | 
    | Stack        |   3       |
    
  
@stack3  
Scenario Outline: Verify that user is able to navigate to the try Editor page from different options in Stack Page
    Given The user is on the Stack Options "<Sheetname>" and <RowNumber> page
    When The user clicks on the Try here button on the Stack Options page
    Then The user should navigate to the tryeditor page 
    
    Examples:
    | Sheetname    | RowNumber |
    | Stack        |   1       |              
    | Stack        |   2       | 
    | Stack        |   3       |
 
@stack4
Scenario Outline: Verify that user is able to run valid Python code in Try Editor for Graph Page
  Given The user is on the tryeditor page of Operations in Stack
  When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
  Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>
  Examples:
    | Sheetname    | RowNumber |code     |expectedresult      |
    | tryEditor    |  1        | Valid   |  successouput      |           
    | tryEditor    |  1        | Invalid |alertmessageoutput  |

    
@stack5
Scenario Outline: Verify that user is able to run valid Python code in Try Editor for Graph Page
   Given The user is on the tryeditor page of Implementation
   When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
   Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>
  Examples:
    | Sheetname    | RowNumber |code     |expectedresult      |
    | tryEditor    |  1        | Valid   |  successouput      |           
    | tryEditor    |  1        | Invalid |alertmessageoutput  |

    
@stack6
Scenario Outline: Verify that user is able to run valid Python code in Try Editor for Graph Page
   Given The user is on the tryeditor page of Applications
   When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
   Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>
  Examples:
    | Sheetname    | RowNumber |code     |expectedresult      |
    | tryEditor    |  1        | Valid   |  successouput      |           
    | tryEditor    |  1        | Invalid |alertmessageoutput  |
   
    
@stack7  
Scenario Outline: Verify the user is able to navigate to the Practice Questions mentioned under three options pages
      Given The user is navigates to three Options "<Sheetname>" and <RowNumber> of stack page 
      When the user clicks on the Practice Questions link 
      Then the user should navigated to the Practice Questions page of three options "<Sheetname>" and <RowNumber> in Stack page 
       
    Examples:
    | Sheetname    | RowNumber |
    | Stack        |   1       |              
    | Stack        |   2       | 
    | Stack        |   3       |
      
@stack8
Scenario Outline: Verify the user see list of Practice Questions in Practice Questions Page of three options pages 
    Given The user is navigates to three Options "<Sheetname>" and <RowNumber> of stack page 
    When the user clicks on the Practice Questions link 
    Then the user should see list of Practice Questions in Practice Questions Page   
     Examples:
    | Sheetname    | RowNumber |
    | Stack        |   1       |              
    | Stack        |   2       | 
    | Stack        |   3       |
    

@stack9
Scenario Outline: Verify that user receives error when user clicks on run button without entering code in tryeditor for Graph Page
    Given The user is on the tryeditor page of three Options "<Sheetname>" and <RowNumber> of stack page
    When the user clicks the Run button
    Then the user should see an error message
     Examples:
    | Sheetname    | RowNumber |
    | Stack        |   1       |              
    | Stack        |   2       | 
    | Stack        |   3       |
