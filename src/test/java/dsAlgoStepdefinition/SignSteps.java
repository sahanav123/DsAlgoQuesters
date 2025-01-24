package dsAlgoStepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.*;
import io.cucumber.java.en.*;

public class SignSteps {

	WebDriver driver = DriverFactory.getdriver();
	HomePage HomePage = new HomePage(driver);
	SigninPage SigninPage = new SigninPage(driver);
	Logger log = LogManager.getLogger(HomeSteps.class);

	@Given("The User is On the Home Page")
	public void the_user_is_on_the_home_page() {
		HomePage.clickLaunchPageGetstartedbutton();
		log.info("User is on the Home Page and clicks on the 'Get Started' button on the launch page.");
	}

	@When("User clicks on Sign in link")
	public void user_clicks_on_sign_in_link() {
		HomePage.clickSignin();
		log.info("User clicks on the 'Sign In' link on the Home Page.");
	}

	@Then("The user should be directed to Signin page")
	public void the_user_should_be_directed_to_signin_page() {
		SigninPage.confirmtextsignin();
		log.info("User is directed to the Sign In page and the presence of sign-in text is confirmed.");

	}

	@Given("The user is on the Login Page")
	public void the_user_is_on_the_login_page() {
		HomePage.clickLaunchPageGetstartedbutton();
        HomePage.clickSignin();
		log.info(
				"User navigates to the Login Page by clicking the 'Get Started' button on the launch page and then clicking the 'Sign In' button.");

	}

	@When("User enters valid username and valid password and clicks Login button {string} and row {int}")
	public void user_enters_valid_username_and_valid_password_and_clicks_login_button_and_row(String Sheetname,
			int RowNumber) {
		SigninPage.enteringcode(Sheetname, RowNumber);
		log.info("Entering username and password from sheet '{}' and row '{}'", Sheetname, RowNumber);
		SigninPage.clickLoginbutton();
		log.info("Clicked on the Login button after entering valid credentials.");

	}

	@Then("The user is directed to Data Structure home page with message {string}")
	public void the_user_is_directed_to_data_structure_home_page_with_message(String expectedmessage) {

		String actualmessage = SigninPage.loggedinmessage();
		Assert.assertEquals(actualmessage, expectedmessage, "message not matched");
		log.info(
				"Verified that the user is directed to the Data Structure home page. Expected message: '{}', Actual message: '{}'",
				expectedmessage, actualmessage);
	}

	@When("User enters Invalid username and valid password and clicks Login button {string} and row {int}")
	public void user_enters_Invalid_username_and_valid_password_and_clicks_login_button_and_row(String Sheetname,
			int RowNumber) {
		SigninPage.enteringcode(Sheetname, RowNumber);
		log.info("Entering an invalid username and a valid password from the sheet '{}' at row '{}'.", Sheetname, RowNumber);
		SigninPage.clickLoginbutton();
		log.info("Clicked on the 'Login' button after entering invalid credentials.");

	}

	@Then("The user should get a warning message {string}")
	public void The_user_should_get_a_warning_message(String expectederrormessage) {
		String actualerrormessage = SigninPage.errormessage();
		Assert.assertEquals(actualerrormessage, expectederrormessage, "error message not matched");
		log.info("Validating that the warning message displayed matches the expected message: '{}'.", expectederrormessage);
	}

	@When("User enters valid username and Invalid password and clicks Login button {string} and row {int}")
	public void user_enters_valid_username_and_Invalid_password_and_clicks_login_button_and_row(String Sheetname,
			int RowNumber) {
		SigninPage.enteringcode(Sheetname, RowNumber);
		log.info("Entering a valid username and an invalid password from the sheet '{}' at row '{}'.", Sheetname, RowNumber);
		SigninPage.clickLoginbutton();
		log.info("Clicked on the 'Login' button after entering the credentials.");

	}

	@When("User enters Invalid username and Invalid password and clicks Login button {string} and row {int}")
	public void user_enters_Invalid_username_and_Invalid_password_and_clicks_login_button_and_row(String Sheetname,
			int RowNumber) {
		SigninPage.enteringcode(Sheetname, RowNumber);
		log.info("Entering an invalid username and an invalid password from the sheet '{}' at row '{}'.", Sheetname, RowNumber);
		SigninPage.clickLoginbutton();
		log.info("Clicked on the 'Login' button after entering invalid credentials.");

	}

	@When("User clicks Login button without  entering username and password")
	public void User_clicks_Login_button_without_entering_username_and_password() {

		SigninPage.clickLoginbutton();
		log.info("User clicks on the 'Login' button without entering username and password.");

	}

	@Then("The user should get a element showing empty field {string}")
	public void the_user_should_get_a_element_showing_empty_field(String expectedmessage) {
		String actualmessage = SigninPage.switchToElementAndGetValidationMessage();
		Assert.assertEquals(actualmessage, expectedmessage, "message not matched");
		log.info("Validating that the element displays the expected empty field message: '{}'.", expectedmessage);
	}

	@When("User clicks on Login link on Login page without entering username and giving password from sheetname {string} and row {int}")
	public void user_clicks_on_login_link_on_login_page_without_entering_username_and_giving_password_from_sheetname_and_row(
			String Sheetname, int RowNumber) {
		SigninPage.enteringcode(Sheetname, RowNumber);
		log.info("Entering username and password from sheet '{}' at row '{}'.", Sheetname, RowNumber);
		SigninPage.clickLoginbutton();
		log.info("Clicked on the 'Login' button without entering a username but providing a password.");
	}

	@When("User clicks on Login link on Login page entering username and without entering password from sheetname {string} and row {int}")
	public void user_clicks_on_login_link_on_login_page_entering_username_and_without_password_from_sheetname_and_row(
			String Sheetname, int RowNumber) {
		SigninPage.enteringcode(Sheetname, RowNumber);
		log.info("Entering username from sheet '{}' at row '{}' and leaving password empty.", Sheetname, RowNumber);
		SigninPage.clickLoginbutton();
		log.info("Clicked on the 'Login' button after entering the username and leaving the password empty.");
	}

	@Given("The user is On the Home Page")
	public void The_user_is_On_the_Home_Page() {

		HomePage.clickLaunchPageGetstartedbutton();
		log.info("User clicks on the 'Get Started' button on the launch page.");
		HomePage.clickSignin();
		log.info("User clicks on the 'Sign In' button.");
		SigninPage.sendtextusername();
		log.info("Entering username into the username field.");
		SigninPage.sendtextpassword();
		log.info("Entering password into the password field.");
		SigninPage.clickLoginbutton();
		log.info("User clicks on the 'Login' button after entering credentials.");

	}

	@When("User clicks Signout link")
	public void user_clicks_link() {
		SigninPage.signout();
		log.info("User clicks on the 'Sign Out' link.");

	}

	@Then("The user should be redirected to home page with message {string}")
	public void the_user_should_be_redirected_to_home_page_with_message(String expectedmessage) {
		String actualmessage = SigninPage.loggedoutmessage();
		log.info("Validating redirection to the home page. Expected message: '{}', Actual message: '{}'.", expectedmessage, actualmessage);

	}

}
