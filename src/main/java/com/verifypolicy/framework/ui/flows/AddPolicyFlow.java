package com.verifypolicy.framework.ui.flows;

import com.verifypolicy.framework.ui.base.DriverManager;
import com.verifypolicy.framework.ui.model.PolicyData;
import com.verifypolicy.framework.ui.pages.AddPolicyPage;
import com.verifypolicy.framework.ui.utils.GenerateTestData;

public class AddPolicyFlow {

    private final AddPolicyPage addPolicyPage;
    public String policyName;

    public AddPolicyFlow() {
        this.addPolicyPage = new AddPolicyPage(DriverManager.getDriver());
    }

    public void enterPolicyName(String startsWith) {
        policyName = GenerateTestData.generateUniquePolicyName(startsWith);
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

    public void setGeolocationValue(String geoLocation)
    {
        addPolicyPage.setGeolocationValue(geoLocation);
    }

    public void setEnableDocAuth(boolean expectedStatus){
        addPolicyPage.setEnableDocAuthchk(expectedStatus);
    }

    public void setDocAuthProvider(String provider){
        addPolicyPage.setDocAuthProviderValue(provider);
    }

    public void setGovIDRetryAttempts(String retryAttempts){
        addPolicyPage.setGovIDRetryAttempts(retryAttempts);
    }

    public void setEnableAAMVA(boolean enableAAMVA){
        addPolicyPage.setEnableAAMVA(enableAAMVA);
    }

    public void setFailExpiredID(boolean failExpiredID){
        addPolicyPage.setFailExpiredID(failExpiredID);
    }

    public void setEnableAadhaarVerification(boolean aadhaarVerification){
        addPolicyPage.setEnableAadhaarVerification(aadhaarVerification);
    }

    public void setFacialComparisonVerify(String facialComparisonVerify){
        addPolicyPage.setFacialComparisonVerify(facialComparisonVerify);
    }

    public void setFacialComparisonThreshold(String facialComparisonThreshold){
        addPolicyPage.setGetFacialComparisonThreshold(facialComparisonThreshold);
    }

    public void setLivenessVerify(String liveVerify){
        addPolicyPage.setLivenessVerify(liveVerify);
    }

    public void setLivenessThreshold(String liveThreshold){
        addPolicyPage.setLivenessThreshold(liveThreshold);
    }

    public void setSelfieRetryAttempts(String selfieRetryAttempts){
        addPolicyPage.setSelfieRetryAttempts(selfieRetryAttempts);
    }

    public void setVoiceVerification(String voiceVerify){
        addPolicyPage.setVoiceVerification(voiceVerify);
    }

    public void setPhoneVerification(String phoneVerify){
        addPolicyPage.setPhoneVerify(phoneVerify);
    }

    public void setEmailVerification(String emailVerify){
        addPolicyPage.setEmailVerify(emailVerify);
    }

    public void setGivenNameThreshold(String givenName){
        addPolicyPage.setGivenNameThreshold(givenName);
    }

    public void isGivenNameRequired(boolean givenNameReq){
        addPolicyPage.isGivenNameRequired(givenNameReq);
    }

    public void setFamilyNameThreshold(String familyName){
        addPolicyPage.setFamilyNameThreshold(familyName);
    }

    public void isFamilyNameRequired(boolean familyNameReq){
        addPolicyPage.isFamilyNameRequired(familyNameReq);
    }

    public void setFullNameThreshold(String fullName){
        addPolicyPage.setFullNameThreshold(fullName);
    }

    public void isFullNameRequired(boolean fullNameReq){
        addPolicyPage.isFullNameRequired(fullNameReq);
    }

    public void setBirthDateThreshold(String birthDate){
        addPolicyPage.setBirthDateThreshold(birthDate);
    }

    public void isBirthdateRequired(boolean birthDateReq){
        addPolicyPage.isBirthDateRequired(birthDateReq);
    }

    public void setAddressThreshold(String address){
        addPolicyPage.setAddressThreshold(address);
    }

    public void isAddressRequired(boolean addressReq){
        addPolicyPage.isAddressRequired(addressReq);
    }

    public void setDBIDVerification(String dbIDVerify){
        addPolicyPage.setDataBasedIDVerification(dbIDVerify);
    }

    public void setDBIDVerifyThreshold(String dbIDThreshold){
        addPolicyPage.setDataBasedIDVerificationThreshold(dbIDThreshold);
    }

    public void isReqContractObligation(boolean reqContractObligation){
        addPolicyPage.isReqContratObligation(reqContractObligation);
    }

    public void setDeviceOwnershipCheck(String ownershipCheck){
        addPolicyPage.setDeviceOwnershipCheck(ownershipCheck);
    }

    public void setPhNumRiskThreshold(String phNumRisk){
        addPolicyPage.setPhRiskThreshold(phNumRisk);
    }

    public void setPhToNameThreshold(String phToName){
        addPolicyPage.setPhToNameThreshold(phToName);
    }

    public void setEmailToPhThreshold(String emailToPhone){
        addPolicyPage.setEmailToPhThreshold(emailToPhone);
    }

    public void setEmailToNameThreshold(String emailToName){
        addPolicyPage.setEmailToNameThreshold(emailToName);
    }

    public void addPolicy(){
        addPolicyPage.clickSavePolicy();
    }

    public void saveChanges(){
        addPolicyPage.clickSavePolicy();
    }

    public String getOpenPolicyName(){
        return addPolicyPage.getPolicyName();
    }



    public void createNewPolicy(PolicyData data){
        enterPolicyName(data.getPolicyName());
        enterPolicyDescription(data.getPolicyDesc());

        //Update Configuration Fields
        enterTransactionTimeout(data.getConfiguration_TransctionTimeout());
        enterDataCollectionTimeout(data.getConfiguration_DataCollectionTimeout());
        setDataCollectionOnly(data.isSelectedDataCollectionOnly());
        setGeolocationValue(data.getConfiguration_Geolocation());
        //Update Gov ID fields
        setEnableDocAuth(data.isGovID_enableDocAuth());
        setDocAuthProvider(data.getGovID_DocAuthProvider());
        setGovIDRetryAttempts(data.getGovID_RetryAttempts());
        setEnableAAMVA(data.isGovID_EnableAAMVA());
        setFailExpiredID(data.isGovID_FailExpiredID());
        setEnableAadhaarVerification(data.isDigitalID_EnabledAadhaarVerification());
        setFacialComparisonVerify(data.getFacialComparison());
        setFacialComparisonThreshold(data.getFacialComparisonThreshold());
        setLivenessVerify(data.getLivenessVerify());
        setLivenessThreshold(data.getLivenessThreshold());
        setSelfieRetryAttempts(data.getSelfieRetryAttempts());
        setVoiceVerification(data.getVoiceVerification());
        setEmailVerification(data.getEmailVerification());
        setPhoneVerification(data.getPhoneVerification());

        setGivenNameThreshold(data.getGivenNameThreshold());
        isGivenNameRequired(data.isGivenNameRequired());
        setFamilyNameThreshold(data.getFamilyNameThreshold());
        isFamilyNameRequired(data.isFamilyNameRequired());
        setFullNameThreshold(data.getFullNameThreshold());
        isFullNameRequired(data.isFullNameRequired());
        setBirthDateThreshold(data.getBirthDateThreshold());
        isBirthdateRequired(data.isBirthDateRequired());
        setAddressThreshold(data.getAddressThreshold());
        isAddressRequired(data.isAddressRequired());
        setDBIDVerification(data.getDbIDVerification());
        setDBIDVerifyThreshold(data.getDbIDThreshold());
        isReqContractObligation(data.isReqContractObligation());
        setDeviceOwnershipCheck(data.getDeviceOwnershipCheck());
        setPhNumRiskThreshold(data.getPhNumRiskThreshold());
        setPhToNameThreshold(data.getPhToNameThreshold());
        setEmailToPhThreshold(data.getEmailToPhoneThreshold());
        setEmailToNameThreshold(data.getEmailToNameThreshold());
        addPolicy();


    }

    public void updateEnabledAadhaarVerification(boolean expectedStatus){
        addPolicyPage.setEnableAadhaarVerification(expectedStatus);
    }

}
