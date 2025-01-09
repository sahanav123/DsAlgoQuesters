Feature: Graph functionality

    Scenario: Verify that the user can navigate to the Graph
page after signin
    Given the user is navigated to the HomePage
    When When the user clicks on the "Get Started" button of Graph section

    Then the user is navigated to the Graph page

    Scenario: Verify the user is able to navigate to the Graph option  in Graph page
    Given the user is on the Graph page
    When the user clicks on the Graph link
    Then the user should navigated to the Graph page and confirm navigation with text display

    Scenario: Verify that user is able to navigate to "try Editor" 
page for Graph page
    Given the user is on the Graph page
    When the user click on Try here button in Graph Page
    Then the user should navigate to the tryeditor page

    Scenario: Verify that user is able to run valid python code in 
try editor for Graph page option
    Given the user is on the tryeditor page
    When the user clicks the "Run" button
    Then the user should see the output in the output under Run option

    Scenario: Verify that user receives error when user enters 
invalid python code in tryeditor for Graph Page
    Given the user is on the tryeditor page
    When the user clicks the "Run" button
    Then the user should see an alert box with text "bad input"

    Scenario: Verify that user receives error when user clicks on run 
button without entering code in tryeditor for Graph Page
    Given the user is on the tryeditor page
    When the user clicks the "Run" button
    Then the user should see an error message

    Scenario: Verify the user is able to navigate to the 
Practice Questions  mentioned under graph Graph Page
    Given the user is on the Graph option page
    When the user clicks on the Practice Questions link in Graph Page
    Then the user should navigated to the Practice Questions page
 

    Scenario: Verify the user is able to navigate to the 
Graph Representations option in Graph page
    Given the user is on the Graph page
    When the user clicks on the Graph Representations link
    Then the user should navigated to the Graph Representations page and confirm navigation with text display

    Scenario: Verify that user is able to navigate to "try Editor" 
page for GraphRepresentation page
    Given the user is on the GraphRepresentation page
    When the user click on Try here button in GraphRepresentation Page
    Then the user should navigate to the tryeditor page

    Scenario: Verify that user is able to run valid python code in 
try editor for GraphRepresentation page option
    Given the user is on the tryeditor page
    When the user clicks the "Run" button
    Then the user should see the output in the output under Run option

    Scenario: Verify that user receives error when user enters 
invalid python code in tryeditor for 
GraphRepresentation Page
    Given the user is on the tryeditor page
    When the user clicks the "Run" button
    Then the user should see an alert box with text "bad input"

    Scenario: Verify that user receives error when user clicks on run 
button without entering code in tryeditor for Graph Page
    Given the user is on the tryeditor page
    When the user clicks the "Run" button
    Then the user should see an error message

    Scenario: Verify the user is able to navigate to the 
Practice Questions  mentioned under graph Graph Page
    Given the user is on the Graph option page 
    When the user clicks on the Practice Questions link in Graph Page
    Then the user should navigated to the Practice Questions page
 

    Scenario: Verify the user is able to navigate to the 
Arrays  under DataStructure DropDown from Graph page
    Given the user is on the Graph page
    When the user click on the Arrays option under DataStructure Dropdown in Graph Page
    Then the user should navigated to the Arrays page

    Scenario: Verify the user is able to navigate to the 
LinkedList  under DataStructure DropDown from 
Graph page
    Given the user is on the Graph page
    When the user click on the LinkedList option under DataStructure Dropdown in Graph Page
    Then the user should navigated to the LinkedList page

    Scenario: Verify the user is able to navigate to the 
Stack under DataStructure DropDown from Graph page
    Given the user is on the Graph page
    When the user click on the Stack option under DataStructure Dropdown in Graph Page
    Then the user should navigated to the Stack page

    Scenario: Verify the user is able to navigate to the 
Queue  under DataStructure DropDown from 
Graph page
    Given the user is on the Graph page
    When the user click on the Queue option under DataStructure Dropdown in Graph Page
    Then the user should navigated to the Queue page

    Scenario: Verify the user is able to navigate to the 
Tree  under DataStructure DropDown from Graph page
    Given the user is on the Graph page
    When the user click on the Tree option under DataStructure Dropdown in Graph Page
    Then the user should navigated to the Tree page

    Scenario: Verify the user is able to navigate to the 
Graph  under DataStructure DropDown from 
Graph page
    Given the user is on the Graph page
    When the user click on the Graph option under DataStructure Dropdown in Graph Page
    Then the user should navigated to the Graph page

