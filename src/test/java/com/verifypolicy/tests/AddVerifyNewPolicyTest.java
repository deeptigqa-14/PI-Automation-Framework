package com.verifypolicy.tests;

import com.verifypolicy.framework.ui.base.BaseTest;
import com.verifypolicy.framework.ui.flows.AddPolicyFlow;
import com.verifypolicy.framework.ui.flows.DashboardFlow;
import com.verifypolicy.framework.ui.flows.LoginFlow;
import com.verifypolicy.framework.ui.flows.VerifyPoliciesFlow;
import com.verifypolicy.framework.ui.model.PolicyData;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddVerifyNewPolicyTest extends BaseTest {

    LoginFlow loginFlow= new LoginFlow();
    DashboardFlow dashboardFlow = new DashboardFlow();
    AddPolicyFlow addPolicyFlow = new AddPolicyFlow();
    VerifyPoliciesFlow verifyPoliciesFlow = new VerifyPoliciesFlow();

    @Test(dataProvider="policyData")
    public void testAddVerifyNewPolicy(PolicyData data) {
        // Implement the test logic here
        loginFlow.loginToPIAdminConsole("QA_USER","Ping@2026");
        Assert.assertTrue(dashboardFlow.isDashboardPageDisplayed(), "Dashboard page is not displayed after login.");
        dashboardFlow.clickPingOneVerifyLink();
        Assert.assertTrue(verifyPoliciesFlow.isVerifyPoliciesPageDisplayed(),"Verify Policies page not displayed.");
        verifyPoliciesFlow.clickAddPolicyButton();
        addPolicyFlow.createNewPolicy(data);



    }

    @DataProvider(name = "policyData")
    public Object[][] policyData() {
        return new Object[][]{
                { new PolicyData("AutoTest_FullVerify_DG", "desc", "30", "14", true) }
        };
    }
}
