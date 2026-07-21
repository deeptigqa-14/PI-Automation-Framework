package com.verifypolicy.framework.api.models.common;

public class Cooldown {
    private int duration;
    private String timeUnit;

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public String getTimeUnit() { return timeUnit; }
    public void setTimeUnit(String timeUnit) { this.timeUnit = timeUnit; }
}
