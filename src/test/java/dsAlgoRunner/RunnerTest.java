package dsAlgoRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/resources/dsAlgoFeatures/Queue.feature", // Path to feature files

		glue = { "dsAlgoStepdefinition", "dsAlgoHooks" }, // Package containing step definition files
		plugin = { "pretty", "html:target/cucumber-reports.html", // Generates an HTML report
				"json:target/cucumber-reports.json" },

		monochrome = true// Makes console output more readable

		//tags = "@stack2" // Runs scenarios with specific tags
)
public class RunnerTest extends AbstractTestNGCucumberTests {

}