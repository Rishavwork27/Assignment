package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Tests.BaseTest;

public class YourCartPage extends BaseTest {
	
	
	@FindBy(linkText = "Sauce Labs Backpack")
	WebElement VerifyItem;
	
	@FindBy(id = "remove-sauce-labs-backpack")
	WebElement RemoveButton;
	
	@FindBy(id = "continue-shopping")
	WebElement ContinueShopping;
	
	public YourCartPage() {
		PageFactory.initElements(driver, this);
	}
	public void verifyItemAdd() {
		String act=VerifyItem.getText();
		String exp="Sauce Labs Backpack";
		Assert.assertEquals(act,exp);		
	}
	public void RemoveToCart() {
		RemoveButton.click();
	}
	public void Continueshopping() {
		ContinueShopping.click();
	}
}
