package dsAlgoPages;

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
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgoUtils.ConfigReader;
import dsAlgoUtils.ExcelDataReader;

public class TryEditorPage {

	WebDriver driver;
	Properties prop;
	List<Map<String, String>> excelData;
	String option;
	String codeToRun;
	String actualResult;
	List<String> actualresults = new ArrayList<>();
	String result;

	public TryEditorPage(WebDriver driver) {
		this.driver = driver;
		this.prop = ConfigReader.initializeprop();
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@onclick='runit()']")
	private WebElement Runbutton;
	@FindBy(id = "output")
	private WebElement tryeditoroutput;

	public void runButton() {
		Runbutton.click();

	}

	public void enteringCode(String Sheetname, int rowNumber, String code) {
		try {

			ExcelDataReader ExcelDataReader = new ExcelDataReader();
			excelData = ExcelDataReader.DataFromExcel(Sheetname);
			System.out.println("sheetname:" + Sheetname);

			String codeToRun = "";

			if (code.equalsIgnoreCase("Valid")) {
				codeToRun = excelData.get(rowNumber).get("Valid");
			} else if (code.equalsIgnoreCase("Invalid")) {
				codeToRun = excelData.get(rowNumber).get("Invalid");
			}

			System.out.println("Excel data: " + excelData);
			System.out.println("Code to run: " + codeToRun);

			WebElement codeMirror = driver.findElement(
					By.xpath("//div[contains(@class, 'CodeMirror') and contains(@class, 'cm-s-default')]"));

			Actions actions = new Actions(driver);
			actions.moveToElement(codeMirror).click().perform();

			WebElement textArea = codeMirror.findElement(By.xpath(".//textarea"));
			textArea.sendKeys(codeToRun);

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

//	public void enteringcode(String Sheetname, int rowNumber)  {
//		try {
//
//			ExcelDataReader ExcelDataReader = new ExcelDataReader();
//			excelData = ExcelDataReader.DataFromExcel(Sheetname);
//			codeToRun = excelData.get(rowNumber).get("PythonCode");
//
//			System.out.println("excel data" + excelData);
//			System.out.println("codetorun: " + codeToRun);
//
//			WebElement codeMirror = driver.findElement(
//					By.xpath("//div[contains(@class, 'CodeMirror') and contains(@class, 'cm-s-default')]"));
//
//			Actions actions = new Actions(driver);
//			actions.moveToElement(codeMirror).click().perform();
//
//			WebElement textArea = codeMirror.findElement(By.xpath(".//textarea"));
//
//			textArea.sendKeys(codeToRun);
//			// runbutton.click();
//
//		} catch (Exception e) {
//			System.out.println("exception: " + e);
//		}
//	}

	public String output() {
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
			actualResult = tryeditoroutput.getText();
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

}