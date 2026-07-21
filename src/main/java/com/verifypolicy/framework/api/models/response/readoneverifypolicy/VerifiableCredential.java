package com.verifypolicy.framework.api.models.response.readoneverifypolicy;

public class VerifiableCredential {
    private String verify;
    private String protocol;

    public String getVerify() { return verify; }
    public void setVerify(String verify) { this.verify = verify; }

    public String getProtocol() { return protocol; }
    public void setProtocol(String protocol) { this.protocol = protocol; }
}
