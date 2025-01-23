package dsAlgoStepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.HomePage;
import dsAlgoPages.QueuePage;
import dsAlgoPages.TreePage;
import dsAlgoPages.TryEditorPage;
import dsAlgoUtils.ExcelDataReader;
import io.cucumber.java.en.*;

public class TreeSteps {
	WebDriver driver = DriverFactory.getdriver();
	HomePage homepage = new HomePage(driver);
	TreePage treepage = new TreePage(driver);
	Logger log = LogManager.getLogger(TreeSteps.class);
	TryEditorPage tryeditorpage = new TryEditorPage(driver);
	List<Map<String,String>>excelData;
	
	
	@When("The user clicks the Getting Started button in Tree Panel")
	public void  The_user_clicks_the_Getting_Started_button_in_Tree_Panel() {
		homepage.getStartedTree();
		log.info("Get Started button of Tree");
	}
	@Then("The user be directed to Tree DataStructure Page")
	public void The_user_be_directed_to_Tree_DataStructure_Page() {
//		treepage.DisplayTreeText()
		Assert.assertTrue(treepage.DisplayTreeText());
		log.info("user is Tree page");
	}
	//1...........................................
	
	@Given("User is on Tree Page")
	public void User_is_on_Tree_Page() {
		homepage.getStartedTree();
		log.info("User is on Tree page");
	}
	@When ("User click on Options {string} and {int} in Tree page")
	public void User_click_on_Options_in_Tree_page(String SheetName,int RowNumber) {
		treepage.TreeOptions(SheetName, RowNumber);
		log.info("user click the topics of Tree");
	}
	@Then("User should redirected to Options {string} and {int} in Tree page")
	public void User_should_navigated_to_Options_in_Tree_page(String SheetName,int RowNumber) {
		try {
			excelData = ExcelDataReader.DataFromExcel(SheetName);
			String ExpectedUrl=excelData.get(RowNumber).get("Expected Url");
			String ActualUrl=driver.getCurrentUrl();
			Assert.assertEquals(ActualUrl, ExpectedUrl,"Url are not matched");
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		log.info("User is validating each pages of Tree topics");
	}
			
	@Given("The user is on the Tree Options {string} and {int} page")
	public void The_user_is_on_the_Tree_Options (String SheetName,int RowNumber) {
		homepage.getStartedTree();
		treepage.TreeOptions(SheetName, RowNumber);
		log.info("user is on topics options");
	}
	
	@When("The user click Try Here button on Tree Options page")
	public void The_user_click_Try_Here_button_on_Tree_Options_page() {
		treepage.TryHereBtn();
		log.info("user click Try here of Tree options");
	}
    @Then("The user should redirected to Try Editor of each Options")
    public void The_user_should_redirected_to_Try_Editor_of_each_Options() {
    	 String ExpectedTryEditorTitlePageUrl = treepage.ExpectedTryEditorTitlePageUrl();
		 String ActualTryEditorTitlePageUrl= treepage.ActualTryEditorTitlePageUrl();
		 Assert.assertEquals(ActualTryEditorTitlePageUrl,ExpectedTryEditorTitlePageUrl,"TryEditor URL not matched");
		 log.info("Validating the try editor page");
	}
    @Given("The user is in TryEditor page of Overview of Trees")
    public void The_user_is_in_TryEditor_page_Overview_of_Trees() {
    	homepage.getStartedTree();
    	treepage.OverviewOfTrees();
    	treepage.TryHereBtn();
    	log.info("user is in Try Editor page of Overview of Trees");
    }
   @When("The user enters code from {string},{string} and {int} clicks the Run button")
   public void The_user_enters_code_from_clicks_the_Run_button(String code,String Sheetname,int RowNumber) {
	   treepage.validationCode(code,Sheetname,RowNumber);
	   treepage.RunBtn();
	   log.info("User enter the code");
	          
      }
   @Then("The user should see a result {string},{string} and {int}")
   public void The_user_should_see_an_expected_result(String expectedresult, String Sheetname, int RowNumber) {
	   
	   String actualerror = treepage.Result();
	   System.out.println("The actual result is " +actualerror);
		String expectederror = treepage.expected(expectedresult, Sheetname, RowNumber);
		 System.out.println("The expected result is " +expectederror);
		
		Assert.assertEquals(actualerror, expectederror, "message not matched");
		log.info("output should match with the actual result");
//	   try {
//			excelData = ExcelDataReader.DataFromExcel(Sheetname);
//			String expectederror = excelData.get(RowNumber).get("expectedresult");
//			String actualerror = treepage.Result();
//			System.out.println("stepactualerror:" + actualerror);
//			System.out.println("stepexpectederror: " + expectederror);
//			Assert.assertEquals(actualerror, expectederror, "message not matched");
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
   }
	   @Given("The user is in TryEditor page of Terminologies")
	    public void The_user_is_in_TryEditor_page_of_Terminologies() {
	    	homepage.getStartedTree();
	    	treepage.Terminologies();
	    	treepage.TryHereBtn();
	    	log.info("User is in TryEditor page of Terminologies");
	    }
	   @Given("The user is in TryEditor page of TreeTraversals")
	    public void The_user_is_in_TryEditor_page_of_TreeTraversals() {
	    	homepage.getStartedTree();
	    	treepage.TreeTraversals();
	    	treepage.TryHereBtn();
	    	log.info("User is in TryEditor page of TreeTraversal");
	    }
	   @Given("The user is in TryEditor page of TraversalsIllustration")
	    public void The_user_is_in_TryEditor_page_of_TraversalsIllustration() {
	    	homepage.getStartedTree();
	    	treepage.TraversalsIllustration();;
	    	treepage.TryHereBtn();
	    	log.info("User is in TryEditor page of TraversalsIllustration");
	    }
	   
	   @Given("The user is in TryEditor page of TypesOfTrees")
	    public void The_user_is_in_TryEditor_page_of_TypesOfTrees() {
	    	homepage.getStartedTree();
	    	treepage.TypesOfTrees();;
	    	treepage.TryHereBtn();
	    	log.info("User is in TryEditor page of TypesOfTrees");

	   }

	   @Given("The user is in TryEditor page of BinaryTrees")
	    public void The_user_is_in_TryEditor_page_of_BinaryTrees() {
	    	homepage.getStartedTree();
	    	treepage.BinaryTrees();;
	    	treepage.TryHereBtn();
	    	log.info("User is in TryEditor page of BinaryTrees");

	   }
   @Given("The user is in TryEditor page of TypesOfBinaryTrees")
	    public void The_user_is_in_TryEditor_page_of_TypesOfBinaryTrees() {
	    	homepage.getStartedTree();
	    	treepage.TypesOfBinaryTrees();;
    	treepage.TryHereBtn();
    	log.info("User is in TryEditor page of TypesOfBinaryTrees");

	   }
     @Given("The user is in TryEditor page of ImplementationInPython")
   public void The_user_is_in_TryEditor_page_of_ImplementationInPython() {
   	homepage.getStartedTree();
   	treepage.ImplementationInPython();
	treepage.TryHereBtn();
	log.info("User is in TryEditor page of ImplementationInPython");

     }
   
   @Given("The user is in TryEditor page of BinaryTreeTraversals")
   public void The_user_is_in_TryEditor_page_of_BinaryTreeTraversals() {
   	homepage.getStartedTree();
   	treepage.BinaryTreeTraversals();;
	treepage.TryHereBtn();
	log.info("User is in TryEditor page of BinaryTreeTraversals");

  }
   @Given("The user is in TryEditor page of ApplicationsOfBinaryTrees")
   public void The_user_is_in_TryEditor_page_of_ApplicationsOfBinaryTrees() {
   	homepage.getStartedTree();
   	treepage.ApplicationsOfBinaryTrees();
	treepage.TryHereBtn();
	log.info("User is in TryEditor page of ApplicationsOfBinaryTrees");

  }
   @Given("The user is in TryEditor page of BinarySearchTrees")
   public void The_user_is_in_TryEditor_page_of_BinarySearchTrees() {
   	homepage.getStartedTree();
   	treepage.BinarySearchTrees();
	treepage.TryHereBtn();
	log.info("User is in TryEditor page of BinarySearchTrees");

  }
   @Given("The user is in TryEditor page of ImplementationOfBST")
   public void The_user_is_in_TryEditor_page_of_ImplementationOfBST() {
   	homepage.getStartedTree();
   	treepage.ImplementationOfBST();;
	treepage.TryHereBtn();
	log.info("User is in TryEditor page of ImplementationOfBST");
     
}
   
   @Given ("The user is on the tryeditor page of Overview of Trees")
   public void The_user_is_on_the_tryeditor_page_of_Overview_of_Trees() {
	   homepage.getStartedTree();
	   treepage.OverviewOfTrees();
	   treepage.TryHereBtn();
	   log.info("User is in TryEditor page of Overview_of_Trees");
   }
   @When("the user clicks the Run button of Overview of Trees")
   public void  the_user_clicks_the_Run_button_of_Overview_of_Trees() {
	   treepage.RunBtn();
	   log.info("User is in Run button of Overview_of_Trees");
   }
   
   @Given("The user is in Overview of Trees page")
   public void The_user_is_in_Overview_of_Trees_page() {
	   homepage.getStartedTree();
	   treepage.OverviewOfTrees();
	   log.info("User is in Overview_of_Trees page");
   }
   @When("The user clicks on Practice Questions")
   public void The_user_clicks_on_Practice_Questions() {
	   treepage.PracticeQuestionPage();
	   log.info("User click Practice Question of Overview_of_Trees");
   }
   @Then("User should navigate to Practice questions page")
   public void User_should_navigate_to_Practice_questions_page() {
	   String CurrentPractice = treepage.CurrentPracticeQuestionUrl();
	   String ExpectedPractice = treepage.PracticeQuestionUrl();
	   Assert.assertEquals(CurrentPractice, ExpectedPractice,"Url not matched");
	   log.info("Validating user is in Practice Question page");
   }
   
   @Given("The user is on Overview of Trees page")
   public void The_user_is_on_Overview_of_Trees_page() {
	   homepage.getStartedTree();
	   treepage.OverviewOfTrees();
	   log.info("User is in of Overview_of_Trees");
   }
   @When("The user click pn Practice Questions")
   public void The_user_click_pn_Practice_Questions() {
	   treepage.PracticeQuestionPage();
	   log.info("User click Practice Question link");
   }
   @Then("User can see Practice Question List")
   public void User_can_see_Practice_Question_List() {
	   Assert.fail();
	   log.error("Bug in Practice question page");
   }
}



