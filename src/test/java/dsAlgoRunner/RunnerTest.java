package dsAlgoRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/resources/dsAlgoFeatures/Signin.feature",

		glue = { "dsAlgoStepdefinition", "dsAlgoHooks" }, plugin = { "pretty", "html:target/cucumber-reports.html",
				"json:target/cucumber-reports.json" },

		monochrome = true

 //tags = "@graph8"

)
public class RunnerTest extends AbstractTestNGCucumberTests {

}