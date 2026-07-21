package com.verifypolicy.framework.api.models.response.readoneverifypolicy;

import com.verifypolicy.framework.api.models.common.Retry;

public class Liveness {
    private String verify;
    private String threshold;
    private Retry retry;

    public String getVerify() { return verify; }
    public void setVerify(String verify) { this.verify = verify; }

    public String getThreshold() { return threshold; }
    public void setThreshold(String threshold) { this.threshold = threshold; }

    public Retry getRetry() { return retry; }
    public void setRetry(Retry retry) { this.retry = retry; }
}
