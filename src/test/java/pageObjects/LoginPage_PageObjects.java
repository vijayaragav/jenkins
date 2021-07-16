package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage_PageObjects {

    @FindBy(xpath = "//*[@name='txtUsername']")
    public static WebElement username;

    @FindBy(xpath = "//*[@name='txtPassword']")
    public static WebElement password;

    @FindBy (id = "menu_dashboard_index")
    public static WebElement dashboard;
}

