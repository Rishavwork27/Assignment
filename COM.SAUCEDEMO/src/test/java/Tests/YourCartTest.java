package Tests;
import java.io.IOException;
import org.testng.annotations.Test;
import Pages.YourCartPage;

public class YourCartTest extends BaseTest{

	@Test
	public void RemoveToCartButton() throws IOException
	{		
		Obj.getlogin().login();
		Obj.AddItems().VerifyAddToCartButton();
		Obj.AddItems().GoToCartButton();
		Obj.Cart().verifyItemAdd();
		Obj.Cart().RemoveToCart();
		Obj.Cart().Continueshopping();
	}

}
