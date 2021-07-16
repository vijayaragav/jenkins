package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_PageObjects {


    @FindBy(id = "menu_admin_viewAdminModule")
    public static WebElement admin;

    @FindBy(id = "menu_admin_UserManagement")
    public static WebElement userManagement;

    @FindBy(id = "menu_admin_viewSystemUsers")
    public static WebElement users;

    @FindBy(id = "searchSystemUser_userType")
    public static WebElement userRole_dropdown;

    @FindBy(id = "searchSystemUser_status")
    public static WebElement status_dropdown;

    @FindBy(id = "searchBtn")
    public static WebElement searchButton;

    @FindBy(xpath = "//tr/td[5]")
    public static WebElement userStatusValue;

    @FindBy(xpath = "//tr/td[3]")
    public static WebElement userRoleValue;

}
