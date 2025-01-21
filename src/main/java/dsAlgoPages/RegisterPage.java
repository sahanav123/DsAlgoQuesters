package dsAlgoPages;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import dsAlgoUtils.ExcelReader;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class RegisterPage {
	WebDriver driver;
	ExcelReader er= new ExcelReader();

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[@for='id_username']")
	private WebElement Registertext;
	
	@FindBy(xpath = "//a[contains(text(),'Questers')]")
	private WebElement loggedIdLink;
	
	@FindBy(xpath="//a[contains(text(),'Sign out')]")
	private WebElement signOutLink;

	

	// username text field
	private By usernameTextBox = By.xpath("//div[@class='col-sm']/form/input[2][@name='username']");
	// password text field
	private By passwordTextBox = By.xpath("//div[@class='col-sm']/form/input[3][@name='password1']");

	// confirm password text field
	private By confirmPasswordTextBox = By.xpath("//div[@class='col-sm']/form/input[4][@name='password2']");

	// Register Button inside Register page
	private By registerButtononRegPage = By.xpath("//input[@value='Register']");
	
	private By passwordMismatchOnRegPage = By.xpath("//div[@class='alert alert-primary']");
	
	public void PasswordMismatchOnRegPage() {
		
	   driver.findElement(passwordMismatchOnRegPage).getText();
	}
	
	//-------------------------------------------------------------------------------------
	
	  public String getLoggedIdText() {
	        return  loggedIdLink.getText();
	    }
	  
	  public String getSignOutText() {
		  return signOutLink.getText();
	  }

	    // Method to click on Sign Out
	    public void clickSignOut() {
	        signOutLink.click();
	    }
	

	public void ConfirmRegisterurl() {

		String expectedUrl = "https://dsportalapp.herokuapp.com/register";
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Actual URL: " + actualUrl);

		if (actualUrl.equals(expectedUrl)) {
			System.out.println("URL matched: User is on the registration page.");
		} else {
			System.out.println("URL did not match. Expected: " + expectedUrl + ", but found: " + actualUrl);
		}


	}
	
	//------------------------------------------------------------------------------------

	
	public void enterUsernameTxt(String username) {
		driver.findElement(usernameTextBox).sendKeys(username);
	}

	public void enterPasswordnameTxt(String password) {
		driver.findElement(passwordTextBox).sendKeys(password);

	}
	public void enterConfirmPasswordnameTxt(String passwordconfirm) {
		driver.findElement(confirmPasswordTextBox).sendKeys(passwordconfirm);

	}
	
	public void clickRegisterButtononRegisterPage() {
		driver.findElement(registerButtononRegPage).click();
	}
	
	//-----------------------------------------------------------------------------------------------

	public String switchToElementAndGetValidationMessage(String expectedmessage) {
	    // Switch to the active element to retrieve the validation message
	    WebElement activeElement = driver.switchTo().activeElement();
	    String actualMessage = activeElement.getAttribute("validationMessage").trim();

	    // Log the validation message for debugging
	    System.out.println("Validation Message: " + actualMessage);
	    
	    String normalizedActualMessage = actualMessage.replaceAll("\\.+$", "").trim();
	    String normalizedExpectedMessage = expectedmessage.replaceAll("\\.+$", "").trim();
	    Assert.assertEquals(normalizedActualMessage, normalizedExpectedMessage, "Validation message mismatch!");

	    // Return the actual validation message
	    return actualMessage;


}
	
	//----------------------------------------------------------------------------------------------------------
	public void fillRegistrationForm(String sheetname, int row) throws InvalidFormatException, IOException, OpenXML4JException {
	    // Retrieve test data
	    List<Map<String, String>> testdata = er.getData("src/main/resources/DSAlgoExcelsheets/ScenarioData.xlsx", sheetname);
	    System.out.println("Register test data ---------> " + testdata);

	    if (testdata == null || testdata.isEmpty()) {
	        throw new IllegalArgumentException("Test data is empty or null for sheet: " + sheetname);
	    }

	    // Handle username
	    String username = testdata.get(row).get("username");
	    if (username != null && !username.isEmpty()) {
	    	 enterUsernameTxt(username);
	    }else{
	        System.out.println("Username is intentionally left empty for row: " + row);
	    }
	    
	    // Handle password (optional for certain scenarios)
	    String password = testdata.get(row).get("password");
	    if (password != null && !password.isEmpty()) {
	        enterPasswordnameTxt(password);
	    } else {
	        System.out.println("Password is intentionally left empty for row: " + row);
	    }

	    // Handle password confirmation (optional for certain scenarios)
	    String passwordConfirm = testdata.get(row).get("password confirmation");
	    if (passwordConfirm != null && !passwordConfirm.isEmpty()) {
	        enterConfirmPasswordnameTxt(passwordConfirm);
	    } else {
	        System.out.println("Password confirmation is intentionally left empty for row: " + row);
	    }
	}

	//----------------------------------------------------------------------------------------------------------
	
}










