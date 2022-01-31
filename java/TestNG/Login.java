package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class Login extends NewTest {
	@Test
	public void loginform() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
	}

	@Test
	public void Forgotpass() {
		driver.findElement(By.linkText("Forgot your password?"));
		
	}
	

}
