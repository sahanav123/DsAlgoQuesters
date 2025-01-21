//package dsAlgoStepdefinition;
//
//import io.cucumber.java.en.*;
//
//public class RegisterSteps {
//
//	@Given("The user is on the Home page")
//	public void the_user_is_on_the_home_page() {
//
//	}
//
//	@When("The user clicks {string} link on the Home page")
//	public void the_user_clicks_link_on_the_home_page(String string) {
//
//	}
//
//	@Then("The user should be redirected to Register form")
//	public void the_user_should_be_redirected_to_register_form() {
//
//	}
//	@Given("The user is on the register page")
//	public void the_user_is_on_the_register_page() {
//	    
//	}
//
//	@When("The user clicks {string} button  on the Register page without entering username ,password and password confirmation")
//	public void the_user_clicks_button_on_the_register_page_without_entering_username_password_and_password_confirmation(
//			String string) {
//
//	}
//
//	@Then("The user should get error message {string} is displayed in username textbox")
//	public void the_user_should_get_error_message_is_displayed_in_username_textbox(String string) {
//
//	}
//
//	@When("The user enters the username only and clicks {string} button")
//	public void the_user_enters_the_username_only_and_clicks_button(String string) {
//
//	}
//
//	@When("The user enters the username and password only and clicks {string} button")
//	public void the_user_enters_the_username_and_password_only_and_clicks_button(String string) {
//
//	}
//
//	@Then("The user should get error message {string} is displayed in Password Confirmation textbox")
//	public void the_user_should_get_error_message_is_displayed_in_password_confirmation_textbox(String string) {
//
//	}
//
//	@When("The user enters the username and password different and clicks {string} button")
//	public void the_user_enters_the_username_and_password_different_and_clicks_button(String string) {
//
//	}
//
//	@Then("The user should get error message password_mismatch:The two password fields didn't match in register page")
//	public void the_user_should_get_error_message_password_mismatch_the_two_password_fields_didn_t_match_in_register_page() {
//
//	}
//
//	@When("The user enters the invalid username like%,$,& and clicks {string} button")
//	public void the_user_enters_the_invalid_username_like_$_and_clicks_button(String string) {
//
//	}
//
//	@Then("The user should get error message and not redirected to the home page")
//	public void the_user_should_get_error_message_and_not_redirected_to_the_home_page() {
//
//	}
//
//	@When("The user enters the password less than {int} characters and clicks {string} button")
//	public void the_user_enters_the_password_less_than_characters_and_clicks_button(Integer int1, String string) {
//
//	}
//
//
//	@When("The user enters the password only numeric and clicks {string}")
//	public void the_user_enters_the_password_only_numeric_and_clicks(String string) {
//
//	}
//
//
//	@When("The user enters the valid username ,password and password confirmation and clicks \"Register")
//	public void the_user_enters_the_valid_username_password_and_password_confirmation_and_clicks_register() {
//
//	}
//
//	@Then("The user should be able to redirect to the home page of DsAlgo . Your logged in as  <valid name> sign in")
//	public void the_user_should_be_able_to_redirect_to_the_home_page_of_ds_algo_your_logged_in_as_valid_name_sign_in() {
//
//	}
//
//	@When("After the user enters the valid username ,password and password confirmation and clicks \"Register")
//	public void after_the_user_enters_the_valid_username_password_and_password_confirmation_and_clicks_register() {
//
//	}
//
//	@Then("The user should be able to see Logged ID and sign out links at the top corner of the home page")
//	public void the_user_should_be_able_to_see_logged_id_and_sign_out_links_at_the_top_corner_of_the_home_page() {
//
//	}
//
//
//	@When("The user clicks {string} link")
//	public void the_user_clicks_link(String string) {
//
//	}
//
//	@Then("The user should be able to see Register and sign in links at the top corner of the home page")
//	public void the_user_should_be_able_to_see_register_and_sign_in_links_at_the_top_corner_of_the_home_page() {
//
//	}
//
//
//	@When("The user clicks login button")
//	public void the_user_clicks_login_button() {
//
//	}
//
//	@Then("The user should be able to redirect to the home page of DsAlgo with Signin ID")
//	public void the_user_should_be_able_to_redirect_to_the_home_page_of_ds_algo_with_signin_id() {
//
//	}
//
//}
