package com.Testbase;

import java.io.FileInputStream;

import javax.naming.Context;
import javax.naming.Name;
import java.io.IOException;
import java.time.Duration;
import java.util.Hashtable;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.pagefactory.ObjectFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	static Properties prop;
	public static WebDriver driver;
	protected static ObjectFactory Fact;
	public  Baseclass() {

		try
		{
			FileInputStream FI=new FileInputStream(System.getProperty("user.dir")+"//src//test//java//com//OrangeHRM//configuration//config.properties");
			prop=new Properties();
			prop.load(FI);
		}

		catch(IOException e)
		{
			e.printStackTrace();

		}

	}
	@BeforeClass
	public void initialization() { 
		Fact  = new ObjectFactory();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get(prop.getProperty("url"));

	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
		//driver.quit();
	}
}
