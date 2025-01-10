package dsAlgoDriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public  WebDriver Intializebrowser(String BrowserName) {

		if (BrowserName.equals("Chrome")) {

			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());

		} else if (BrowserName.equals("Firefox")) {

			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());

		} else if (BrowserName.equals("Edge")) {

			WebDriverManager.edgedriver().setup();
			tlDriver.set(new EdgeDriver());
		} else if (BrowserName.equals("Safari")) {

			WebDriverManager.safaridriver().setup();
			tlDriver.set(new SafariDriver());

		} else {
			System.out.println("Please pass the correct browser value: " + BrowserName);
		}

		getdriver().manage().deleteAllCookies();
		getdriver().manage().window().maximize();
		return getdriver();
	}

	public static synchronized WebDriver getdriver() {

		return tlDriver.get();

	}
}


