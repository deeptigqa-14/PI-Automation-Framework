package com.verifypolicy.framework.api.models.common;

public class Links {
    private Href self;
    private Href environment;

    public Href getSelf() { return self; }
    public void setSelf(Href self) { this.self = self; }

    public Href getEnvironment() { return environment; }
    public void setEnvironment(Href environment) { this.environment = environment; }
}
