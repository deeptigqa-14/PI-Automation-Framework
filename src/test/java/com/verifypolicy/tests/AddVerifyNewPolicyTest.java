package com.verifypolicy.tests;

import com.verifypolicy.framework.api.clients.ReadOneVerifyPolicyClient;
import com.verifypolicy.framework.api.models.response.readoneverifypolicy.ReadOneVerifyPolicyResponse;
import com.verifypolicy.framework.ui.base.BaseTest;
import com.verifypolicy.framework.ui.flows.AddPolicyFlow;
import com.verifypolicy.framework.ui.flows.DashboardFlow;
import com.verifypolicy.framework.ui.flows.LoginFlow;
import com.verifypolicy.framework.ui.flows.VerifyPoliciesFlow;
import com.verifypolicy.framework.ui.model.PolicyData;
import com.verifypolicy.framework.ui.utils.ReportLogger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class AddVerifyNewPolicyTest extends BaseTest {

    LoginFlow loginFlow= new LoginFlow();
    DashboardFlow dashboardFlow = new DashboardFlow();
    AddPolicyFlow addPolicyFlow = new AddPolicyFlow();
    VerifyPoliciesFlow verifyPoliciesFlow = new VerifyPoliciesFlow();
    public String policyID;
    public String policyName;

    @Test(dataProvider="policyData", priority = 1)
    public void testAddVerifyNewPolicy(PolicyData data) {
        ReportLogger.logStep("STEP 1: Login to PI Console by given username and password");
        loginFlow.loginToPIAdminConsole();
        ReportLogger.logStep("Verify user is navigated to Dashboard");
        Assert.assertTrue(dashboardFlow.isDashboardPageDisplayed(), "Dashboard page is not displayed after login.");
        ReportLogger.logStep("STEP 2: Click on Identify Verification --> Verify Policies");
        dashboardFlow.clickPingOneVerifyLink();
        ReportLogger.logStep("Verify user is navigated to Verify Policies");
        Assert.assertTrue(verifyPoliciesFlow.isVerifyPoliciesPageDisplayed(),"Verify Policies page not displayed.");
        ReportLogger.logStep("STEP 3: Click on + sign to Add New Policy");
        verifyPoliciesFlow.clickAddPolicyButton();
        ReportLogger.logStep("STEP 4: Fill the data and click save"+ data.toString());
        addPolicyFlow.createNewPolicy(data);
        policyName =addPolicyFlow.policyName;
        System.out.println("New Policy Name: "+ policyName);
        policyID=verifyPoliciesFlow.getNewPolicyID();
        System.out.println("New Policy ID: "+policyID );


    }

    @Test(priority = 2)
    public void testVerifyAddedPolicy(){
        System.out.println("STEP 5: Navigated back to verify policies");
        Assert.assertTrue(verifyPoliciesFlow.isVerifyPoliciesPageDisplayed(),"Verify Policies page not displayed.");
        System.out.println("STEP 4: Verify Policy details from API");
        ReadOneVerifyPolicyClient client = new ReadOneVerifyPolicyClient();
        ReadOneVerifyPolicyResponse response = client.readOneVerifyPolicy(policyID);
        Assert.assertEquals(response.getName(), policyName);
        System.out.println("Response: " + response.getName());
        Assert.assertEquals(response.getGovernmentId().getVerify(), "REQUIRED");
    }

    @Test(priority = 3)
    public void testUpdatePolicy(){
        verifyPoliciesFlow.closeAnyOpenPolicy();
        verifyPoliciesFlow.searchPolicyByName(policyName);
        verifyPoliciesFlow.clickPolicyByName(policyName);
        Assert.assertTrue(verifyPoliciesFlow.getNewPolicyID().equals(policyID), "Wrong policy Opened");
        verifyPoliciesFlow.updatePolicyByName();
        Assert.assertTrue(addPolicyFlow.getOpenPolicyName().equals(policyName),"Wrong policy opened");
        addPolicyFlow.updateEnabledAadhaarVerification(true);
        addPolicyFlow.saveChanges();


    }

    @Test(priority = 4)
    public void testDeletePolicy(){
        verifyPoliciesFlow.closeAnyOpenPolicy();
        verifyPoliciesFlow.searchPolicyByName(policyName);
        verifyPoliciesFlow.clickPolicyByName(policyName);
        Assert.assertTrue(verifyPoliciesFlow.getNewPolicyID().equals(policyID), "Wrong policy Opened");
        verifyPoliciesFlow.deletePolicy();
        verifyPoliciesFlow.searchPolicyByName(policyName);
        Assert.assertTrue(verifyPoliciesFlow.isPolicyListEmpty(), "Policy is not deleted");

    }


    @DataProvider(name = "policyData")
    public Object[][] policyData() {
        return new Object[][]{
                { new PolicyData("AutoTest_FullVerify_DG", "Full Verification",
                        "30", "15", true, "REQUIRED",
                        true, "VERIFF","2",true,true, false,
                        "REQUIRED","HIGH", "REQUIRED","LOW","1",
                        "DISABLED","DISABLED","DISABLED","HIGH",true, "HIGH",true,
                        "HIGH",true,"HIGH",true,"HIGH",true, "ENABLED","MEDIUM",true,
                        "ENABLED","MEDIUM","MEDIUM","MEDIUM","MEDIUM"
                        ) }
        };
    }
}
