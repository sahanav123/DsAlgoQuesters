package dsAlgoRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/resources/dsAlgoFeatures",

		glue = { "dsAlgoStepdefinition", "dsAlgoHooks" }, 
		plugin = { "pretty", "html:target/cucumber-reports.html",
				"json:target/cucumber-reports.json" },

		monochrome = true

    //tags = " @Queue14"

)
public class RunnerTest extends AbstractTestNGCucumberTests {

}