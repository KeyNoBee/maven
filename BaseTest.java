package pageobjects;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    @BeforeClass
    public static void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", "E:\\Progs\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
        driver.get("https://sharelane.com/cgi-bin/main.py");



    }
    @AfterClass
    public static void tearDown() throws Exception{
        driver.quit();
    }
    public static  WebDriver getDriver(){
        return driver;

    }

}
