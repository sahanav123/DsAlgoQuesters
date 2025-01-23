package dsAlgoStepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.HomePage;
import dsAlgoPages.StackPage;
import dsAlgoUtils.ExcelDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackSteps {

	WebDriver driver = DriverFactory.getdriver();
	HomePage HomePage = new HomePage(driver);
	StackPage StackPage = new StackPage(driver);
	List<Map<String, String>> excelData;
	Logger log = LogManager.getLogger(StackSteps.class);

//TC1--------------------------	
	@When("the user clicks on the GetStarted button of Stack section")
	public void the_user_clicks_on_the_GetStarted_button_of_Stack_section() {
		HomePage.getStartedStack();
		log.info("clicking on the getstarted of stack");
	}

	@Then("the user is navigated to the Stack page")
	public void the_user_is_navigated_to_the_Graph_page() {

		Assert.assertTrue(StackPage.textconfirmforstack());
		log.info("confirming text forstack navigation");

	}

//TC2----------------------------
	@Given("the user is on the Stack page")
	public void the_user_is_on_the_stack_page() {
		HomePage.getStartedStack();
		log.info("clicking on the getstarted of stack");

	}

	@When("the user clicks on the Options {string} and {int} in Stack Page")
	public void the_user_clicks_on_the_options_in_stack_page(String Sheetname, int rownumber) {
		StackPage.stackOptions(Sheetname, rownumber);
		log.info("clicks on the options of stack");

	}

	@Then("the user should navigated to the Options {string} and {int} in Stack page")
	public void the_user_should_navigated_to_the_options_in_stack_page(String Sheetname, int rownumber) {
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
		log.info("Navigated to the options of stack");
	}

//TC3-----------------------------------------------
	@Given("The user is on the Stack Options {string} and {int} page")
	public void the_user_is_on_the_stack_options_and_page(String Sheetname, int rownumber) {
		HomePage.getStartedStack();
		log.info("clicking on the getstarted of stack");
		StackPage.stackOptions(Sheetname, rownumber);
		log.info("clicking on the Stack options");

	}

	@When("The user clicks on the Try here button on the Stack Options page")
	public void the_user_clicks_on_the_try_here_button_on_the_stack_options_page() {
		StackPage.tryHere();
		log.info("clicking on the tryhere button");

	}

	@Then("The user should navigate to the tryeditor page")
	public void the_user_should_navigate_to_the_tryeditor_page() {
		Assert.assertTrue(StackPage.textconfirmfortryeditor());
		log.info("confirming text tryeditor page");

	}

//TC4-----------------------------------------------
	@Given("The user is on the tryeditor page of Operations in Stack")
	public void the_user_is_on_the_tryeditor_page_of_operations_in_stack() {

		HomePage.getStartedStack();
		log.info("clicking on the getstarted of stack");
		StackPage.operationsinstack();
		log.info("clicking on the operationsinstack of stack");
		StackPage.tryHere();
		log.info("clicking on the tryhere button");

	}

//TC5------------------------------------------------------
	@Given("The user is on the tryeditor page of Implementation")
	public void the_user_is_on_the_tryeditor_page_of_Implementation() {

		HomePage.getStartedStack();
		log.info("clicking on the getstarted of stack");
		StackPage.implementation();
		log.info("clicking on the implementation of stack");
		StackPage.tryHere();
		log.info("clicking on the tryhere button");

	}

//TC6------------------------------------------------------
	@Given("The user is on the tryeditor page of Applications")
	public void the_user_is_on_the_tryeditor_page_of_applications() {
		HomePage.getStartedStack();
		log.info("clicking on the getstarted of stack");
		StackPage.applications();
		log.info("clicking on the applications of stack");

		StackPage.tryHere();
		log.info("clicking on the tryhere button");

	}

//TC7----------------------------------------------------
	@Given("The user is navigates to three Options {string} and {int} of stack page")
	public void the_user_is_navigates_to_three_options_and_of_stack_page(String Sheetname, int rownumber) {

		HomePage.getStartedStack();
		log.info("clicking on the getstarted of stack");
		StackPage.stackOptions(Sheetname, rownumber);
		log.info("clicking on the Stack options");

	}

	@Then("the user should navigated to the Practice Questions page of three options {string} and {int} in Stack page")
	public void the_user_should_navigated_to_the_practice_questions_page_of_three_options_and_in_stack_page(
			String Sheetname, int rownumber) {
		try {
			excelData = ExcelDataReader.DataFromExcel(Sheetname);

			String actualurl = driver.getCurrentUrl();
			System.out.println("actualurl: " + actualurl);
			String expectedurl = excelData.get(rownumber).get("Practicequestionsurl");
			System.out.println("expectedurl: " + expectedurl);
			Assert.assertEquals(actualurl, expectedurl, "message not matched");

		} catch (IOException e) {

			e.printStackTrace();
		}
		log.info("Navigating to the practice questions page");
	}

//------------------------------------------------------
	@Given("The user is on the tryeditor page of three Options {string} and {int} of stack page")
	public void the_user_is_on_the_tryeditor_page_of_three_options_and_of_stack_page(String Sheetname, int rownumber) {
		HomePage.getStartedStack();
		log.info("clicking on the getstarted of stack");
		StackPage.stackOptions(Sheetname, rownumber);
		log.info("clicking on the Stack options");
		StackPage.tryHere();
		log.info("clicking on the tryhere button");

	}

}