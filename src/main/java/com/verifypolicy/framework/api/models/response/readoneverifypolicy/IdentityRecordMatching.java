package com.verifypolicy.framework.api.models.response.readoneverifypolicy;

public class IdentityRecordMatching {
    private ThresholdRequired given_name;
    private ThresholdRequired family_name;
    private ThresholdRequired name;
    private ThresholdRequired birth_date;
    private ThresholdRequired address;

    public ThresholdRequired getGiven_name() { return given_name; }
    public void setGiven_name(ThresholdRequired given_name) { this.given_name = given_name; }

    public ThresholdRequired getFamily_name() { return family_name; }
    public void setFamily_name(ThresholdRequired family_name) { this.family_name = family_name; }

    public ThresholdRequired getName() { return name; }
    public void setName(ThresholdRequired name) { this.name = name; }

    public ThresholdRequired getBirth_date() { return birth_date; }
    public void setBirth_date(ThresholdRequired birth_date) { this.birth_date = birth_date; }

    public ThresholdRequired getAddress() { return address; }
    public void setAddress(ThresholdRequired address) { this.address = address; }
}
