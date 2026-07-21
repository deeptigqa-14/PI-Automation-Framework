package com.verifypolicy.framework.api.models.response.readoneverifypolicy;

public class ReferenceData {
    private boolean retainOriginalRecordings;
    private boolean updateOnReenrollment;
    private boolean updateOnVerification;

    public boolean isRetainOriginalRecordings() { return retainOriginalRecordings; }
    public void setRetainOriginalRecordings(boolean retainOriginalRecordings) { this.retainOriginalRecordings = retainOriginalRecordings; }

    public boolean isUpdateOnReenrollment() { return updateOnReenrollment; }
    public void setUpdateOnReenrollment(boolean updateOnReenrollment) { this.updateOnReenrollment = updateOnReenrollment; }

    public boolean isUpdateOnVerification() { return updateOnVerification; }
    public void setUpdateOnVerification(boolean updateOnVerification) { this.updateOnVerification = updateOnVerification; }
}
