Feature: Array functionality

  Background: 
    Given The user is on the DSAlgo homepage after sign

  @Array1
  Scenario: Verify that the user can navigate to the Array after signin
    When the user clicks on the GetStarted button of Array section
    Then the user is navigated to the Array page

  @Array2
  Scenario Outline: Verify the user is able to navigate to the Operations in Array options
    Given the user is on the Array page
    When the user clicks on the Options "<Sheetname>" and <RowNumber> in Array Page
    Then the user should navigated to the Options "<Sheetname>" and <RowNumber> in Array page

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         1 |
      | Array     |         2 |
      | Array     |         3 |
      | Array     |         4 |

  @Array3
  Scenario Outline: Verify that user is able to navigate to the try Editor page from different options in Array Page
    Given The user is on the Array Options "<Sheetname>" and <RowNumber> page
    When The user clicks on the Try here button on the Array Options page
    Then the user should navigate to the tryeditor page

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         1 |
      | Array     |         2 |
      | Array     |         3 |
      | Array     |         4 |

  @Array4
  Scenario Outline: Verify that user receives error when user clicks on run button without entering code in tryeditor for ArrayPage
    Given The user is on the Array Options "<Sheetname>" and <RowNumber> page
    When the user clicks the Run button in try editor page
    Then the user should see an error message

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         1 |
      | Array     |         2 |
      | Array     |         3 |
      | Array     |         4 |

  @flaky
  Scenario Outline: Verify that user is able to run valid and invalid Python code in Try Editor for ArrayPage
    Given the user is on the tryeditor page of Array in python
    When The user enters code "<code>", "<Sheetname>" and <RowNumber> from tryeditor and clicks the Run button
    Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

@flaky
  Scenario Outline: Verify that user is able to run valid Python code in Try Editor for Array page
    Given The user is on the tryeditor page of Array Using List
    When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

   @flaky
  Scenario Outline: Verify that user is able to run valid Python code in Try Editor for Array Page
    Given The user is on the tryeditor page of Basic Operation in List
    When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @flaky
  Scenario Outline: Verify that user is able to run valid Python code in Try Editor for Array Page
    Given The user is on the tryeditor page of Application of Array
    When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @Array9
  Scenario: Verify the user is able to navigate to the Practice Questions  mentioned under Array "Array in python"Page
    Given the user is on the Array in python page
    When the user clicks on the Practice Questions link of Array in python page
    Then the user should navigated to the Practice Questions page

  @Array10
  Scenario: Verify the user see list of Practice Questions in Practice Questions Page
    Given the user is on the Array in python page
    When the user clicks on the Practice Questions link of Array in python page
    Then the user should see list of all Practice Questions in Practice Questions Page

  @Array11
  Scenario Outline: Verify that user receives output on running valid python code for "Search the array" question
    Given The user is on the tryeditor page of  Search The Array question
    When The user enters code "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see an result for search the array in console for "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname        | RowNumber |
      | Search The Array |         1 |

  @Array12
  Scenario Outline: Verify that user receives error on running Invalid python code for "Search the array" question
    Given The user is on the tryeditor page of  Search The Array question
    When The user enters code "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should able to see an error message in alert window "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname        | RowNumber |
      | Search The Array |         2 |

  @Array13
  Scenario Outline: Verify that user receives output on submitting valid python code for "Search the array" question
    Given The user is on the tryeditor page of  Search The Array question
    When The user enters code "<Sheetname>" and <RowNumber> clicks the Submit button
    Then The user should see an output for question in console for "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname        | RowNumber |
      | Search The Array |         3 |

  @Array14
  Scenario Outline: Verify that user receives output on running valid python code for "Max Consecutive Ones" question
    Given The user is on the tryeditor page of  Max Consecutive Ones
    When The user enters code "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see an result for question in console for "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname            | RowNumber |
      | Max Consecutive Ones |         1 |

  @Array15
  Scenario Outline: Verify that user receives error on running Invalid python code for "Max Consecutive Ones" question
    Given The user is on the tryeditor page of  Max Consecutive Ones
    When The user enters code "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should able to see an error message in alert window "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname            | RowNumber |
      | Max Consecutive Ones |         2 |

  @Array16
  Scenario Outline: Verify that user receives output on submitting valid python code for "Max Consecutive Ones" question
    Given The user is on the tryeditor page of  Max Consecutive Ones
    When The user enters code "<Sheetname>" and <RowNumber> clicks the Submit button
    Then The user should see an output for question in console for "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname            | RowNumber |
      | Max Consecutive Ones |         3 |

  @Array17
  Scenario Outline: Verify that user receives output on running valid python code for "Find Numbers with Even Number" question
    Given The user is on the tryeditor page of  Find Numbers with Even Number
    When The user enters code "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see an result for question in console for "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname                     | RowNumber |
      | Find Numbers with Even Number |         1 |

  @Array18
  Scenario Outline: Verify that user receives error on running Invalid python code for "Find Numbers with Even Number" question
    Given The user is on the tryeditor page of  Find Numbers with Even Number
    When The user enters code "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should able to see an error message in alert window "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname                     | RowNumber |
      | Find Numbers with Even Number |         2 |

  @Array19
  Scenario Outline: Verify that user receives output on submitting valid python code for "Find Numbers with Even Number" question
    Given The user is on the tryeditor page of  Find Numbers with Even Number
    When The user enters code "<Sheetname>" and <RowNumber> clicks the Submit button
    Then The user should see an output for question in console for "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname                     | RowNumber |
      | Find Numbers with Even Number |         3 |

  @Array20
  Scenario Outline: Verify that user receives output on running valid python code for "Squares of  a Sorted Array" question
    Given The user is on the tryeditor page of  Squares of  a Sorted Array
    When The user enters code "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see an result for Squares in console for "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname                  | RowNumber |
      | Squares of  a Sorted Array |         1 |

  @Array21
  Scenario Outline: Verify that user receives error on running Invalid python code for "Squares of  a Sorted Array" question
    Given The user is on the tryeditor page of  Squares of  a Sorted Array
    When The user enters code "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should able to see an error message in alert window "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname                  | RowNumber |
      | Squares of  a Sorted Array |         2 |

  @Array22
  Scenario Outline: Verify that user receives output on submitting valid python code for "Squares of  a Sorted Array" question
    Given The user is on the tryeditor page of  Squares of  a Sorted Array
    When The user enters code "<Sheetname>" and <RowNumber> clicks the Submit button
    Then The user should see an output for question in console for "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname                  | RowNumber |
      | Squares of  a Sorted Array |         3 |
