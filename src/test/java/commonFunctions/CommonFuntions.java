package commonFunctions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import testCases.PendingLeaveRequests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFuntions {
    public static WebDriver driver;
    public static Properties properties;
    public static Logger logger = Logger.getLogger(CommonFuntions.class);

    public Properties loadproperty() throws IOException {
        FileInputStream inputStream = new FileInputStream("Config.properties");
        properties = new Properties();
        properties.load(inputStream);
        return properties;
    }

    @BeforeSuite
    public void launchBrowser() throws IOException {
        loadproperty();
        String browser = properties.getProperty("browser");
        String url = properties.getProperty("url");
        String driverlocation = properties.getProperty("driverlocation");
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",driverlocation);
            driver = new ChromeDriver();
        }
        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver",driverlocation);
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    /*@AfterSuite
    public void tearDown(){
        driver.quit();
    }*/

    public void clicknext(){
    }
}
