package testCases;

import commonFunctions.CommonFuntions;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Dashboard_PageObjects;
import pageObjects.LoginPage_PageObjects;

import java.util.concurrent.TimeUnit;

public class PendingLeaveRequests
        extends CommonFuntions {

    public void login() {

        PropertyConfigurator.configure("src\\test\\java\\log4j.properties");
        PageFactory.initElements(driver, LoginPage_PageObjects.class);
        LoginPage_PageObjects.username.sendKeys(properties.getProperty("username"));
        LoginPage_PageObjects.password.sendKeys(properties.getProperty("password"));
        LoginPage_PageObjects.password.sendKeys(properties.getProperty("password"));
        LoginPage_PageObjects.password.submit();

        if (LoginPage_PageObjects.dashboard.isDisplayed()
        )
            logger.info("Login successful");
        else
            logger.error("Login Failed");
    }

    @Test
    public void pendingLeave(){
        login();
        PageFactory.initElements(driver, Dashboard_PageObjects.class);
        String actualMessage = Dashboard_PageObjects.pendingLeaveRequests.getText();

        Assert.assertEquals(actualMessage, "No Records are Available");
    }
}

