package com.verifypolicy.framework.api.models.response.readoneverifypolicy;

import com.verifypolicy.framework.api.models.common.DurationTimeUnit;

public class Transaction {
    private DurationTimeUnit timeout;
    private DataCollection dataCollection;
    private Ida ida;
    private boolean dataCollectionOnly;
    private boolean authenticationMode;

    public DurationTimeUnit getTimeout() { return timeout; }
    public void setTimeout(DurationTimeUnit timeout) { this.timeout = timeout; }

    public DataCollection getDataCollection() { return dataCollection; }
    public void setDataCollection(DataCollection dataCollection) { this.dataCollection = dataCollection; }

    public Ida getIda() { return ida; }
    public void setIda(Ida ida) { this.ida = ida; }

    public boolean isDataCollectionOnly() { return dataCollectionOnly; }
    public void setDataCollectionOnly(boolean dataCollectionOnly) { this.dataCollectionOnly = dataCollectionOnly; }

    public boolean isAuthenticationMode() { return authenticationMode; }
    public void setAuthenticationMode(boolean authenticationMode) { this.authenticationMode = authenticationMode; }
}
