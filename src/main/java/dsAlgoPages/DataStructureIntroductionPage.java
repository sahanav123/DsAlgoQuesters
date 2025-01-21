package dsAlgoPages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgoUtils.ConfigReader;

public class DataStructureIntroductionPage {
	WebDriver driver;
	Properties prop;
	
	public DataStructureIntroductionPage(WebDriver driver) {
		this.driver = driver;
		this.prop = ConfigReader.initializeprop();
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//h4[text()='Data Structures-Introduction']")
	private WebElement Textconfirmfordatastructure;
	
	
	
	public boolean textconfirmfordatastructure() {
		boolean textconfirmfordatastructure=Textconfirmfordatastructure.isDisplayed();
		return textconfirmfordatastructure;
	}

}
