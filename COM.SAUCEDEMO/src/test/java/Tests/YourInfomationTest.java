package Tests;
import java.io.IOException;
import org.testng.annotations.Test;
import Pages.YourInformationPage;

public class YourInfomationTest extends BaseTest {
	YourInformationPage Info;
	@Test
	public void CheckoutItem() throws IOException {
		Obj.getlogin().login();
		Obj.AddItems().VerifyAddToCartButton();
		Obj.AddItems().GoToCartButton();
		Obj.checkout().CheckoutItems();
		Obj.Infomation().CheckoutYourInfomation();
		Obj.Infomation().VerifyOrderPage();
	}
}
