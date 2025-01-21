package dsAlgoPages;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgoUtils.ConfigReader;
import dsAlgoUtils.ExcelDataReader;

public class TryEditorForArraysPracticeQuestions {

	WebDriver driver;
	Properties prop;
	List<Map<String, String>> excelData;
	String option;
	String codeToRun;
	String actualResult;
	List<String> actualresults = new ArrayList<>();
	String result;

	@FindBy(xpath = "//*[@onclick='runit()']")
	private WebElement Runbutton;
	@FindBy(id = "output")
	private WebElement tryeditoroutput;
	@FindBy(id = "output")
	private WebElement Searcharrayoutput;

	

	public TryEditorForArraysPracticeQuestions(WebDriver driver) {
		this.driver = driver;
		this.prop = ConfigReader.initializeprop();
		PageFactory.initElements(driver, this);

	}
	public void runButton() {
		Runbutton.click();

	}

	public void enteringCodeForArary(String Sheetname, int rowNumber) {
		try {

			ExcelDataReader ExcelDataReader = new ExcelDataReader();
			excelData = ExcelDataReader.DataFromExcel(Sheetname);
			System.out.println("sheetname:" + Sheetname);

			String codeToRun = excelData.get(rowNumber).get("pcode");

			System.out.println("Excel data: " + excelData);
			System.out.println("Code to run: " + codeToRun);

			WebElement codeMirror = driver.findElement(
					By.xpath("//div[contains(@class, 'CodeMirror') and contains(@class, 'cm-s-default')]"));

			Actions actions = new Actions(driver);
			actions.moveToElement(codeMirror).click().perform();

			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].CodeMirror.setValue(arguments[1]);", codeMirror, codeToRun);

			enterCodePractice(codeToRun, codeMirror);

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	public void enterCodePractice(String code, WebElement element) {

		new Actions(driver).keyDown(Keys.CONTROL).keyUp(Keys.CONTROL).perform();

		String[] str1 = code.split("\n");

		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equalsIgnoreCase("\\b")) {

				element.sendKeys(Keys.BACK_SPACE);
			} else {

				element.sendKeys(str1[i]);
				element.sendKeys(Keys.RETURN);
			}
		}

	}

	public String actualresultforsearchforarray() {
		String searcharrayoutput = Searcharrayoutput.getText();
		return searcharrayoutput;

	}
	

}
