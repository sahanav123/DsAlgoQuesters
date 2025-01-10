package dsAlgoStepdefinition;

import io.cucumber.java.en.*;
import io.cucumber.java.en.When;

public class RegisterSteps {
	@Given("The user is on the Home page")
	public void the_user_is_on_the_home_page() {
	 
	}
	@When("The user clicks {string} link on the Home page")
	public void the_user_clicks_link_on_the_home_page(String string) {
	   
	}
	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
	   
	}
	
	@Given("The user is on the register page")
	public void the_user_is_on_the_register_page() {
	    
	}
	@When("The user clicks {string} button  on the Register page without entering username ,password and password confirmation")
	public void the_user_clicks_button_on_the_register_page_without_entering_username_password_and_password_confirmation(String string) {
	  
	}
	@Then("The user should get error message {string} is displayed in username textbox")
	public void the_user_should_get_error_message_is_displayed_in_username_textbox(String string) {
	    
	}




}
