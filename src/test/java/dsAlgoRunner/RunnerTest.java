package dsAlgoRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

<<<<<<< HEAD
		features = "src/test/resources/dsAlgoFeatures/Signin.feature",
=======
		features = "src/test/resources/dsAlgoFeatures/Arrays.feature", // Path to feature files
>>>>>>> main

		glue = { "dsAlgoStepdefinition", "dsAlgoHooks" }, plugin = { "pretty", "html:target/cucumber-reports.html",
				"json:target/cucumber-reports.json" },
		// dryRun= true,
		monochrome = true// Makes console output more readable

<<<<<<< HEAD
		monochrome = true

 //tags = "@graph8"
=======
// tags = "@Array2"// Runs scenarios with specific tags
>>>>>>> main

)
public class RunnerTest extends AbstractTestNGCucumberTests {

}