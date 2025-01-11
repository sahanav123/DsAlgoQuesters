Feature: HOME functionality

Background:
Given the user is on the DSAlgo homepage
	
Scenario: Verify that the user is able to Navigate to Register page
When The user clicks on the Register button
Then the user should be navigated to the Register page

Scenario: Verify that the user is able to Navigate to signin page
When The user clicks on the signin button
Then the user should be navigated to the signin page

Scenario Outline: Verify the error message when the user clicks on the GetStarted button under all the options in Home Page without signing in

When the user clicks on the GetStarted button under <Section>
Then the user should see an error message stating "You are not logged in"

Examples:
| Section                                     |
| Data Structures-Introduction |
| Array                                         |
| Linked List                               |
| Stack                                         |
| Queue                                       |
| Tree                                           |
| Graph                                        |

Scenario Outline: Verify that the user sees six options under the Data Structure dropdown before logging in

When the user clicks on the Data Structure button
Then the user should see six options: <option1>, <option2>, <option3>,<option4>, <option5>, and <option6> under the Data Structure dropdown

Examples:
| option1 | option2 | option3 | option4 | option5 | option6 |
| Arrays | Linked List | Stack | Queue | Tree | Graph |

Scenario Outline: Verify the error message when the user clicks on the options under DataStructure dropdown before login

When the user clicks on the <Section> option under DataStructure
Then the user should see an error message stating "You are not logged in"

Examples:
| Section       |
| Arrays         |
| Linked List |
| Stack           |
| Queue         |
| Tree             |
| Graph          |