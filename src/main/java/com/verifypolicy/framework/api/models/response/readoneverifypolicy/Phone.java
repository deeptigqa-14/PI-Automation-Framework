package com.verifypolicy.framework.api.models.response.readoneverifypolicy;

import com.verifypolicy.framework.api.models.common.Otp;

public class Phone {
    private String verify;
    private boolean createMfaDevice;
    private Otp otp;

    public String getVerify() { return verify; }
    public void setVerify(String verify) { this.verify = verify; }

    public boolean isCreateMfaDevice() { return createMfaDevice; }
    public void setCreateMfaDevice(boolean createMfaDevice) { this.createMfaDevice = createMfaDevice; }

    public Otp getOtp() { return otp; }
    public void setOtp(Otp otp) { this.otp = otp; }
}
