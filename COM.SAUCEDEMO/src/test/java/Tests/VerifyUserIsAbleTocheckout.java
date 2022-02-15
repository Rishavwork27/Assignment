package Tests;
import java.io.IOException;
import org.testng.annotations.Test;

public class VerifyUserIsAbleTocheckout extends BaseTest {
	
	@Test
	public void Logindetails() throws IOException {
		Obj.getlogin().login();
		Obj.getlogin().VerifyTitle();
	}
	
	@Test(dependsOnMethods = "Logindetails" )
	public void AddItemsToCart() throws IOException {
		Obj.AddItems().VerifyAddToCartButton();
		Obj.AddItems().VerifyRemoveButtonDisplayed();
		Obj.AddItems().GoToCartButton();
	}
	
	@Test(dependsOnMethods = "AddItemsToCart" )
	public void RemoveToCartButton() throws IOException
	{				
		Obj.Cart().verifyItemAdd();
		Obj.Cart().RemoveToCart();
		Obj.Cart().Continueshopping();
	}


	@Test(dependsOnMethods = "RemoveToCartButton" )
	public void CheckOut() throws IOException {
		Obj.AddItems().VerifyAddToCartButton();
		Obj.AddItems().GoToCartButton();
		Obj.checkout().CheckoutItems();
	}

	@Test(dependsOnMethods = "CheckOut" )
	public void CheckoutItem() throws IOException {
		Obj.Infomation().CheckoutYourInfomation();
		Obj.Infomation().VerifyOrderPage();
	}
	
}
