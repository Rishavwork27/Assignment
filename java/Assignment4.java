package Data_provider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class Assignment4{
    WebDriver driver;
    String sheetpath;
    @DataProvider(name="EntertheData")
    public Object[][] log() throws IOException {
        sheetpath=System.getProperty("user.dir")+"/Excelsheet/Data.xls";
        FileInputStream fin=new FileInputStream(sheetpath);
		HSSFWorkbook wb = new HSSFWorkbook(fin);
		HSSFSheet sheet = wb.getSheetAt(0);
        int rowcount=sheet.getLastRowNum();
        System.out.println(rowcount);
        Object[][] Obj=new Object[rowcount][2];
        int ci=0;
        for(int i=1;i<=rowcount;i++,ci++)
        {  
                Obj[ci][0]= sheet.getRow(i).getCell(0).getStringCellValue();
                Obj[ci][1]= sheet.getRow(i).getCell(1).getStringCellValue();
//                System.out.println(Obj[ci][cj]);
        }
        return Obj;
    }
   @Test(dataProvider = "EntertheData")
    public void login(String username, String password){
       System.out.println(username+" "+password);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();
    }
    @Test
    public void logout(){
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    }
}