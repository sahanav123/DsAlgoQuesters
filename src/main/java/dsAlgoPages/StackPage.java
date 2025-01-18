package dsAlgoPages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgoUtils.ConfigReader;
import dsAlgoUtils.ExcelDataReader;


public class StackPage {
	WebDriver driver;
	Properties prop;
	List<Map<String, String>> excelData;
	String option;

	public StackPage(WebDriver driver) {
		this.driver = driver;
		this.prop = ConfigReader.initializeprop();
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Try here>>>']")
	private WebElement Tryhere;
	@FindBy(xpath = "//a[@href='operations-in-stack']")
	private WebElement Operationsinstack;
	@FindBy(linkText = "Implementation")
	private WebElement Implementation;
	@FindBy(linkText = "Applications")
	private WebElement Applications;

	public void stackOptions(String Sheetname, int rowNumber){
		try {
			ExcelDataReader ExcelDataReader = new ExcelDataReader();
			excelData = ExcelDataReader.DataFromExcel(Sheetname);
			option = excelData.get(rowNumber).get("Options");
			System.out.println("options are : " + option);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement optionMenu = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(option)));
			optionMenu.click();
			//driver.findElement(By.linkText(option)).click();
		} catch(Exception e) {
			System.out.println("exception: "+e);
		}
	}
	

	public void tryHere() {
		Tryhere.click();
	}

	public void operationsinstack() {
		Operationsinstack.click();
	}

	public void implementation() {
		Implementation.click();
	}

	public void applications() {
		Applications.click();
	}
}
