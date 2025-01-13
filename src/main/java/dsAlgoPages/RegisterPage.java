package dsAlgoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	@FindBy(xpath = "//label[@for='id_username']")
	private WebElement Registertext;

	public void ConfirmRegisterurl() {

		String expectedUrl = "https://dsportalapp.herokuapp.com/register";
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Actual URL: " + actualUrl);

		if (actualUrl.equals(expectedUrl)) {
			System.out.println("URL matched: User is on the registration page.");
		} else {
			System.out.println("URL did not match. Expected: " + expectedUrl + ", but found: " + actualUrl);
		}

//		String expecterurl = "https://dsportalapp.herokuapp.com/register";
//		String actualurl = driver.getCurrentUrl();
//		Assert.assertEquals(actualurl, expecterurl);
	}

}
