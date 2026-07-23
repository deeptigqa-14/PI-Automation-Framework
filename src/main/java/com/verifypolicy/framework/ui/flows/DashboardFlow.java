package com.verifypolicy.framework.ui.flows;

import com.verifypolicy.framework.ui.utils.DriverManager;
import com.verifypolicy.framework.ui.pages.DashboardPage;

public class DashboardFlow {
    private final DashboardPage dashboardPage;

    public DashboardFlow() {
        this.dashboardPage = new DashboardPage(DriverManager.getDriver());
    }

    public boolean isDashboardPageDisplayed() {
        return dashboardPage.getDashboardPageTitle().contains("Overview - Ping Identity");
    }

    public void clickPingOneVerifyLink() {
        dashboardPage.clickPingOneVerifyLink();
    }


}
