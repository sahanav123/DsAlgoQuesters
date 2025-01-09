package dsAlgoHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoUtils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

	private WebDriver driver ;
	private DriverFactory driverfactory;
	private ConfigReader configReader;
	Properties prop;
	
	
	@Before(order=0)
	public void getProperty() {
		configReader= new ConfigReader(); 
		prop =configReader.init_prop();
			}
	@Before(order=1)
	public void launchBrowser() {
		String browserName=prop.getProperty("browser");
		driverfactory = new DriverFactory();
		driver=driverfactory.Intializebrowser(browserName);
		driver.get(prop.getProperty("URL"));
	}
	
	@After(order=0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After(order=1)
	public void tearDown(Scenario scenario) {
    if(scenario.isFailed()) {
    	//take screenshot
    	String screanshotName=scenario.getName().replaceAll(" ","_");
    	byte[] sourcePath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    	scenario.attach(sourcePath, screanshotName, screanshotName);
    }

	}
	
}
