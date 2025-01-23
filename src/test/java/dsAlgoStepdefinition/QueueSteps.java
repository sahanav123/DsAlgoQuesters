package dsAlgoStepdefinition;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgoDriverFactory.DriverFactory;
import dsAlgoPages.HomePage;
import dsAlgoPages.QueuePage;
import dsAlgoPages.TryEditorPage;
import dsAlgoUtils.ExcelDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class QueueSteps {
		WebDriver driver = DriverFactory.getdriver();
		HomePage homepage = new HomePage(driver);
		QueuePage queuepage = new QueuePage(driver);
		Logger log = LogManager.getLogger(QueueSteps.class);
		TryEditorPage TryEditorPage = new TryEditorPage(driver);
		List<Map<String, String>> excelData;
		 
			
		@When("The user clicks the Getting Started button in Queue Panel")
		public void the_user_clicks_the_button_in_queue_panel() {
		  homepage.getStartedQueue();
		  log.info("Get Started button of Queue");
		}
		@Then("The user be directed to Queue DataStructure Page")
		public void The_user_be_directed_to_data_structure_page() {
		    String ExpectedQueueTitle=queuepage.QueueExpectedTitle();
		    String ActualQueueTitle=queuepage.QueueActualTitle();
		    Assert.assertEquals(ActualQueueTitle,ExpectedQueueTitle,"Title not matched");
		    log.info("matching the title of queue datastructure");
		}
		//1......................................................................
		@Given("The user is in the Queue page after Sign in")
		public void The_user_is_in_the_Queue_page_after_Sign_in() {
			 homepage.getStartedQueue();
			 log.info("user is in queue sigin page");
			}
		@When("User clicks Implementation of Queue in Python button")
		public void  User_clicks_Implementation_of_Queue_in_Python_button()  {
			queuepage.implementationOfQueueInPythonBtn();
			log.info("user is in Implementation of Queue ");
		  	}
		@Then("User should be redirected to Implementation of Queue in Python page")
		public void User_should_be_redirected_to_Implementation_of_Queue_in_Python_page(){
			String ActualImplementationOfQueueTitle=queuepage.QueueActualTitle();
		    String ExpectedImplementationOfQueueTitle=queuepage.ExpectedImplementationOfQueueTitle();
		    Assert.assertEquals(ActualImplementationOfQueueTitle,ExpectedImplementationOfQueueTitle,"Title not matched");
		    log.info("validating the title of Implementation of queue");
		}
	//.................................................................................
		@Given("User is on the Implementation of Queue in Python page")
		public void User_is_on_the_Implementation_of_Queue_in_Python_page() {
			homepage.getStartedQueue();
		    queuepage.implementationOfQueueInPythonBtn();
		    log.info("user is in Implementation of queue page");
		    
		}
		@When("The user clicks Try Here button in Implementation of Queue in Python page")
		public void The_user_clicks_Try_Here_button_in_Implementation_of_Queue_in_Python_page() {
		    queuepage.TryHereBtn();
		    log.info("user click try here of Implementation of queue ");
		}
		@Then("User should be redirected to a page having an try Editor with a Run button to test")
		public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		    String ExpectedTryEditorTitlePage=queuepage.ExpectedTryEditorTitlePage();
			 String ActualTryEditorTitlePage=queuepage.QueueActualTitle();
			 Assert.assertEquals(ActualTryEditorTitlePage,ExpectedTryEditorTitlePage,"TryEditor Title not matched");
			 log.info("user is in Try Editor page");  
		}
		 //2.....................................................................................    
		@Given("The user is in the Implementation of Queue in Python page")
		public void The_user_is_in_the_Implementation_of_Queue_in_Python_page() { 
			homepage.getStartedQueue();
			 log.info("user is in Implementation of queue page");
	    }
		@When("The user clicks Implementation using collections deque button")
		public void The_user_clicks_Implementation_using_collections_deque_button() {
			queuepage.implementationUsingCollectionsDequeBtn();	
			 log.info("user click collections deque button");
		}
	    @Then("The user should be redirected to Implementation using collections deque page")
	    public void The_user_should_be_redirected_to_Implementation_using_collections_deque_page() {
	    	String ExpectedCollectionDequeTitle= queuepage.CollectionDequeTitle();
			 String ActualCollectionDequeTitle=queuepage.QueueActualTitle();
			 Assert.assertEquals(ActualCollectionDequeTitle,ExpectedCollectionDequeTitle,"TryEditor Title not matched");
			 log.info("user click collections deque button");
	    }
	   @Given("The user is on the Implementation using collections deque page")
	   public void The_user_is_on_the_Implementation_using_collections_deque_page() {
		   homepage.getStartedQueue();
		   queuepage.implementationUsingCollectionsDequeBtn();
		   log.info("user is on collections deque page");
		}
	    @When("The user clicks Try Here button in Implementation using collections deque page")
	    public void The_user_clicks_Try_Here_button_in_Implementation_using_collections_deque_page() {
	    	queuepage.TryHereBtn();
	    	 log.info("user is on collections deque page");
	     }
	 //3..................................................................................................   
	    
	   @Given("The user is in the Implementation using collections deque page")
	   public void The_user_is_in_the_Implementation_using_collections_deque_page(){
		   homepage.getStartedQueue();
		   log.info("user is in collections deque page");
		}
	   @When("The user clicks Implementation using array button")
	   public void The_user_clicks_Implementation_using_array_button(){
		   queuepage.ImplementationUsingArrayBtn();
		   log.info("user is in Implementation using array");
	   }
	   @Then("The user should be redirected to Implementation using array page")
	   public void The_user_should_be_redirected_to_Implementation_using_array_page() {
		    String ExpectedImplementationUsingArrayTitle= queuepage.ExpectedImplementationUsingArrayTitle();
		    String ActualImplementationUsingArrayTitle=queuepage.QueueActualTitle();
			Assert.assertEquals(ActualImplementationUsingArrayTitle,ExpectedImplementationUsingArrayTitle,"TryEditor Title not matched"); 
			log.info("user is to verify Implementation using array title page"); 
	   }
	   @Given("The user is on the Implementation using array page")
	   public void The_user_is_on_the_Implementation_using_array_page() {
		   homepage.getStartedQueue();
		   queuepage.ImplementationUsingArrayBtn();
		   log.info("user is to verify Implementation using array page");
	   }
	   @When("The user clicks Try Here button in Implementation using array page")
	   public void The_user_clicks_Try_Here_button_in_Implementation_using_array_page() {
		   queuepage.TryHereBtn();
		   log.info("user clicks Try here page implementation using array page"); 
	   }
	   //4................................................................................................
	   @Given("The user is in the Implementation using array page")
	   public void The_user_is_in_the_Implementation_using_array_page() {
		  homepage.getStartedQueue();
		  log.info("user is in Implementation using array page");
	   }
	   @When("User clicks Queue Operations button")
	   public void User_clicks_Queue_Operations_button() {
		   queuepage.QueueOperationsBtn();
		   log.info("user is in Queue Operations");
	   }
	   @Then("User should be redirected to Queue Operations page")
	   public void User_should_be_redirected_to_Queue_Operations_page() {
		   String ExpectedQueueOperationsTitle= queuepage.QueueOperationsTitle();
		   String ActualQueueOperationsTitle=queuepage.QueueActualTitle();
		   Assert.assertEquals(ExpectedQueueOperationsTitle,ActualQueueOperationsTitle,"TryEditor URL not matched");   
		   log.info("user verify Queue Operations page");
	   }
	   @Given("User is on the Queue Operations page")
	   public void User_is_on_the_Queue_Operations_page() {
		   homepage.getStartedQueue();
		   queuepage.QueueOperationsBtn();
		   log.info("user is on Queue Operations");
	   }
	   @When("The user clicks Try here button in Queue Operations page")
	   public void The_user_clicks_Try_here_button_in_Queue_Operations_page() {
		   queuepage.TryHereBtn();
		   log.info("user click try here button og Queue Operations");
	   }

	    @Given("The user is in TryEditor page of Implementation of Queue in Python")
	    public void The_user_is_in_TryEditor_page_of_Implementation_of_Queue_in_Python() {
	    	 homepage.getStartedQueue();
	    	 queuepage.implementationOfQueueInPythonBtn();
	    	 queuepage.TryHereBtn();
	    	 log.info("user is in Implementation of Queue");
	    }
	    @Given("The user is in TryEditor page of Implementation using collections deque in Python")
	    public void The_user_is_in_TryEditor_page_of_Implementation_using_collections_deque_in_Python() {
	    	homepage.getStartedQueue();
	    	 queuepage.implementationUsingCollectionsDequeBtn();
	    	 queuepage.TryHereBtn();
	    	 log.info("user is in try editor page of collections deque in Python");
	    }
	  @Given("The user is in TryEditor page of Implementation using array in Python")
	  public void The_user_is_in_TryEditor_page_of_Implementation_using_array_in_Python() {
		  homepage.getStartedQueue();
		  queuepage.ImplementationUsingArrayBtn();
		  queuepage.TryHereBtn();
		  log.info("user is in try editor page Implementation using array");
	  }
	  
	  @Given("The user is on the tryeditor page of Implementation of Queue in Python")
	  public void The_user_is_on_the_tryeditor_page_of_Implementation_of_Queue_in_Python() {
		  homepage.getStartedQueue();
		  queuepage.implementationOfQueueInPythonBtn();
		  queuepage.TryHereBtn();
		  log.info("user is in try editor page of Implementation of Queue");
	  }
	  @When("the user clicks the Run button of Implementation of Queue in Python")
	  public void the_user_clicks_the_Run_button_of_Implementation_of_Queue_in_Python() {
		  queuepage.RunBtn();
		  log.info("user is in run button of Implementation of Queue");
	  }
	  @Given("The user is in TryEditor page of Queue Operations in Python")
	  public void The_user_is_in_TryEditor_page_of_Queue_Operations_in_Python() {
		  homepage.getStartedQueue();
		  queuepage.QueueOperationsBtn();
		  queuepage.TryHereBtn();
		  log.info("user is in try editor page of Implementation of Queue");
		}
	 
	  @Given("The user navigates to options {string} and {int} of Queue page")
	  public void The_user_navigates_to_options_of_Queue_page(String SheetName,int RowNumber){
			  homepage.getStartedQueue();
			  queuepage.PracticeQuestionTopics(SheetName, RowNumber);
			  log.info("user is in Practices question of Queue");
	  }
	  @When("User click Practice Questions Link")
	  public void User_click_Practice_Questions_Link() {
		  queuepage.PracticeQuestionBtn();
		  log.info("user click Practice Question");
	   }
	  @Then("User should navigate to Practice questions from {string} and {int} Queue Topics")
	  public void User_should_navigate_to_Practice_questions_from_Queue_topics(String SheetName,int RowNumber) {
		 try {
			excelData = ExcelDataReader.DataFromExcel(SheetName);
			 String ExpectedUrl = excelData.get(RowNumber).get("PracticeQuestionUrl");
			 System.out.println("The expected Url of practice page " +ExpectedUrl);
			 String AcceptedUrl = driver.getCurrentUrl();
			 System.out.println("The accepted Url of practice page " +AcceptedUrl);
			 Assert.assertEquals(ExpectedUrl,AcceptedUrl,"Url not matched" );
		     } catch (IOException e) {
			
			e.printStackTrace();
		    }
		 log.info("user is in Practice Question Topics");
	       }
	 
	  @Given("The user navigates to Queue Options {string} and {int} of queue page")
	  public void The_user_navigates_to_Queue_Options_of_queue_page(String SheetName,int RowNumber) {
		  homepage.getStartedQueue();
		  queuepage.PracticeQuestionTopics(SheetName, RowNumber);
		  log.info("user is in Practice question");
 	   }
	  @When("The user clicks on the Practice Questions link")
	  public void The_user_clicks_on_the_Practice_Questions_link() {
		  queuepage.PracticeQuestionBtn();
		  log.info("user click Practice Question");
	  }
	  @Then("The user should see list of Practice Questions in Practice Questions Page")
	  public void The_user_should_see_list_of_Practice_Questions_in_Practice_Questions_Page(){
		  Assert.fail();
		  log.error("There is a bug in the Practice Question");
	  }
	  
	}