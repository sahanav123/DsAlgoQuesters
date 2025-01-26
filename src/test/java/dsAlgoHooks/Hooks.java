package dsAlgoHooks;

import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoUtils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import java.io.ByteArrayInputStream;

public class Hooks {

	private WebDriver driver;
	private DriverFactory driverfactory;
	private ConfigReader configReader;
	Properties prop;

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.initializeprop();
	}

	@Before(order = 1)
	public void launchBrowser() {

		String browserName = prop.getProperty("browser");
		//String browserName = System.getProperty("browser");
		driverfactory = new DriverFactory();
		driver = driverfactory.Intializebrowser(browserName);

		DriverFactory.getdriver();
		driver.get(prop.getProperty("URL"));
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
			Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(sourcePath));
		}

	}
}