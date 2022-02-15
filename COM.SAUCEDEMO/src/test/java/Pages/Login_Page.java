package Pages;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Tests.BaseTest;

public class Login_Page extends BaseTest{
	String actualTitle;
	String expectedTitle;
	
	@FindBy(id = "user-name")
	WebElement uname;

	@FindBy(id = "password")
	WebElement pass;

	@FindBy(id = "login-button")
	WebElement loginButton;
	public Login_Page() {
		PageFactory.initElements(driver, this);
	}

	public void login() throws IOException 
	{
		uname.sendKeys(prop.getProperty("Username"));
		pass.sendKeys(prop.getProperty("Password"));
		loginButton.click();
	}
	public void VerifyTitle() {
		 actualTitle = driver.getCurrentUrl();
		 expectedTitle = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualTitle,expectedTitle);
	}
}
