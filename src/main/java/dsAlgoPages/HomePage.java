package dsAlgoPages;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgoUtils.ExcelDataReader;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//------------------------------------------------------------------------	

	@FindBy(xpath = "//button[@class='btn']")
	private WebElement launchPageGetstartedbutton;
	@FindBy(xpath = "//a[text()='Sign in']")
	private WebElement signin;
	@FindBy(linkText = "Register")
	private WebElement Register;
	@FindBy(xpath = "//a[contains(text(), 'Data Structures')]")
	private WebElement DataStructuresDropDown;
	@FindBy(xpath = "//div[@class='col']/div/div[h5[text()='\" + Section + \"']]/a[text()='Get Started']")
	private WebElement GetStartedbuttonofalloptions;
	@FindBy(xpath = "//*[@href='graph']")
	private WebElement GetStartedofGraph;
	@FindBy(xpath = "//a[@href='data-structures-introduction']")
	private WebElement getstartedofdatastructureintroduction;
	@FindBy(xpath = "//a[@href='array']")
	private WebElement getstartedArray;
	@FindBy(xpath = "//a[@href='linked-list']")
	private WebElement getstartedLinkedlist;
	@FindBy(xpath = "//a[@href='stack']")
	private WebElement getstartedStack;
	@FindBy(xpath = "//a[@href='queue']")
	private WebElement getstartedQueue;
	@FindBy(xpath = "//a[@href='tree']")
	private WebElement getstartedTree;

//-----------------------------------------------------------------------------
	public void url() {
		driver.get("https://dsportalapp.herokuapp.com");
	}
//-------------------------------------------

	public void landondsalgoportal() {

		String expectedUrl = "https://dsportalapp.herokuapp.com/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Actual URL: " + actualUrl);

		if (actualUrl.equals(expectedUrl)) {
			System.out.println("URL matched: User landed on the DS Algo portal.");
		} else {
			System.out.println("URL did not match. Expected: " + expectedUrl + ", but found: " + actualUrl);
		}

	}
//------------------------------------------------	

	public void clicklaunchPageGetstartedbutton() {
		launchPageGetstartedbutton.click();
	}

	public void verifyHomeUrl() {

		String expectedUrl = "https://dsportalapp.herokuapp.com/home";
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Actual URL: " + actualUrl);

		if (actualUrl.equals(expectedUrl)) {
			System.out.println("URL matched.");
		} else {
			System.out.println("URL did not match. Expected: " + expectedUrl + ", but found: " + actualUrl);
		}
	}

//----------------------------------------------	
	public void clicksignin() {
		signin.click();
	}
//----------------------------------------------	

	public void clickRegister() {
		Register.click();

	}

//---------------------------------------------------	
	public void clickDataStructuresDropDown() {
		DataStructuresDropDown.click();

	}

//----------------------------------------------------------	
	public void DataStructureDropDownList(String option1, String option2, String option3, String option4,
			String option5, String option6) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dropdownMenu = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.className("dropdown-menu")));
		List<WebElement> dropdownOptions = dropdownMenu.findElements(By.className("dropdown-item"));

		List<String> actualOptions = new ArrayList<>();
		for (WebElement option : dropdownOptions) {
			actualOptions.add(option.getText());
		}

		List<String> expectedOptions = List.of(option1, option2, option3, option4, option5, option6);

		System.out.println("Actual Dropdown Options: " + actualOptions);
		System.out.println("Expected Dropdown Options: " + expectedOptions);

		if (actualOptions.equals(expectedOptions)) {
			System.out.println("Dropdown options match.");
		} else {
			System.out.println(
					"Dropdown options do not match. Expected: " + expectedOptions + ", but found: " + actualOptions);
		}
	}

//---------------------------------------------------------------

	public void clickonGetstartedofOptions() throws IOException {
		List<String> options = ExcelDataReader.getDataFromExcel("Sheet1");
		System.out.println(options);

		for (String option : options) {
			try {
				// Log the current option being processed
				System.out.println("Processing option: " + option);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				WebElement getStartedButton = wait.until(ExpectedConditions.elementToBeClickable(
						By.xpath("//div[@class='col']/div/div[h5[text()='" + option + "']]/a[text()='Get Started']")));
				getStartedButton.click();

			} catch (Exception e) {
				System.err.println("An error occurred while processing option: " + option);
				e.printStackTrace();
			}
		}
	}

//----------------------------------------------------------------	
	public void ErrormessageGetStarted(String expectedMessage) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement errorMessageElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
		String actualMessage = errorMessageElement.getText();
		System.out.println("Actual Error Message: " + actualMessage);

		if (actualMessage.equals(expectedMessage)) {
			System.out.println("Error message matched: " + actualMessage);
		} else {
			System.out.println(
					"Error message did not match. Expected: " + expectedMessage + ", but found: " + actualMessage);
		}
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement errorMessageElement = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
//		String actualMessage = errorMessageElement.getText();
//		System.out.println(actualMessage);
//		Assert.assertEquals(actualMessage, expectedMessage, "Error message mismatch!");
	}

//--------------------------------------------------------------------
	public void GetStartedofGraph() {
		GetStartedofGraph.click();
	}

//--------------------------------------------------------------------
	public void GetStartedDataStructureIntroduction() {
		getstartedofdatastructureintroduction.click();
	}

//-------------------------------------------------------------------
	public void GetStartedArray() {
		getstartedArray.click();

	}

//-------------------------------------------------------------------
	public void GetStartedLinkedlist() {
		getstartedLinkedlist.click();

	}

//-------------------------------------------------------------------
	public void GetStartedStack() {
		getstartedStack.click();

	}

//------------------------------------------------------------------	
	public void GetStartedQueue() {
		getstartedQueue.click();
	}

//-----------------------------------------------------------------
	public void GetStartedTree() {
		getstartedTree.click();
	}
//-----------------------------------------------------------------	
}
