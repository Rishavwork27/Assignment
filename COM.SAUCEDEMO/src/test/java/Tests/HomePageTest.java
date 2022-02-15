package Tests;
import java.io.IOException;

import org.testng.annotations.Test;

import Pages.Homepage;

public class HomePageTest extends BaseTest {
	
	@Test
	public void AddItemsToCart() throws IOException {
		Obj.getlogin().login();
		Obj.AddItems().VerifyAddToCartButton();
		Obj.AddItems().VerifyRemoveButtonDisplayed();
		Obj.AddItems().GoToCartButton();
	}
}
