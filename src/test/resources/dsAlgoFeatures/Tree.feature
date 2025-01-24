Feature: Tree functionality

  Background: 
    Given The user is on the DSAlgo homepage after sign

  @Tree01
  Scenario: Verify that user is able to navigate to "Tree" data structure page
    When The user clicks the Getting Started button in Tree Panel
    Then The user be directed to Tree DataStructure Page

  @Tree02
  Scenario Outline: Verify the user is able to navigate to the Operations in Tree in Tree page
    Given User is on Tree Page
    When User click on Options "<SheetName>" and <RowNumber> in Tree page
    Then User should redirected to Options "<SheetName>" and <RowNumber> in Tree page

    Examples: 
      | SheetName | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |
      | Tree      |         3 |
      | Tree      |         4 |
      | Tree      |         5 |
      | Tree      |         6 |
      | Tree      |         7 |
      | Tree      |         8 |
      | Tree      |         9 |
      | Tree      |        10 |
      | Tree      |        11 |
      | Tree      |        12 |
      | Tree      |        13 |

  @Tree03
  Scenario Outline: Verify the user is able to navigate to TryEditor page from Tree Options
    Given The user is on the Tree Options "<SheetName>" and <RowNumber> page
    When The user click Try Here button on Tree Options page
    Then The user should redirected to Try Editor of each Options

    Examples: 
      | SheetName | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |
      | Tree      |         3 |
      | Tree      |         4 |
      | Tree      |         5 |
      | Tree      |         6 |
      | Tree      |         7 |
      | Tree      |         8 |
      | Tree      |         9 |
      | Tree      |        10 |
      | Tree      |        11 |
      | Tree      |        12 |
      | Tree      |        13 |

  @Tree04
  Scenario Outline: Verify that valid and invalid python code in TryEditor Overview of Trees
    Given The user is in TryEditor page of Overview of Trees
    When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @Tree05
  Scenario Outline: Verify that valid and invalid python code in TryEditor Terminologies
    Given The user is in TryEditor page of Terminologies
    When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @Tree06
  Scenario Outline: Verify that valid and invalid python code in TryEditor Types of Trees
    Given The user is in TryEditor page of TypesOfTrees
    When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @Tree07
  Scenario Outline: Verify that valid and invalid python code in TryEditor Tree Traversals
    Given The user is in TryEditor page of TreeTraversals
    When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @Tree08
  Scenario Outline: Verify that valid and invalid python code in TryEditor TraversalsIllustration
    Given The user is in TryEditor page of TraversalsIllustration
    When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @Tree09
  Scenario Outline: Verify that valid and invalid python code in TryEditor BinaryTrees
    Given The user is in TryEditor page of BinaryTrees
    When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @Tree10
  Scenario Outline: Verify that valid and invalid python code in TryEditor TypesOfBinaryTrees
    Given The user is in TryEditor page of TypesOfBinaryTrees
    When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @Tree11
  Scenario Outline: Verify that valid and invalid python code in TryEditor ImplementationInPython
    Given The user is in TryEditor page of ImplementationInPython
    When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @Tree12
  Scenario Outline: Verify that valid and invalid python code in TryEditor BinaryTreeTraversals
    Given The user is in TryEditor page of BinaryTreeTraversals
    When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @Tree13
  Scenario Outline: Verify that valid and invalid python code in TryEditor ApplicationsOfBinaryTrees
    Given The user is in TryEditor page of ApplicationsOfBinaryTrees
    When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @Tree14
  Scenario Outline: Verify that valid and invalid python code in TryEditor BinarySearchTrees
    Given The user is in TryEditor page of BinarySearchTrees
    When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @Tree15
  Scenario Outline: Verify that valid and invalid python code in TryEditor ImplementationOfBST
    Given The user is in TryEditor page of ImplementationOfBST
    When The user enters code from "<code>","<Sheetname>" and <RowNumber> clicks the Run button
    Then The user should see a result "<expectedresult>","<Sheetname>" and <RowNumber>

    Examples: 
      | Sheetname | RowNumber | code    | expectedresult     |
      | tryEditor |         1 | Valid   | successouput       |
      | tryEditor |         2 | Invalid | alertmessageoutput |

  @Tree16
  Scenario: Verify that user receives error when user clicks on run button without entering code in tryeditor for Overview of Trees
    Given The user is on the tryeditor page of Overview of Trees
    When the user clicks the Run button of Overview of Trees
    Then the user should see an error message

  @Tree17
  Scenario: Verify the user is in Practical Question of Overview of Trees
    Given The user is in Overview of Trees page
    When The user clicks on Practice Questions
    Then User should navigate to Practice questions page

  @Tree18
  Scenario: Verify user can see practice question list
    Given The user is on Overview of Trees page
    When The user click pn Practice Questions
    Then User can see Practice Question List
