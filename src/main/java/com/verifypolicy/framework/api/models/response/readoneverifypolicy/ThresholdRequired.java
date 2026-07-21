package com.verifypolicy.framework.api.models.response.readoneverifypolicy;

public class ThresholdRequired {
    private String threshold;
    private boolean fieldRequired;

    public String getThreshold() { return threshold; }
    public void setThreshold(String threshold) { this.threshold = threshold; }

    public boolean isFieldRequired() { return fieldRequired; }
    public void setFieldRequired(boolean fieldRequired) { this.fieldRequired = fieldRequired; }
}
