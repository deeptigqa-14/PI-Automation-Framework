package com.verifypolicy.framework.ui.model;

public class PolicyData {
    private String policyName;
    private String policyDesc;
    private String configuration_TransctionTimeout;
    private String configuration_DataCollectionTimeout;
    private boolean configuration_DataCollectionOnly;
    private String configuration_Geolocation;
    private boolean govID_enableDocAuth;
    private String govID_DocAuthProvider;
    private String govID_RetryAttempts;
    private boolean govID_EnableAAMVA;
    private boolean govID_FailExpiredID;
    private boolean digitalID_EnabledAadhaarVerification;
    private String facialComparison;
    private String facialComparisonThreshold;
    private String livenessVerify;
    private String livenessThreshold;
    private String selfieRetryAttempts;
    private String voiceVerification;
    private String phoneVerification;
    private String emailVerification;
    private String givenNameThreshold;
    private boolean givenNameRequired;
    private String familyNameThreshold;
    private boolean familyNameRequired;
    private String fullNameThreshold;
    private boolean fullNameRequired;
    private String birthDateThreshold;
    private boolean birthDateRequired;
    private String addressThreshold;
    private boolean addressRequired;
    private String dbIDVerification;
    private String dbIDVerifyThreshold;
    private boolean reqContractObligation;
    private String deviceOwnershipCheck;
    private String phNumRiskThreshold;
    private String phToNameThreshold;
    private String emailToPhoneThreshold;
    private String emailToNameThreshold;


    public PolicyData(String policyName, String policyDesc,
                      String TransctionTimeout, String DataCollectionTimeout, boolean DataCollectionOnly,String Geolocation,
                      boolean enableDocAuth, String docAuthProvider, String retryAttempts,boolean enableAAMVA,boolean failExpiredID, boolean enabledAadhaarVerification,
                      String facialComp, String facialCompThreshold, String liveVerify, String liveThreshold, String selfieRetryAttempts,
                      String voiceVerify, String phoneVerify, String emailVerify, String givenName, boolean givenNameReq , String familyName, boolean familyNameReq,
                      String fullName, boolean fullNameReq,  String birthDate, boolean birthDateReq, String address, boolean addressReq,
                      String sbIDVerify, String dbIDThreshold, boolean reqContract, String ownershipCheck, String phNumRisk, String phToName, String emailToPh, String emailToName){
        this.policyName = policyName;
        this.policyDesc = policyDesc;
        this.configuration_TransctionTimeout= TransctionTimeout;
        this.configuration_DataCollectionTimeout = DataCollectionTimeout;
        this.configuration_DataCollectionOnly =DataCollectionOnly;
        this.configuration_Geolocation= Geolocation;
        this.govID_enableDocAuth =enableDocAuth;
        this.govID_DocAuthProvider = docAuthProvider;
        this.govID_RetryAttempts= retryAttempts;
        this.govID_EnableAAMVA= enableAAMVA;
        this.govID_FailExpiredID = failExpiredID;
        this.digitalID_EnabledAadhaarVerification= enabledAadhaarVerification;
        this.facialComparison = facialComp;
        this.facialComparisonThreshold= facialCompThreshold;
        this.livenessVerify =liveVerify;
        this.livenessThreshold=liveThreshold;
        this.selfieRetryAttempts= selfieRetryAttempts;
        this.voiceVerification=voiceVerify;
        this.phoneVerification= phoneVerify;
        this.emailVerification= emailVerify;
        this.givenNameThreshold= givenName;
        this.givenNameRequired= givenNameReq;
        this.familyNameThreshold= familyName;
        this.familyNameRequired= familyNameReq;
        this.fullNameThreshold=fullName;
        this.fullNameRequired=fullNameReq;
        this.birthDateThreshold=birthDate;
        this.birthDateRequired=birthDateReq;
        this.addressThreshold=address;
        this.addressRequired=addressReq;
        this.dbIDVerification=sbIDVerify;
        this.dbIDVerifyThreshold=dbIDThreshold;
        this.reqContractObligation=reqContract;
        this.deviceOwnershipCheck= ownershipCheck;
        this.phNumRiskThreshold=phNumRisk;
        this.phToNameThreshold= phToName;
        this.emailToPhoneThreshold=emailToPh;
        this.emailToNameThreshold=emailToName;

    }

    //generate get for all fields
    public String getPolicyName(){return policyName;}
    public String getPolicyDesc(){return policyDesc;}
    public String getConfiguration_TransctionTimeout(){return configuration_TransctionTimeout;}
    public String getConfiguration_DataCollectionTimeout(){ return configuration_DataCollectionTimeout;}
    public boolean isSelectedDataCollectionOnly(){ return configuration_DataCollectionOnly;}
    public String getConfiguration_Geolocation(){return configuration_Geolocation;}
    public boolean isGovID_enableDocAuth(){return govID_enableDocAuth;}
    public String getGovID_DocAuthProvider(){ return govID_DocAuthProvider;}
    public String getGovID_RetryAttempts(){return govID_RetryAttempts;}
    public boolean isGovID_EnableAAMVA(){return govID_EnableAAMVA;}
    public boolean isGovID_FailExpiredID() {return govID_FailExpiredID;}
    public boolean isDigitalID_EnabledAadhaarVerification() {return digitalID_EnabledAadhaarVerification;}
    public String getFacialComparison(){return facialComparison;}
    public String getFacialComparisonThreshold(){return facialComparisonThreshold;}
    public String getLivenessVerify(){return livenessVerify;}
    public String getLivenessThreshold(){return livenessThreshold;}
    public String getSelfieRetryAttempts(){return selfieRetryAttempts;}
    public String getVoiceVerification(){return voiceVerification;}
    public String getPhoneVerification(){return phoneVerification;}
    public String getEmailVerification(){return emailVerification;}
    public String getGivenNameThreshold(){return givenNameThreshold;}
    public boolean isGivenNameRequired(){return givenNameRequired;}
    public String getFamilyNameThreshold(){return familyNameThreshold;}
    public boolean isFamilyNameRequired(){return familyNameRequired;}
    public String getFullNameThreshold(){return fullNameThreshold;}
    public boolean isFullNameRequired(){return fullNameRequired;}
    public String getBirthDateThreshold(){return birthDateThreshold;}
    public boolean isBirthDateRequired(){return birthDateRequired;}
    public String getAddressThreshold(){return addressThreshold;}
    public boolean isAddressRequired(){return addressRequired;}
    public String getDbIDVerification(){return dbIDVerification;}
    public String getDbIDThreshold(){return dbIDVerifyThreshold;}
    public boolean isReqContractObligation(){return reqContractObligation;}
    public String getDeviceOwnershipCheck(){return deviceOwnershipCheck;}
    public String getPhNumRiskThreshold(){return phNumRiskThreshold;}
    public String getPhToNameThreshold(){return phToNameThreshold;}
    public String getEmailToPhoneThreshold(){return emailToPhoneThreshold;}
    public String getEmailToNameThreshold(){return  emailToNameThreshold;}

}
