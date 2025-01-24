package dsAlgoRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/resources/dsAlgoFeatures/Tree.feature",

		glue = { "dsAlgoStepdefinition", "dsAlgoHooks" }, plugin = { "pretty",
				"html:src/test/resources/dsAlgoReports/cucumber-reports.html", 
				"json:src/test/resources/dsAlgoReports/cucumber-reports.json",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

		monochrome = true
//tags = "@Array4"

)
public class RunnerTest extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios();

	}

}