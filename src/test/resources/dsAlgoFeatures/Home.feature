Feature: HOME functionality


Scenario: Verify User is able to navigate to DsAlgo Application
    Given Empty browser open
    When The user enters the DsAlgo Url
    Then the user should able to land on DsAlgo portal
Scenario: verify that user is able to navigate to homepage when clicked on getstarted button
    Given the user enters the DsAlgo Url
    When The user click on Getstarted button
    Then the user navigates to DSAlgo home page and verifies whether the home page is displayed
Scenario: Verify that the user is able to Navigate to Register page
    Given the user is on the DSAlgo homepage
    When The user clicks on the Register button
    Then the user should be navigated to the Register page
    
Scenario: Verify that the user is able to Navigate to signin page
    Given the user is on the DSAlgo homepage
    When The user clicks on the signin button
    Then the user should be navigated to the signin page

Scenario Outline: Verify that the user sees six options under the Data Structure dropdown before logging in
    Given the user is on the DSAlgo homepage
    When the user clicks on the Data Structure button
    Then the user should see six options: "<option1>","<option2>","<option3>","<option4>","<option5>", and "<option6>" under the Data Structure dropdown

    Examples:
    | option1 | option2 | option3 | option4 | option5 | option6 |
    | Arrays | Linked List | Stack | Queue | Tree | Graph |

Scenario Outline: Verify the error message when the user clicks on the GetStarted button under all the options in Home Page without signing in
    Given the user is on the DSAlgo homepage
    When the user clicks on the GetStarted button under "<Section>"
    Then the user should see an error message stating "You are not logged in"
    Examples:
    | Section     |
    | <ExcelData> |
    
    
#Scenario Outline: Verify the error message when the user clicks on the options under DataStructure dropdown before login
    #Given the user is on the DSAlgo homepage
    #When the user clicks on the <Section> option under DataStructure
    #Then the user should see an error message stating "You are not logged in" after clicking on options
#
    #Examples:
    #| Section       |
    #| Arrays        |
    #| Linked List   |
    #| Stack         |
    #| Queue         |
    #| Tree          |
    #| Graph         |