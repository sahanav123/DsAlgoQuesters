package dsAlgoRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/resources/dsAlgoFeatures/DataStructure.feature", 
		glue = { "dsAlgoStepdefinition", "dsAlgoHooks" }, 
		plugin = { "pretty", "html:target/cucumber-reports.html", 
				"json:target/cucumber-reports.json" },

		monochrome = true

// tags = "@stack2" // Runs scenarios with specific tags

)
public class RunnerTest extends AbstractTestNGCucumberTests {

}