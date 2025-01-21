package dsAlgoStepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.GraphPage;
import dsAlgoPages.*;
import dsAlgoPages.TryEditorPage;
import dsAlgoUtils.ConfigReader;
import dsAlgoUtils.ExcelDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArraySteps {

WebDriver driver = DriverFactory.getdriver();
	HomePage HomePage = new HomePage(driver);
	Properties prop = ConfigReader.initializeprop();

	GraphPage GraphPage = new GraphPage(driver);
	TryEditorPage TryEditorPage = new TryEditorPage(driver);
	ArrayPage ArrayPage = new ArrayPage(driver);
	TryEditorForArrayPracticeQuestions tp = new TryEditorForArrayPracticeQuestions(driver);

	List<Map<String, String>> excelData;

@Given("The user is on the practice question editor for Search the array")
public void the_user_is_on_the_practice_question_editor_for_search_the_array() {
	HomePage.getStartedArray();
	ArrayPage.arraysinpython();
	ArrayPage.practicequestions();
	ArrayPage.searchthearray();
}

    
@When("The user write the valid code in Editor from {string} and {int} and Click the Run button")
public void the_user_write_the_valid_code_in_editor_from_python_code_and_and_click_the_run_button(String Sheetname, int RowNumber ) {
	tp.enteringCodeForArary(Sheetname, RowNumber);
	ArrayPage.runbutton();
    
}
@Then("The user should able to see an output message {string} and {int}")
public void the_user_should_able_to_see_an_output_message_in_alert_window(String Sheetname, int RowNumber) throws IOException {
	excelData = ExcelDataReader.DataFromExcel(Sheetname);
	String expectedresult =excelData.get(RowNumber).get("Result");
	String actualresult = tp.actualresultforsearchforarray();
	Assert.assertEquals(actualresult, expectedresult, "result not matched");
    
}	
}