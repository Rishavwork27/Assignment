package Tests;
import java.io.IOException;
import org.testng.annotations.Test;

public class CheckOutTest extends BaseTest {
	@Test
	public void CheckOut() throws IOException {
		Obj.getlogin().login();
		Obj.AddItems().VerifyAddToCartButton();
		Obj.AddItems().GoToCartButton();
		Obj.checkout().CheckoutItems();
	}
}