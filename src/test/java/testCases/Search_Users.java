package testCases;

import commonFunctions.CommonFuntions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Admin_PageObjects;

public class Search_Users extends CommonFuntions {

    public void moveToUsers() {

        PageFactory.initElements(driver, Admin_PageObjects.class);
        Actions actions = new Actions(driver);
        actions.moveToElement(Admin_PageObjects.admin);
        actions.moveToElement(Admin_PageObjects.userManagement);
        actions.moveToElement(Admin_PageObjects.users).click().build().perform();

    }

    public void selectUser(){
        Select selectRole = new Select(Admin_PageObjects.userRole_dropdown);
        selectRole.selectByValue("1");
        Select selectStatus = new Select(Admin_PageObjects.status_dropdown);
        selectStatus.selectByValue("1");
    }

    @Test
    public void verifyUserRole() {
        moveToUsers();
        selectUser();
        Admin_PageObjects.searchButton.click();
        String actualRole = Admin_PageObjects.userRoleValue.getText();
        String actualStatus = Admin_PageObjects.userStatusValue.getText();
        Assert.assertEquals(actualStatus, "Enabled");
        Assert.assertEquals(actualRole, "Admin");
    }
}
