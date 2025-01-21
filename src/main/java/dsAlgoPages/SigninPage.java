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
	@FindBy(xpath = "//label[@for='id_username']")
	private WebElement Registertext;

	public boolean textConfirmforRegister() {
		boolean textconfirmforregister = Registertext.isDisplayed();
		return textconfirmforregister;

	}

	public void sendtextusername() {

		username.sendKeys(prop.getProperty("username"));
	}

	public void sendtextpassword() {
		password.sendKeys(prop.getProperty("password"));
	}

	public void clickLoginbutton() {
		Loginbutton.click();
	}

}