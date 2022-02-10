package com.Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Pages.Add_EmployePage;
import com.Testbase.Baseclass;

public class Add_EmployeTest extends Baseclass {
	 Add_EmployePage AD;

	 public Add_EmployeTest() 
		{
			super();
		} 
	 @Test
	public void clicknavToAddEmpPage() throws IOException {
		Fact.getlogin().login();
		Fact.AddEmploye().click_navToAddEmpPage();
	}
}
