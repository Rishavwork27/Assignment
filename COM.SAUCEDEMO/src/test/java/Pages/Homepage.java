package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Tests.BaseTest;

public class Homepage extends BaseTest 
{

	@FindBy(xpath = "//Button[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement AddCartButton;

	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	WebElement GoToCart;

	@FindBy(xpath = "//button[@id=\"remove-sauce-labs-backpack\"]")
	WebElement VerifyRemove;


	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	public void VerifyAddToCartButton() {
		AddCartButton.click();
	}
	public void VerifyRemoveButtonDisplayed() {
		String act=VerifyRemove.getText();
		String exp="REMOVE";
		Assert.assertEquals(act,exp);	
	}
	public void GoToCartButton() {
		GoToCart.click();
	}


}
