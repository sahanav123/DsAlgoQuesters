package dsAlgoRunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import dsAlgoUtils.ConfigReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/dsAlgoFeatures", glue = { "dsAlgoStepdefinition",
		"dsAlgoHooks" }, plugin = { "pretty", "html:src/test/resources/dsAlgoReports/cucumber-reports.html",
				"json:src/test/resources/dsAlgoReports/cucumber-reports.json",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true)
public class CrossbrowserRunnerTest extends AbstractTestNGCucumberTests {

	@BeforeTest
	@Parameters("browser")
	public void defineBrowser(String browser) {
		ConfigReader.setBrowserType(browser);
	}

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
