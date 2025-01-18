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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgoUtils.ConfigReader;
import dsAlgoUtils.ExcelDataReader;

public class GraphPage {

	WebDriver driver;
	Properties prop;
	List<String> actualresults = new ArrayList<>();
	String actualResult;
	String codeToRun;
	List<Map<String, String>> excelData;
	ExcelDataReader exceldatareader;
	List<Map<String, String>> testData;
	String option;
	String expectederror;

	public GraphPage(WebDriver driver) {
		this.driver = driver;
		this.prop = ConfigReader.initializeprop();
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "Graph")
	private WebElement graphpagegraphoption;
	@FindBy(linkText = "Try here>>>")
	private WebElement Tryherebutton;
	@FindBy(linkText = "Graph Representations")
	private WebElement GraphRepresentation;
	@FindBy(xpath = "//div[contains(@class, 'CodeMirror') and contains(@class, 'cm-s-default')]")
	private WebElement tryeditorpage;
	@FindBy(xpath = "//*[@onclick='runit()']")
	private WebElement runbutton;
	@FindBy(id = "output")
	private WebElement tryeditoroutput;
	@FindBy(linkText = "Practice Questions")
	private WebElement practicequestions;

//--------------------------------------------------------------------------
	public void clickgraphpagegraphoption() {
		graphpagegraphoption.click();
	}

//--------------------------------------------------------------------------
	public String garpModuleUrl() {
		String expectedurl = prop.getProperty("Graphgraphurl");
		return expectedurl;
	}

//--------------------------------------------------------------------
	public String actualUrl() {
		String actualurl = driver.getCurrentUrl();
		return actualurl;
	}

//-------------------------------------------------------------------------	
	public String grapRepresentationUrl() {
		String expectedurl = prop.getProperty("GraphRepresentationurl");
		return expectedurl;
	}

//----------------------------------------------------------------------	
	public void tryherebutton() {
		Tryherebutton.click();

	}

//----------------------------------------------------------------------
	public void Graphrepresentation() {
		GraphRepresentation.click();

	}

//-------------------------------------------------------------------------	

	public void run() {
		runbutton.click();
	}
//----------------------------------------------------------------	

	public String output() {
		String phythonoutput = tryeditoroutput.getText();
		System.out.println("Final output is " + phythonoutput);
		return phythonoutput;
	}

//------------------------------------------------------------------------

	public String tryEditorUrl() {
		String expectedurl = "https://dsportalapp.herokuapp.com/tryEditor";
		return expectedurl;
	}

//--------------------------------------------------------------
	public void clickpracticequestions() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement pq = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Practice Questions")));

		pq.click();
	}
//--------------------------------------------------------------

	public void enteringcode(String Sheetname, int rowNumber) {
		try {

			ExcelDataReader ExcelDataReader = new ExcelDataReader();
			excelData = ExcelDataReader.DataFromExcel(Sheetname);
			codeToRun = excelData.get(rowNumber).get("PythonCode");

			System.out.println("excel data" + excelData);
			System.out.println("codetorun: " + codeToRun);

			WebElement codeMirror = driver.findElement(
					By.xpath("//div[contains(@class, 'CodeMirror') and contains(@class, 'cm-s-default')]"));

			Actions actions = new Actions(driver);
			actions.moveToElement(codeMirror).click().perform();

			WebElement textArea = codeMirror.findElement(By.xpath(".//textarea"));

			textArea.sendKeys(codeToRun);
			// runbutton.click();

		} catch (Exception e) {
			System.out.println("exception: " + e);
		}
	}

	public String validExpected(String Sheetname, int rowNumber) {

		try {
			expectederror = excelData.get(rowNumber).get("expectedResult");
			System.out.println("stepexpectederror: " + expectederror);
			// return expectederror;

//		String expectedResult = excelData.get(rowNumber).get(1);
//
//		System.out.println("expectedresult1: " + expectedResult);
//		return expectedResult;

		} catch (Exception e) {
			System.out.println("exception: " + e);
		}
		return expectederror;

	}

	public String validOutput() {

		String actualResult = tryeditoroutput.getText();
		actualresults.add(actualResult);
		System.out.println("actual result: " + actualResult);
		return actualResult;

	}

	public String alertmessage() {
		Alert alert = driver.switchTo().alert();
		actualResult = alert.getText();

		System.out.println("Alert message: " + actualResult);
		actualresults.add(actualResult);
		alert.accept();
		return actualResult;

	}

	public void dataStructureDropDownOptionsClick(String Sheetname, int rowNumber) {
		try {
			ExcelDataReader ExcelDataReader = new ExcelDataReader();

			excelData = ExcelDataReader.DataFromExcel(Sheetname);

			option = excelData.get(rowNumber).get("DataStructureDropDownOptions");

			System.out.println("options are : " + option);

			driver.findElement(By.linkText(option)).click();
		} catch (Exception e) {
			System.out.println("exception: " + e);
		}

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement dropdownMenu = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.className("dropdown-menu")));
//
//		List<WebElement> dropdownOptions = dropdownMenu.findElements(By.className("dropdown-item"));
//
//		for (WebElement option : dropdownOptions) {
//
//			if (option.getText().equals(Section)) {
//				option.click();
//				break;
//
//			}
//		}
	}

	public String datadropdownurls(String Sheetname, int rowNumber) {
		option = excelData.get(rowNumber).get("DataStructureDropDownOptions");
		if (option.equals("Arrays")) {

			option = "array";

		}

		String Urls = prop.getProperty("URL") + option.toLowerCase().replace(" ", "-") + "/";
		System.out.println("urls: " + Urls);
		return Urls;

	}

	public String out() {
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

}