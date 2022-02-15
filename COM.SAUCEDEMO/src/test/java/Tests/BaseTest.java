package Tests;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Pages.ObjectFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected static Properties prop;
	public static WebDriver driver;
	protected static ObjectFactory Obj;
	String Path;
	public  BaseTest() {

		try
		{
			FileInputStream FI=new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Config//Config.properties");
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
		Obj  = new ObjectFactory();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get(prop.getProperty("BaseUrl"));

	}

	@AfterClass
	public void tearDown()
	{
		driver.close();
		//driver.quit();
	}
}
