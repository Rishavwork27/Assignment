// Assignment 5 : get data from excel sheet using data provider
package Assignments;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class Assignment_5 {

    public static WebDriver driver;
    @DataProvider(name="EnterData")
    public Object[][] log() {
        String sheetpath=System.getProperty("user.dir")+"/Testdata/Data.xls";
        Xls_Reader xlr=new Xls_Reader(sheetpath);
        int rowcount=xlr.getRowCount("Test");
        System.out.println("No of rows are:"+rowcount);
        int colcount=xlr.getColumnCount("Test");
        Object[][] obj=new Object[rowcount-1][colcount];
        int ci=0;
        for(int i=2;i<=rowcount;i++,ci++)
        {   int cj=0;
            for(int j=0;j<colcount;j++,cj++)
            {
                obj[ci][cj]=xlr.getCellData("Test", j, i);
                System.out.println(obj[ci][cj]);
            }
        }
        return obj;
    }
    @Test(dataProvider = "EnterData")
    public void log(String uname, String pass){
        System.out.println(uname+" "+pass);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys(uname);
        driver.findElement(By.id("txtPassword")).sendKeys(pass);
        driver.findElement(By.id("btnLogin")).click();
    }
    @Test
    public void logout(){
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    }
}