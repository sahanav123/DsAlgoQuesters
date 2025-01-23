package dsAlgoPages;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import dev.failsafe.internal.util.Durations;
import dsAlgoUtils.ConfigReader;
import dsAlgoUtils.ExcelDataReader;

public class TreePage {
	public WebDriver driver;
	Properties prop;
	List<Map<String,String>> excelData; 
	String option;
	String codetorun;
	String actualResult;
	String result;
	List<String> actualresults = new ArrayList<>();
//1.Create constructor
	public TreePage(WebDriver driver) {
		this.driver=driver; 
		this.prop= ConfigReader.initializeprop();
		PageFactory.initElements(driver, this);
	}
//2. Locators
	
	@FindBy(xpath="//a[text()='Try here>>>']")
	private WebElement TryHereBtn;
	@FindBy(xpath="//button[text()='Run']")
	private WebElement RunBtn;
	@FindBy(xpath="//h4[text()='Tree']")
	private WebElement DisplayTreeText;
	@FindBy(id="output")
	private WebElement ValidPythonResult;
	@FindBy(xpath="//a[text()='Overview of Trees']")
	private WebElement OverviewOfTrees;
	@FindBy(xpath="//a[text()='Terminologies']")
	private WebElement Terminologies;
	@FindBy(xpath="//a[text()='Types of Trees']")
	private WebElement TypesOfTrees;
	@FindBy(xpath="//a[text()='Tree Traversals']")
	private WebElement TreeTraversals;
	@FindBy(xpath="//a[text()='Traversals-Illustration']")
	private WebElement TraversalsIllustration;
	@FindBy(xpath="//a[text()='Binary Trees']")
	private WebElement BinaryTrees;
	@FindBy(xpath="//a[text()='Types of Binary Trees']")
	private WebElement TypesOfBinaryTrees;
	@FindBy(xpath="//a[text()='Implementation in Python']")
	private WebElement ImplementationInPython;
	@FindBy(xpath="//a[text()='Binary Tree Traversals']")
	private WebElement BinaryTreeTraversals;
	@FindBy(xpath="//a[text()='Applications of Binary trees']")
	private WebElement ApplicationsOfBinaryTrees;
	@FindBy(xpath="//a[text()='Binary Search Trees']")
	private WebElement BinarySearchTrees;
	@FindBy(xpath="//a[text()='Implementation Of BST']")
	private WebElement ImplementationOfBST;
	@FindBy(xpath="//a[text()='Practice Questions']")
	private WebElement PracticeQuestionPage;
	//Methods
	public void TreeOptions(String SheetName,int RowNumber) {
		try {
			ExcelDataReader ExcelDataReader = new ExcelDataReader();
			 excelData = ExcelDataReader.DataFromExcel(SheetName);//storing all data information in list through mapping
			 option = excelData.get(RowNumber).get("Options");//calling the header name (Options)
			 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			 WebElement OptionType = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(option)));
			 OptionType.click();
		}catch(Exception e) {
			System.out.println("exception: "+e);
	}
	}
	public void TryHereBtn() {
		TryHereBtn.click();
	}
	public String ActualTryEditorTitlePageUrl() {
		String ActualTryEditor=driver.getCurrentUrl();
		return ActualTryEditor;
	}
	public String ExpectedTryEditorTitlePageUrl() {
		return "https://dsportalapp.herokuapp.com/tryEditor";
	}
	public String alertMessage() {
		Alert alert =driver.switchTo().alert();
		String AlertMessage=driver.switchTo().alert().getText();
		System.out.println("The alertmessge is " +AlertMessage);
		alert.accept();
		return AlertMessage;
		
	}
	public void RunBtn() {
		RunBtn.click();
	}
	public void OverviewOfTrees() {
		OverviewOfTrees.click();
	}
	
	public boolean DisplayTreeText() {
		boolean ConfirmTreeText = DisplayTreeText.isDisplayed();
		return  ConfirmTreeText;
	}
	
	public void validationCode(String code,String Sheetname, int RowNumber)  {
		try {
			
			ExcelDataReader ExcelDataReader = new ExcelDataReader();
			excelData = ExcelDataReader.DataFromExcel(Sheetname);
			System.out.println("excel data" + excelData);
			String codetorun="";
			if(code.equalsIgnoreCase("Valid"))
			{
				codetorun=excelData.get(RowNumber).get("Valid");
			}else if(code.equalsIgnoreCase("Invalid"))
			{
			codetorun=excelData.get(RowNumber).get("Invalid");	
			}

			
			System.out.println("codetorun: " + codetorun);

			WebElement TryEditor = driver.findElement(
					By.xpath("//div[contains(@class, 'CodeMirror') and contains(@class, 'cm-s-default')]"));

			Actions actions = new Actions(driver);
			actions.moveToElement(TryEditor).click().perform();

			WebElement textArea =  TryEditor.findElement(By.xpath(".//textarea"));

			textArea.sendKeys(codetorun);
			
		} catch (Exception e) {
			System.out.println("exception: " + e);
		}
	}
	public String Result() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			// Switch to alert box if present
			Alert alert = driver.switchTo().alert();
			actualResult = alert.getText();

			System.out.println("Alert message of invalid code: " + actualResult);
			actualresults.add(actualResult);
			alert.accept(); // Accept the alert
		} catch (NoAlertPresentException e) {
			// No alert present, handle as normal
			actualResult =ValidPythonResult.getText();
			actualresults.add(actualResult);
			System.out.println("actual result of valid code: " + actualResult);
		}
		return actualResult;
	}
	
	public String expected(String expectedresult, String Sheetname, int rowNumber) {

		try {
			ExcelDataReader ExcelDataReader = new ExcelDataReader();
			excelData = ExcelDataReader.DataFromExcel(Sheetname);

			if (expectedresult.equalsIgnoreCase("successouput")) {
				result = excelData.get(rowNumber).get("successouput"); // Assuming column for valid code is
																		// "ValidCode"
			} else if (expectedresult.equalsIgnoreCase("alertmessageoutput")) {
				result = excelData.get(rowNumber).get("alertmessageoutput"); // Assuming column for invalid code is
																				// "InvalidCode"
			}

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		return result;

	}

	public void Terminologies() {
		 Terminologies.click();
	}
	public void TypesOfTrees() {
		TypesOfTrees.click();
	}
	public void TreeTraversals() {
		TreeTraversals.click();
	}
	public void TraversalsIllustration() {
		TraversalsIllustration.click();
	}
	public void BinaryTrees() {
		BinaryTrees.click();
	}
	public void TypesOfBinaryTrees() {
		TypesOfBinaryTrees.click();
	}
	public void ImplementationInPython() {
		ImplementationInPython.click();
	}
	public void BinaryTreeTraversals() {
		 BinaryTreeTraversals.click();
	}
	public void ApplicationsOfBinaryTrees() {
		ApplicationsOfBinaryTrees.click();
	}		
	public void BinarySearchTrees() {
		BinarySearchTrees.click();
	}
	public void ImplementationOfBST() {
		ImplementationOfBST.click();
	}
	public void PracticeQuestionPage() {
		PracticeQuestionPage.click();
	}
	public String  PracticeQuestionUrl() {
		String practiceUrl= "https://dsportalapp.herokuapp.com/tree/practice";
		return practiceUrl;
	}
	
	public String CurrentPracticeQuestionUrl() {
		String CurrentUrl=driver.getCurrentUrl();
		return CurrentUrl;
	}
	}
	
	
	
