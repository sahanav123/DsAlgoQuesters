package dsAlgoPages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
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
// ****************************************************

	public void enteringcode(String Sheetname, int rowNumber) {
		try {

			ExcelDataReader ExcelDataReader = new ExcelDataReader();
			excelData = ExcelDataReader.DataFromExcel(Sheetname);
			String username = excelData.get(rowNumber).get("username");
			String password = excelData.get(rowNumber).get("password");
			String passwordconfirm = excelData.get(rowNumber).get("password confirmation");
			System.out.println("excel data" + excelData);
			System.out.println("username: " + username);
			System.out.println("password: " + password);
			System.out.println("passwordconfirmation: " + passwordconfirm);
			driver.findElement(By.id("id_username")).sendKeys(username);
			driver.findElement(By.id("id_password1")).sendKeys(password);
			driver.findElement(By.id("id_password2")).sendKeys(passwordconfirm);
		} catch (Exception e) {
			System.out.println("exception: " + e);
		}
	}
// ************************************************************************

	public String switchToElementAndGetValidationMessage(String expectedresult) {
		// Switch to the active element to retrieve the validation message
		WebElement activeElement = driver.switchTo().activeElement();
		String actualMessage = activeElement.getAttribute("validationMessage").trim();
		// Log the validation message for debugging
		System.out.println("Validation Message: " + actualMessage);
		String normalizedActualMessage = actualMessage.replaceAll("\\.+$", "").trim();
		String normalizedExpectedMessage = expectedresult.replaceAll("\\.+$", "").trim();
		// Validate the messages
		if (normalizedActualMessage.equals(normalizedExpectedMessage)) {
			System.out.println("Validation message matched successfully!");
		} else {
			System.out.println("Validation message mismatch!");
			System.out.println("Actual: " + normalizedActualMessage);
			System.out.println("Expected: " + normalizedExpectedMessage);
		}
// Return the actual validation message
		return actualMessage;
	}
}
//************************************************************************