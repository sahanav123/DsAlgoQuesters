package dsAlgoStepdefinition;

import org.openqa.selenium.WebDriver;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.*;

import io.cucumber.java.en.Given;

public class BackgroundSteps {

	WebDriver driver = DriverFactory.getdriver();
	HomePage HomePage = new HomePage(driver);
	LoginPage LoginPage = new LoginPage(driver);
	

	@Given("the user is navigating to the  signin page")
	public void the_user_is_navigating_to_the_signin_page() {

		HomePage.clicklaunchPageGetstartedbutton();
		HomePage.clicksignin();
		LoginPage.sendtextusername();
		LoginPage.sendtextpassword();
		LoginPage.clickLoginbutton();
		

	}
	
	
	

}