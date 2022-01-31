package TestNG;
import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;

public class homepage extends NewTest{
	 public static String actualtitle;
	@Test
	public void verifypage() {
		actualtitle=driver.getTitle();
		assertEquals(actualtitle,"OrangeHRM");
	}
	@Test
	public void logout() {
		driver.findElement(By.partialLinkText("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	}

	

