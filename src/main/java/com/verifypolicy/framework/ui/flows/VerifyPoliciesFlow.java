package com.verifypolicy.framework.ui.flows;

import com.verifypolicy.framework.ui.base.DriverManager;
import com.verifypolicy.framework.ui.pages.VerifyPoliciesPage;
import org.openqa.selenium.WebDriver;

public class VerifyPoliciesFlow {
    private final VerifyPoliciesPage verifyPoliciesPage;

    public VerifyPoliciesFlow() {
       this.verifyPoliciesPage= new VerifyPoliciesPage(DriverManager.getDriver());
    }

    public boolean isVerifyPoliciesPageDisplayed() {
        System.out.println("Verify Policies Page Title: " + verifyPoliciesPage.getVerifyPoliciesPageTitle());
        return verifyPoliciesPage.getVerifyPoliciesPageTitle().contains("Verify Policies");
    }

    public void selectPolicy(String policyName) {

        // Logic to verify the policy with the given name
    }

    public void clickAddPolicyButton()
    {
        verifyPoliciesPage.clickAddPolicyButton();
    }
}
