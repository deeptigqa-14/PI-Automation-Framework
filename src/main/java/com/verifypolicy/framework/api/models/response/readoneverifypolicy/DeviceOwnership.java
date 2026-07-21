package com.verifypolicy.framework.api.models.response.readoneverifypolicy;

public class DeviceOwnership {
    private String verify;
    private Transunion transunion;

    public String getVerify() { return verify; }
    public void setVerify(String verify) { this.verify = verify; }

    public Transunion getTransunion() { return transunion; }
    public void setTransunion(Transunion transunion) { this.transunion = transunion; }
}
