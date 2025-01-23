package dsAlgoPages;

import java.io.IOException;
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

public class QueuePage {
	public WebDriver driver;
	Properties prop;
	ArrayList<String>actualURL= new ArrayList<>(); 
	List<Map<String,String>>exceldatareader;
	
	

	//1.Locators of page
	@FindBy(xpath="//a[text()='Implementation of Queue in Python']" )
	private WebElement implementationOfQueueInPythonBtn;
	@FindBy(xpath="//a[text()='Implementation using collections.deque']")
	private WebElement  implementationUsingCollectionsDequeBtn;
	@FindBy(xpath="//a[text()='Implementation using array']")
	private WebElement ImplementationUsingArrayBtn;
	@FindBy(xpath="//a[text()='Queue Operations']")
	private WebElement QueueOperationsBtn;
	@FindBy(xpath="//a[text()='Try here>>>']" )
	private WebElement TryHereBtn;
	@FindBy(xpath = "//div[contains(@class, 'CodeMirror') and contains(@class, 'cm-s-default')]")
	private WebElement TryEditorPage;
	@FindBy(id="output")
	private WebElement TryEditorOutput;
	@FindBy(xpath="//button[@type='button']")
	private WebElement RunBtn;
	@FindBy(xpath="//a[text()='Practice Questions']")
	private WebElement PracticeQuestionBtn;
	
	//2.Constructor to initialize the driver   
	public  QueuePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.prop = ConfigReader.initializeprop();
	}
	//3. Methods to interact with elements
	
	public String QueueActualTitle() {
		String actualTitle = driver.getTitle();
		return actualTitle ;
	}
	public String QueueExpectedTitle() {
		return "Queue";
	}
	  public String ExpectedImplementationOfQueueTitle() {
		
		return "Implementation of Queue in Python";
	}
	
	public String ExpectedTryEditorTitlePage() {
		return "Assessment";
	}
//	public String AcceptedTryEditorTitlePageUrl() {
//		String ActualTryEditor=driver.getCurrentUrl();
//		return ActualTryEditor;
//	}
	public void QueueOperationsBtn() {
		QueueOperationsBtn.click();
	}
	
	public void implementationUsingCollectionsDequeBtn() {
		implementationUsingCollectionsDequeBtn.click();
	}
	public String CollectionDequeTitle() {
		String CollectionTitle= "Implementation using collections.deque";
		return CollectionTitle;
	}
	public String ExpectedImplementationUsingArrayTitle() {
		String UsingArrayTitle= "Implementation using array";
		return UsingArrayTitle;
	}
	
	public String QueueOperationsTitle() {
		String UsingQueueOperationsTitle= "Queue Operations";
		return UsingQueueOperationsTitle;
	}
	//....................................................................
		public void implementationOfQueueInPythonBtn() {
		implementationOfQueueInPythonBtn.click();
	}
		public void ImplementationUsingArrayBtn() {
			ImplementationUsingArrayBtn.click();
		}
	//....................................................................	
	public void TryHereBtn() {
		TryHereBtn.click();
	}
    //.....................................................................
	 public  void RunBtn()
	    {
	    	RunBtn.click();
	    }
	//......................................................................
	 public void PracticeQuestionBtn() {
		 PracticeQuestionBtn.click();
	 }
	 public void PracticeQuestionTopics(String SheetName,int RowNumber)
	 {
		 try {
		 ExcelDataReader ExcelDataReader = new ExcelDataReader();
		
			exceldatareader=ExcelDataReader.DataFromExcel(SheetName);
		String option=exceldatareader.get(RowNumber).get("Options");
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement QueueTopics =wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(option)));
			System.out.println("The number of Queue Topics are  " +QueueTopics);
			 QueueTopics.click();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	 }
		
	 }
	 
	 
