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
        return verifyPoliciesPage.getVerifyPoliciesPageTitle().contains("Verify Policies");
    }

    public void clickPolicyByName(String policyName) {
        verifyPoliciesPage.clickPolicy(policyName);
        // Logic to verify the policy with the given name
    }

    public void clickAddPolicyButton()
    {
        verifyPoliciesPage.clickAddPolicyButton();
    }
    public String getNewPolicyID(){
        return verifyPoliciesPage.getPolicyID();
    }

    public void deletePolicy(){
        verifyPoliciesPage.deletePolicy();
    }

    public void updatePolicyByName(){
        verifyPoliciesPage.clickUpdatePolicyBtn();
    }

    public void searchPolicyByName(String policyName){
        verifyPoliciesPage.enterSearchText(policyName);
    }

    public void closeAnyOpenPolicy()
    {
        verifyPoliciesPage.closeAnyOpenPolicy();
    }

    public boolean isPolicyListEmpty(){return verifyPoliciesPage.isPolicyListEmpty();}
}
