package dsAlgoStepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
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
	TryEditorForArraysPracticeQuestions  tryEditorArray =new TryEditorForArraysPracticeQuestions(driver);
	List<Map<String, String>> excelData;


	//@Array1	
	@When("the user clicks on the GetStarted button of Array section")
	public void the_user_clicks_on_the_get_started_button_of_array_section() {
		Homepage.getStartedArray();
	}
	@Then("the user is navigated to the Array page")
	public void the_user_is_navigated_to_the_array_page() {
		Assert.assertTrue(arrayPage.arrayPageIsDisplayed());
	}
	//@Array2
	@Given("the user is on the Array page")
	public void the_user_is_on_the_array_page() {
		Homepage.getStartedArray();
	}

	@When("the user clicks on the Options {string} and {int} in Array Page")
	public void the_user_clicks_on_the_options_and_in_array_page(String Sheetname, Integer rownumber) {
		arrayPage.ArrayOptions(Sheetname, rownumber);

	}

	@Then("the user should navigated to the Options {string} and {int} in Array page")
	public void the_user_should_navigated_to_the_options_and_in_array_page(String Sheetname, Integer rownumber) {
		arrayPage.ArrayOptions(Sheetname, rownumber);
		try {
			excelData = ExcelDataReader.DataFromExcel(Sheetname);

			String actualurl = driver.getCurrentUrl();
			System.out.println("actualurl: " + actualurl);
			String expectedurl = excelData.get(rownumber).get("expectedurls");
			System.out.println("expectedurl: " + expectedurl);
			Assert.assertEquals(actualurl, expectedurl, "message not matched");

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	//@Array3

	@Given("The user is on the Array Options {string} and {int} page")
	public void the_user_is_on_the_array_options_and_page(String Sheetname, Integer rowNumber) {
		Homepage.getStartedArray();
		arrayPage.ArrayOptions(Sheetname, rowNumber);
	}
	@When("The user clicks on the Try here button on the Array Options page")
	public void the_user_clicks_on_the_try_here_button_on_the_array_options_page() {
		arrayPage.tryHere();
	}

	//	@Array4
	@Given("The user is on the tryeditor page of Array in python")
	public void the_user_is_on_the_tryeditor_page_of_array_in_python() {
		Homepage.getStartedArray();
		arrayPage.clickArrayInPython();
		arrayPage.tryHere();
	}
	@When("The user enters code {string}, {string} and {int} from tryeditor and clicks the Run button")
	public void the_user_enters_code_and_from_tryeditor_and_clicks_the_run_button(String code, String Sheetname, Integer rowNumber) {
		tryEditorPage.enteringCode(Sheetname, rowNumber, code);
		tryEditorPage.runButton();
	}

	//@Array5
	@Given("The user is on the tryeditor page of Array Using List")
	public void the_user_is_on_the_tryeditor_page_of_array_using_list() {
		Homepage.getStartedArray();
		arrayPage.clickArraysUsingList();
		arrayPage.tryHere();
	}
	//@Array6
	@Given("The user is on the tryeditor page of Basic Operation in List")
	public void the_user_is_on_the_tryeditor_page_of_basic_operation_in_list() {
		Homepage.getStartedArray();
		arrayPage.clickBasicOperationsInLists();
		arrayPage.tryHere();
	}
	//@Array7
	@Given("The user is on the tryeditor page of Application of Array")
	public void the_user_is_on_the_tryeditor_page_of_application_of_array() {
		Homepage.getStartedArray();
		arrayPage.clickApplicationsOfArray();
		arrayPage.tryHere();

	}
	//@Array8
	@When("the user clicks on the Practice Questions link of Array in python page")
	public void the_user_clicks_on_the_practice_questions_link_of_array_in_python_page() {
		arrayPage.clickOnPracticeQuestionLink();
	}

	//@Array9
	@Then("the user should see list of all Practice Questions in Practice Questions Page")
	public void the_user_should_see_list_of_all_practice_questions_in_practice_questions_page() {
		List<WebElement> questions = arrayPage.getPracticeQuestions();
		Assert.assertFalse(questions.isEmpty(), "Practice Questions are not displayed on the page!");
		System.out.println("Practice Questions displayed: " + questions.size());
	}
	//@Array10
	@Given("The user is on the tryeditor page of  SearchTheArray question")
	public void the_user_is_on_the_tryeditor_page_of_question() {
		Homepage.getStartedArray();
		arrayPage.clickApplicationsOfArray();
		arrayPage.clickOnPracticeQuestionLink();
		arrayPage.clickOnsearchTheArray();
	}
	
	@When("The user enters code {string} and {int} clicks the Run button")
	public void the_user_enters_code_and_clicks_the_run_button(String Sheetname, Integer RowNumber) {
		tryEditorArray.enteringCodeForArary(Sheetname, RowNumber);
		arrayPage.run();
		System.out.println("Run button pressed");
	}
	@Then("The user should see an result for question in console for {string} and {int}")
	public void the_user_should_see_an_result_for_question_in_console_for_and(String Sheetname, Integer RowNumber) throws IOException {
		excelData = ExcelDataReader.DataFromExcel(Sheetname);
		String actualResult =tryEditorArray.actualresultforsearchforarray();
		System.out.println("Actual Result:"+actualResult);
		String expectedResult= excelData.get(RowNumber).get("Result");
		System.out.println("Expected Result: " + expectedResult);
		Assert.assertEquals(actualResult, expectedResult, "Result not matched");
		}
	//@Array11
	@Then("The user should able to see an error message in alert window {string} and {int}")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_and(String Sheetname, Integer RowNumber)throws IOException {
		        String actualResult = arrayPage.actualResult(); // Fetch alert text
		        System.out.println("Actual Result: " + actualResult);
		        excelData = ExcelDataReader.DataFromExcel(Sheetname);
		        String expectedResult = excelData.get(RowNumber).get("Result");
		        System.out.println("Expected Result: " + expectedResult);
		        Assert.assertEquals(actualResult, expectedResult, "Result not matched");
		    } 
	//@Array12
	@When("The user enters code {string} and {int} clicks the Submit button")
	public void the_user_enters_code_and_clicks_the_submit_button(String Sheetname, Integer RowNumber) {
		tryEditorArray.enteringCodeForArary(Sheetname, RowNumber);
			arrayPage.submit();
		System.out.println("Submitbutton pressed");
	}
	@Then("The user should see an output for question in console for {string} and {int}")
	public void the_user_should_see_an_output_for_question_in_console_for_and(String Sheetname, Integer RowNumber) throws IOException {
		excelData = ExcelDataReader.DataFromExcel(Sheetname);
		String actualOutputResult =arrayPage.actualOutputResult();
		System.out.println("Actual Result:"+actualOutputResult);
		String expectedResult= excelData.get(RowNumber).get("Result");
		System.out.println("Expected Result: "+expectedResult);
		Assert.assertEquals(actualOutputResult, expectedResult, "Result not matched");
	}
	//@Array13
	@Given("The user is on the tryeditor page of  Max Consecutive Ones")
	public void the_user_is_on_the_tryeditor_page_of_max_consecutive_ones() {
		Homepage.getStartedArray();
		arrayPage.clickApplicationsOfArray();
		arrayPage.clickOnPracticeQuestionLink();
		arrayPage.clickOnMaxConsecutiveOnes();
	}



















	@Given("the user is on the Array in python page")
	public void the_user_is_on_the_array_in_python_page() {
		Homepage.getStartedArray();
		arrayPage.clickArrayInPython();
	}



















	@Given("The user is in the {string} page")
	public void the_user_is_in_the_page(String string) {


	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {


	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {


	}

	@Given("The user is on the {string} page")
	public void the_user_is_on_the_page(String string) {


	}

	@When("The user clicks {string} button in Arrays in Python page")
	public void the_user_clicks_button_in_arrays_in_python_page(String string) {


	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {


	}

	@Given("The user is in the tryEditor page")
	public void the_user_is_in_the_try_editor_page() {


	}

	@When("The user clicks the Run Button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {


	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {


	}

	@When("The user write the invalid code in Editor and click the Run Button")
	public void The_user_write_the_invalid_code_in_editor_and_click_the_run_button() {


	}

	@When("The user write the valid code in Editor and click the Run Button")
	public void The_user_write_the_valid_code_in_editor_and_click_the_run_button() {


	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {


	}

	@Given("The user is in the Array in python page")
	public void the_user_is_in_the_array_in_python_page() {


	}

	@When("The user clicks the {string} link from Practice question page")
	public void the_user_clicks_the_link_from_practice_question_page(String string) {


	}

	@Then("The user should be redirected to {string} page contains a question, and try Editor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_page_contains_a_question_and_try_editor_with_run_and_submit_buttons(String string) {


	}

	@Given("The user is on the practice question editor")
	public void the_user_is_on_the_practice_question_editor() {


	}

	@When("The user write the invalid code in Editor and Click the Run Button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {


	}

	@When("The user write the valid code in Editor and Click the Run Button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {


	}

	@When("The user write the invalid code in Editor and Click the Submit Button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_submit_button() {


	}

	@Then("The user see an error message {string}")
	public void the_user_see_an_error_message(String string) {


	}

	@When("The user write the valid code in Editor and Click the Submit Button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_submit_button() {


	}

	@Then("The user see success message {string}")
	public void the_user_see_success_message(String string) {


	}

	@Then("The user should be redirected to {string} page contains a question,and try Editor with Run and Submit buttons")
	public void The_user_should_be_redirected_to_page_contains_a_question_and_try_editor_with_run_and_submit_buttons(String string) {


	}

	@When("The user clicks {string} button in Arrays Using List page")
	public void the_user_clicks_button_in_arrays_using_list_page(String string) {


	}

	@When("The user clicks {string} button in Basic Operations in Lists page")
	public void the_user_clicks_button_in_basic_operations_in_lists_page(String string) {


	}

	@When("The user clicks {string} button in Applications of Array page")
	public void the_user_clicks_button_in_applications_of_array_page(String string) {


	}

}	