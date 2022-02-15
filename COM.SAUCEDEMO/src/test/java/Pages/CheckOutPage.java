package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Tests.BaseTest;

public class CheckOutPage extends BaseTest {
	@FindBy(id = "checkout")
	WebElement CheckOut;
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	public void CheckoutItems() {
		CheckOut.click();
	}
}
