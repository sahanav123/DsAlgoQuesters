Feature: Arrays functionality

    Scenario: Verify that user is able to navigate to "Array" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the "Getting Started" button in Array Panel 
    Then The user be directed to "ARRAY" Data Structure Page

    Scenario: Verify that user is able to navigate to "Arrays in Python" page
    Given The user is in the "Array" page 
    When The user clicks "Arrays in Python" button
    Then The user should be redirected to "Arrays in Python" page

    Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays in Python" page
    Given The user is on the "Arrays in Python" page
    When The user clicks "Try Here" button in Arrays in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test

    Scenario: Verify that user receives error when click on Run button without entering code for "Arrays in Python" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

    Scenario: Verify that user receives error when click on Run button for invalid python code for "Arrays in Python" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

    Scenario: Verify that user receives output when click on Run button for valid python code for "Arrays in Python" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

    Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Arrays in Python" page
    Given The user is in the Array in python page 
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page

    Scenario: Verify that user is able to navigate to "Search the array" Page from Practice question page of "Arrays in Python" page
    Given The user is on the "Arrays in Python" page
    When The user clicks the "Search the array" link from Practice question page
    Then The user should be redirected to "Question" page contains a question, and try Editor with Run and Submit buttons

    Scenario: Verify that user receives error on running invalid python code for "Search the array" question
    Given The user is on the practice question editor
    When The user write the invalid code in Editor and Click the Run Button
    Then The user should able to see an error message in alert window

    Scenario: Verify that user receives output on running valid python code for "Search the array" question
    Given The user is on the practice question editor
    When The user write the valid code in Editor and Click the Run Button
    Then The user should able to see output in the console

    Scenario: Verify that user receives error on submitting invalid python code for "Search the array" question
    Given The user is on the practice question editor
    When The user write the invalid code in Editor and Click the Submit Button
    Then The user see an error message "Error occurred during submission"

    Scenario: Verify that user receives output on submitting valid python code for "Search the array" question
    Given The user is on the practice question editor
    When The user write the valid code in Editor and Click the Submit Button
    Then The user see success message "Submission successful"

    Scenario: Verify that user is able to navigate to "Max Consecutive Ones" Page from Practice question page of "Arrays in Python" page
    Given The user is on the "Arrays in Python" page
    When The user clicks the "Max Consecutive Ones" link from Practice question page
    Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons

    Scenario: Verify that user receives error on running invalid python code for "Max Consecutive Ones" question
    Given The user is on the practice question editor
    When The user write the invalid code in Editor and Click the Run Button
    Then The user should able to see an error message in alert window

    Scenario: Verify that user receives output on running valid python code for "Max Consecutive Ones" question
    Given The user is on the practice question editor
    When The user write the valid code in Editor and Click the Run Button
    Then The user should able to see output in the console

    Scenario: Verify that user receives error on submitting invalid python code for "Max Consecutive Ones" question
    Given The user is on the practice question editor
    When The user write the invalid code in Editor and Click the Submit Button
    Then The user see an error message "Error occurred during submission"

    Scenario: Verify that user receives output on submitting valid python code for "Max Consecutive Ones" question
    Given The user is on the practice question editor
    When The user write the valid code in Editor and Click the Submit Button
    Then The user see success message "Submission successful"

    Scenario: Verify that user is able to navigate to "Find Numbers with Even Number of Digits" Page from Practice question page of "Arrays in Python" page
    Given The user is on the "Arrays in Python" page
    When The user clicks the "Max Consecutive Ones" link from Practice question page
    Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons

    Scenario: Verify that user receives error on running invalid python code for "Find Numbers with Even Number of Digits" question
    Given The user is on the practice question editor
    When The user write the invalid code in Editor and Click the Run Button
    Then The user should able to see an error message in alert window

    Scenario: Verify that user receives output on running valid python code for "Find Numbers with Even Number of Digits" question
    Given The user is on the practice question editor
    When The user write the valid code in Editor and Click the Run Button
    Then The user should able to see output in the console

    Scenario: Verify that user receives error on submitting invalid python code for "Find Numbers with Even Number of Digits" question
    Given The user is on the practice question editor
    When The user write the invalid code in Editor and Click the Submit Button
    Then The user see an error message "Error occurred during submission"

    Scenario: Verify that user receives output on submitting valid python code for "Find Numbers with Even Number of Digits" question
    Given The user is on the practice question editor
    When The user write the valid code in Editor and Click the Submit Button
    Then The user see success message "Submission successful"

    Scenario: Verify that user is able to navigate to "Squares of a Sorted Array" Page from Practice question page of "Arrays in Python" page
    Given The user is on the "Arrays in Python" page
    When The user clicks the "Squares of a Sorted Array" link from Practice question page
    Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons

    Scenario: Verify that user receives error on running invalid python code for "Squares of a Sorted Array" question
    Given The user is on the practice question editor
    When The user write the invalid code in Editor and Click the Run Button
    Then The user should able to see an error message in alert window

    Scenario: Verify that user receives output on running valid python code for "Squares of a Sorted Array" question
    Given The user is on the practice question editor
    When The user write the valid code in Editor and Click the Run Button
    Then The user should able to see output in the console

    Scenario: Verify that user receives error on submitting invalid python code for "Squares of a Sorted Array" question
    Given The user is on the practice question editor
    When The user write the invalid code in Editor and Click the Submit Button
    Then The user see an error message "Error occurred during submission"

    Scenario: Verify that user receives output on submitting valid valid python code for "Squares of a Sorted Array" question
    Given The user is on the practice question editor
    When The user write the valid code in Editor and Click the Submit Button
    Then The user see success message "Submission successful"

    Scenario: Verify that user is able to navigate to "Arrays Using List" page
    Given The user is in the "Array" page 
    When The user clicks "Arrays Using List" button
    Then The user should be redirected to "Arrays Using List" page

    Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays Using List" page
    Given The user is on the "Arrays Using List" page
    When The user clicks "Try Here" button in Arrays Using List page
    Then The user should be redirected to a page having an try Editor with a Run button to test

    Scenario: Verify that user receives error when click on Run button without entering code for "Arrays Using List" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

    Scenario: Verify that user receives error when click on Run button for invalid python code for "Arrays Using List" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

    Scenario: Verify that user receives output when click on Run button for valid python code for "Arrays Using List" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

    Scenario: Verify that user is able to navigate to "Basic Operations in Lists" page
    Given The user is in the "Array" page 
    When The user clicks "Basic Operations in Lists" button
    Then The user should be redirected to "Basic Operations in Lists" page

    Scenario: Verify that user is able to navigate to "try Editor" page for "Basic Operations in Lists" page
    Given The user is on the "Basic Operations in Lists" page
    When The user clicks "Try Here" button in Basic Operations in Lists page
    Then The user should be redirected to a page having an try Editor with a Run button to test

    Scenario: Verify that user receives error when click on Run button without entering code for "Basic Operations in Lists" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

    Scenario: Verify that user receives error when click on Run button for invalid python code for "Basic Operations in Lists" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

    Scenario: Verify that user receives output when click on Run button for valid python code for "Arrays Using List" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

    Scenario: Verify that user is able to navigate to "Applications of Array" page
    Given The user is in the "Array" page 
    When The user clicks "Applications of Array" button
    Then The user should be redirected to "Applications of Array" page

    Scenario: Verify that user is able to navigate to "try Editor" page for "Applications of Array" page
    Given The user is on the "Applications of Array" page
    When The user clicks "Try Here" button in Applications of Array page
    Then The user should be redirected to a page having an try Editor with a Run button to test

    Scenario: Verify that user receives error when click on Run button without entering code for "Applications of Array" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

    Scenario: Verify that user receives error when click on Run button for invalid python code for "Applications of Array" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

    Scenario: Verify that user receives output when click on Run button for valid python code for "Applications of Array" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

