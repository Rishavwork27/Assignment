package com.Tests;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.Pages.LoginPage;
import com.Testbase.Baseclass;

public class LoginTest extends Baseclass {
	LoginPage LG;
	String title;
	public LoginTest() 
	{
		super();
	}
	@BeforeSuite
	public void Launch() 
	{
		initialization();
		LG=new LoginPage();	
	}
	@Test(priority = 2)
	public void CheckTitle()
	{
		title=LG.Verifytitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	@Test(priority = 3)
	 public void Logindetails() throws IOException {
		Fact.getlogin().login();
	}
	@Test(priority = 1)
	 public void forgetpas() {
			Fact.getlogin().Forgetpass();
		}
}
