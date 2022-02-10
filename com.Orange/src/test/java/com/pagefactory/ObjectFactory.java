package com.pagefactory;

import com.Pages.Add_EmployePage;
import com.Pages.Add_User_;
import com.Pages.Homepage;
import com.Pages.LoginPage;

public class ObjectFactory {
	private LoginPage loginObj;
	private Homepage HomeObj;
	private Add_EmployePage AD;
	private Add_User_ user;
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
	public Add_EmployePage AddEmploye() 
	{
		if(AD==null) {
			AD=new Add_EmployePage();
			
		}
		return AD;
	}
		

		public Add_User_ AddUser() {
			if(user==null) {
				user=new Add_User_();
				
			}
			return user;
		}
}
