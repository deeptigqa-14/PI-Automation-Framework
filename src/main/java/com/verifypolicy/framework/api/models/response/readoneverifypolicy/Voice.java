package com.verifypolicy.framework.api.models.response.readoneverifypolicy;

public class Voice {
    private String verify;
    private boolean enrollment;
    private TextDependent textDependent;
    private Comparison comparison;
    private VoiceLiveness liveness;
    private ReferenceData referenceData;

    public String getVerify() { return verify; }
    public void setVerify(String verify) { this.verify = verify; }

    public boolean isEnrollment() { return enrollment; }
    public void setEnrollment(boolean enrollment) { this.enrollment = enrollment; }

    public TextDependent getTextDependent() { return textDependent; }
    public void setTextDependent(TextDependent textDependent) { this.textDependent = textDependent; }

    public Comparison getComparison() { return comparison; }
    public void setComparison(Comparison comparison) { this.comparison = comparison; }

    public VoiceLiveness getLiveness() { return liveness; }
    public void setLiveness(VoiceLiveness liveness) { this.liveness = liveness; }

    public ReferenceData getReferenceData() { return referenceData; }
    public void setReferenceData(ReferenceData referenceData) { this.referenceData = referenceData; }
}
