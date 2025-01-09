Feature: HomeAfterSignin functionality

    Scenario: Verify User is able to navigate to DsAlgo Application
    Given Empty browser open
    When The user enters the DsAlgo Url
    Then the user should able to land on DsAlgo portal

    Scenario: verify that user is able to navigate to homepage 
when clicked on getstarted button
    Given the user enters the DsAlgo Url
    When The user click on Getstarted button
    Then the user navigates to DSAlgo home page and verifies whether the home page is displayed

    Scenario: Verify that the user is able to Navigate to Register page
    Given the user navigates to the DSAlgo homepage
    When The user clicks on the "Register" button
    Then the user should be navigated to the Register page and confirm its presence with the displayed text

    Scenario: Verify that the user is able to Navigate to Login page
    Given the user navigates to the DSAlgo homepage
    When The user clicks on the Login button
    Then the user should be navigated to the Login page and confirm its presence with the displayed text

    Scenario: Verify the error message when the user clicked on GetStarted button of
 DataStructures-Introduction without signing in
    Given the user navigates to DSAlgo homepage
    When The user clicks on the GetStarted button under DataStructures-Introduction
    Then the user should see an error message stating You are not signed in

    Scenario: Verify the error message when the user clicked on  GetStarted button 
of Array without signing in
    Given the user is on the DSAlgo homepage
    When The user clicks on the GetStarted button under Array
    Then the user should see an error message stating You are not signed in

    Scenario: Verify the error message when the user clicked on GetStarted button of
 LinkedList without signing in
    Given the user is on the DSAlgo homepage
    When The user clicks on the GetStarted button under LinkedList 
    Then the user should see an error message stating You are not signed in

    Scenario: Verify error message when the user clicked on GetStarted button of
 Stack without signing in
    Given the user is on the DSAlgo homepage
    When the user clicks on the GetStarted button under Stack
    Then the user should see an error message stating You are not signed in

    Scenario: Verify error message when the user clicked on GetStarted button of
  Queue without signing in
    Given the user is on the DSAlgo homepage
    When the user clicks on the GetStarted button under Queue
    Then the user should see an error message stating You are not signed in

    Scenario: Verify error message when the user clicked on GetStarted button of
 Tree without signing in
    Given the user is on the DSAlgo homepage
    When the user clicks on the GetStarted button under Tree
    Then the user should see an error message stating You are not signed in

    Scenario: Verify error message when the user clicked on GetStarted button of
 Graph without signing in
    Given the user is on the DSAlgo homepage
    When the user clicks on the GetStarted button under Graph
    Then the user should see an error message stating You are not signed in

    Scenario: Verify that the user sees six options under the 
Data Structure dropdown before logging in
    Given the user is on the DSAlgo homepage
    When the user clicks on the Data Structure button
    Then the user should see six options: "Arrays," "Linked List," "Stack," "Queue,", "Tree," and "Graph" under the Data Structure dropdown.

    Scenario: Verify error message when selecting "Arrays" from the Data
 Structures dropdown without signing in
    Given the user is on the DSAlgo homepage
    When the user selects "Arrays" option under "Data Structures" dropdown
    Then the user should see an error message stating, "You are not logged in

    Scenario: Verify error message when selecting LinkedList from the Data
 Structures dropdown without signing in
    Given the user is on the DSAlgo homepage
    When the user selects  LinkedList option under "Data Structures" dropdown
    Then the user should see an error message stating, "You are not logged in

    Scenario: Verify error message when selecting Stack from the Data
 Structures dropdown without signing in
    Given the user is on the DSAlgo homepage
    When the user selects Stack option under "Data Structures" dropdown
    Then the user should see an error message stating, "You are not logged in

    Scenario: Verify error message when selecting Queue from the Data
 Structures dropdown without signing in
    Given the user is on the DSAlgo homepage
    When the user selects Queue option under "Data Structures" dropdown
    Then the user should see an error message stating, "You are not logged in

    Scenario: Verify error message when selecting Tree from the Data
 Structures dropdown without signing in
    Given the user is on the DSAlgo homepage
    When the user selects Tree option under "Data Structures" dropdown
    Then the user should see an error message stating, "You are not logged in

    Scenario: Verify error message when selecting Graph from the Data
 Structures dropdown without signing in
    Given the user is on the DSAlgo homepage
    When the user selects Graph option under "Data Structures" dropdown
    Then the user should see an error message stating, "You are not logged in

