package dsAlgoStepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.HomePage;
import dsAlgoPages.SigninPage;
import dsAlgoUtils.ExcelDataReader;
import dsAlgoUtils.ExcelReader;
import dsAlgoUtils.ExcelReader1;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.*;

public class SignSteps {
	WebDriver driver = DriverFactory.getdriver();
	HomePage Hg = new HomePage(driver);
	SigninPage Sg = new SigninPage(driver);

//TC01	
	@Given("The User is On the Home Page")
	public void The_User_is_On_the_Home_Page() {
		Hg.clicklaunchPageGetstartedbutton();
	}

	@When("User clicks on Sign in link")
	public void user_clicks_on_sign_in_link() {
		Hg.clicksignin();
	}

	@Then("The user should be directed to Login page")
	public void the_user_should_be_directed_to_login_page() throws InterruptedException {
		Hg.clicksignin();
		Sg.confirmsigninurl();
	}

// TC02
	@Given("The user is on the Login Page")
	public void the_user_is_on_the_login_page() {
		Hg.clicklaunchPageGetstartedbutton();
		Hg.clicksignin();
	}

	@When("User enters valid username and valid password and clicks Login button from sheetname {string} and row {int}")
	public void user_enters_valid_username_and_valid_password_and_clicks_login_button_from_sheetname_and_row(
			String Signin, Integer RowNumber) throws InvalidFormatException, IOException, OpenXML4JException {
		Sg.enterLoginFormFields("Signin", 0);
		Sg.Clickloginbutton();
	}

	@Then("The user is directed to Data Structure home page with message {string}")
	public void the_user_is_directed_to_data_structure_home_page_with_message(String string) {

	}

//TC03
	@When("User enters invalid username and invalid password and clicks Login button from sheetname {string} and row {int}")
	public void user_enters_invalid_username_and_invalid_password_and_clicks_login_button_from_sheetname_and_row(
			String Signin, Integer RowNumber) throws InvalidFormatException, IOException, OpenXML4JException {
		Sg.enterLoginFormFields("Signin", 1);
		Sg.Clickloginbutton();
	}

	@Then("The user should get error message {string} is displayed in Login screen")
	public void the_user_should_get_error_message_is_displayed_in_login_screen(String expectedmessage) {
		Sg.InvalidMessage(expectedmessage);

	}

//TC04
	@When("User enters valid username and invalid password and clicks Login button from sheetname {string} and row {int}")
	public void user_enters_valid_username_and_invalid_password_and_clicks_login_button_from_sheetname_and_row(
			String Signin, Integer RowNumber) throws InvalidFormatException, IOException, OpenXML4JException {
		Sg.enterLoginFormFields("Signin", 2);
		Sg.Clickloginbutton();
	}

	@Then("The User should get error message {string} is displayed in Login screen")
	public void the_User_should_get_error_message_is_displayed_in_login_screen(String expectedmessage) {
		Sg.InvalidMessage(expectedmessage);
	}
//TC05

	@Given("The user is on the Login Page\"")
	public void the_user_is_on_the_Login_page() {
		Hg.clicklaunchPageGetstartedbutton();
		Hg.clicksignin();

	}

	@When("User enters invalid username and valid password  and clicks Login button from sheetname {string} and row {int}")
	public void user_enters_invalid_username_and_valid_password_and_clicks_login_button_from_sheetname_and_row(
			String Signin, Integer RowNumber) throws InvalidFormatException, IOException, OpenXML4JException {
		Sg.enterLoginFormFields("Signin", 3);
		Sg.Clickloginbutton();
	}

	@Then("The user should get Error Message {string} is displayed in Login screen")
	public void The_user_should_get_error_message_is_displayed_in_login_screen(String expectedmessage) {
		Sg.InvalidMessage(expectedmessage);

	}

//TC06	   
	@When("User clicks on Login link on Login page giving username without entering password from sheetname {string} and row {int}")
	public void user_clicks_on_login_link_on_login_page_giving_username_without_entering_password_from_sheetname_and_row(
			String Signin, Integer RowNumber) throws InvalidFormatException, IOException, OpenXML4JException {
		Sg.enterLoginFormFields("Signin", 4);
		Sg.Clickloginbutton();
	}

	@Then("The user Should get error message {string} is displayed in Password textbox")
	public void the_user_should_get_error_message_is_displayed_in_password_textbox(String expectedmessage) {
		Sg.switchToElementAndGetValidationMessage(expectedmessage);

	}

//TC07
	@When("User clicks on Login link on Login page without entering username and giving password from sheetname {string} and row {int}")
	public void user_clicks_on_login_link_on_login_page_without_entering_username_and_giving_password_from_sheetname_and_row(
			String Signin, Integer RowNumber) throws InvalidFormatException, IOException, OpenXML4JException {
		Sg.enterLoginFormFields("Signin", 5);
		Sg.Clickloginbutton();
	}

