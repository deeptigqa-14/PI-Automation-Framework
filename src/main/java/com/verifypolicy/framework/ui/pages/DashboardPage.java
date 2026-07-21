package com.verifypolicy.framework.ui.pages;

import com.verifypolicy.framework.ui.base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;

public class DashboardPage extends BasePage
{
    @FindBy(xpath="//button[@data-id='sidebar-section_pingoneverify']")
    private WebElement identityVerificationSidebarLink;

    @FindBy(id="verifypolicies")
    private WebElement verifyPoliciesLink;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public String getDashboardPageTitle() {
        wait.until(ExpectedConditions.titleContains("Overview - Ping Identity"));
        return getPageTitle();
    }

    public void clickPingOneVerifyLink() {
        click(identityVerificationSidebarLink);
        click(verifyPoliciesLink);

    }

}
