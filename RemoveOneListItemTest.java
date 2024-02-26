package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CheckBoxPage;
import util.BrowserFactory;

public class RemoveOneListItemTest {

	//Test 2: Validate that a single list item could be removed using the remove button when a single checkbox is selected.
	
	WebDriver driver;
	CheckBoxPage singlecheckbox;

	@BeforeMethod
	public void removeAllTest() {

		driver = BrowserFactory.initBrowser();

		singlecheckbox = PageFactory.initElements(driver, CheckBoxPage.class);
	}

	@Test
	public void ClickOneCheck_Box() {
		singlecheckbox.clickOneCheckBox(0);

	}

	@AfterMethod
	public void tearDown() {
		BrowserFactory.teardown();
	}

}
