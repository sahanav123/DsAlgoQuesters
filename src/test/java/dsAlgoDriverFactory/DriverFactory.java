package dsAlgoDriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public WebDriver Intializebrowser(String BrowserName) {
        if (BrowserName == null || BrowserName.isEmpty()) {
            throw new IllegalArgumentException("BrowserName must not be null or empty.");
        }

        try {
            switch (BrowserName) {
                case "Chrome":
                    WebDriverManager.chromedriver().setup();
                    tlDriver.set(new ChromeDriver());
                    break;
                case "Firefox":
                    WebDriverManager.firefoxdriver().setup();
                    tlDriver.set(new FirefoxDriver());
                    break;
                case "Edge":
                    WebDriverManager.edgedriver().setup();
                    tlDriver.set(new EdgeDriver());
                    break;
                case "Safari":
                    WebDriverManager.safaridriver().setup();
                    tlDriver.set(new SafariDriver());
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported browser: " + BrowserName);
            }
        } catch (Exception e) {
            System.out.println("Error initializing browser: " + e.getMessage());
            throw e;
        }

        getdriver().manage().deleteAllCookies();
        getdriver().manage().window().maximize();
        return getdriver();
    }

    public static synchronized WebDriver getdriver() {
        WebDriver driver = tlDriver.get();
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized. Did you call Intializebrowser?");
        }
        return driver;
    }


}


