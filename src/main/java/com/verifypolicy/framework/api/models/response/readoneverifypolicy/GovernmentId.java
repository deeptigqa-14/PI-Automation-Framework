package com.verifypolicy.framework.api.models.response.readoneverifypolicy;

import com.verifypolicy.framework.api.models.common.Enabled;
import com.verifypolicy.framework.api.models.common.Retry;

public class GovernmentId {
    private String verify;
    private String inspectionType;
    private boolean failExpiredId;
    private Retry retry;
    private Provider provider;
    private boolean verifyAamva;
    private Enabled aadhaar;
    private Enabled mdoc;
    private DocumentImages documentImages;

    public String getVerify() { return verify; }
    public void setVerify(String verify) { this.verify = verify; }

    public String getInspectionType() { return inspectionType; }
    public void setInspectionType(String inspectionType) { this.inspectionType = inspectionType; }

    public boolean isFailExpiredId() { return failExpiredId; }
    public void setFailExpiredId(boolean failExpiredId) { this.failExpiredId = failExpiredId; }

    public Retry getRetry() { return retry; }
    public void setRetry(Retry retry) { this.retry = retry; }

    public Provider getProvider() { return provider; }
    public void setProvider(Provider provider) { this.provider = provider; }

    public boolean isVerifyAamva() { return verifyAamva; }
    public void setVerifyAamva(boolean verifyAamva) { this.verifyAamva = verifyAamva; }

    public Enabled getAadhaar() { return aadhaar; }
    public void setAadhaar(Enabled aadhaar) { this.aadhaar = aadhaar; }

    public Enabled getMdoc() { return mdoc; }
    public void setMdoc(Enabled mdoc) { this.mdoc = mdoc; }

    public DocumentImages getDocumentImages() { return documentImages; }
    public void setDocumentImages(DocumentImages documentImages) { this.documentImages = documentImages; }
}
