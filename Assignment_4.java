
/*Assignment 4: Fetching data from the Excel sheet using Data-Driven Framework and Writing status in the Excel sheet which shows if the value has been
passed or not.*/
package Assignments;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import com.github.dockerjava.api.model.Driver;import io.github.bonigarcia.wdm.WebDriverManager;
import net.jodah.failsafe.internal.util.Assert;
public class Assignment_4 {
    void call() throws IOException {
        WebDriver driver = new ChromeDriver();
        String uname,pass,message;
        String path = System.getProperty("user.dir") + "/Testdata/Data.xls";
        FileInputStream fin=new FileInputStream(path);
        HSSFWorkbook wb = new HSSFWorkbook(fin);
        HSSFSheet sheet = wb.getSheetAt(0);
        System.out.println(sheet.getLastRowNum());
        driver.get("https://opensource-demo.orangehrmlive.com/");
        for(int i=1;i<=sheet.getLastRowNum();i++) {
            uname=sheet.getRow(i).getCell(0).getStringCellValue();
            driver.findElement(By.name("txtUsername")).sendKeys(uname);
            pass=sheet.getRow(i).getCell(1).getStringCellValue();
            driver.findElement(By.id("txtPassword")).sendKeys(pass);
            FileOutputStream Fout= new FileOutputStream(path);
            message="pass";
            sheet.getRow(i).createCell(3).setCellValue(message);
            wb.write(Fout);
            Fout.close();
            driver.findElement(By.id("btnLogin")).click();
            wb.close();
        }
    }
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        Assignment_4 D = new Assignment_4();
        D.call();
    }
}

