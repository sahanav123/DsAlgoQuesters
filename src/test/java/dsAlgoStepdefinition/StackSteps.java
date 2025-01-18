package dsAlgoStepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.HomePage;
import dsAlgoPages.StackPage;
import dsAlgoUtils.ConfigReader;
import dsAlgoUtils.ExcelDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackSteps {

	WebDriver driver = DriverFactory.getdriver();
	HomePage HomePage = new HomePage(driver);
	Properties prop = ConfigReader.initializeprop();
	StackPage StackPage = new StackPage(driver);
	List<Map<String, String>> excelData;

//TC1--------------------------	
	@When("the user clicks on the GetStarted button of Stack section")
	public void the_user_clicks_on_the_GetStarted_button_of_Stack_section() {
		HomePage.getStartedStack();

	}

	@Then("the user is navigated to the Stack page")
	public void the_user_is_navigated_to_the_Graph_page() {

		String expectedurl = prop.getProperty("stackurl");
		System.out.println("expected url is: " + expectedurl);
		String actualurl = driver.getCurrentUrl();
		System.out.println("actualurl is: " + actualurl);
		Assert.assertEquals(actualurl, expectedurl, "URL not matched");

	}

//TC2----------------------------
	@Given("the user is on the Stack page")
	public void the_user_is_on_the_stack_page() {
		HomePage.getStartedStack();

	}

	@When("the user clicks on the Options {string} and {int} in Stack Page")
	public void the_user_clicks_on_the_options_in_stack_page(String Sheetname, int rownumber) {
		StackPage.stackOptions(Sheetname, rownumber);

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
	}

//TC3-----------------------------------------------
	@Given("The user is on the Stack Options {string} and {int} page")
	public void the_user_is_on_the_stack_options_and_page(String Sheetname, int rownumber) {
		HomePage.getStartedStack();
		StackPage.stackOptions(Sheetname, rownumber);

	}

	@When("The user clicks on the Try here button on the Stack Options page")
	public void the_user_clicks_on_the_try_here_button_on_the_stack_options_page() {
		StackPage.tryHere();

	}

	@Then("The user should navigate to the tryeditor page")
	public void the_user_should_navigate_to_the_tryeditor_page() {

		String actualurl = driver.getCurrentUrl();
		System.out.println("actualurl: " + actualurl);
		String expectedurl = prop.getProperty("tryeditorurl");
		System.out.println("expectedurl: " + expectedurl);
		Assert.assertEquals(actualurl, expectedurl, "message not matched");

	}

//TC4-----------------------------------------------
	@Given("The user is on the tryeditor page of Operations in Stack")
	public void the_user_is_on_the_tryeditor_page_of_operations_in_stack() {

		HomePage.getStartedStack();
		StackPage.operationsinstack();
		StackPage.tryHere();

	}

//TC5------------------------------------------------------
	@Given("The user is on the tryeditor page of Implementation")
	public void the_user_is_on_the_tryeditor_page_of_Implementation() {

		HomePage.getStartedStack();
		StackPage.implementation();
		StackPage.tryHere();

	}

//TC6------------------------------------------------------
	@Given("The user is on the tryeditor page of Applications")
	public void the_user_is_on_the_tryeditor_page_of_applications() {
		HomePage.getStartedStack();
		StackPage.applications();
		StackPage.tryHere();

	}

//TC7----------------------------------------------------
	@Given("The user is navigates to three Options {string} and {int} of stack page")
	public void the_user_is_navigates_to_three_options_and_of_stack_page(String Sheetname, int rownumber) {

		HomePage.getStartedStack();
		StackPage.stackOptions(Sheetname, rownumber);

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
	}

//------------------------------------------------------
	@Given("The user is on the tryeditor page of three Options {string} and {int} of stack page")
	public void the_user_is_on_the_tryeditor_page_of_three_options_and_of_stack_page(String Sheetname, int rownumber)
			 {
		HomePage.getStartedStack();
		StackPage.stackOptions(Sheetname, rownumber);
		StackPage.tryHere();

	}

}