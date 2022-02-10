package com.Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Pages.Add_User_;
import com.Testbase.Baseclass;

public class Add_UserTest extends Baseclass {

	Add_User_ obj;
	

public Add_UserTest() {
	super();
}
@Test
public void AddingUserDetails() throws IOException {
	Fact.getlogin().login();
	Fact.AddEmploye().click_navToAddEmpPage();
	Fact.AddUser().UserDetails();
}
}