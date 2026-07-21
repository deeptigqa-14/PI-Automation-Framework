package com.verifypolicy.framework.api.models.common;

public class Notification {
    private String templateName;
    private String variantName;

    public String getTemplateName() { return templateName; }
    public void setTemplateName(String templateName) { this.templateName = templateName; }

    public String getVariantName() { return variantName; }
    public void setVariantName(String variantName) { this.variantName = variantName; }
}
