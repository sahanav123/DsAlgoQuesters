Feature: TREE1 functionality

    Scenario: To validate user is in Tree page after SignIn
    Given The user is in Home Page after SignIn
    When User select Tree from the Home page
    Then The user is navigated to DsAlgo/Tree page and need to validate it 

    Scenario: To verify that the user is in OverView Of Tree
    Given The user is in  Tree page
    When  User select Overview Of Tree
    Then The user navigate to Overview Of Tree page need to validate

    Scenario: To verify the user is able to click "Try Editor" button for Overview Of Tree
    Given The user is in Overview Of Tree page 
    When User click the "Try Editor " button
    Then The user navigate to OverviewOf Tree/TryEditor

    Scenario: Verify that the user get the error message when click Run button without entering any code
    Given The user is in "Try Editor"page
    When Without entering the code the user click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user get the error message when click Run button by entering wrong code

    Given The user is in "Try Editor"page
    When User enter wrong code and then click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user enter the  valid Python  code for "Overviewing  Of Tree"
    Given The user is in "Try Editor"oage
    When User enter the right code and then click Run button
    Then The user should able to see output in the console

    Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Overviewing Of Tree" page 
    Given The user is in Tree/Overviewing Of Tree
    When The user click "Practice Question " button
    Then The user should be redirected to the Practice Page

    Scenario: To verify that the user is in Terminologies
    Given The user is in  Tree/Overviewing Of Tree page
    When User select Terminologies
    Then The user navigate to Terminologies page and need to validate

    Scenario: To verify the user is able to click "Try Editor" button for Terminologies
    Given The user is in Terminologies page 
    When User click the "Try Editor " button
    Then The user navigate to Terminologies/TryEditor

    Scenario: Verify that the user get the error message when click Run button without entering any code
    Given The user is in "Try Editor"page
    When Without entering the code the user click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user get the error message when click Run button without entering wrong code

    Given The user is in "Try Editor"page
    When User enter wrong code and then click  Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user enter the  valid Python  code for "Terminologies"
    Given The user is in "Try Editor"oage
    When User enter the right code and then click Run button
    Then The user should able to see output in the console

    Scenario: To verify that the user is in Types of Trees
    Given The user is in  Tree/Terminologies page
    When  User select Types Of Trees
    Then The user navigate to Tree/Types Of Trees

    Scenario: To verify the user is able to click "Try Editor" button for Types Of Trees
    Given The user is in Types Of Trees page 
    When User click the "Try Editor " button
    Then The user navigate to Types Of Trees/TryEditor

    Scenario: Verify that the user get the error message when click Run button without entering any code
    Given The user is in "Try Editor"page
    When Without entering the code the user click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user get the error message when click Run button by entering wrong code
    Given The user is in "Try Editor"page
    When User enter wrong code and then click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user enter the  valid Python  code for "Overviewing  Of Tree"
    Given The user is in "Try Editor"oage
    When User enter the right code and then click Run button
    Then The user should able to see output in the console

    Scenario: To verify that the user is in Tree Traversals
    Given The user is in  Tree/Types of Trees
    When User select Tree Traversals
    Then The user navigate to Tree/Types Of Trees

    Scenario: To verify the user is able to click "Try Editor" button for Types Of Trees
    Given The user is in Types Of Trees page 
    When User click the "Try Editor " button
    Then The user navigate to Types Of Trees/TryEditor need to validate

    Scenario: Verify that the user get the error message when click Run button without entering any code
    Given The user is in "Try Editor"page
    When Without entering the code the user click  Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user get the error message when click Run button by entering wrong code
    Given The user is in "Try Editor"page
    When User enter wrong code and then click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user enter the  valid Python  code for "Tree Transversals"
    Given The user is in "Try Editor"oage
    When User enter the right code and then click Run button
    Then The user should able to see output in the console

    Scenario: To verify that the user is in Traversals-Illustration
    Given The user is in  Tree/Tree Traversals
    When User select Traversals-Illustration
    Then The user navigate to Tree/Traversals-Illustration

    Scenario: To verify the user is able to click "Try Editor" button for Traversals-Illustration
    Given The user is in Traversals-Illustration page 
    When User click the "Try Editor " button
    Then The user navigate toTraversals-Illustration/TryEditor need to validate

    Scenario: Verify that the user get the error message when click Run button without entering any code
    Given The user is in "Try Editor"page
    When Without entering the code the user click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user get the error message when click Run button by entering wrong code
    Given The user is in "Try Editor"page
    When User enter wrong code and then click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user enter the  valid Python  code for Traversals-Illustration
    Given The user is in "Try Editor"page
    When User enter the right code and then click Run button
    Then The user should able to see output in the console

    Scenario: To verify that the user is in Binary Trees
    Given The user is in  Tree/Traversals-Illustration
    When User select Binary Trees
    Then The user navigate to Tree/Binary Trees

    Scenario: To verify the user is able to click "Try Editor "button for Traversals-Illustration
    Given The user is in Binary Trees page 
    When User click the "Try Editor " button
    Then The user navigate to Binary Trees/TryEditor need to validate

    Scenario: Verify that the user get the error message when click Run button without entering any code
    Given The user is in "Try Editor"page
    When Without entering the code the user click  Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user get the error message when click Run button by entering wrong code
    Given The user is in "Try Editor"page
    When User enter wrong code and then click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user enter the  valid Python  code for Binary Trees
    Given The user is in "Try Editor"page
    When User enter the right code and then click Run button
    Then The user should able to see output in the console

    Scenario: To verify that the user is in Types of Binary Trees
    Given The user is in  Tree/Binary Trees
    When User select Types of Binary Trees
    Then The user navigate to Tree/Types of Binary Trees

    Scenario: To verify the user is able to click "Try Editor" button for Types of Binary Trees
    Given The user is in Types of Binary Trees page 
    When User click the "Try Editor " button
    Then The user navigate to Types of Binary Trees/TryEditor need to validate

    Scenario: Verify that the user get the error message when click Run button without entering any code
    Given The user is in "Try Editor"page
    When Without entering the code the user click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user get the error message when click Run button by entering wrong code
    Given The user is in "Try Editor"page
    When User enter wrong code and then click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user enter the  valid Python  code for Types of Binary Trees
    Given The user is in "Try Editor"page
    When User enter the right code and then click Run button
    Then The user should able to see output in the console

    Scenario: To verify the user is able to click "Try Editor" button for Implementation in Python  
    Given The user is in Implementation in Python      
    When User click the "Try Editor " button
    Then The user navigate to Implementation in Python/TryEditor need to validate      

    Scenario: Verify that the user get the error message when click Run button without entering any code
    Given The user is in "Try Editor"page
    When Without entering the code the user click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user get the error message when click Run button by entering wrong code
    Given The user is in "Try Editor"page
    When User enter wrong code and then click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user enter the  valid Python  code for Implementation in Python 
    Given The user is in "Try Editor"oage
    When User enter the right code and then click Run button
    Then The user should able to see output in the console

    Scenario: To verify that the user is in Binary Tree Traversals
    Given The user is in  Tree/Implementation in Python    
    When User select Binary Tree Traversals   
    Then The user navigate to Tree/Binary Tree Traversals   

    Scenario: To verify the user is able to click "Try Editor" button for Binary Tree Traversals   
    Given The user is in Binary Tree Traversals     
    When User click the "Try Editor " button
    Then The user navigate to Binary Tree Traversals/TryEditor need to validate      

    Scenario: Verify that the user get the error message when click Run button without entering any code
    Given The user is in "Try Editor"page
    When Without entering the code the user click Run button 
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user get the error message when click Run button by entering wrong code
    Given The user is in "Try Editor"page
    When User enter wrong code and then click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user enter the  valid Python  code for Binary Tree Traversals  
    Given The user is in "Try Editor"oage
    When User enter the right code and then click Run button
    Then The user should able to see output in the console

    Scenario: To verify that the user is in Implementation of Binary Trees
    Given The user is in  Tree/ Binary Tree Traversals      
    When User select  Implementation of Binary Trees 
    Then The user navigate to Implementation of Binary Trees   

    Scenario: To verify the user is able to click "Try Editor" button for Tree/Implementation of Binary Trees    
    Given The user is in Tree/Implementation of Binary Trees    
    When User click the "Try Editor " button
    Then The user navigate to Implementation of Binary Trees/TryEditor need to validate      

    Scenario: Verify that the user get the error message when click Run button without entering any code
    Given The user is in "Try Editor"page
    When Without entering the code the user click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user get the error message when click Run button by entering wrong code
    Given The user is in "Try Editor"page
    When User enter wrong code and then click  Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user enter the  valid Python  code for Tree/Implementation of Binary Trees 
    Given The user is in "Try Editor"oage
    When User enter the right code and then click Run button
    Then The user should able to see output in the console

    Scenario: To verify that the user is in Applications of Binary trees
    Given The user is in   Implementation of Binary Trees      
    When User select  Implementation of Binary Trees 
    Then The user navigate to Implementation of Binary Trees   

    Scenario: To verify the user is able to click "Try Editor" button for Tree/Applications of Binary trees     
    Given The user is in Tree/Applications of Binary trees       
    When User click the "Try Editor " button
    Then The user navigate to Implementation of Binary Trees/TryEditor need to validate      

    Scenario: Verify that the user get the error message when click Run button without entering any code
    Given The user is in "Try Editor"page
    When Without entering the code the user click  Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user get the error message when click Run button by entering wrong code
    Given The user is in "Try Editor"page
    When User enter wrong code and then click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user enter the  valid Python  code for Tree/Implementation of Binary Trees   
    Given The user is in "Try Editor"oage
    When User enter the right code and then click Run button
    Then The user should able to see output in the console

    Scenario: To verify that the user is in Binary Search Trees
    Given The user is in  Applications of Binary trees         
    When User select  Binary Search Trees
    Then The user navigate to Binary Search Trees

    Scenario: To verify the user is able to click "Try Editor" button for Tree/Binary Search Trees    
    Given The user is in Tree/Binary Search Trees     
    When User click the "Try Editor " button
    Then The user navigate to Binary Search Trees/TryEditor need to validate       

    Scenario: Verify that the user get the error message when click Run button without entering any code
    Given The user is in "Try Editor"page
    When Without entering the code the user click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user get the error message when click Run button by entering wrong code
    Given The user is in "Try Editor"page
    When User enter wrong code and then click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user enter the  valid Python  code for Tree/Binary Search Trees     
    Given The user is in "Try Editor"oage
    When User enter the right code and then click Run button
    Then The user should able to see output in the console

    Scenario: To verify that the user is in Implementation Of BST  
    Given The user is in  Binary Search Trees          
    When User select   Implementation Of BST  
    Then The user navigate to  Implementation Of BST  

    Scenario: To verify the user is able to click "Try Editor" button for Tree/ Implementation Of BST  
    Given The user is in Tree/Binary Search Trees     
    When User click the "Try Editor " button
    Then The user navigate to Binary Search Trees/TryEditor need to validate       

    Scenario: Verify that the user get the error message when click Run button without entering any code
    Given The user is in "Try Editor"page
    When Without entering the code the user click Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user get the error message when click Run button by entering wrong code
    Given The user is in "Try Editor"page
    When User enter wrong code and then click  Run button
    Then The user should able to see an error message in alert window

    Scenario: Verify that the user enter the  valid Python  code for Tree/ Implementation Of BST    
    Given The user is in "Try Editor"oage
    When User enter the right code and then click Run button
    Then The user should able to see output in the console

