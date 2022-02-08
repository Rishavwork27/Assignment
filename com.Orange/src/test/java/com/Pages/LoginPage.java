package com.Pages;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Testbase.Baseclass;

public class LoginPage extends Baseclass {
	
	 String path;
	@FindBy(id = "txtUsername")
	WebElement uname;

	@FindBy(id = "txtPassword")
	WebElement pass;

	@FindBy(id = "btnLogin")
	WebElement loginButton;

	@FindBy(linkText = "Forgot your password?")
	WebElement forgotpass;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String Verifytitle() {
		return driver.getTitle();   	
	}
	public void login() throws IOException
	{
	    String path = System.getProperty("user.dir") + "//src//main//resources//OrangeData.xls";

		FileInputStream File = null;
		
		try {
			File = new FileInputStream(path);
		}catch(FileNotFoundException e) {
			e.printStackTrace();;
		}
		HSSFWorkbook wb = new HSSFWorkbook(File);
	    HSSFSheet sheet = wb.getSheetAt(0);
	    for (int i = 1; i <= sheet.getLastRowNum(); i++) {
	        String uname = sheet.getRow(i).getCell(0).getStringCellValue();
	        driver.findElement(By.name("txtUsername")).sendKeys(uname);
	        String pass = sheet.getRow(i).getCell(1).getStringCellValue();
	        driver.findElement(By.id("txtPassword")).sendKeys(pass);
	        loginButton.click();
	    }
	    

//		uname.sendKeys(prop.getProperty("username"));
//		pass.sendKeys(prop.getProperty("password"));
//		loginButton.click();
	}
	public void Forgetpass() {
		forgotpass.click();
		driver.navigate().back();
	}

}

	