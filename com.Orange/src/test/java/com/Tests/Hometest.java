package com.Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Pages.Homepage;
import com.Testbase.Baseclass;

public class Hometest extends Baseclass {
	public Hometest() {
		super();
	}
@Test
public void logout()
{
	try {
		Fact.getlogin().login();
	} catch (IOException e) {
		e.printStackTrace();
	}
	Fact.gethomepage().Logout();
}

}
