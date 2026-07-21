package com.verifypolicy.framework.ui.flows;

import com.verifypolicy.framework.ui.base.DriverManager;
import com.verifypolicy.framework.ui.pages.LoginPage;

public class LoginFlow {

    private final LoginPage loginPage;

    public LoginFlow() {
        this.loginPage = new LoginPage(DriverManager.getDriver());
    }

    public void loginToPIAdminConsole(String username, String password) {
        loginPage.loginToPIAdminConsole(username, password);
    }
}
