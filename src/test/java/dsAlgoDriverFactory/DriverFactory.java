package dsAlgoDriverFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public WebDriver initializeBrowser(String browser) {
		if (browser == null || browser.isEmpty()) {
			throw new IllegalArgumentException("Browser name must not be null or empty.");
		}

		try {
			switch (browser.toLowerCase()) {
			
			case "chrome":
				ChromeOptions Coptions = new ChromeOptions();
				Coptions.addArguments("headless");
				tlDriver.set(new ChromeDriver(Coptions));
				break;
			case "firefox":
				FirefoxOptions Foptions = new FirefoxOptions();
				Foptions.addArguments("headless");
				tlDriver.set(new FirefoxDriver(Foptions));
				break;
			case "edge":
				EdgeOptions eOptions = new EdgeOptions();
				eOptions.addArguments("headless"); 
				tlDriver.set(new EdgeDriver(eOptions));
				break;
			default:
				throw new IllegalArgumentException("Unsupported browser: " + browser);
			}
		} catch (Exception e) {
			System.out.println("Error initializing browser: " + e.getMessage());
			throw e;
		}

		getdriver().manage().deleteAllCookies();
		getdriver().manage().window().maximize();
		getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return getdriver();
	}

	public static synchronized WebDriver getdriver() {
		WebDriver driver = tlDriver.get();
		if (driver == null) {
			throw new IllegalStateException("WebDriver is not initialized. Did you call initializeBrowser?");
		}
		return driver;
	}

	public static void removedriver() {
		tlDriver.remove(); // Clear the ThreadLocal after quitting the driver
	}
}
