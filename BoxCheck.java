package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BoxCheck {

	// Test Case: Validate when the toggle all check box is checked, all check boxes for list items are also checked.

	WebDriver driver;
	@FindBy(how = How.NAME, using = "allbox")
	WebElement toggleAll;
	@FindBy(how = How.XPATH, using = "//input[@name = \"data\"]")
	WebElement addAccount;
	@FindBy(how = How.XPATH, using = "//input[@value = \"Add\"]")
	WebElement clickAdd;
	@FindBy(how = How.CSS, using = "input[value=\"Remove\"]")
	WebElement removeButton;

	String beforeXpath = "//input[@name = 'todo[";
	String afterXpath = "]']";

	public BoxCheck(WebDriver driver) {
		this.driver = driver;

	}
	
	public void clickRemoveButton() {
		try {
		removeButton.click();
		System.out.println("Elements Removed.");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void allCheckBox() {
		add_Account();
		toggleAll.click();
		System.out.println("Toogle All CheckBox selected." + toggleAll.isSelected());
	}

	public void add_Account() {
		addAccount.sendKeys("iloveyou");
		clickAdd.click();
	}

	public void clickOneCheckBox(int i) {
		add_Account();
		WebElement onecheckbox = driver.findElement(By.xpath(beforeXpath + i + afterXpath));
		onecheckbox.click();
		System.out.println("Check Box is selected :" + onecheckbox.isSelected());
		try {
			removeButton.click();
			System.out.println("Element was removed successfully.");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void ValidateEachCheckBoxSelected() {

		List<WebElement> chklist = driver.findElements(By.xpath("//li//input[@type='checkbox']"));
		{
			System.out.println("The ammount of check boxes :" + chklist.size());
			for (int i = 0; i < chklist.size(); i++) {

				System.out.println(chklist.get(i).isSelected());
			}
		}

	}

}
