package dsAlgoStepdefinition;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.WebDriver;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.HomePage;
import dsAlgoPages.RegisterPage;
import dsAlgoPages.SigninPage;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.*;

public class RegisterSteps {

	WebDriver driver = DriverFactory.getdriver();
	HomePage Hg = new HomePage(driver);
	RegisterPage Rg = new RegisterPage(driver);
	SigninPage Sg = new SigninPage(driver);

//TC01

	@Given("The User is On The Home Page")
	public void the_user_is_on_the_home_page() {
		Hg.clicklaunchPageGetstartedbutton();
	}

	@When("User clicks {string} link on the Home page")
	public void user_clicks_link_on_the_home_page(String string) {

		Hg.clickRegister();

	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		Rg.ConfirmRegisterurl();

	}
//TC02

	@Given("The user is on the register page")
	public void the_user_is_on_the_register_page() {

		Hg.clicklaunchPageGetstartedbutton();
		Hg.clickRegister();
	}

	@When("The user enters the valid username ,password and password confirmation and clicks {string} button from sheetname {string} and row {int}")
	public void the_user_enters_the_valid_username_password_and_password_confirmation_and_clicks_button_from_sheetname_and_row(
			String button, String sheetname, int RowNUmber)
			throws InvalidFormatException, IOException, OpenXML4JException {
		Rg.fillRegistrationForm("Register", 0);
		Rg.clickRegisterButtononRegisterPage();
	}

	@Then("The user should be able to redirect to the home page of DsAlgo . Your logged in as  <valid name> sign in")
	public void the_user_should_be_able_to_redirect_to_the_home_page_of_ds_algo_your_logged_in_as_valid_name_sign_in() {

	}

	// TC03

	@When("The user enters the username only and clicks {string} button from sheetname {string} and row {int}")
	public void the_user_enters_the_username_only_and_clicks_button_from_sheetname_and_row(String button,
			String sheetname, int RowNUmber) throws InvalidFormatException, IOException, OpenXML4JException {

		Rg.fillRegistrationForm("Register", 1);
		Rg.clickRegisterButtononRegisterPage();

	}

	@Then("The user should get error message {string} is displayed in Password textbox")
	public void the_user_should_get_error_message_is_displayed_in_password_textbox(String expectedmessage) {

		Rg.switchToElementAndGetValidationMessage(expectedmessage);

	}

	// TC04
	@When("The user enters the username and password only and clicks {string} button from sheetname {string} and row {int}")
	public void the_user_enters_the_username_and_password_only_and_clicks_button_from_sheetname_and_row(String button,
			String sheetname, int RowNUmber) throws InvalidFormatException, IOException, OpenXML4JException {

		Rg.fillRegistrationForm("Register", 2);
		Rg.clickRegisterButtononRegisterPage();

	}

	@Then("The user should get error message {string} is displayed in Password Confirmation textbox")
	public void the_user_should_get_error_message_is_displayed_in_password_confirmation_textbox(
			String expectedmessage) {

		Rg.switchToElementAndGetValidationMessage(expectedmessage);

	}
	// TC05

	@When("The user clicks {string} button  on the Register page without entering username ,password and password confirmation from {string} and row {int}")
	public void the_user_clicks_button_on_the_register_page_without_entering_username_password_and_password_confirmation_from_and_row(
			String button, String sheetname, int RowNUmber)
			throws InvalidFormatException, IOException, OpenXML4JException {
		Rg.fillRegistrationForm("Register", 3);
		Rg.clickRegisterButtononRegisterPage();

	}

	@Then("The User Should get Error Message {string} is displayed in username textbox")
	public void the_user_should_get_error_message_is_displayed_in_username_textbox(String expectedmessage) {

		Rg.switchToElementAndGetValidationMessage(expectedmessage);
	}

	// TC06

	@When("The user enters the username and password different and clicks {string} button from sheet {string} and row {int}")
	public void the_user_enters_the_username_and_password_different_and_clicks_button_from_sheet_and_row(String button,
			String sheetname, int RowNUmber)
			throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {

		Rg.fillRegistrationForm("Register", 4);
		Rg.clickRegisterButtononRegisterPage();
	}

	@Then("The user should get error message password_mismatch:The two password fields didn't match in register page")
	public void the_user_should_get_error_message_password_mismatch_the_two_password_fields_didn_t_match_in_register_page() {
		Rg.PasswordMismatchOnRegPage();
	}

//TC07

	@When("The user enters the Password only numeric and clicks {string} from sheetname {string} and row {int}")
	public void the_user_enters_the_Password_only_numeric_and_clicks_from_sheetname_and_row(String button,
			String sheetname, int RowNUmber)
			throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {

		Rg.fillRegistrationForm("Register", 5);
		Rg.clickRegisterButtononRegisterPage();

	}

	@Then("The user should get error message and not redirected to the home page")
	public void the_user_should_get_error_message_and_not_redirected_to_the_home_page() {

		Rg.PasswordMismatchOnRegPage();

	}
//TC08

	@When("The user enters the invalid username like%,$,& and clicks {string} button from sheetname {string} and row {int}")
	public void the_user_enters_the_invalid_username_like_$_and_clicks_button_from_sheetname_and_row(String button,
			String sheetname, int RowNUmber) throws InvalidFormatException, IOException, OpenXML4JException {

		Rg.fillRegistrationForm("Register", 6);
		Rg.clickRegisterButtononRegisterPage();

	}

	@Then("The User Should get Error Message and not Redirected to the home page")
	public void the_User_should_get_Error_Message_and_not_Redirected_to_the_home_page() {
		Rg.PasswordMismatchOnRegPage();

	}

	// TC09

	@When("The user enters the password less than {int} characters and clicks {string} button from sheetname {string} and row {int}")
	public void the_user_enters_the_password_less_than_characters_and_clicks_button_from_sheetname_and_row(int length,
			String button, String sheetname, int RowNUmber)
			throws InvalidFormatException, IOException, OpenXML4JException {
		System.out.println("Password length specified: " + length);
		Rg.fillRegistrationForm("Register", 7);
		Rg.clickRegisterButtononRegisterPage();

	}

	@Then("The user should get error message and not redirected to The Home Page")
	public void the_user_should_get_error_message_and_not_redirected_to_The_Home_Page() {

		Rg.PasswordMismatchOnRegPage();

	}
	

	
	// TC10

	@Given("The user Is on the Home Page")
	public void The_user_Is_on_the_Home_Page() {
		Hg.clicklaunchPageGetstartedbutton();
	}

	@When("The user clicks {string} link")
	public void the_user_clicks_link(String string) {
		Rg.clickSignOut();
	}

	@Then("The user should be able to see Register and sign in links at the top corner of the home page")
	public void the_user_should_be_able_to_see_register_and_sign_in_links_at_the_top_corner_of_the_home_page() {

	}

	// TC11

	@Given("The user Is on The Home Page")
	public void The_user_Is_on_The_Home_Page() {
		Hg.clicklaunchPageGetstartedbutton();
		Hg.clicksignin();

	}

	@When("The user clicks login button")
	public void the_user_clicks_login_button() throws InvalidFormatException, IOException, OpenXML4JException {
		Sg.enterLoginFormFields("Signin", 0);
		Sg.Clickloginbutton();

	}

	@Then("The user should be able to redirect to the home page of DsAlgo with Signin ID")
	public void the_user_should_be_able_to_redirect_to_the_home_page_of_ds_algo_with_signin_id() {
		Hg.landondsalgoportal();
	}

}
