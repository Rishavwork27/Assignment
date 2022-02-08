package com.Tests;

import org.testng.annotations.Test;

import com.Pages.Homepage;
import com.Testbase.Baseclass;

public class Hometest extends Baseclass {
	public Hometest() {
		super();
	}
@Test(priority = 4)
public void logout()
{
	Fact.gethomepage().Logout();
}

}
