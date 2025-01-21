package dsAlgoRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


                                      //Specifies that this class will use Cucumber's test runner.
@CucumberOptions(

    features = "src/test/resources/dsAlgoFeatures/DataStructure.feature",       // Path to feature files
     glue={"dsAlgoStepdefinition","dsAlgoHooks"},       // Package containing step definition files
    plugin = {
        "pretty",                                                                     // Prints Gherkin steps in the console
        "html:target/cucumber-reports.html",                   // Generates an HTML report
        "json:target/cucumber-reports.json"                       // Generates a JSON report
    },
    
    monochrome = true  ,                                            // Makes console output more readable
     tags ="@Tag12"                                                    // Runs scenarios with specific tags
)
public class RunnerTest extends AbstractTestNGCucumberTests{
	
    // No additional code needed; the annotations do all the work!
}