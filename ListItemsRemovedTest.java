package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CheckBoxPage;
import util.BrowserFactory;

public class ListItemsRemovedTest {

	// Validate that all list item could be removed using the remove button and when
	// "Toggle All" functionality is on.

	WebDriver driver;
	CheckBoxPage checkboxpage;
	
	@BeforeMethod
	public void navigatetoURL() {
		driver = BrowserFactory.initBrowser();
		checkboxpage = PageFactory.initElements(driver, CheckBoxPage.class);

	}
	@Test
	public void ValidateAllListItem() {
		checkboxpage.allCheckBox();
		checkboxpage.clickRemoveButton();
		
	}
	@AfterMethod
	public void teardown() {
		BrowserFactory.teardown();
	}
}
