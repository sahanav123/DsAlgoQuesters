package dsAlgoStepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.GraphPage;
import dsAlgoPages.HomePage;
import dsAlgoPages.TryEditorPage;
import dsAlgoUtils.ExcelDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphSteps {

	WebDriver driver = DriverFactory.getdriver();
	HomePage HomePage = new HomePage(driver);
	GraphPage GraphPage = new GraphPage(driver);
	TryEditorPage TryEditorPage = new TryEditorPage(driver);
	Logger log = LogManager.getLogger(GraphSteps.class);

	List<Map<String, String>> excelData;

	@When("the user clicks on the GetStarted button of Graph section")
	public void the_user_clicks_on_the_GetStarted_button_of_Graph_section() {
		HomePage.getStartedofGraph();
		log.info("User clicks on the 'Get Started' button in the Graph section.");

	}

	@Then("the user is navigated to the Graph page")
	public void the_user_is_navigated_to_the_Graph_page() {

		Assert.assertTrue(GraphPage.textconfirmforgraph());
		log.info("Confirming that the user is navigated to the Graph page by validating the page text.");

	}

	@Given("the user is on the Graph page")
	public void the_user_is_on_the_graph_page() {
		HomePage.getStartedofGraph();
		log.info("User clicks on the 'Get Started' button in the Graph section to navigate to the Graph page.");

	}

	@When("the user clicks on the Graphmodule link")
	public void the_user_clicks_on_the_graph_link() {

		GraphPage.clickgraphpagegraphoption();
		log.info("User clicks on the 'Graph' option link in the Graph page.");
	}

	@Then("the user should navigated to the Graphmodule page")
	public void the_user_should_navigated_to_the_graphmodule_page() {

		Assert.assertTrue(GraphPage.textconfirmforgraphmodule());
		log.info("Confirming that the user is navigated to the Graph module page by validating the page text.");

	}

	@Given("the user is on the Graphmodule page")
	public void the_user_is_on_the_page() {
		HomePage.getStartedofGraph();
		log.info("Clicking on getstarted of graph");
		GraphPage.clickgraphpagegraphoption();
		log.info("Clicking on graphoption of graphPage");

	}

	@When("the user clicks on the Graph Representations link")
	public void the_user_clicks_on_the_graph_representations_link() {
		GraphPage.Graphrepresentation();
		log.info("Clicking on graphorepresentation option");
	}

	@Then("the user should navigated to the Graph Representations page")
	public void the_user_should_navigated_to_the_graph_representations_page() {
		Assert.assertTrue(GraphPage.textconfirmforgraphrepresentation());
		log.info("Confirming graphrepresentation text");
	}

	@When("the user click on Try here button in Graph Page")
	public void the_user_click_on_try_here_button_in_graph_page() {
		GraphPage.clickgraphpagegraphoption();
		log.info("Clicking on graphoption of graphPage");
		GraphPage.tryherebutton();
		log.info("Clicking on tryhere button of graphPage");

	}

	@Then("the user should navigate to the tryeditor page")
	public void the_user_should_navigate_to_the_tryeditor_page() {
		Assert.assertTrue(GraphPage.textconfirmfortryeditor());
		log.info("Confirming tryeditor text");
	}

	@Given("the user is on the Graph Representation page")
	public void the_user_is_on_the_graph_representation_page() {
		HomePage.getStartedofGraph();
		log.info("Clicking on getstarted of graph");
	    GraphPage.clickgraphpagegraphoption();

	}

	@When("the user click on Try here button in Graph Representation Page")
	public void the_user_click_on_try_here_button_in_graph_representation_page() {
		GraphPage.Graphrepresentation();
		log.info("Clicking on Graphrepresentation of graphPage");
		GraphPage.tryherebutton();
		log.info("Clicking on tryhere button of graphRepresentationPage");
	}

	@When("the user clicks on the Practice Questions link")
	public void the_user_clicks_on_the_practice_questions_link_in_graph_page() {

		GraphPage.clickpracticequestions();
		log.info("Clicking on practicequestions");

	}

	@Then("the user should navigated to the Practice Questions page")
	public void the_user_should_navigated_to_the_practice_questions_page() {
		Assert.assertTrue(GraphPage.textconfirmpracticequestion());
		log.info("Confirming practicequestions text");
	}

	@Then("the user should see list of Practice Questions in Practice Questions Page")
	public void the_user_should_see_list_of_Practice_Questions_in_Practice_Questions_Page() {
		Assert.fail();
		log.error("did not find practice questions");

	}

	@Given("The user is on the tryeditor page of Graph module")
	public void the_user_is_on_the_tryeditor_page() {
		HomePage.getStartedofGraph();
		log.info("Clicking on getstarted of graph");
		GraphPage.clickgraphpagegraphoption();
		log.info("Clicking on graphoption of graphPage");

		GraphPage.tryherebutton();
		log.info("Clicking on tryhere button of graphPage");

	}

	@When("The user enters code {string}, {string} and {int} clicks the Run button")
	public void the_user_enters_Invalid_code_clicks_the_run_button(String code, String Sheetname, int rowNumber) {

		TryEditorPage.enteringCode(Sheetname, rowNumber, code);
		log.info("entering the invalid code");
		TryEditorPage.runButton();
		log.info("clicking on run button");
	}

	@Then("The user should see an result {string}, {string} and {int}")
	public void the_user_should_see_an_expected_output(String expectedresult, String Sheetname, int rowNumber) {
		String actualerror = TryEditorPage.output();
		String expectederror = TryEditorPage.expected(expectedresult, Sheetname, rowNumber);
		Assert.assertEquals(actualerror, expectederror, "message not matched");
		log.info("validating the expected output of tryeditoorpage for valid and invalid python code");

	}

	@Given("The user is on the tryeditor page of Graph Representation")
	public void the_user_is_on_the_tryeditor_page_Graph_Representattion() {
		HomePage.getStartedofGraph();
		log.info("Clicking on getstarted of graph");
		GraphPage.Graphrepresentation();
		log.info("Clicking on Graphrepresentation of graphPage");

		GraphPage.tryherebutton();
		log.info("Clicking on tryhere button of graphPage");

	}

	@When("the user clicks the Run button")
	public void the_user_clicks_the_Run_button() {
		GraphPage.run();
		log.info("clicking on run button");

	}

	@Then("the user should see an error message")
	public void the_user_should_see_an_error_message() {
		Assert.fail();
		log.error("did not find any error message");

	}

	@When("the user clicks on the options under {string} and {int} dataStructure after signin")
	public void the_user_clicks_on_the_options_under_and_row_number_data_structure_after_signin(String Sheetname,
			int rowNumber) {
		HomePage.getStartedofGraph();
		log.info("Clicking on getstarted of graph");
		HomePage.clickDataStructuresDropDown();
		log.info("Clicking on DataStructure DropDown");
		GraphPage.dataStructureDropDownOptionsClick(Sheetname, rowNumber);
		log.info("Clicking on options under DataStructure Dropdown");

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
		log.info("validating the DataStructure DropDown options navigation");

	}
}