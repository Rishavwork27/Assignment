package com.Tests;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.Pages.LoginPage;
import com.Testbase.Baseclass;

public class LoginTest extends Baseclass {
	LoginPage LG;
	public LoginTest() 
	{
		super();
	}
	
	@Test
	 public void Logindetails() throws IOException {
		Fact.getlogin().Forgetpass();
	}
	
}
