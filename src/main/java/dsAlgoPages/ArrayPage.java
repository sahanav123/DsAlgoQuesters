package dsAlgoPages;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgoUtils.ConfigReader;
import dsAlgoUtils.ExcelDataReader;

public class ArrayPage {
	WebDriver driver;
	private Properties prop;
	String option;
	List<Map<String, String>> excelData;
	List<WebElement> questions;
	String alertText;
	
	//1.Locators 
	@FindBy(xpath = "//h4[text()='Array']")private WebElement arrayHeader;
	@FindBy(linkText = "Arrays in Python")private WebElement arraysInPython;
	@FindBy(linkText = "Arrays Using List")private WebElement arraysUsingList;
	@FindBy(linkText = "Basic Operations in Lists")private WebElement basicOperationsinLists;
	@FindBy(linkText = "Applications of Array")private WebElement applicationsofArray;
	@FindBy(linkText = "Options")WebElement arrayOptions;
	@FindBy(linkText = "Practice Questions")private WebElement practiceQuestionLink;
	@FindBy(xpath = "//a[text()='Try here>>>']")private WebElement Tryhere;
	@FindBy(linkText="Search the array")private WebElement Question1;
	@FindBy(linkText = "Max Consecutive Ones")private WebElement Question2 ;
	@FindBy(linkText = "Find Numbers with Even Number of Digits")private WebElement Question3 ;
	@FindBy(xpath="//a[text()='Squares of a Sorted Array']")private WebElement Question4 ;
	@FindBy(xpath = "//a[contains(@class, 'list-group-item')]")List<WebElement> practiceQuestions;
	@FindBy(xpath="//button[@type='button']")private WebElement runbutton;
	@FindBy(xpath="//input[@type='submit']")private WebElement submitbutton ;
	@FindBy(xpath="//pre[@id='output' and text()='Error occurred during submission']")private WebElement outPut;
	
	// 2. Constructor of Page Class
	public ArrayPage(WebDriver driver) {
		if (driver == null) {
			throw new IllegalArgumentException("WebDriver instance cannot be null.");
		}
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.prop = ConfigReader.initializeprop();
	}
	//methods
	public void ArrayOptions(String Sheetname, int rowNumber){
		try {
			ExcelDataReader ExcelDataReader = new ExcelDataReader();
			List<Map<String, String>> excelData = ExcelDataReader.DataFromExcel(Sheetname);
			option = excelData.get(rowNumber).get("Options");
			System.out.println("options are : " + option);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement options = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(option)));
			options.click();
		} catch(Exception e) {
			System.out.println("exception: "+e);
		}
	}
	//Action methods
	public boolean arrayPageIsDisplayed() {
		return arrayHeader.isDisplayed();
	}
	public boolean arraysInPythonIsDisplayed() {
		return arraysInPython.isDisplayed();
	}
	public boolean arraysUsingListIsDisplayed() {
		return arraysUsingList.isDisplayed();
	}
	public boolean basicOperationsInListsIsDisplayed() {
		return basicOperationsinLists.isDisplayed();
	}
	public boolean applicationsOfArrayIsDisplayed() {
		return applicationsofArray.isDisplayed();
	}
	public void clickArrayInPython() {
		arraysInPython.click();
	}
	public void clickArraysUsingList() {
		arraysUsingList.click();
	}
	public void clickBasicOperationsInLists() {
		arraysInPython.click();
	}		
	public void clickApplicationsOfArray() {
		arraysInPython.click();
	}
	public void tryHere() {
		Tryhere.click();	
	}
	public void clickOnPracticeQuestionLink() {
		practiceQuestionLink.click();
	}
		public boolean maxConsecutiveOnesIsDisplyed() {
			return Question2.isDisplayed();
		}
		public boolean findNumberswithEvenNumberofDigitsIsDisplyed() {
			return Question2.isDisplayed();
		}
	public boolean squaresofaSortedArrayIsDisplyed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(Question4)).isDisplayed();
	}
	public void clickOnsearchTheArray() {
	Question1.click();
}
	public void clickOnMaxConsecutiveOnes() {
	Question2.click();
	}
	public List<WebElement> getPracticeQuestions() {
		return practiceQuestions;
	}
	public void run() {
		runbutton.click();
	}

	public String actualResult() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	try {
		// Switch to alert box if present
		Alert alert = driver.switchTo().alert();
		alertText = alert.getText();
		alert.accept(); // Accept the alert
		System.out.println("Alert message of invalid code: " + alertText);
	} catch (NoAlertPresentException e) {
		// No alert present, handle as normal
		System.out.println("actual result of valid code: " + alertText);
	}
	return alertText;
	}
	public void submit() {
		submitbutton.click();
	}
	public String actualOutputResult() {
		return  outPut.getText();
		}
	
//	public void allQuestions(String Sheetname) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement Questions = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(Sheetname)));
//		Questions.click();
//
//		
	}
	
	

// submission success
	