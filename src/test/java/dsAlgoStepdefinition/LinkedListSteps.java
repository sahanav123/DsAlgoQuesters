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
import dsAlgoPages.LinkedListPage;
import dsAlgoPages.TryEditorPage;
import dsAlgoUtils.ExcelDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListSteps {

	WebDriver driver = DriverFactory.getdriver();
	HomePage HomePage = new HomePage(driver);
    TryEditorPage TryEditorPage = new TryEditorPage(driver);
	LinkedListPage LinkedListPage = new LinkedListPage(driver);
	Logger log = LogManager.getLogger(StackSteps.class);

	List<Map<String, String>> excelData;

	@When("The user clicks the Getting Started button in Linked List Panel")
	public void the_user_clicks_the_getting_started_button_in_linked_list_panel() {
		HomePage.getStartedLinkedlist();
		log.info("clicking on the getstarted of Linkedlist");

	}

	@Then("The user be directed to Linked List Data Structure Page")
	public void the_user_be_directed_to_linked_list_data_structure_page() {
		LinkedListPage.textconfirmlinked();
		log.info("confirming text for Linked List navigation");

	}

	@Given("The user is in the Linked List page")
	public void the_user_is_in_the_linked_list_page() {
		HomePage.getStartedLinkedlist();
		log.info("clicking on the getstarted of Linkedlist");

	}

	@When("The user clicks Introduction button")
	public void the_user_clicks_introduction_button() {

		LinkedListPage.introduction();
		log.info("clicking on the introduction");
	}

	@When("The user clicks Creating Linked LIst button")
	public void the_user_clicks_Creating_Linked_LIst_button() {

		LinkedListPage.creatingLinkedList();
		log.info("clicking on the Creating Linked LIst button");
	}

	@When("The user clicks Types of Linked List button")
	public void the_user_clicks_Types_of_Linked_List_button() {

		LinkedListPage.typesofLnkedlist();
		log.info("clicking on the Types of Linked List button");
	}

	@When("The user clicks Implement Linked List button")
	public void the_user_clicks_Implement_Linked_List_button() {

		LinkedListPage.implementlinkedlist();
		log.info("clicking on the Implement Linked List button");
	}

	@When("The user clicks Traversal button")
	public void the_user_clicks_Traversal_button() {

		LinkedListPage.traversal();
		log.info("clicking on the Traversal button");
	}

	@When("The user clicks Insertion button")
	public void the_user_clicks_Insertion_button() {

		LinkedListPage.insertion();
		log.info("clicking on the Insertion button");
	}

	@When("The user clicks Deletion button")
	public void the_user_clicks_Deletion_button() {

		LinkedListPage.deletion();
		log.info("clicking on the Deletion button");
		
	}

	@Then("The user should be redirected to page and confirm url {string} and {int}")
	public void the_user_should_be_redirected_to_introduction_page(String Sheetname, int rownumber) {
		try {
			excelData = ExcelDataReader.DataFromExcel(Sheetname);

			String actualurl = driver.getCurrentUrl();
			System.out.println("actualurl: " + actualurl);
			String expectedurl = excelData.get(rownumber).get("expectedurls");
			System.out.println("expectedurl: " + expectedurl);
			Assert.assertEquals(actualurl, expectedurl, "message not matched");

		} catch (IOException e) {

			e.printStackTrace();
		}
		log.info("Navigate to the all the options of Linked List");
	}

	@Given("The user is on the LinkedList Options {string} and {int} page")
	public void the_user_is_on_the_linked_list_options_and_page(String Sheetname, int rownumber) {
		HomePage.getStartedLinkedlist();
		log.info("clicking on the getstarted of Linkedlist");
		LinkedListPage.stackOptions(Sheetname, rownumber);
		log.info("clicking on all the options of LinkedList");

	}

	@When("The user clicks on the Try here button on the LinkedList Options page")
	public void the_user_clicks_on_the_try_here_button_on_the_linked_list_options_page() {

		LinkedListPage.tryHere();
		log.info("clicking on the tryhere button");

	}

	@Given("The user is on the tryeditor page of Introduction in LinkedList")
	public void the_user_is_on_the_tryeditor_page_of_introduction_in_linked_list() {
		HomePage.getStartedLinkedlist();
		log.info("clicking on the getstarted of Linkedlist");
		LinkedListPage.introduction();
		log.info("clicking on the introduction");
		LinkedListPage.tryHere();
		log.info("clicking on the tryhere button");
	}

	@Given("The user is on the tryeditor page of Creating Linked LIst in LinkedList")
	public void the_user_is_on_the_tryeditor_page_of_Creating_Linked_LIst_in_linked_list() {
		HomePage.getStartedLinkedlist();
		log.info("clicking on the getstarted of Linkedlist");
		LinkedListPage.creatingLinkedList();
		log.info("clicking on the Creating Linked LIst button");
		LinkedListPage.tryHere();
		log.info("clicking on the tryhere button");
	}

	@Given("The user is on the tryeditor page of Types of Linked List in LinkedList")
	public void the_user_is_on_the_tryeditor_page_of_Types_of_Linked_List_in_linked_list() {
		HomePage.getStartedLinkedlist();
		log.info("clicking on the getstarted of Linkedlist");
		LinkedListPage.typesofLnkedlist();
		log.info("clicking on the Types of Linked List button");
		LinkedListPage.tryHere();
		log.info("clicking on the tryhere button");
	}

	@Given("The user is on the tryeditor page of Implement Linked List in Python in LinkedList")
	public void the_user_is_on_the_tryeditor_page_of_Implement_Linked_List_in_Python_in_linked_list() {
		HomePage.getStartedLinkedlist();
		log.info("clicking on the getstarted of Linkedlist");
		LinkedListPage.implementlinkedlist();
		log.info("clicking on the Implement Linked List button");
		LinkedListPage.tryHere();
		log.info("clicking on the tryhere button");
	}

	@Given("The user is on the tryeditor page of Traversal in LinkedList")
	public void the_user_is_on_the_tryeditor_page_of_Traversal_in_Python_in_linked_list() {
		HomePage.getStartedLinkedlist();
		log.info("clicking on the getstarted of Linkedlist");
		LinkedListPage.traversal();
		log.info("clicking on the Traversal button");
		LinkedListPage.tryHere();
		log.info("clicking on the tryhere button");
	}

	@Given("The user is on the tryeditor page of Insertion in LinkedList")
	public void the_user_is_on_the_tryeditor_page_of_Insertion_in_Python_in_linked_list() {
		HomePage.getStartedLinkedlist();
		log.info("clicking on the getstarted of Linkedlist");
		LinkedListPage.insertion();
		log.info("clicking on the Insertion button");
		LinkedListPage.tryHere();
		log.info("clicking on the tryhere button");
	}

	@Given("The user is on the tryeditor page of Deletion in LinkedList")
	public void the_user_is_on_the_tryeditor_page_of_Deletion_in_Python_in_linked_list() {
		HomePage.getStartedLinkedlist();
		log.info("clicking on the getstarted of Linkedlist");
		LinkedListPage.deletion();
		log.info("clicking on the Deletion button");
		LinkedListPage.tryHere();
		log.info("clicking on the tryhere button");
	}

	@Given("The user is navigates to seven Options {string} and {int} of LinkedList page")
	public void the_user_is_navigates_to_seven_options_and_of_linked_list_page(String Sheetname, int rownumber) {
		HomePage.getStartedLinkedlist();
		log.info("clicking on the getstarted of Linkedlist");
		LinkedListPage.stackOptions(Sheetname, rownumber);
		log.info("clicking on all the options of LinkedList");

	}

	@Given("The user is on the tryeditor page of seven Options {string} and {int} of LinkedList page")
	public void the_user_is_on_the_tryeditor_page_of_seven_options_and_of_linked_list_page(String Sheetname,
			int rownumber) {
		HomePage.getStartedLinkedlist();
		log.info("clicking on the getstarted of Linkedlist");
		LinkedListPage.stackOptions(Sheetname, rownumber);
		log.info("clicking on all the options of LinkedList");
		LinkedListPage.tryHere();
		log.info("clicking on the tryhere button");
	}

}
