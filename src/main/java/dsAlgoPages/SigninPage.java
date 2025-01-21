package dsAlgoPages;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import dsAlgoUtils.ConfigReader;
import dsAlgoUtils.ExcelReader;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class SigninPage {

	

WebDriver driver;
	ExcelReader er = new ExcelReader();
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

	public By usernameTextBox = By.id("id_username");
	public By passwordTextBox = By.id("id_password");
	public By loginButton = By.xpath("//input[@value='Login']");
	@FindBy(xpath = "//div[contains(text(),'Invalid Username and Password')]")
	private WebElement invalidmessage;
	
	@FindBy(xpath = "//a[contains(text(),'Questers')]")
	private WebElement loggedIdLink;
	
	@FindBy(xpath="//a[contains(text(),'Sign out')]")
	private WebElement signOutLink;
	
   public By Youareloggedintxt= By.xpath("//div[@class='alert alert-primary' and @role='alert']");
	
	
   public void getloggedintxt() {
	   
	   driver.findElement(Youareloggedintxt).getText();
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
	
	
	

	// enter Username in text box
	public void enterUsernameTxt(String username) {
		driver.findElement(usernameTextBox).sendKeys(username);
	}

	// enter Password in text box
	public void enterPasswordTxt(String password) {
		driver.findElement(passwordTextBox).sendKeys(password);
	}

	// click login button
	public void Clickloginbutton() {
		driver.findElement(loginButton).click();
	}

	// Login with valid user and password details
	public void loginWithValidCredentials(String username, String password) throws InterruptedException {
		driver.findElement(usernameTextBox).sendKeys(username);
		driver.findElement(passwordTextBox).sendKeys(password);
		driver.findElement(loginButton).click();
	}

	public void passwordTextField(String password) {
		driver.findElement(passwordTextBox).sendKeys(password);
	}


public void enterLoginFormFields(String sheetname, int row) 
	        throws InvalidFormatException, IOException, OpenXML4JException {
	    System.out.println("Inside enterLoginFormFields");
	    
	    // Fetch data from the Excel sheet
	    List<Map<String, String>> testdata = er.getData("src/main/resources/DSAlgoExcelsheets/ScenarioData.xlsx", sheetname);
	    System.out.println("Login test data ---------> " + testdata);

	    // Fetch and log the username
	    String username = testdata.get(row).get("username").trim();
	    System.out.println("Fetched username from Excel: " + username);
	    enterUsernameTxt(username);

	    // Fetch and log the password
	    String password = testdata.get(row).get("password").trim();
	    System.out.println("Fetched password from Excel: " + password);
	    enterPasswordTxt(password);
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

	}

	public void sendTextUsername1() {
		WebElement usernameField = driver.findElement(By.id("Tester")); // Update selector if needed
		usernameField.clear(); // Clear any pre-filled text
		usernameField.sendKeys("testUsername"); // Replace "testUsername" with dynamic input if required
	}

	public void sendtextpassword1() {
		WebElement passwordField = driver.findElement(By.id("Test@113")); // Update selector if needed
		passwordField.clear(); // Clear any pre-filled text
		passwordField.sendKeys("testPassword"); // Replace "testPassword" with dynamic input if required
	}

	
public void InvalidMessage(String expectedmessage) {
	    // Get the actual error message and trim any extra spaces
	    String actualmessage = invalidmessage.getText().trim();
	    
	    // Log the actual message for debugging
	    System.out.println("Error Message Displayed: " + actualmessage);
	    
	    // Assert the actual and expected messages match
	    Assert.assertEquals(actualmessage, expectedmessage.trim(), "Error message mismatch!");
	}
	



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



}
