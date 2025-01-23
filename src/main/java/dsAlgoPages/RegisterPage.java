package dsAlgoPages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgoUtils.ExcelDataReader;

public class RegisterPage {

	WebDriver driver;
	List<Map<String, String>> excelData;
	ExcelDataReader exceldatareader;
	SigninPage signinpage = new SigninPage(driver);

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//Web Locators
	@FindBy(xpath = "//label[@for='id_username']")
	private WebElement Registertext;
	@FindBy(id = "id_username")
	private WebElement Username;
	@FindBy(xpath = "//input[@value='Register']")
	private WebElement Register;
	@FindBy(xpath = "//div[contains(text(),'password_mismatch:The two')]")
	private WebElement Passwordmismatch;
	@FindBy(linkText = "Register")
	private WebElement Registerlinktext;
	@FindBy(linkText = "Sign in")
	private WebElement Signinlinktext;

// ***************************************************
	public boolean registerlinktext() {
		return Registerlinktext.isDisplayed();
	}

//***************************************************
	public boolean Signinlinktext() {
		return Signinlinktext.isDisplayed();
	}
// ***************************************************

	public String InvalidPasswordmismatch() {
		return Passwordmismatch.getText();
	}

// ****************************************************
	public boolean textConfirmforRegister() {
		boolean textconfirmforregister = Registertext.isDisplayed();
		return textconfirmforregister;
	}
// ****************************************************

	public void register() {
		Register.click();
	}
}