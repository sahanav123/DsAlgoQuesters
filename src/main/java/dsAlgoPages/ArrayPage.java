package dsAlgoPages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgoUtils.ConfigReader;

public class ArrayPage {
	WebDriver driver;
	Properties prop;
	
	public ArrayPage(WebDriver driver) {
		this.driver = driver;
		this.prop = ConfigReader.initializeprop();
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(linkText="Arrays in Python")
	private WebElement Arraysinpython;
	@FindBy(linkText="Practice Questions")
	private WebElement Practicequestions;
	@FindBy(linkText="Search the array")
	private WebElement Searchthearray;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Submit;
	@FindBy(linkText="Squares of a Sorted Array")
	private WebElement Squaresofsortedarray;
	@FindBy(xpath="//button[@onclick='runit()']")
	private WebElement Runbutton;
	
	public void arraysinpython() {
		Arraysinpython.click();
	}
	public void practicequestions() {
		Practicequestions.click();
	}
	public void searchthearray() {
		Searchthearray.click();
	}
	public void submit() {
		Submit.click();
	}
	public void squaresofsortedarray() {
		Squaresofsortedarray.click();
	}
	public void runbutton() {
		Runbutton.click();
	}

}
