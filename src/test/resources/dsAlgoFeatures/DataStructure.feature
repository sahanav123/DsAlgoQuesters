Feature: DataStructure functionality

  Background: 
    Given The user is on the DSAlgo homepage after sign

  @DataStructure1
  Scenario: Verify that user isable to navigate to "DataStructure-Introduction" Page
    When The user clicks on GetStarted  button in DataStructure Panel
    Then The user be directed to Data-Structure Introduction Page

  @DataStructure2
  Scenario: Verify that user is able to navigate to "Time Complexity" Page
    Given The user is in the Data structures- Introduction page
    When The user clicks on  "Time Complexity" link
    Then The user should be directed to Time Complexity Page

  @DataStructure3
  Scenario: Verify that user is able to navigate to "Try Editor" Page for Time Complexity page
    Given The user is on the Time Complexity page
    When The user clicks "Try Here" button in Time Complexity  page
    Then The user Should be redirected to a page having an try Editor with a Run button to Test

  @DataStructure4
  Scenario Outline: Verify that user is able to run  Python code in Try Editor for DataStructure Page
    Given The user is on the tryeditor page of Datastructure module
    When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         1 | Invalid | alertmessageoutput |

  @DataStructure5
  Scenario: Verify that user receives error when click on Run button without entering code for "Time Complexity" in "python" page
    Given The user is in the TryEditor page of TimeComplexity module
    When The user clicks the Run Button without entering the code in the Editor of TimeComplexity module
    Then The user should able to see an error message in alert window of TimeComplexity module

  @DataStructure6
  Scenario: Verify the user is able to navigate to the Practice Questions for "Time Complexity" in "python"  page
    Given The user is in the Time Complexity  in DataStructure page
    When the user clicks on the Practice Questions link of TimeComplexity module
    Then the user should navigated to the Practice Questions page of TimeComplexity module

  @DataStructure7
  Scenario: Verify the user see list of Practice Questions in Practice Questions Page
    Given The user is in the Time Complexity  in DataStructure page
    When the user clicks on the Practice Questions link of TimeComplexity module
    Then the user should see list of Practice Questions in Practice Questions Page of TimeComplexity module
