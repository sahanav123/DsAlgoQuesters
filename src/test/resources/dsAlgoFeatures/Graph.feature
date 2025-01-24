Feature: Graph functionality

Background:
Given The user is on the DSAlgo homepage after sign

@graph1
Scenario: Verify that the user can navigate to the Graph page after signin
    
    When the user clicks on the GetStarted button of Graph section
    Then the user is navigated to the Graph page

@graph2
Scenario: Verify the user is able to navigate to the Graph option  in Graph page
    Given the user is on the Graph page
    When the user clicks on the Graphmodule link
    Then the user should navigated to the Graphmodule page

@graph3
Scenario: Verify that user is able to navigate to try Editor page for Graph page
    Given the user is on the Graphmodule page
    When the user click on Try here button in Graph Page
    Then the user should navigate to the tryeditor page 

@graph4    
Scenario: Verify the user is able to navigate to the Practice Questions  mentioned under graph Graph Page
    Given the user is on the Graphmodule page 
    When the user clicks on the Practice Questions link 
    Then the user should navigated to the Practice Questions page 

@graph5  
Scenario: Verify the user is able to navigate to the Graph Representations option in Graph page
    Given the user is on the Graph page
    When the user clicks on the Graph Representations link
    Then the user should navigated to the Graph Representations page

@graph6    
Scenario: Verify that user is able to navigate to try Editor page for GraphRepresentation page
    Given the user is on the Graph Representation page
    When the user click on Try here button in Graph Representation Page
    Then the user should navigate to the tryeditor page  

@graph7
Scenario: Verify the user is able to navigate to the Practice Questions  mentioned under graph Graph Page
    Given the user is on the Graph Representation page 
    When the user clicks on the Practice Questions link 
    Then the user should navigated to the Practice Questions page 

@graph8
Scenario: Verify the user see list of Practice Questions in Practice Questions Page 
    Given the user is on the Graph Representation page 
    When the user clicks on the Practice Questions link
    Then the user should see list of Practice Questions in Practice Questions Page   

@graph9
Scenario Outline: Verify that user is able to run valid Python code in Try Editor for Graph Page
  Given The user is on the tryeditor page of Graph module
  When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
  Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>
  Examples:
    | Sheetname    | RowNumber |code     |expectedresult      |
    | tryEditor    |  1        | Valid   |  successouput      |           
    | tryEditor    |  1        | Invalid |alertmessageoutput  |

@graph11
Scenario: Verify that user receives error when user clicks on run button without entering code in tryeditor for Graph Page
    Given The user is on the tryeditor page of Graph module
    When the user clicks the Run button
    Then the user should see an error message

@graph12    
Scenario Outline: Verify that user is able to run valid Python code in Try Editor for Graph Representation Page
  Given The user is on the tryeditor page of Graph Representation
  When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
  Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>
  Examples:
    | Sheetname    | RowNumber |code     |expectedresult      |
    | tryEditor    |  1        | Valid   |  successouput      |           
    | tryEditor    |  1        | Invalid |alertmessageoutput  |
          
   
@graph14   
Scenario: Verify that user receives error when user clicks on run button without entering code in tryeditor for Graph Page
    Given The user is on the tryeditor page of Graph Representation
    When the user clicks the Run button
    Then the user should see an error message

@graph15    
Scenario Outline: Verify the user is able to navigate to the options under DataStructure DropDown from Graph page
   
    When the user clicks on the options under "<Sheetname>" and <RowNumber> dataStructure after signin
    Then The user should be navigated to the options page after sign "<Sheetname>" and <RowNumber>

    Examples:
      | Sheetname     |RowNumber  |
      | Home2         |   1       |
      | Home2         |   2       |
      | Home2         |   3       |
      | Home2         |   4       |
      | Home2         |   5       |
      | Home2         |   6       |