package dsAlgoPages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgoUtils.ConfigReader;

public class SigninPage {
	WebDriver driver;
	Properties prop;

	public SigninPage(WebDriver driver) {
		this.driver = driver;
		this.prop = ConfigReader.initializeprop();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_username")
	private WebElement username;
	@FindBy(id = "id_password")
	private WebElement password;
	@FindBy(xpath = "//*[@value='Login']")
	private WebElement Loginbutton;

	public void sendtextusername() {

		username.sendKeys(prop.getProperty("username"));
	}

	public void sendtextpassword() {
		password.sendKeys(prop.getProperty("password"));
	}

	public void clickLoginbutton() {
		Loginbutton.click();
	}

	public String confirmSigninUrl() {

		String expectedUrl = "https://dsportalapp.herokuapp.com/login";
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Actual URL: " + actualUrl);

		if (actualUrl.equals(expectedUrl)) {
			System.out.println("URL matched: User is on the sign-in page.");
		} else {
			System.out.println("URL did not match. Expected: " + expectedUrl + ", but found: " + actualUrl);
		}
//		String expecterurl = "https://dsportalapp.herokuapp.com/login";
//		String actualurl = driver.getCurrentUrl();
//		Assert.assertEquals(actualurl, expecterurl);
		return actualUrl;
	}

}
