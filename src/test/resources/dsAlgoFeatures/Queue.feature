Feature: Queue functionality

  Background: 
    Given the user is navigating to the  signin page
@Queue1
    Scenario: Verify that user is able to navigate to "Queue" data structure page
    When The user clicks the Getting Started button in Queue Panel
    Then The user be directed to Queue DataStructure Page
 @Queue02   
    Scenario: Verify that user is able to navigate to "Implementation of Queue in Python" page
    Given The user is in the Queue page after Sign in
    When  User clicks Implementation of Queue in Python button
    Then  User should be redirected to Implementation of Queue in Python page
 @Queue03  
    Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation of Queue in Python" page
    Given User is on the Implementation of Queue in Python page
    When The user clicks Try Here button in Implementation of Queue in Python page
    Then User should be redirected to a page having an try Editor with a Run button to test
 @Queue04     
    Scenario: Verify that user is able to navigate to "Implementation using collections.deque" page
    Given The user is in the Implementation of Queue in Python page 
    When  The user clicks Implementation using collections deque button
    Then The user should be redirected to Implementation using collections deque page 
  @Queue05    
    Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation using collections.deque" page
    Given  The user is on the Implementation using collections deque page
    When   The user clicks Try Here button in Implementation using collections deque page
    Then User should be redirected to a page having an try Editor with a Run button to test
   @Queue06 
    Scenario: Verify that user is able to navigate to "Implementation using array" page
    Given    The user is in the Implementation using collections deque page 
    When    The user clicks Implementation using array button
    Then The user should be redirected to Implementation using array page
 @Queue07 
    Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation using array" page
    Given The user is on the Implementation using array page
    When The user clicks Try Here button in Implementation using array page
    Then User should be redirected to a page having an try Editor with a Run button to test
   @Queue08 
    Scenario: Verify that user is able to navigate to "Queue Operations" page
    Given The user is in the Implementation using array page 
    When User clicks Queue Operations button
    Then User should be redirected to Queue Operations page
@Queue09 
    Scenario: Verify that user is able to navigate to "try Editor" page for "Queue Operations" page
    Given User is on the Queue Operations page
    When  The user clicks Try here button in Queue Operations page
    Then User should be redirected to a page having an try Editor with a Run button to test 
    
  @Queue10 
     Scenario Outline: Verify that valid and invalid python code in TryEditor Implementation of Queue in Python
      Given The user is in TryEditor page of Implementation of Queue in Python
      When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
      Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>
      
      Examples:
      |Sheetname|RowNumber|code   |expectedresult|
       |tryEditor|1       |Valid  | successouput|
       |tryEditor|1       |Invalid| alertmessageoutput|  
    
    @Queue12 
      Scenario Outline: Verify that valid and invalid python code in TryEditor Implementation using collections deque
      Given The user is in TryEditor page of Implementation using collections deque in Python
      When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
      Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>
     
      Examples:
      |Sheetname|RowNumber|code|expectedresult|
       |tryEditor|1       |Valid|successouput|
       |tryEditor|1       |Invalid|alertmessageoutput|         
    
    @Queue13 
      Scenario Outline: Verify that valid and invalid python code in TryEditor Implementation using array
      Given The user is in TryEditor page of Implementation using array in Python
      When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
      Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>
      
      Examples:
      |Sheetname|RowNumber|code|expectedresult|
       |tryEditor|1       |Valid|successouput|
       |tryEditor|1       |Invalid|alertmessageoutput|
     
     @Queue14
      Scenario Outline: Verify that valid and invalid python code in TryEditor Queue Operations
      Given The user is in TryEditor page of Queue Operations in Python
      When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
      Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>
      
      Examples:
      |Sheetname|RowNumber|code|expectedresult|
       |tryEditor|1|Valid|successouput|
       |tryEditor|1|Invalid|alertmessageoutput|     
     
    @Queue15  
   Scenario: Verify that user receives error when user clicks on run button without entering code in tryeditor for Implementation of Queue in Python
    Given The user is on the tryeditor page of Implementation of Queue in Python
    When  the user clicks the Run button of Implementation of Queue in Python
    Then the user should see an error message   
     
   @Queue16 
   Scenario Outline: Verify the user is able to navigate to the pratice questions on each Queue topics 
    Given The user navigates to options "<SheetName>" and <RowNumber> of Queue page
    When User click Practice Questions Link
    Then  User should navigate to Practice questions from "<SheetName>" and <RowNumber> Queue Topics  
    Examples: 
    |SheetName|RowNumber|
    |Queue     |1       |
    |Queue     |2       |
    |Queue     |3       |
    |Queue     |4       |
   
    @Queue17
   Scenario Outline: Verify the user see list of Practice Questions in Practice Questions Page of Queue Options
   Given The user navigates to Queue Options "<Sheetname>" and <RowNumber> of queue page  
   When The user clicks on the Practice Questions link  
   Then The user should see list of Practice Questions in Practice Questions Page 
   Examples:
   |SheetName|RowNumber|
   |Queue     |1       |
   |Queue     |2       |
   |Queue     |3       |
   |Queue     |4       |