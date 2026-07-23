package com.verifypolicy.tests;

import com.aventstack.extentreports.model.Report;
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
import org.testng.annotations.Test;

public class AddVerifyNewPolicyTest extends BaseTest {

    LoginFlow loginFlow= new LoginFlow();
    DashboardFlow dashboardFlow = new DashboardFlow();
    AddPolicyFlow addPolicyFlow = new AddPolicyFlow();
    VerifyPoliciesFlow verifyPoliciesFlow = new VerifyPoliciesFlow();
    ReadOneVerifyPolicyClient client = new ReadOneVerifyPolicyClient();
    public String policyID;
    public String policyName;

    @Test(dataProvider="policyData", priority = 1)
    public void testAddVerifyNewPolicy(PolicyData data) {
        ReportLogger.logStep("Create a new policy on PI Console");
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
        ReportLogger.logStep("STEP 4: Fill the data and click save.");
        addPolicyFlow.createNewPolicy(data);
        ReportLogger.logStep("verify navigated back to verify policies");
        Assert.assertTrue(verifyPoliciesFlow.isVerifyPoliciesPageDisplayed(),"Verify Policies page not displayed.");
        ReportLogger.logStep("Get new Policy Name");
        policyName =addPolicyFlow.policyName;
        ReportLogger.logStep("New Policy Name: "+ policyName);
        ReportLogger.logStep("Get Policy ID from UI");
        policyID=verifyPoliciesFlow.getNewPolicyID();
        ReportLogger.logStep("New Policy ID: "+policyID );
    }

    @Test(priority = 2)
    public void testVerifyAddedPolicy(){
        ReportLogger.logStep("Test API to verify newly created policy in DB");
        ReportLogger.logStep("STEP 1: Verify Policy details from API (Read One Verify Policy)");
        //ReadOneVerifyPolicyClient client = new ReadOneVerifyPolicyClient();
        ReportLogger.logStep("Get policy using policyID");
        ReadOneVerifyPolicyResponse response = client.readOneVerifyPolicy(policyID);
        Assert.assertTrue(response.getName().equals(policyName), "Policy name is matching with API response");
        ReportLogger.logStep("API Response: ");
        ReportLogger.logStep("Policy Name " + response.getName());
        Assert.assertTrue(response.getVoice().getVerify().contains("DISABLED"),"Voice status is not matching");
        Assert.assertTrue(response.getPhone().getVerify().contains("DISABLED"),"Phone status is not matching");
        Assert.assertTrue(response.getEmail().getVerify().contains("DISABLED"),"Email status is not matching");
        ReportLogger.logStep("Voice , Phone, and Email verification :" +response.getVoice().getVerify()  +", " + response.getPhone().getVerify() +", "+ response.getEmail().getVerify());
        Assert.assertTrue(response.getFacialComparison().getVerify().contains("REQUIRED"),"Facial Comparison is matching");
        Assert.assertTrue(response.getLiveness().getVerify().contains("REQUIRED"),"Liveness is not matching");
        ReportLogger.logStep("Facial Comparison ;" + response.getFacialComparison().getVerify());
        ReportLogger.logStep("Liveness ;" + response.getLiveness().getVerify());
        ReportLogger.logStep("Enabled Aadhaar Verification : " + response.getGovernmentId().getAadhaar().isEnabled());
    }

    @Test(priority = 3)
    public void testUpdatePolicy(){
        ReportLogger.logStep("Test API to verify newly created policy in DB");
        ReportLogger.logStep("Step 1: close open policy on verify policies screen");
        verifyPoliciesFlow.closeAnyOpenPolicy();
        ReportLogger.logStep("Step 2: Fill the policy name in search box" +policyName);
        verifyPoliciesFlow.searchPolicyByName(policyName);
        ReportLogger.logStep("Verify total rows returned" +verifyPoliciesFlow.totalRows());
        Assert.assertTrue(verifyPoliciesFlow.totalRows()>0,"No policy found by name :"+ policyName);
        ReportLogger.logStep("Step 3: Click on policy");
        verifyPoliciesFlow.clickPolicyByName(policyName);
        ReportLogger.logStep("Verify correct policy is opened in sidebar");
        Assert.assertTrue(verifyPoliciesFlow.getNewPolicyID().equals(policyID), "Wrong policy Opened");
        ReportLogger.logStep("Step 4: Click on update policy button");
        verifyPoliciesFlow.updatePolicyByName();
        ReportLogger.logStep("Verify correct policy is opened to update");
        Assert.assertTrue(addPolicyFlow.getOpenPolicyName().equals(policyName),"Wrong policy opened");
        ReportLogger.logStep("Step 5: update Enable Aadhaar verification as true");
        addPolicyFlow.updateEnabledAadhaarVerification(true);
        addPolicyFlow.saveChanges();
        ReportLogger.logStep("Get policy using policyID");
        ReadOneVerifyPolicyResponse response = client.readOneVerifyPolicy(policyID);
        Assert.assertTrue(response.getName().equals(policyName), "Policy name is matching with API response");
        ReportLogger.logStep("API Response: ");
        Assert.assertTrue(response.getGovernmentId().getAadhaar().isEnabled(),"Aadhaar is enabled");
        ReportLogger.logStep("Enabled Aadhaar Verification : " + response.getGovernmentId().getAadhaar().isEnabled());

    }

    @Test(priority = 4)
    public void testDeletePolicy(){
        ReportLogger.logStep("Test Delete Policy");
        ReportLogger.logStep("Step 1: Close any open policy");
        verifyPoliciesFlow.closeAnyOpenPolicy();
        ReportLogger.logStep("Step 2: Search policy by name :"+ policyName);
        verifyPoliciesFlow.searchPolicyByName(policyName);
        ReportLogger.logStep("Step 3: Click on policy");
        verifyPoliciesFlow.clickPolicyByName(policyName);
        ReportLogger.logStep("Verify correct policy is opened in sidebar");
        Assert.assertTrue(verifyPoliciesFlow.getNewPolicyID().equals(policyID), "Wrong policy Opened");
        ReportLogger.logStep("Step 4: Click on hamburger menu--> delete-->delete");
        verifyPoliciesFlow.deletePolicy();
        ReportLogger.logStep("Step 5: Search policy by name :"+ policyName);
        verifyPoliciesFlow.searchPolicyByName(policyName);
        ReportLogger.logStep("Verify total rows returned 0: " +verifyPoliciesFlow.totalRows());
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
