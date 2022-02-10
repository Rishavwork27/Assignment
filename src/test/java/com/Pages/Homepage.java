package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Testbase.Baseclass;

public class Homepage extends Baseclass {
	@FindBy(partialLinkText = "Welcome ")
	WebElement logout;
	
	@FindBy(partialLinkText = "Logout")
	WebElement logoutbttn;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
public void Logout() {
	logout.click();
	logoutbttn.click();
}
}
