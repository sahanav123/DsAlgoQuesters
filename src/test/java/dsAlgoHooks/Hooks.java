package dsAlgoHooks;

import java.io.ByteArrayInputStream;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoUtils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks {

	private static WebDriver driver;
	private static DriverFactory driverFactory = new DriverFactory();
	private static Properties prop;

	@Before
	public void beforeScenario() throws Throwable {

		prop = ConfigReader.initializeprop();
		// String browser = prop.getProperty("browser");
		String browser = ConfigReader.getBrowserType();
		driver = driverFactory.initializeBrowser(browser);
		driver.get(prop.getProperty("URL"));
	}

//	@Before
//	public void beforeScenario() throws Throwable {
//
//		prop = ConfigReader.initializeprop();
//		String browser = System.getProperty("browser");
//		if (browser == null || browser.isEmpty()) {
//			browser = ConfigReader.getBrowserType();
//		}
//		driver = driverFactory.initializeBrowser(browser);
//		driver.get(prop.getProperty("URL"));
//	}

	@After(order = 0)
	public void quitBrowser() {
		if (DriverFactory.getdriver() != null) {
			DriverFactory.getdriver().quit();
			DriverFactory.removedriver();
		}
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
			Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
		}
	}
}
