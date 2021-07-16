package fileHandling;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Exercise04_Enhanced_test_scripts {

    public static void main(String [] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\" +
                "chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(sourcefile, new File("C:\\Users\\karth\\Downloads\\NewFile.png"));
        Set<String> windows =  driver.getWindowHandles();
        int windowsize = windows.size();
        System.out.println("the name of opened window: " + driver.getTitle());
        System.out.println("the number of opened windows: " + windowsize);
        driver.close();

    }
}
class ABCBank{
    int phone;
    double getPhone(){
        System.out.println("phone number received");
        return phone;
    }
}