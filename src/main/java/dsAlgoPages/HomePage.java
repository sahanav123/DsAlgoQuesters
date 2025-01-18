package dsAlgoPages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgoUtils.ConfigReader;

public class HomePage {

	WebDriver driver;
	Properties prop;
	List<String> beforevalidation = new ArrayList<>();

	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.prop = ConfigReader.initializeprop();
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
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement errormessage;
	

//-----------------------------------------------------------------------------
	public void url() {

		driver.get(prop.getProperty("URL"));
	}
//-------------------------------------------

	public String getExpectedUrl() {
		return "https://dsportalapp.herokuapp.com/";
	}

//-----------------------------------------------
	public String getActualUrl() {
		return driver.getCurrentUrl();
	}
//----------------------------------------------- 

	public String landondsalgoportal() {

		String DsAlgoportalurl = prop.getProperty("URL");
		return DsAlgoportalurl;

	}
//------------------------------------------------	

	public void clickLaunchPageGetstartedbutton() {
		launchPageGetstartedbutton.click();
	}
//---------------------------------------------------	

	public String verifyHomeUrl() {

		String homeUrl = prop.getProperty("Homeurl");
		return homeUrl;
	}

//----------------------------------------------	
	public void clickSignin() {
		signin.click();
	}
//----------------------------------------------	

	public void clickRegister() {
		Register.click();

	}

//------------------------------------------------	
	public void clickDataStructuresDropDown() {
		DataStructuresDropDown.click();

	}

//--------------------------------------------------	
	public void dataStructureDropDownList(String option1, String option2, String option3, String option4,
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

	public void clickonGetstartedofOptions(String Section) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement getStartedButton = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='col']/div/div[h5[text()='" + Section + "']]/a[text()='Get Started']")));
		getStartedButton.click();

	}

//----------------------------------------------------------------	
	public String errorMessageGetStarted() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement errorMessageElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
		String actualMessage = errorMessageElement.getText();
		System.out.println(actualMessage);
		return actualMessage;
	}

//--------------------------------------------------------------------
	public void getStartedofGraph() {
		GetStartedofGraph.click();
	}

//--------------------------------------------------------------------
	public void getStartedDataStructureIntroduction() {
		getstartedofdatastructureintroduction.click();
	}

//-------------------------------------------------------------------
	public void getStartedArray() {
		getstartedArray.click();

	}

//-------------------------------------------------------------------
	public void getStartedLinkedlist() {
		getstartedLinkedlist.click();

	}

//-------------------------------------------------------------------
	public void getStartedStack() {
		getstartedStack.click();

	}

//------------------------------------------------------------------	
	public void getStartedQueue() {
		getstartedQueue.click();
	}

//-----------------------------------------------------------------
	public void getStartedTree() {
		getstartedTree.click();
	}

//-----------------------------------------------------------------	
	public void notNavigatetoOptionsDataStructure(String Section) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dropdownMenu = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.className("dropdown-menu")));

		List<WebElement> dropdownOptions = dropdownMenu.findElements(By.className("dropdown-item"));

		for (WebElement option : dropdownOptions) {

			if (option.getText().equals(Section)) {
				option.click();
				break;

			}
		}
	}

//------------------------------------------------------------------


}