package com.pagefactory;

import com.Pages.Homepage;
import com.Pages.LoginPage;

public class ObjectFactory {
	private LoginPage loginObj;
	private Homepage HomeObj;
	
	public LoginPage getlogin() 
	{
		if(loginObj==null) {
			loginObj=new LoginPage();
			
		}
		return loginObj;
	}
	public Homepage gethomepage() 
	{
		if(HomeObj==null) {
			HomeObj=new Homepage();
			
		}
		return HomeObj;
	}


}
