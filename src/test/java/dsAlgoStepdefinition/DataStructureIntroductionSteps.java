package dsAlgoStepdefinition;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.GraphPage;
import dsAlgoPages.*;
import dsAlgoPages.TryEditorPage;
import dsAlgoUtils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructureIntroductionSteps {

	WebDriver driver = DriverFactory.getdriver();
	HomePage HomePage = new HomePage(driver);
	Properties prop = ConfigReader.initializeprop();
	DataStructureIntroductionPage DataStructure = new DataStructureIntroductionPage(driver);

	GraphPage GraphPage = new GraphPage(driver);
	TryEditorPage TryEditorPage = new TryEditorPage(driver);
	
	@When("the user clicks on the GetStarted button of DataStructure section")
	public void the_user_clicks_on_the_get_started_button_of_data_structure_section() {
		HomePage.getStartedDataStructureIntroduction();
	    
	}
	@Then("the user is navigated to the DataStructure page")
	public void the_user_is_navigated_to_the_data_structure_page() {
		Assert.assertTrue(DataStructure.textconfirmfordatastructure());
	    
	}
	
}