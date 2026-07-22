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
        String policyID;
        System.out.println("STEP 1: Login to PI Console");
        loginFlow.loginToPIAdminConsole();
        Assert.assertTrue(dashboardFlow.isDashboardPageDisplayed(), "Dashboard page is not displayed after login.");
        System.out.println("STEP 2: Click on Identify Verification--> Verify Policies");
        dashboardFlow.clickPingOneVerifyLink();
        Assert.assertTrue(verifyPoliciesFlow.isVerifyPoliciesPageDisplayed(),"Verify Policies page not displayed.");
        System.out.println("STEP 3: Click on + sign to Add New Policy");
        verifyPoliciesFlow.clickAddPolicyButton();
        System.out.println("STEP 4: Fill the data and click save");
        addPolicyFlow.createNewPolicy(data);
        System.out.println("New Policy Name: "+addPolicyFlow.policyName);
        policyID=verifyPoliciesFlow.getNewPolicyID();
        System.out.println("New Policy ID: "+policyID );
        System.out.println("STEP 5: Navigated back to verify policies");
        Assert.assertTrue(verifyPoliciesFlow.isVerifyPoliciesPageDisplayed(),"Verify Policies page not displayed.");
        System.out.println("Delete policy");
        verifyPoliciesFlow.deletePolicy();
        verifyPoliciesFlow.searchPolicyByName(addPolicyFlow.policyName);




    }

    @DataProvider(name = "policyData")
    public Object[][] policyData() {
        return new Object[][]{
                { new PolicyData("AutoTest_FullVerify_DG", "Full Verification",
                        "20", "15", true, "REQUIRED",
                        true, "VERIFF","2",true,true, true,
                        "REQUIRED","HIGH", "REQUIRED","LOW","1",
                        "DISABLED","DISABLED","DISABLED","HIGH",true, "HIGH",true,
                        "HIGH",true,"HIGH",true,"HIGH",true, "ENABLED","MEDIUM",true,
                        "ENABLED","MEDIUM","MEDIUM","MEDIUM","MEDIUM"
                        ) }
        };
    }
}
