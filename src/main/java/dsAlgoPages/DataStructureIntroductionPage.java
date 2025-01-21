package dsAlgoPages;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgoUtils.ConfigReader;

public class DataStructureIntroductionPage {
	private WebDriver driver;
    private Properties prop;
    
  
	
	public DataStructureIntroductionPage(WebDriver driver) {

		this.driver = driver;

		this.prop = ConfigReader.initializeprop();

		PageFactory.initElements(driver, this);


		}
	
	
	public By timeComplexityLink = By.xpath("//a[contains(@href, 'time-complexity')]");
	public By textdisplayinDataStructurePage=By.xpath("//h4[@class='bg-secondary text-white' and contains(text(), 'Data Structures-Introduction')]");          
	public By textdisplayinTimeComplexityPage=By.xpath("//p[@class='bg-secondary text-white' and text()='Time Complexity']");
	public By TryHereButton =By.xpath("//a[@href='/tryEditor']");
	
	
	//By btn_tryEditor=By.xpath("//a[@href=\"/tryEditor\"]");
	By textArea=By.xpath("//textarea[@tabindex='0']");
	By runBtn=By.xpath("//button[text()='Run']");
	By outputText=By.xpath("//*[@id='output']");

	
	public boolean isTextDisplayedInDataStructurePage() {
	    try {
	        return driver.findElement(textdisplayinDataStructurePage).isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false; // Element not found
	    }
	}
	
	

	public boolean isTextDisplayedInTimeComplexityPage() {
	    try {
	        return driver.findElement(textdisplayinTimeComplexityPage).isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false; // Element not found
	    }
	}
	
	public void ClickTryHereButton() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement TryHereButtonElement = wait.until(ExpectedConditions.elementToBeClickable(TryHereButton));
		
		driver.findElement(TryHereButton).click();
		System.out.println("Navigated to try Editor with a Run button to test");
	}
	
	public void ClickTimeComplexityLink() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		    WebElement timeComplexityLinkElement = wait.until(ExpectedConditions.elementToBeClickable(timeComplexityLink));
     driver.findElement(timeComplexityLink).click();
			System.out.println("Navigated to the Time Complexity page.");
		}
		
		
	
	
	public String getDataStructureModuleUrl() {

		return  prop.getProperty("DataStructureURL");


		}
	
	public String actualUrl() {

		return driver.getCurrentUrl();

	

		}
	
	public void enter_input(String code)
	{
		
		Actions actions=new Actions(driver);
		WebElement textEditor=driver.findElement(textArea);
		actions.moveToElement(textEditor).click().sendKeys(code).build().perform(); 
	}
	
	
	public void click_run()
	{
		driver.findElement(runBtn).click();
	}
	
	
	public void click_tryEditor()
	{
		try {
	   By tryeditor=By.xpath("//a[@href='/tryEditor']");
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(tryeditor)).perform();
		driver.findElement(tryeditor).click();
		}catch (Exception e) {
            System.out.println("Element not found or not clickable: " + e.getMessage());
        }
		//LoggerLoad.info("Clicking the try editor link of array page");

	}
	
	public boolean isAlertPresent(){
	    try{
	        driver.switchTo().alert();
	        return true;
	    }
	    catch (NoAlertPresentException e){
	        return false;
	    }
	}

	public void capture_alert()
	{
		Alert alert = driver.switchTo().alert(); // switch to alert

		String alertMessage= driver.switchTo().alert().getText(); // capture alert message
        System.out.println(alertMessage); // Print Alert Message
	
	}
	
	
	public String get_outputText() 
	{
		
		String consoleOutput=driver.findElement(outputText).getText();
		return consoleOutput;
	}
	

	
	}


	
