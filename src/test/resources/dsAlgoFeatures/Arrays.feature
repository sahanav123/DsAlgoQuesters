Feature: Array functionality

Background:
Given the user is navigating to the  signin page

@array1
Scenario Outline: Verify that user receives output on running valid python code for "Search the array" questions 
  Given The user is on the practice question editor for Search the array
  When The user write the valid code in Editor from "<Sheetname>" and <RowNumber> and Click the Run button
  Then The user should able to see an output message "<Sheetname>" and <RowNumber>
  Examples:
    | Sheetname    | RowNumber |
    |Array         |   3      |
    

   