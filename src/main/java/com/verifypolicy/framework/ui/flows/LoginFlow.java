package com.verifypolicy.framework.ui.flows;

import com.verifypolicy.framework.config.ConfigReader;
import com.verifypolicy.framework.ui.base.DriverManager;
import com.verifypolicy.framework.ui.pages.LoginPage;

public class LoginFlow {

    private final LoginPage loginPage;
    ConfigReader configReader=new ConfigReader();

    public LoginFlow() {
        this.loginPage = new LoginPage(DriverManager.getDriver());
    }

    public void loginToPIAdminConsole() {

        loginPage.loginToPIAdminConsole(configReader.getUserName(),configReader.getPassword() );
    }
}
