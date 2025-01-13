package dsAlgoStepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import dsAlgoDriverFactory.DriverFactory;
import io.cucumber.java.en.*;
import dsAlgoPages.*;

public class HomeSteps {
	WebDriver driver = DriverFactory.getdriver();

	HomePage HomePage = new HomePage(driver);
	RegisterPage RegisterPage = new RegisterPage(driver);
	SigninPage LoginPage = new SigninPage(driver);

	// 1-------------------------------------------
	@Given("Empty browser open")
	public void empty_browser_open() {
		WebDriver driver = DriverFactory.getdriver();

	}

	@When("The user enters the DsAlgo Url")
	public void the_user_enters_the_Ds_algo_url() {

		HomePage.url();

	}

	@Then("the user should able to land on DsAlgo portal")
	public void the_user_should_able_to_land_on_ds_algo_portal() {

		HomePage.landondsalgoportal();

	}

	// 2----------------------------------------------
	@Given("the user enters the DsAlgo Url")
	public void the_user_enters_the_ds_algo_url() {
		HomePage.url();

	}

	@When("The user click on Getstarted button")
	public void the_user_click_on_getstarted_button() {

		HomePage.clicklaunchPageGetstartedbutton();
	}

	@Then("the user navigates to DSAlgo home page and verifies whether the home page is displayed")
	public void the_user_navigates_to_ds_algo_home_page_and_verifies_whether_the_home_page_is_displayed() {

		HomePage.verifyHomeUrl();
	}

	// 3----------------------------------------------
	@Given("the user is on the DSAlgo homepage")
	public void the_user_is_on_the_ds_algo_homepage() {
		HomePage.clicklaunchPageGetstartedbutton();

	}

	@When("The user clicks on the Register button")
	public void the_user_clicks_on_the_Register_button() {

		HomePage.clickRegister();

	}

	@Then("the user should be navigated to the Register page")
	public void the_user_should_be_navigated_to_the_register_page() {
		RegisterPage.ConfirmRegisterurl();

	}

	// 4---------------------------------------------------------
	@When("The user clicks on the signin button")
	public void the_user_clicks_on_the_signin_button() {
		HomePage.clicksignin();

	}

	@Then("the user should be navigated to the signin page")
	public void the_user_should_be_navigated_to_the_signin_page() {

		LoginPage.confirmsigninurl();

	}

	// 5----------------------------------------------------------------
	@When("the user clicks on the Data Structure button")
	public void the_user_clicks_on_the_Data_Structure_button() {

		HomePage.clickDataStructuresDropDown();

	}

	@Then("the user should see six options: {string},{string},{string},{string},{string}, and {string} under the Data Structure dropdown")
	public void the_user_should_see_six_options_and_under_the_data_structure_dropdown(String string, String string2, String string3, String string4, String string5, String string6) {
		HomePage.DataStructureDropDownList(string, string2, string3, string4, string5, string6);
	}

	// 6-----------------------------------------------------------------
	@When("the user clicks on the GetStarted button under {string}")
	public void the_user_clicks_on_the_get_started_button_under(String Section) throws IOException {

		
		HomePage.clickonGetstartedofOptions();
	}

	@Then("the user should see an error message stating {string}")
	public void the_user_should_see_an_error_message_stating(String expectedMessage) {

		HomePage.ErrormessageGetStarted(expectedMessage);
	}


}