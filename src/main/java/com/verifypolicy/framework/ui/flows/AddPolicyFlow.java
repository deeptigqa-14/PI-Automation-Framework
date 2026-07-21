package com.verifypolicy.framework.ui.flows;

import com.verifypolicy.framework.ui.base.DriverManager;
import com.verifypolicy.framework.ui.model.PolicyData;
import com.verifypolicy.framework.ui.pages.AddPolicyPage;
import com.verifypolicy.framework.ui.utils.GenerateTestData;

public class AddPolicyFlow {

    private final AddPolicyPage addPolicyPage;

    public AddPolicyFlow() {
        this.addPolicyPage = new AddPolicyPage(DriverManager.getDriver());
    }

    public void enterPolicyName(String startsWith) {
        String policyName = GenerateTestData.generateUniquePolicyName(startsWith);
        addPolicyPage.enterPolicyName(policyName);
    }

    public void enterPolicyDescription(String desc) {
        addPolicyPage.enterPolicyDescription(desc);
    }

    public void enterTransactionTimeout(String transTimeOut) {
        addPolicyPage.enterTransactionTimeout(transTimeOut);
    }

    public void enterDataCollectionTimeout(String dataCollectionTimeout) {
        addPolicyPage.enterDataCollectionTimeout(dataCollectionTimeout);
    }

    public void setDataCollectionOnly(boolean dataCollectionOnly){
        addPolicyPage.setDataCollectionOnly(dataCollectionOnly);
    }

    public void createNewPolicy(PolicyData data){
        enterPolicyName(data.getPolicyName());
        enterPolicyDescription(data.getPolicyDesc());
        enterTransactionTimeout(data.getConfiguration_TransctionTimeout());
        enterDataCollectionTimeout(data.getConfiguration_DataCollectionTimeout());
        setDataCollectionOnly(data.isSelectedDataCollectionOnly());


    }

}
