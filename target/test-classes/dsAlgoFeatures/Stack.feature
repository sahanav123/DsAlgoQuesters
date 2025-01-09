Feature: Stack functionality

    Scenario: Verify that the user can navigate to the Stack
page after signin
    Given the user is navigated to the HomePage
    When When the user clicks on the "Get Started" button of Stack section

    Then the user is navigated to the Stack page

    Scenario: Verify the user is able to navigate to the 
Operations in Stack option in Stack Page
    Given the user is on the Stack page
    When the user clicks on the Operations in Stack link
    Then the user should navigated to the Operations in Stack page and confirm navigation with text display

    Scenario: Verify that user is able to navigate to "try Editor" 
page of Operations in Stack page
    Given the user is on the Operations in Stack page
    When the user click on Try here button in Operations in Stack
    Then the user should navigate to the tryeditor page

    Scenario: Verify that user is able to run valid python code in 
try editor for Operations in Stack option
    Given the user is on the tryeditor page
    When the user clicks the "Run" button
    Then the user should see the output in the output under Run option

    Scenario: Verify that user receives error when user enters 
invalid python code in tryeditor for Operations in Stack
 Page
    Given the user is on the tryeditor page
    When the user clicks the "Run" button
    Then the user should see an alert box with text "bad input"

    Scenario: Verify that user receives error when user clicks on run 
button without entering code in tryeditor for
Operations in Stack Page
    Given the user is on the tryeditor page
    When the user clicks the "Run" button
    Then the user should see an error message

    Scenario: Verify the user is able to navigate to the 
Practice Questions in Applications
    Given the user is on the Applications page
    When the user clicks on the Practice Questions link in Application Page
    Then the user should navigated to the Practice Questions page
 

    Scenario: Verify the user is able to navigate to the 
Implementation option in Stack page
    Given the user is on the Stack page
    When the user clicks on the Implementation link
    Then the user should navigated to the Implementation page and confirm navigation with text display

    Scenario: Verify that user is able to navigate to "try Editor" 
page for Implementation page
    Given the user is on the Implementation page
    When the user click on Try here button in Implementation Page
    Then the user should navigate to the tryeditor page

    Scenario: Verify that user is able to run valid python code in 
try editor for Implementation page option
    Given the user is on the tryeditor page
    When the user clicks the "Run" button
    Then the user should see the output in the output under Run option

    Scenario: Verify that user receives error when user enters 
invalid python code in tryeditor for 
Implementation Page
    Given the user is on the tryeditor page
    When the user clicks the "Run" button
    Then the user should see an alert box with text "bad input"

    Scenario: Verify that user receives error when user clicks on run 
button without entering code in tryeditor for 
Implementation Page
    Given the user is on the tryeditor page
    When the user clicks the "Run" button
    Then the user should see an error message

    Scenario: Verify the user is able to navigate to the 
Practice Questions in Applications
    Given the user is on the Applications page
    When the user clicks on the Practice Questions link in Application Page
    Then the user should navigated to the Practice Questions page
 

    Scenario: Verify the user is able to navigate to the 
Applications option in Stack page
    Given the user is on the Stack page
    When the user clicks on the Applications link
    Then the user should navigated to the Applications page and confirm navigation with text display

    Scenario: Verify that user is able to navigate to "try Editor" 
page for Applications page
    Given the user is on the Applications page
    When the user click on Try here button in Applications Page
    Then the user should navigate to the tryeditor page

    Scenario: Verify that user is able to run valid python code in 
try editor for Applications page option
    Given the user is on the tryeditor page
    When the user clicks the "Run" button
    Then the user should see the output in the output under Run option

    Scenario: Verify that user receives error when user enters 
invalid python code in tryeditor for 
Applications Page
    Given the user is on the tryeditor page
    When the user clicks the "Run" button
    Then the user should see an alert box with text "bad input"

    Scenario: Verify that user receives error when user clicks on run 
button without entering code in tryeditor for 
Applications Page
    Given the user is on the tryeditor page
    When the user clicks the "Run" button
    Then the user should see an error message

    Scenario: Verify the user is able to navigate to the 
Practice Questions in Applications
    Given the user is on the Applications page
    When the user clicks on the Practice Questions link in Application Page
    Then the user should navigated to the Practice Questions page
 

    Scenario: Verify the user is able to navigate to the 
Arrays  under DataStructure DropDown from Stack page
    Given the user is on the Graph page
    When the user click on the Arrays option under DataStructure Dropdown in Graph Page
    Then the user should navigated to the Arrays page

    Scenario: Verify the user is able to navigate to the 
LinkedList  under DataStructure DropDown from 
Stack page
    Given the user is on the Stack page
    When the user click on the LinkedList option under DataStructure Dropdown in Graph Page
    Then the user should navigated to the LinkedList page

    Scenario: Verify the user is able to navigate to the 
Stack under DataStructure DropDown from Stack page
    Given the user is on the Stack page
    When the user click on the Stack option under DataStructure Dropdown in Graph Page
    Then the user should navigated to the Stack page

    Scenario: Verify the user is able to navigate to the 
Queue  under DataStructure DropDown from 
Stack page
    Given the user is on the Stack page
    When the user click on the Queue option under DataStructure Dropdown in Graph Page
    Then the user should navigated to the Queue page

    Scenario: Verify the user is able to navigate to the 
Tree  under DataStructure DropDown from Stack page
    Given the user is on the Stack page
    When the user click on the Tree option under DataStructure Dropdown in Graph Page
    Then the user should navigated to the Tree page

    Scenario: Verify the user is able to navigate to the 
Graph  under DataStructure DropDown from 
Stack page
    Given the user is on the Stack page
    When the user click on the Graph option under DataStructure Dropdown in Graph Page
    Then the user should navigated to the Graph page

    Scenario: Verify the user is see options in 
Practice Questions in Applications
    Given the user is on the Applications page
    When the user clicks on the Practice Questions link in Application Page
    Then the user should see options in Practice Questions page

