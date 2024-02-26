package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BoxCheck;
import util.Browse;

public class ListItemsRemovedTest {

	// Validate that the list items can be removed using the remove button and when
	// "Toggle All" functionality is on.

	WebDriver driver;
	BoxCheck checkboxpage;
	
	@BeforeMethod
	public void navigatetoURL() {
		driver = Browse.initBrowser();
		checkboxpage = PageFactory.initElements(driver, CheckBoxPage.class);

	}
	@Test
	public void ValidateAllListItem() {
		checkboxpage.allCheckBox();
		checkboxpage.clickRemoveButton();
		
	}
	@AfterMethod
	public void teardown() {
		Browse.teardown();
	}
}
