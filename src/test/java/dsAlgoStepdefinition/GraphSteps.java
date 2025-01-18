package dsAlgoStepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.*;
import dsAlgoPages.HomePage;
import dsAlgoUtils.ConfigReader;
import dsAlgoUtils.ExcelDataReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphSteps {

	WebDriver driver = DriverFactory.getdriver();
	HomePage HomePage = new HomePage(driver);
	Properties prop = ConfigReader.initializeprop();

	GraphPage GraphPage = new GraphPage(driver);
	TryEditorPage TryEditorPage = new TryEditorPage(driver);

	List<Map<String, String>> excelData;

	@Given("The user is on the DSAlgo homepage after sign")
	public void the_user_is_on_the_DSAlgo_home_page() {
		driver.getCurrentUrl();

	}

	@When("the user clicks on the GetStarted button of Graph section")
	public void the_user_clicks_on_the_GetStarted_button_of_Graph_section() {
		HomePage.getStartedofGraph();

	}

	@Then("the user is navigated to the Graph page")
	public void the_user_is_navigated_to_the_Graph_page() {

		String expectedurl = prop.getProperty("Graphurl");
		System.out.println("expected url is: " + expectedurl);
		String actualurl = driver.getCurrentUrl();
		System.out.println("actualurl is: " + actualurl);
		Assert.assertEquals(actualurl, expectedurl, "URL not matched");

	}

	@Given("the user is on the Graph page")
	public void the_user_is_on_the_graph_page() {
		HomePage.getStartedofGraph();

	}

	@When("the user clicks on the Graphmodule link")
	public void the_user_clicks_on_the_graph_link() {

		GraphPage.clickgraphpagegraphoption();
	}

	@Then("the user should navigated to the Graphmodule page")
	public void the_user_should_navigated_to_the_graphmodule_page() {

		String expectedurl = GraphPage.garpModuleUrl();
		System.out.println("expected url is: " + expectedurl);
		String actualurl = GraphPage.actualUrl();
		System.out.println("actualurl is: " + actualurl);
		Assert.assertEquals(actualurl, expectedurl, "URL not matched");

	}

	@Given("the user is on the Graphmodule page")
	public void the_user_is_on_the_page() {
		HomePage.getStartedofGraph();
		GraphPage.clickgraphpagegraphoption();

	}

	@When("the user clicks on the Graph Representations link")
	public void the_user_clicks_on_the_graph_representations_link() {
		GraphPage.Graphrepresentation();
	}

	@Then("the user should navigated to the Graph Representations page")
	public void the_user_should_navigated_to_the_graph_representations_page() {
		String expectedurl = GraphPage.grapRepresentationUrl();
		System.out.println("expected url is: " + expectedurl);
		String actualurl = GraphPage.actualUrl();
		System.out.println("actualurl is: " + actualurl);
		Assert.assertEquals(actualurl, expectedurl, "URL not matched");
	}

	@When("the user click on Try here button in Graph Page")
	public void the_user_click_on_try_here_button_in_graph_page() {
		GraphPage.clickgraphpagegraphoption();
		GraphPage.tryherebutton();

	}

	@Then("the user should navigate to the tryeditor page")
	public void the_user_should_navigate_to_the_tryeditor_page() {
		String expectedurl = GraphPage.tryEditorUrl();
		String actualurl = GraphPage.actualUrl();
		Assert.assertEquals(actualurl, expectedurl, "URL not matched");

	}

	@Given("the user is on the Graph Representation page")
	public void the_user_is_on_the_graph_representation_page() {
		HomePage.getStartedofGraph();
		GraphPage.clickgraphpagegraphoption();

	}

	@When("the user click on Try here button in Graph Representation Page")
	public void the_user_click_on_try_here_button_in_graph_representation_page() {
		GraphPage.Graphrepresentation();
		GraphPage.tryherebutton();

	}

	@When("the user clicks on the Practice Questions link")
	public void the_user_clicks_on_the_practice_questions_link_in_graph_page() {

		GraphPage.clickpracticequestions();

	}

	@Then("the user should navigated to the Practice Questions page")
	public void the_user_should_navigated_to_the_practice_questions_page() {
		String expectedurl = prop.getProperty("practicequestions");
		String actualurl = driver.getCurrentUrl();
		System.out.println("actualurl is: " + actualurl);
		Assert.assertEquals(actualurl, expectedurl, "URL not matched");

	}

	@Then("the user should see list of Practice Questions in Practice Questions Page")
	public void the_user_should_see_list_of_Practice_Questions_in_Practice_Questions_Page() {
		Assert.fail();

	}

	@Given("The user is on the tryeditor page of Graph module")
	public void the_user_is_on_the_tryeditor_page() {
		HomePage.getStartedofGraph();
		GraphPage.clickgraphpagegraphoption();

		GraphPage.tryherebutton();

	}

//	@When("The user enters Valid code {string} and {int} clicks the Run button")
//	public void the_user_enters_Valid_code_clicks_the_run_button(String Sheetname, int rowNumber) throws IOException {
//
//		GraphPage.enteringcode(Sheetname, rowNumber);
//	}
//
//	@Then("The user should see the output in the outputfiled under the Run option")
//	public void the_user_should_see_the_output_in_the_output_under_the_run_option() throws IOException {
//
//		String actualm = GraphPage.validOutput();
//		String expm = GraphPage.validExpected("tryEditor", 1);
//		Assert.assertEquals(actualm, expm, "message not matched");
//
//	}

	@When("The user enters Valid and Invalid code {string} and {int} clicks the Run button")
	public void the_user_enters_Invalid_code_clicks_the_run_button(String Sheetname, int rowNumber) {

		TryEditorPage.enteringcode(Sheetname, rowNumber);
		TryEditorPage.runButton();
	}

	@Then("The user should see an codeoutput for validcode and alert message for invalidcode {string} and {int}")
	public void the_user_should_see_an_expected_output(String Sheetname, int rowNumber) {

		try {
			excelData = ExcelDataReader.DataFromExcel(Sheetname);

			String actualerror = TryEditorPage.output();
			System.out.println("stepactualerror:" + actualerror);

			String expectederror = excelData.get(rowNumber).get("expectedResult");

			System.out.println("stepexpectederror: " + expectederror);
			Assert.assertEquals(actualerror, expectederror, "message not matched");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Given("The user is on the tryeditor page of Graph Representation")
	public void the_user_is_on_the_tryeditor_page_Graph_Representattion() {
		HomePage.getStartedofGraph();
		GraphPage.Graphrepresentation();

		GraphPage.tryherebutton();

	}

	@When("the user clicks the Run button")
	public void the_user_clicks_the_Run_button() {
		GraphPage.run();

	}

	@Then("the user should see an error message")
	public void the_user_should_see_an_error_message() {
		Assert.fail();

	}

	@When("the user clicks on the options under {string} and {int} dataStructure after signin")
	public void the_user_clicks_on_the_options_under_and_row_number_data_structure_after_signin(String Sheetname,
			int rowNumber) {
		HomePage.getStartedofGraph();
		HomePage.clickDataStructuresDropDown();
		GraphPage.dataStructureDropDownOptionsClick(Sheetname, rowNumber);

	}

	@Then("The user should be navigated to the options page after sign {string} and {int}")
	public void the_user_should_be_navigated_to_the_options_page_after_sign_and_row_number(String Sheetname,
			int rowNumber) {
		try {
			excelData = ExcelDataReader.DataFromExcel(Sheetname);

			String actualurl = driver.getCurrentUrl();
			System.out.println("actualurl: " + actualurl);
			String expectedurl = excelData.get(rowNumber).get("expectedurl");
			System.out.println("expectedurl: " + expectedurl);
			Assert.assertEquals(actualurl, expectedurl, "message not matched");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}