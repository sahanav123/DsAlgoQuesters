Feature: LinkedList functionality

  Background: 
    Given The user is on the DSAlgo homepage after sign

  @LL1
  Scenario: Verify that user is able to navigate to "Linked List" data structure page
    When The user clicks the Getting Started button in Linked List Panel
    Then The user be directed to Linked List Data Structure Page

  @LL2
  Scenario Outline: Verify that user is able to navigate to "Introduction" page
    Given The user is in the Linked List page
    When The user clicks Introduction button
    Then The user should be redirected to page and confirm url "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname  | RowNumber |
      | LinkedList |         1 |

  @LL3
  Scenario Outline: Verify that user is able to navigate to "Creating Linked LIst" page
    Given The user is in the Linked List page
    When The user clicks Creating Linked LIst button
    Then The user should be redirected to page and confirm url "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname  | RowNumber |
      | LinkedList |         2 |

  @LL4
  Scenario Outline: Verify that user is able to navigate to "Types of Linked List" page
    Given The user is in the Linked List page
    When The user clicks Types of Linked List button
    Then The user should be redirected to page and confirm url "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname  | RowNumber |
      | LinkedList |         3 |

  @LL5
  Scenario Outline: Verify that user is able to navigate to "Introduction" page
    Given The user is in the Linked List page
    When The user clicks Implement Linked List button
    Then The user should be redirected to page and confirm url "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname  | RowNumber |
      | LinkedList |         4 |

  @LL6
  Scenario Outline: Verify that user is able to navigate to "Introduction" page
    Given The user is in the Linked List page
    When The user clicks Traversal button
    Then The user should be redirected to page and confirm url "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname  | RowNumber |
      | LinkedList |         5 |

  @LL7
  Scenario Outline: Verify that user is able to navigate to "Introduction" page
    Given The user is in the Linked List page
    When The user clicks Insertion button
    Then The user should be redirected to page and confirm url "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname  | RowNumber |
      | LinkedList |         6 |

  @LL8
  Scenario Outline: Verify that user is able to navigate to "Introduction" page
    Given The user is in the Linked List page
    When The user clicks Deletion button
    Then The user should be redirected to page and confirm url "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname  | RowNumber |
      | LinkedList |         7 |

  @LL9
  Scenario Outline: Verify that user is able to navigate to the try Editor page from different options in Stack Page
    Given The user is on the LinkedList Options "<Sheetname>" and <RowNumber> page
    When The user clicks on the Try here button on the LinkedList Options page
    Then The user should navigate to the tryeditor page

    Examples: 
      | Sheetname  | RowNumber |
      | LinkedList |         1 |
      | LinkedList |         2 |
      | LinkedList |         3 |
      | LinkedList |         4 |
      | LinkedList |         5 |
      | LinkedList |         6 |
      | LinkedList |         7 |

  @LL10
  Scenario Outline: Verify that user is able to run valid Python code in Try Editor for LinkedList Page
    Given The user is on the tryeditor page of Introduction in LinkedList
    When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @LL11
  Scenario Outline: Verify that user is able to run valid Python code in Try Editor for LinkedList Page
    Given The user is on the tryeditor page of Creating Linked LIst in LinkedList
    When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @LL12
  Scenario Outline: Verify that user is able to run valid Python code in Try Editor for LinkedList Page
    Given The user is on the tryeditor page of Types of Linked List in LinkedList
    When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @LL13
  Scenario Outline: Verify that user is able to run valid Python code in Try Editor for LinkedList Page
    Given The user is on the tryeditor page of Types of Linked List in LinkedList
    When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @LL14
  Scenario Outline: Verify that user is able to run valid Python code in Try Editor for LinkedList Page
    Given The user is on the tryeditor page of Traversal in LinkedList
    When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @LL15
  Scenario Outline: Verify that user is able to run valid Python code in Try Editor for LinkedList Page
    Given The user is on the tryeditor page of Insertion in LinkedList
    When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @LL16
  Scenario Outline: Verify that user is able to run valid Python code in Try Editor for LinkedList Page
    Given The user is on the tryeditor page of Deletion in LinkedList
    When The user enters code "<code>", "<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see an result "<expectedresult>", "<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @LL17
  Scenario Outline: Verify that user receives error when user clicks on run button without entering code in tryeditor for LinkedList Page
    Given The user is on the tryeditor page of seven Options "<Sheetname>" and <RowNumber> of LinkedList page
    When the user clicks the Run button
    Then the user should see an error message

    Examples: 
      | Sheetname  | RowNumber |
      | LinkedList |         1 |
      | LinkedList |         2 |
      | LinkedList |         3 |
      | LinkedList |         4 |
      | LinkedList |         5 |
      | LinkedList |         6 |
      | LinkedList |         7 |

  @LL18
  Scenario Outline: Verify the user is able to navigate to the Practice Questions mentioned under Seven options of LinkedList
    Given The user is navigates to seven Options "<Sheetname>" and <RowNumber> of LinkedList page
    When the user clicks on the Practice Questions link
    Then the user should navigated to the Practice Questions page of three options "<Sheetname>" and <RowNumber> in Stack page

    Examples: 
      | Sheetname  | RowNumber |
      | LinkedList |         1 |
      | LinkedList |         2 |
      | LinkedList |         3 |
      | LinkedList |         4 |
      | LinkedList |         5 |
      | LinkedList |         6 |
      | LinkedList |         7 |

  @LL19
  Scenario Outline: Verify the user see list of Practice Questions in Practice Questions Page of three options pages
    Given The user is navigates to seven Options "<Sheetname>" and <RowNumber> of LinkedList page
    When the user clicks on the Practice Questions link
    Then the user should see list of Practice Questions in Practice Questions Page

    Examples: 
      | Sheetname  | RowNumber |
      | LinkedList |         1 |
      | LinkedList |         2 |
      | LinkedList |         3 |
      | LinkedList |         4 |
      | LinkedList |         5 |
      | LinkedList |         6 |
      | LinkedList |         7 |
