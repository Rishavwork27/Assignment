package maven.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class List {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
        driver.get("https://opensource-demo.orangehrmlive.com/");
        List elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements:" +elements.size());

        
        
	}

}
