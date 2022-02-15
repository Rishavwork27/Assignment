package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Tests.BaseTest;

public class YourInformationPage extends BaseTest{

	@FindBy(id="first-name")
	WebElement fname;

	@FindBy(id = "last-name")
	WebElement Lname;

	@FindBy(id = "postal-code")
	WebElement Postalcode;

	@FindBy(id = "continue")
	WebElement Continue;

	@FindBy(id = "finish")
	WebElement Finish;

	public YourInformationPage() {
		PageFactory.initElements(driver, this);
	}

	public void CheckoutYourInfomation() 
	{
		fname.sendKeys(prop.getProperty("Firstname"));
		Lname.sendKeys(prop.getProperty("lastname"));
		Postalcode.sendKeys(prop.getProperty("Postalcode"));
		Continue.click();
		Finish.click();
	}
	public void VerifyOrderPage() {
		String actual = driver.getCurrentUrl();
		String expected = "https://www.saucedemo.com/checkout-complete.html";
		Assert.assertEquals(actual,expected);
	}
}
