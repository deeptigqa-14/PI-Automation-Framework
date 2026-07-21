package com.verifypolicy.framework.api.models.response.readoneverifypolicy;

import com.verifypolicy.framework.api.models.common.DurationTimeUnit;

public class DataCollection {
    private DurationTimeUnit timeout;

    public DurationTimeUnit getTimeout() { return timeout; }
    public void setTimeout(DurationTimeUnit timeout) { this.timeout = timeout; }
}
