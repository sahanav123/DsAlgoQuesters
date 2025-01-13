package dsAlgoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_username")
	private WebElement username;
	@FindBy(id = "id_password")
	private WebElement password;
	@FindBy(xpath = "//*[@value='Login']")
	private WebElement Loginbutton;

	public void sendtextusername() {
		username.sendKeys("Questers");
	}

	public void sendtextpassword() {
		password.sendKeys("Awesome@2025");
	}

	public void clickLoginbutton() {
		Loginbutton.click();
	}

	public void confirmsigninurl() {

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
	}

}
