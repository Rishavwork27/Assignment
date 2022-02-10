package com.Pages;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Testbase.Baseclass;


public class Add_EmployePage extends Baseclass {


	@FindBy(id = "menu_pim_viewPimModule")
	 WebElement btn_PIM;
	
	@FindBy(id = "menu_pim_addEmployee")
	WebElement btn_ToAddEmployeePage;	
	

	public	Add_EmployePage() {
		PageFactory.initElements(driver, this);
	}
	public void click_navToAddEmpPage() {

		btn_PIM.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500)) ;		
		btn_ToAddEmployeePage.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500)) ;		

	}

}
