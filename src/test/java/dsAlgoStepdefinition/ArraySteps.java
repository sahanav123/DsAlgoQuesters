package dsAlgoStepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.ArrayPage;
import dsAlgoPages.HomePage;
import dsAlgoPages.TryEditorForArraysPracticeQuestions;
import dsAlgoPages.TryEditorPage;
import dsAlgoUtils.ExcelDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArraySteps {
	WebDriver driver = DriverFactory.getdriver();
	HomePage Homepage = new HomePage(driver);
	ArrayPage arrayPage = new ArrayPage(driver);
	TryEditorPage tryEditorPage = new TryEditorPage(driver);
	Logger log = LogManager.getLogger(ArraySteps.class);
	TryEditorForArraysPracticeQuestions  tryEditorArray =new TryEditorForArraysPracticeQuestions(driver);
	List<Map<String, String>> excelData;


	//@Array1	
	@When("the user clicks on the GetStarted button of Array section")
	public void the_user_clicks_on_the_get_started_button_of_array_section() {
		log.info("Clicking Getstarted button on Home Page after SignIn");
		Homepage.getStartedArray();
	}
	
	@Then("the user is navigated to the Array page")
	public void the_user_is_navigated_to_the_array_page() {
			 log.info("Verifying that the user is navigated to the Array page.");
		Assert.assertTrue(arrayPage.arrayPageIsDisplayed());
		log.info("User successfully navigated to the Array page.");	
	}
	
	//@Array2
	@Given("the user is on the Array page")
	public void the_user_is_on_the_array_page() {
		log.info("Navigating to Array page.");
		Homepage.getStartedArray();
	}
	
	@When("the user clicks on the Options {string} and {int} in Array Page")
	public void the_user_clicks_on_the_options_and_in_array_page(String Sheetname, Integer rownumber) {
		log.info("User is clicking on options: " + Sheetname + " and row number: " + rownumber + " on Array page.");
		arrayPage.ArrayOptions(Sheetname, rownumber);
	}
	
	@Then("the user should navigated to the Options {string} and {int} in Array page")
	public void the_user_should_navigated_to_the_options_and_in_array_page(String Sheetname, Integer rownumber) {
		arrayPage.ArrayOptions(Sheetname, rownumber);
		try {
			log.info("Verifying navigation to the option: " + Sheetname + " and row number: " + rownumber + " on Array page.");
			excelData = ExcelDataReader.DataFromExcel(Sheetname);

			String actualurl = driver.getCurrentUrl();
				log.info("Actual URL: " + actualurl);
			String expectedurl = excelData.get(rownumber).get("expectedurls");
				log.info("Expected URL: " + expectedurl);
			Assert.assertEquals(actualurl, expectedurl, "message not matched");

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	//@Array3

	@Given("The user is on the Array Options {string} and {int} page")
	public void the_user_is_on_the_array_options_and_page(String Sheetname, Integer rowNumber) {
		 log.info("Navigating to Array options page for " + Sheetname + " and row " + rowNumber);
		Homepage.getStartedArray();
		arrayPage.ArrayOptions(Sheetname, rowNumber);
//		arrayPage.tryHere();
	}
	
	@When("The user clicks on the Try here button on the Array Options page")
	public void the_user_clicks_on_the_try_here_button_on_the_array_options_page() {
		log.info("Clicking on Try Here button on Array options page.");
		arrayPage.tryHere();
	}

	//	@Array4
	@Given("the user is on the tryeditor page of Array in python")
	public void the_user_is_on_the_tryeditor_page_of_array_in_python() {
		log.info("Navigating to the tryeditor page of Array in Python.");
		Homepage.getStartedArray();
		arrayPage.clickArrayInPython();
		arrayPage.tryHere();
	}
	
	@When("The user enters code {string}, {string} and {int} from tryeditor and clicks the Run button")
	public void the_user_enters_code_and_from_tryeditor_and_clicks_the_run_button(String code, String Sheetname, Integer rowNumber) {
		log.info("Entering code from sheet " + Sheetname + " and row number " + rowNumber + ". Code: " + code);
		tryEditorPage.enteringCode(Sheetname, rowNumber, code);
		log.info("Clicking Run button after entering the code.");
		tryEditorPage.runButton();
	}

	//@Array5
	@Given("The user is on the tryeditor page of Array Using List")
	public void the_user_is_on_the_tryeditor_page_of_array_using_list() {
		log.info("Navigating to tryeditor page of Array Using List.");
		Homepage.getStartedArray();
		arrayPage.clickArraysUsingList();
		arrayPage.tryHere();
	}
	
	//@Array6
	@Given("The user is on the tryeditor page of Basic Operation in List")
	public void the_user_is_on_the_tryeditor_page_of_basic_operation_in_list() {
		log.info("Navigating to the tryeditor page of Basic Operations in List.");
		Homepage.getStartedArray();
		arrayPage.clickBasicOperationsInLists();
		arrayPage.tryHere();
		log.info("User is now on the tryeditor page of Basic Operations in List.");
	}
	
	//@Array7
	@Given("The user is on the tryeditor page of Application of Array")
	public void the_user_is_on_the_tryeditor_page_of_application_of_array() {
		log.info("Navigating to the tryeditor page of Applications of Array.");
		Homepage.getStartedArray();
		arrayPage.clickApplicationsOfArray();
		arrayPage.tryHere();
		log.info("User is now on the tryeditor page of Applications of Array.");
	}
	
	//@Array8
	@When("the user clicks on the Practice Questions link of Array in python page")
	public void the_user_clicks_on_the_practice_questions_link_of_array_in_python_page() {
		log.info("Clicking on the Practice Questions link on Array in Python page.");
		arrayPage.clickOnPracticeQuestionLink();
	}
	//@Array9
	@Given("the user is on the Array in python page")
	public void the_user_is_on_the_array_in_python_page() {
		log.info("Navigating to the 'Array in Python' page.");
		Homepage.getStartedArray();
        log.info("Clicked on 'Get Started' for the Array section.");
		arrayPage.clickApplicationsOfArray();
		log.info("Navigated to 'Applications of Array' section.");
		arrayPage.clickArrayInPython();
	     log.info("Navigated to 'Array in Python' page successfully.");
	}
	@Then("the user should see list of all Practice Questions in Practice Questions Page")
	public void the_user_should_see_list_of_all_practice_questions_in_practice_questions_page() {
		log.info("Verifying that the user sees a list of all Practice Questions.");
		List<WebElement> questions = arrayPage.getPracticeQuestions();
		Assert.assertFalse(questions.isEmpty(), "Practice Questions are not displayed on the page!");
		log.info("Practice Questions displayed: " + questions.size());
	}
	
	//@Array10
	@Given("The user is on the tryeditor page of  Search The Array question")
	public void the_user_is_on_the_tryeditor_page_of_question() {
		log.info("Navigating to the tryeditor page of 'Search The Array' question.");
		Homepage.getStartedArray();
		arrayPage.clickApplicationsOfArray();
		arrayPage.clickOnPracticeQuestionLink();
		arrayPage.clickOnsearchTheArray();
		log.info("User is now on the tryeditor page of 'Search The Array' question.");
	}

	@When("The user enters code {string} and {int} clicks the Run button")
	public void the_user_enters_code_and_clicks_the_run_button(String Sheetname, Integer RowNumber) {
		log.info("Entering code for Sheet: " + Sheetname + " and Row: " + RowNumber);
		tryEditorArray.enteringCodeForArary(Sheetname, RowNumber);
		log.info("Clicking the Run button.");
		arrayPage.run();
		log.info("Run button pressed");
	}
	
	@Then("The user should see an result for question in console for {string} and {int}")
	public void the_user_should_see_an_result_for_question_in_console_for_and(String Sheetname, Integer RowNumber) throws IOException {
		log.info("Verifying the result for question in console.");
		excelData = ExcelDataReader.DataFromExcel(Sheetname);
		String actualResult =tryEditorArray.actualresultforsearchforarray();
		 log.info("Actual Result: " + actualResult);	
		String expectedResult= excelData.get(RowNumber).get("Result");
		log.info("Expected Result: " + expectedResult);
		Assert.assertEquals(actualResult, expectedResult, "Result not matched");
	}
	
	//@Array11
	@Then("The user should able to see an error message in alert window {string} and {int}")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_and(String Sheetname, Integer RowNumber)throws IOException {
		log.info("Verifying the error message in the alert window.");        
		String actualResult = arrayPage.actualResult(); // Fetch alert text
		log.info("Actual Result: " + actualResult);
		excelData = ExcelDataReader.DataFromExcel(Sheetname);
		String expectedResult = excelData.get(RowNumber).get("Result");
		 log.info("Expected Result: " + expectedResult);
		Assert.assertEquals(actualResult, expectedResult, "Result not matched");
	} 
	
	//@Array12
	@When("The user enters code {string} and {int} clicks the Submit button")
	public void the_user_enters_code_and_clicks_the_submit_button(String Sheetname, Integer RowNumber) {
		log.info("Entering code for Sheet: " + Sheetname + " and Row: " + RowNumber);
		tryEditorArray.enteringCodeForArary(Sheetname, RowNumber);
		log.info("Clicking the Submit button.");
		arrayPage.submit();
		 log.info("Submit button pressed");
	}
	
	@Then("The user should see an output for question in console for {string} and {int}")
	public void the_user_should_see_an_output_for_question_in_console_for_and(String Sheetname, Integer RowNumber) throws IOException {
		log.info("Verifying the output for question in console.");
		excelData = ExcelDataReader.DataFromExcel(Sheetname);
		String actualOutputResult =arrayPage.actualOutputResult();
		log.info("Actual Result: " + actualOutputResult);
		String expectedResult= excelData.get(RowNumber).get("Result");
		log.info("Expected Result: " + expectedResult);
		Assert.assertEquals(actualOutputResult, expectedResult, "Result not matched");
	}
	
	//@Array13
	@Given("The user is on the tryeditor page of  Max Consecutive Ones")
	public void the_user_is_on_the_tryeditor_page_of_max_consecutive_ones() {
		log.info("Navigating to the tryeditor page of Max Consecutive Ones.");
		Homepage.getStartedArray();
		arrayPage.clickApplicationsOfArray();
		arrayPage.clickOnPracticeQuestionLink();
		arrayPage.clickOnMaxConsecutiveOnes();
		log.info("User is now on the tryeditor page of Max Consecutive Ones.");
	}
	
	//@Array14
	@Given("The user is on the tryeditor page of  Find Numbers with Even Number")
	public void the_user_is_on_the_tryeditor_page_of_find_numbers_with_even_number() {
		log.info("Navigating to the tryeditor page of 'Find Numbers with Even Number'.");
		Homepage.getStartedArray();
		arrayPage.clickApplicationsOfArray();
		arrayPage.clickOnPracticeQuestionLink();
		arrayPage.clickOnFindNumbersWithEvenNumber();	
		log.info("User is on the tryeditor page of 'Find Numbers with Even Number'.");
	}

	@Given("The user is on the tryeditor page of  Squares of  a Sorted Array")
	public void the_user_is_on_the_tryeditor_page_of_squares_of_a_sorted_array() {
		log.info("Navigating to the tryeditor page of 'Squares of a Sorted Array'.");
		Homepage.getStartedArray();
		arrayPage.clickApplicationsOfArray();
		arrayPage.clickOnPracticeQuestionLink();
		arrayPage.clickOnSquaresofaSortedArray();
		log.info("User is on the tryeditor page of 'Squares of a Sorted Array'.");
	}
}	