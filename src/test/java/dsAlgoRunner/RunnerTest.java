package dsAlgoRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/resources/dsAlgoFeatures/Arrays.feature", // Path to feature files

		glue = { "dsAlgoStepdefinition", "dsAlgoHooks" }, // Package containing step definition files
		plugin = { "pretty", "html:target/cucumber-reports.html", // Generates an HTML report
				"json:target/cucumber-reports.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		// dryRun= true,
		monochrome = true// Makes console output more readable

// tags = "@Array2"// Runs scenarios with specific tags

)
public class RunnerTest extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios();

	}
}