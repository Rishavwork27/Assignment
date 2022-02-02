package Data_provider;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Assignment_6 {

    public static WebDriver driver;
    SoftAssert soft = new SoftAssert();

    @BeforeSuite (groups = {"Run","Smoke"})
    void setup(){
        System.out.println("testcase1");
    }
    @Test (groups = {"Run","smoke"})
    void login(){
        System.out.println("testcase2");
    }
    @Test (groups = {"NotRun","smoke"})
    void check(){
        System.out.println("testcase3");
    }
    @AfterSuite(groups = {"Run"})
    void closeBrow()
    {
        System.out.println("testcase4");
    }
}