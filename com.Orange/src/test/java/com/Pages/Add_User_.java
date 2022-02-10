package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Testbase.Baseclass;

public class Add_User_  extends Baseclass{
	
	@FindBy(id="firstName")
	WebElement txt_firstName;	

	@FindBy(id="middleName")
	WebElement txt_middleName;

	@FindBy(id="lastName")
	WebElement txt_lastName;

	@FindBy(id="employeeId")
	WebElement txt_employeeId;

	@FindBy(id="photofile")
	WebElement file_uploadProfilePhoto;

	@FindBy(id="chkLogin")
	WebElement chk_createLoginInfo;

	@FindBy(id="user_name")
	WebElement txt_userName;

	@FindBy(id="user_password")
	WebElement txt_password;

	@FindBy(id="re_password")
	WebElement txt_rePassword;

	@FindBy(id="status")
	WebElement sel_status;

	@FindBy(id="btnSave")
	WebElement btn_save;
	
	public	Add_User_() {
		PageFactory.initElements(driver, this);
	}

		
		

	public void UserDetails() {
		txt_firstName.sendKeys("Aayush");
		txt_middleName.sendKeys("Singh");
		txt_lastName.sendKeys("kumar");
		txt_employeeId.sendKeys("123445");
		chk_createLoginInfo.click();
		txt_userName.sendKeys("rishav98");
		txt_password.sendKeys("12345");
		btn_save.click();
	}
}


