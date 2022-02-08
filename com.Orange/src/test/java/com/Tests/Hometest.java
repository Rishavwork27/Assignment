package com.Tests;

import org.testng.annotations.Test;

import com.Pages.Homepage;

public class Hometest {
	public Hometest() {
		super();
	}
@Test(priority = 4)
public void logout()
{
	Homepage HM= new Homepage();
	HM.Logout();
}

}
