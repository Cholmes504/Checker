package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CheckBoxPage;
import util.BrowserFactory;

public class AllCheckBoxSelectedTest {
	
	// Test Case: Validate when the toggle all check box has been checked, all check boxes for list items are also checked.

	WebDriver driver;
	CheckBoxPage checkboxpage;
	
	@BeforeMethod
	public void navigatetoURL() {
		driver = BrowserFactory.initBrowser();
		checkboxpage = PageFactory.initElements(driver, CheckBoxPage.class);

	}

	@Test
	public void ToggleAllCheckBox() {

		checkboxpage.allCheckBox();
		checkboxpage.ValidateEachCheckBoxSelected();

	}

	@AfterMethod
	public void teardown() {
		BrowserFactory.teardown();
	}

}
