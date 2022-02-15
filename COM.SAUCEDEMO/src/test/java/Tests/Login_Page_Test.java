package Tests;
import java.io.IOException;
import org.testng.annotations.Test;
import Pages.Login_Page;

public class Login_Page_Test extends BaseTest {

	
	@Test
	public void Logindetails() throws IOException {
		Obj.getlogin().login();
		Obj.getlogin().VerifyTitle();
	}

}
