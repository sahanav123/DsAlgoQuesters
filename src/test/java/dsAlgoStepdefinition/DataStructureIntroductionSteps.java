package dsAlgoStepdefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.DataStructureIntroductionPage;
import dsAlgoPages.GraphPage;
import dsAlgoPages.HomePage;
import dsAlgoPages.SigninPage;
import dsAlgoPages.TryEditorPage;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.*;
import dsAlgoUtils.ConfigReader;
import dsAlgoUtils.ExcelDataReader;

public class DataStructureIntroductionSteps {

	WebDriver driver = DriverFactory.getdriver();
	HomePage Hg = new HomePage(driver);
	Properties prop = ConfigReader.initializeprop();
	DataStructureIntroductionPage Dg = new DataStructureIntroductionPage(driver);
	SigninPage Sg = new SigninPage(driver);
	TryEditorPage TryEditorPage = new TryEditorPage(driver);
	Logger log = LogManager.getLogger(HomeSteps.class);

//TC01
	@When("The user clicks on GetStarted  button in DataStructure Panel")
	public void the_user_clicks_on_Get_Started_button_in_Data_structure_Panel() {
		Hg.getStartedDataStructureIntroduction();
		log.info("Clicking on get started button of Data Structure introduction");
	}

	@Then("The user be directed to Data-Structure Introduction Page")
	public void the_user_be_directed_to_data_structure_introduction_Page() {
		Dg.isTextDisplayedInDataStructurePage();
		log.info("Confirming on Text in DataStructure Page");
	}

//TC02
	@Given("The user is in the Data structures- Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {
		Hg.getStartedDataStructureIntroduction();
		log.info("Clicking on get started button of Data Structure introduction");
	}

	@When("The user clicks on  {string} link")
	public void the_user_clicks_on_link(String string) {
		Dg.ClickTimeComplexityLink();
		log.info("Clicking on TimeComplexity link");
	}

	@Then("The user should be directed to Time Complexity Page")
	public void the_user_should_be_directed_to_time_complexity_page() {
		Dg.isTextDisplayedInTimeComplexityPage();
		log.info("Confirming on Text in TimeComplexity Page");
	}

//TC03
	@Given("The user is on the Time Complexity page")
	public void the_user_is_on_the_Time_Complexity_page() {
		Hg.getStartedDataStructureIntroduction();
		log.info("Clicking on get started button of Data Structure introduction");
		Dg.ClickTimeComplexityLink();
		log.info("Clicking on TimeComplexity link");
		Dg.isTextDisplayedInTimeComplexityPage();
		log.info("Confirming on Text in TimeComplexity Page");
	}

	@When("The user clicks {string} button in Time Complexity  page")
	public void the_user_clicks_button_in_time_complexity_page(String string) {
		Dg.ClickTryHereButton();
		log.info("Clicking on TryHere Button ");
	}
	
	@Then("The user Should be redirected to a page having an try Editor with a Run button to Test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		
		Dg.textconfirmfortryeditor();
	}

//TC04
	@Given("The user is on the tryeditor page of Datastructure module")
	public void The_user_is_on_the_tryeditor_page_of_Datastructure_module() {
		Hg.getStartedDataStructureIntroduction();
		log.info("Clicking on get started button of Data Structure introduction");
		Dg.ClickTimeComplexityLink();
		log.info("Clicking on TimeComplexity link");
		Dg.ClickTryHereButton();
		log.info("Clicking on TryHere Button");
	}

//TC05
	@Given("The user is in the TryEditor page of TimeComplexity module")
	public void the_user_is_in_the_try_editor_page_of_time_complexity_module() {
		Hg.getStartedDataStructureIntroduction();
		log.info("Clicking on get started button of Data Structure introduction");
		Dg.ClickTimeComplexityLink();
		log.info("Clicking on TimeComplexity link");
		Dg.ClickTryHereButton();
		log.info("Clicking on TryHere Button");
	}

	@When("The user clicks the Run Button without entering the code in the Editor of TimeComplexity module")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_of_time_complexity_module() {
		Dg.click_run();
		log.info("Clicking on Run Button");
	}

	@Then("The user should able to see an error message in alert window of TimeComplexity module")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_of_time_complexity_module() {
		Assert.fail();
		log.error("Not seeing an error");
	}

//TC06
	@Given("The user is in the Time Complexity  in DataStructure page")
	public void The_user_is_in_the_Time_Complexity_in_DataStructure_page() {
		Hg.getStartedDataStructureIntroduction();
		log.info("Clicking on get started button of Data Structure introduction");
		Dg.ClickTimeComplexityLink();
		log.info("Clicking on TimeComplexity link");
	}

//TC07
	@When("the user clicks on the Practice Questions link of TimeComplexity module")
	public void the_user_clicks_on_the_practice_questions_link_of_Time_Complexity_module() {
		Dg.clickpracticequestions();
		log.info("Clicking on practice questions");
	}

	@Then("the user should navigated to the Practice Questions page of TimeComplexity module")
	public void the_user_should_navigated_to_the_practice_questions_page_of_Time_Complexity_module() {
		Assert.assertTrue(Dg.textconfirmpracticequestion());
		log.info("Confirming on Text Confirming practice questions");
	}

//TC08
	@Then("the user should see list of Practice Questions in Practice Questions Page of TimeComplexity module")
	public void the_user_should_see_list_of_Practice_Questions_in_Practice_Questions_Page_of_TimeComplexity_module() {
		Assert.fail();
		log.error("Not finding any practice questions");
	}

}