	@Then("The user should get error message {string} is displayed in Password Textbox")
	public void the_user_should_get_error_message_is_displayed_in_password_Textbox(String expectedmessage) {
		Sg.switchToElementAndGetValidationMessage(expectedmessage);
	}

//TC08
	@When("The user clicks login button after leaving the Username textbox and Password textbox empty from sheetname {string} and row {int}")
	public void the_user_clicks_login_button_after_leaving_the_username_textbox_and_password_textbox_empty_from_sheetname_and_row(
			String Signin, Integer RowNumber) throws InvalidFormatException, IOException, OpenXML4JException {
		Sg.enterLoginFormFields("Signin", 6);
		Sg.Clickloginbutton();
	}

	@Then("The user should get error message {string} is displayed in username textbox")
	public void the_user_should_get_error_message_is_displayed_in_username_textbox(String expectedmessage) {
		Sg.switchToElementAndGetValidationMessage(expectedmessage);
	}

	// TC09

	@Given("The user Is On the Login Page")
	public void the_user_Is_On_the_Login_Page() {
		Hg.clicklaunchPageGetstartedbutton();
	}

	@When("After the user enters the valid username , password  and clicks {string} button")
	public void after_the_user_enters_the_valid_username_password_and_clicks_button(String string) {
		Hg.clicksignin();
		Sg.sendtextusername();
		Sg.sendtextpassword();
		Sg.Clickloginbutton();

	}

	@Then("The user shoud be able to see logged in ID and sign out links on top corner of the home page")
	public void the_user_shoud_be_able_to_see_logged_in_id_and_sign_out_links_on_top_corner_of_the_home_page() {
		Sg.getLoggedIdText();
		Sg.getSignOutText();

	}

	// TC10

	@Given("The User Is On The Login Page")
	public void The_User_Is_On_The_Login_Page() {
		Hg.clicklaunchPageGetstartedbutton();
	}

	@When("After the user enters the valid username , password  and clicks Login button")
	public void after_the_user_enters_the_valid_username_password_and_clicks_login_button() {
		Hg.clicksignin();
		Sg.sendtextusername();
		Sg.sendtextpassword();
		Sg.Clickloginbutton();

	}

	@Then("The user should be able to direct Data Structure Home Page with message {string}")
	public void the_user_should_be_able_to_direct_data_structure_home_page_with_message(String string) {
		Sg.getLoggedIdText();

	}

	// TC11
	@Given("The user is on the Home page")
	public void the_user_is_on_the_home_page() {
		Hg.clicklaunchPageGetstartedbutton();
		Hg.clicksignin();
		Sg.sendtextusername();
		Sg.sendtextpassword();
		Sg.Clickloginbutton();

	}

	@When("User clicks {string} link")
	public void user_clicks_link(String string) {
		Sg.clickSignOut();

	}

	@Then("The user should be redirected to home page with message {string}")
	public void the_user_should_be_redirected_to_home_page_with_message(String string) {

	}

	// TC12
	@Given("The user is on the Home Page")
	public void The_user_is_on_the_home_page() {
    	Hg.clicklaunchPageGetstartedbutton();
	    Hg.clicksignin();

	}

	@When("User clicks on Sign in without registration")
	public void user_clicks_on_sign_in_without_registration() {
		Sg.sendTextUsername1();
		Sg.sendtextpassword1();
       Sg.Clickloginbutton();
	}

	@Then("The user should get the error message {string} in signin page")
	public void the_user_should_get_the_error_message_in_signin_page(String expectedmessage) {
	   Sg.InvalidMessage(expectedmessage);
	}

	// TC13
	@Given("the user is On The DSAlgo homepage")
	public void the_user_is_on_the_ds_algo_homepage() {
		Hg.clicklaunchPageGetstartedbutton();
		Hg.clicksignin();

	}

	@When("After the user Enters the valid username , password  and clicks {string} button")
	public void After_the_user_enters_the_valid_username_password_and_clicks_button(String string) {
		Sg.sendtextusername();
		Sg.sendtextpassword();
		Sg.Clickloginbutton();
	}

	@Then("the user clicks on the Data Structure button and should see six options: {string},{string},{string},{string},{string}, and {string} under the Data Structure dropdown")
	public void the_user_clicks_on_the_data_structure_button_and_should_see_six_options_and_under_the_data_structure_dropdown(
			String string, String string2, String string3, String string4, String string5, String string6) throws TimeoutException {
		Hg.DataStructureDropDownList(string, string2, string3, string4, string5, string6);
	}

}
