package com.Testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static Properties prop;
	public static WebDriver driver;

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
		public static void initialization() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			driver.get(prop.getProperty("url"));

		}
	}
