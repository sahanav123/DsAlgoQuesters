package dsAlgoStepdefinition;

import org.openqa.selenium.WebDriver;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.*;

import io.cucumber.java.en.Given;

public class BackgroundSteps {

	WebDriver driver = DriverFactory.getdriver();
	HomePage HomePage = new HomePage(driver);
	SigninPage LoginPage = new SigninPage(driver);
	

	@Given("The user is on the DSAlgo homepage after sign")
	public void the_user_is_navigating_to_the_signin_page() {

		HomePage.clickLaunchPageGetstartedbutton();
		HomePage.clickSignin();
		LoginPage.sendtextusername();
		LoginPage.sendtextpassword();
		LoginPage.clickLoginbutton();
		

	}
	
	
	

}