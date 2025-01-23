package dsAlgoStepdefinition;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.*;
import dsAlgoPages.RegisterPage;
import dsAlgoPages.TryEditorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;

public class RegisterSteps {

	WebDriver driver = DriverFactory.getdriver();
	HomePage HomePage = new HomePage(driver);
	RegisterPage RegisterPage = new RegisterPage(driver);
	SigninPage signinpage = new SigninPage(driver);
	TryEditorPage TryEditorPage = new TryEditorPage(driver);
	Logger log = LogManager.getLogger(HomeSteps.class);

	List<Map<String, String>> excelData;

//TC01
	@Given("The User is On The Home Page")
	public void the_user_is_on_the_home_page() {
		HomePage.clickLaunchPageGetstartedbutton();
		log.info("Clicking on get started button of HomePage");
	}

	@When("User clicks Register link on the Home page")
	public void user_clicks_link_on_the_home_page() {
		HomePage.clickRegister();
		log.info("Clicking on Register link");
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		RegisterPage.textConfirmforRegister();
		log.info("Confirming on Register Page");
	}

//TC02
	@Given("The user is on the register page")
	public void the_user_is_on_the_register_page() {

		HomePage.clickLaunchPageGetstartedbutton();
		log.info("Clicking on get started button of HomePage");
		HomePage.clickRegister();
		log.info("Clicking on Register link");
	}

	@When("The user enters the username and clicks Register button {string} and {int}")
	public void the_user_enters_the_username_and_clicks_register_button_and(String Sheetname, int RowNumber) {

		RegisterPage.enteringcode(Sheetname, RowNumber);
		log.info("Entering valid username and Password from the excel");
		RegisterPage.register();
		log.info("Clicking on Register button");
	}

	@Then("The user should get error message {string} is displayed in Password Confirmation textbox")
	public void the_user_should_get_error_message_is_displayed_in_password_textbox(String expectedresult) {

		RegisterPage.switchToElementAndGetValidationMessage(expectedresult);
		log.info("Error message in Password Confirmation textbox");
	}

//TC03
	@When("The user enters the username and password and clicks Register button {string} and {int}")
	public void the_user_enters_the_username_and_password_and_clicks_register_button_sheetname(String Sheetname,
			int RowNumber) {
		RegisterPage.enteringcode(Sheetname, RowNumber);
		log.info("Entering valid username and Password from the excel");
		RegisterPage.register();
		log.info("Clicking on Register button");
	}

//TC04
	@When("The user clicks Register button on the Register page without entering username ,password and password confirmation {string}and {int}")

	public void the_user_clicks_register_button_on_the_register_page_without_entering_username_password_and_password_confirmation_and(
			String Sheetname, int RowNumber) {

		RegisterPage.enteringcode(Sheetname, RowNumber);
		log.info("Entering valid username and Password from the excel");
		RegisterPage.register();
		log.info("Clicking on Register button");
	}

//TC05
	@When("The user enters the username and password different and clicks Register button from sheet {string} and row {int}")
	public void the_user_enters_the_username_and_password_different_and_clicks_register_button_from_sheet_and_row(
			String Sheetname, int RowNumber) {
		RegisterPage.enteringcode(Sheetname, RowNumber);
		log.info("Entering valid username and Password from the excel");
		RegisterPage.register();
		log.info("Clicking on Register button");
	}

	@Then("The user should get error message {string} in register page")
	public void the_user_should_get_error_message_in_register_page(String expectedmessage) {

		String actualmessage = RegisterPage.InvalidPasswordmismatch();
		System.out.println("actual message is " + actualmessage);
		System.out.println("expected  message is" + expectedmessage);
		Assert.assertEquals(expectedmessage, actualmessage, "Text did not match");
		log.info("Verifying the Passwordmismatch is Invalid");
	}

//TC06
	@When("The user enters the Password only numeric and clicks Register button from sheet {string} and row {int}")
	public void the_user_enters_the_password_only_numeric_and_clicks_from_sheet_and_row(String Sheetname,
			int RowNumber) {
		RegisterPage.enteringcode(Sheetname, RowNumber);
		log.info("Entering valid username and Password from the excel");
		RegisterPage.register();
		log.info("Clicking on Register button");
	}

//TC07
	@When("The user enters the invalid username like %,$,& and clicks Register button from sheet {string} and row {int}")
	public void the_user_enters_the_invalid_username_like_and_clicks_register_button_from_sheet_and_row(
			String Sheetname, int RowNumber) {
		RegisterPage.enteringcode(Sheetname, RowNumber);
		log.info("Entering valid username and Password from the excel");
		RegisterPage.register();
		log.info("Clicking on Register button");
	}

//TC08
	@When("The user enters the password less than eight characters and clicks Register button from sheet {string} and row {int}")
	public void the_user_enters_the_password_less_than_eight_characters_and_clicks_register_button_from_sheet_and_row(
			String Sheetname, int RowNumber) {
		RegisterPage.enteringcode(Sheetname, RowNumber);
		log.info("Entering valid username and Password from the excel");
		RegisterPage.register();
		log.info("Clicking on Register button");
	}

//TC09
	@When("The user clicks Signout link")
	public void the_user_clicks_Signout_link() {

		HomePage.clickSignin();
		log.info("Clicking on Signin link");
		signinpage.sendtextusername();
		log.info("Entering the username in usernametextbox");
		signinpage.sendtextpassword();
		log.info("Entering the password in passwordtextbox");
		signinpage.clickLoginbutton();
		log.info("Clicking on Login button");
		signinpage.clickSignOut();
		log.info("Clicking on Signout button");
	}

	@Then("The user should be able to see Register and sign in links at the top corner of the home page")
	public void the_user_should_be_able_to_see_register_and_sign_in_links_at_the_top_corner_of_the_home_page() {

		RegisterPage.registerlinktext();
		log.info("Confirming on registerlinktext");
		RegisterPage.Signinlinktext();
		log.info("Confirming on signinlinktext");
	}

//TC10
	@When("The user clicks login button")
	public void the_user_clicks_login_button() {
		HomePage.clickSignin();
		log.info("Clicking on Signin link");
		signinpage.sendtextusername();
		log.info("Entering the username in usernametextbox");
		signinpage.sendtextpassword();
		log.info("Entering the password in passwordtextbox");
		signinpage.clickLoginbutton();
		log.info("Clicking on Login button");
	}

	@Then("The user should be able to redirect to the home page of DsAlgo after Signin")
	public void the_user_should_be_able_to_redirect_to_the_home_page_of_ds_algo_after_signin() {
         HomePage.textdisplayinhomepage();
		log.info("Confirming the text in homepage");
	}

}