package dsAlgoPages;

import java.time.Duration;
import java.util.ArrayList;
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

public class LinkedListPage {
	WebDriver driver;
	Properties prop;
	List<String> actualresults = new ArrayList<>();
	String actualResult;
	String codeToRun;
	List<Map<String, String>> excelData;
	ExcelDataReader exceldatareader;
	String option;

	public LinkedListPage(WebDriver driver) {
		this.driver = driver;
		this.prop = ConfigReader.initializeprop();
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h4[text()='Linked List']")
	private WebElement Textconfirmlinked;
	@FindBy(linkText = "Introduction")
	private WebElement Introduction;
	@FindBy(xpath = "//p[text()='Introduction']")
	private WebElement TextconfirmIntroduction;
	@FindBy(xpath = "//a[text()='Try here>>>']")
	private WebElement Tryhere;
	@FindBy(xpath = "//a[@href='creating-linked-list']")
	private WebElement CreatingLinkedList;
	@FindBy(xpath = "//a[@href='types-of-linked-list']")
	private WebElement TypesofLnkedlist;
	@FindBy(xpath = "//a[@href='implement-linked-list-in-python']")
	private WebElement Implementlinkedlist;
	@FindBy(linkText = "Traversal")
	private WebElement Traversal;
	@FindBy(xpath="//a[@href='insertion-in-linked-list']")
	private WebElement Insertion;
	@FindBy(linkText="Deletion")
	private WebElement Deletion;
	
	
	

	public boolean textconfirmlinked() {
	return 	Textconfirmlinked.isDisplayed();
	}

	public void introduction() {
		Introduction.click();

	}


	

	public void stackOptions(String Sheetname, int rowNumber) {
		try {
			ExcelDataReader ExcelDataReader = new ExcelDataReader();
			excelData = ExcelDataReader.DataFromExcel(Sheetname);
			option = excelData.get(rowNumber).get("Options");
			System.out.println("options are : " + option);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement optionMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(option)));
			optionMenu.click();
			// driver.findElement(By.linkText(option)).click();
		} catch (Exception e) {
			System.out.println("exception: " + e);
		}
	}

	public void tryHere() {
		Tryhere.click();
	}

	public void creatingLinkedList() {
		CreatingLinkedList.click();
	}

	public void typesofLnkedlist() {
		TypesofLnkedlist.click();
	}

	public void implementlinkedlist() {
		Implementlinkedlist.click();

	}

	public void traversal() {
		Traversal.click();

	}
	public void insertion() {
		Insertion.click();
	}
	public void deletion() {
		Deletion.click();
	}

}
