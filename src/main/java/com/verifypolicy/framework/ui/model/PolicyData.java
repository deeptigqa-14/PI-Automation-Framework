package com.verifypolicy.framework.ui.model;

public class PolicyData {
    private String policyName;
    private String policyDesc;
    private String configuration_TransctionTimeout;
    private String configuration_DataCollectionTimeout;
    private boolean configuration_Geolocation;

    public PolicyData(String policyName, String policyDesc, String configuration_TransctionTimeout, String configuration_DataCollectionTimeout,
                      boolean configuration_Geolocation){
        this.policyName = policyName;
        this.policyDesc = policyDesc;
        this.configuration_TransctionTimeout= configuration_TransctionTimeout;
        this.configuration_DataCollectionTimeout = configuration_DataCollectionTimeout;
        this.configuration_Geolocation =configuration_Geolocation;
    }

    //generate get for all fields
    public String getPolicyName(){return policyName;}
    public String getPolicyDesc(){return policyDesc;}
    public String getConfiguration_TransctionTimeout(){return configuration_TransctionTimeout;}
    public String getConfiguration_DataCollectionTimeout(){ return configuration_DataCollectionTimeout;}
    public boolean isSelectedDataCollectionOnly(){ return configuration_Geolocation;}


}
