package dsAlgoStepdefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.DataStructureIntroductionPage;

import dsAlgoPages.HomePage;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.*;
import dsAlgoUtils.ConfigReader;
import dsAlgoUtils.ExcelReader;

public class DataStructureIntroductionSteps {

	WebDriver driver = DriverFactory.getdriver();
	HomePage Hg = new HomePage(driver);
	Properties prop = ConfigReader.initializeprop();
	DataStructureIntroductionPage Dg = new DataStructureIntroductionPage(driver);
	
	


//TC01
	@When("The user clicks on Get Started  button in DataStructure Panel")
	public void the_user_clicks_on_button_in_data_structure_panel() {

		Hg.GetStartedDataStructureIntroduction();

	}

	@Then("The user be directed to Data-Structure Introduction Page")
	public void the_user_be_directed_to_introduction_page() throws InterruptedException {
		Thread.sleep(7000);

		Dg.isTextDisplayedInDataStructurePage();

	}

//TC02
	@Given("The user is in the Data structures- Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {
		Hg.GetStartedDataStructureIntroduction();
	}

	@When("The user clicks on  {string} link")
	public void the_user_clicks_on_link(String string) {

		Dg.ClickTimeComplexityLink();

	}

	@Then("The user should be directed to Time Complexity Page")
	public void the_user_should_be_directed_to_time_complexity_page() throws InterruptedException {
		Thread.sleep(8000);

		Dg.isTextDisplayedInTimeComplexityPage();

	}
//TC03
	
	@Given("The user is on the Time Complexity page")
	public void the_user_is_on_the_time_complexity_page() {
		Hg.GetStartedDataStructureIntroduction();
		Dg.ClickTimeComplexityLink();
		Dg.isTextDisplayedInTimeComplexityPage();
	    
	}
	@When("The user clicks {string} button in Time Complexity  page")
	public void the_user_clicks_button_in_time_complexity_page(String string) {
		
		Dg.ClickTryHereButton();
	    
	}
	//TC06
	@Given("The user is in the tryEditor page of Time Complexity Page")
	public void The_user_is_in_the_try_Editor_page_of_Time_Complexity_Page() {
		
		Hg.GetStartedDataStructureIntroduction();
		Dg.ClickTimeComplexityLink();
		Dg.isTextDisplayedInTimeComplexityPage();
		Dg.ClickTryHereButton();
		Dg.click_tryEditor();
	  
	}
	@When("The user write the valid code <RowNumber> from sheetname {string} in Editor and click the Run Button")
	public void the_user_write_the_valid_code_row_number_from_sheetname_in_editor_and_click_the_run_button(String string) throws InvalidFormatException, IOException, OpenXML4JException {
		ExcelReader er =new ExcelReader();
	    List<Map<String, String>> data = er.getData("src/main/resources/DSAlgoExcelsheets/ScenarioData.xlsx", "Valid");
	    int rowNumber = 0;
	    String validcode=data.get(rowNumber).get("valid_data");
	    if (validcode != null && !validcode.isEmpty()) {
	        Dg.enter_input(validcode); // Input valid code in the editor
	        Dg.click_run(); // Click the Run button
	    } else {
	        System.out.println("No valid code found in the provided Excel sheet.");
	    }
	}
	@Then("The user should able to see output <RowNumber> in the console")
	public void the_user_should_able_to_see_output_row_number_in_the_console() {
	    
	}
}


