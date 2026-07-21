package com.verifypolicy.framework.ui.pages;

import com.verifypolicy.framework.config.ConfigReader;
import com.verifypolicy.framework.ui.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public static final ConfigReader configReader = new ConfigReader();

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "username")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//button[@data-id='submit-button']")
    private WebElement signOn;


    public void enterUsername(String username) {
       type(userName, username);
    }

    public void enterPassword(String pwd) {
        type(password, pwd);
    }

    public void loginToPIAdminConsole(String username, String pwd) {
        navigateTo(configReader.GetPIAdminConsoleUrl());
        enterUsername(username);
        enterPassword(pwd);
        click(signOn);
    }
}
