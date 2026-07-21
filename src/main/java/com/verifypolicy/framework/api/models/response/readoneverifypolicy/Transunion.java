package com.verifypolicy.framework.api.models.response.readoneverifypolicy;

public class Transunion {
    private String phoneToNameThreshold;
    private String emailToNameThreshold;
    private String emailToPhoneThreshold;
    private String phoneRiskThreshold;

    public String getPhoneToNameThreshold() { return phoneToNameThreshold; }
    public void setPhoneToNameThreshold(String phoneToNameThreshold) { this.phoneToNameThreshold = phoneToNameThreshold; }

    public String getEmailToNameThreshold() { return emailToNameThreshold; }
    public void setEmailToNameThreshold(String emailToNameThreshold) { this.emailToNameThreshold = emailToNameThreshold; }

    public String getEmailToPhoneThreshold() { return emailToPhoneThreshold; }
    public void setEmailToPhoneThreshold(String emailToPhoneThreshold) { this.emailToPhoneThreshold = emailToPhoneThreshold; }

    public String getPhoneRiskThreshold() { return phoneRiskThreshold; }
    public void setPhoneRiskThreshold(String phoneRiskThreshold) { this.phoneRiskThreshold = phoneRiskThreshold; }
}
