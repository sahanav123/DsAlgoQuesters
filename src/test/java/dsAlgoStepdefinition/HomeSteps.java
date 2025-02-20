package dsAlgoStepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.HomePage;
import dsAlgoPages.RegisterPage;
import dsAlgoPages.SigninPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {
	
	WebDriver driver = DriverFactory.getdriver();
    HomePage HomePage = new HomePage(driver);
    RegisterPage RegisterPage = new RegisterPage(driver);
	SigninPage LoginPage = new SigninPage(driver);
	Logger log = LogManager.getLogger(HomeSteps.class);

	@Given("Empty browser open")
	public void empty_browser_open() {
		WebDriver driver = DriverFactory.getdriver();
		log.info("Launching the empty browser");

	}

	@When("The user enters the DsAlgo Url")
	public void the_user_enters_the_Ds_algo_url() {

		HomePage.url();
		log.info("Entering the Homepage url");

	}

	@Then("the user should able to land on DsAlgo portal")
	public void the_user_should_able_to_land_on_ds_algo_portal() {

		Assert.assertTrue(HomePage.textLaunchPageGetstartedbutton());
		log.info("Confirming launchpage text");

	}

	@Given("the user navigates to the DsAlgo portal")
	public void the_user_enters_the_ds_algo_url() {
		HomePage.url();
		log.info("Entering the Dsalgo portal url");

	}

	@When("The user click on Getstarted button")
	public void the_user_click_on_getstarted_button() {

		HomePage.clickLaunchPageGetstartedbutton();
		log.info("Clicking on launch page Getstarted button");
	}

	@Then("the user navigates to DSAlgo home page")
	public void the_user_navigates_to_ds_algo_home_page_and_verifies_whether_the_home_page_is_displayed() {

		Assert.assertTrue(HomePage.textdisplayinhomepage());
		log.info("Confirming homepage text display");

	}

	@Given("the user is on the DSAlgo homepage")
	public void the_user_is_on_the_ds_algo_homepage() {
		HomePage.clickLaunchPageGetstartedbutton();
		log.info("Clicking on launch page Getstarted button");

	}

	@When("The user clicks on the Register button")
	public void the_user_clicks_on_the_Register_button() {

		HomePage.clickRegister();
		log.info("Clicking on Register button");

	}

	@Then("the user should be navigated to the Register page")
	public void the_user_should_be_navigated_to_the_register_page() {

		Assert.assertTrue(RegisterPage.textConfirmforRegister());
		log.info("Confirming Signin text");

	}

	@When("The user clicks on the signin button")
	public void the_user_clicks_on_the_signin_button() {
		HomePage.clickSignin();
		log.info("Clicking on Signin button");

	}

	@Then("the user should be navigated to the signin page")
	public void the_user_should_be_navigated_to_the_signin_page() {
		
		Assert.assertTrue(LoginPage.textConfirmforRegister());
		log.info("Confirming Register text display");
	}

	@When("the user clicks on the Data Structure button")
	public void the_user_clicks_on_the_Data_Structure_button() {

		HomePage.clickDataStructuresDropDown();
		log.info("Clicking on DataStructure dropdown button");

	}

	@Then("the user should see six options: {string},{string},{string},{string},{string}, and {string} under the Data Structure dropdown")
	public void the_user_should_see_six_options_and_under_the_data_structure_dropdown(String string, String string2,
			String string3, String string4, String string5, String string6) {
		HomePage.dataStructureDropDownList(string, string2, string3, string4, string5, string6);
		log.info("Should see six options under Data Structure Dropdown");
	}

	@When("the user clicks on the GetStarted button under {string}")
	public void the_user_clicks_on_the_get_started_button_under(String Section) {

		HomePage.clickonGetstartedofOptions(Section);
		log.info("Clicking on Getstarted button of all the options in home page");
		
	}

	@Then("the user should see an error message stating {string}")
	public void the_user_should_see_an_error_message_stating(String expectedMessage) {

		String actualmessage = HomePage.errorMessageGetStarted();
		Assert.assertEquals(actualmessage, expectedMessage, "message not matched");
		log.info("Error message of Getstarted button before signin");

	}

	@When("the user clicks on the {string} option under DataStructure")
	public void the_user_clicks_on_the_arrays_option_under_data_structure(String Section) {
		HomePage.clickDataStructuresDropDown();
		HomePage.notNavigatetoOptionsDataStructure(Section);
		log.info("Clicking on all the options under Datastructure");
	}

}