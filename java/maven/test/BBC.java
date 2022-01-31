package maven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BBC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
		
		java.util.List<WebElement> news = driver.findElements(By.tagName("a"));
		System.out.println(news.size());
		for(int i = 0;i<news.size();i++){
			String linktxt = news.get(i).getText();

			System.out.println(linktxt); 
		}


	}
}



