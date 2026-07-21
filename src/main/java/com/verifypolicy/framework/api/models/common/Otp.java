package com.verifypolicy.framework.api.models.common;

public class Otp {
    private Attempts attempts;
    private DurationTimeUnit lifeTime;
    private Deliveries deliveries;
    private Notification notification;

    public Attempts getAttempts() { return attempts; }
    public void setAttempts(Attempts attempts) { this.attempts = attempts; }

    public DurationTimeUnit getLifeTime() { return lifeTime; }
    public void setLifeTime(DurationTimeUnit lifeTime) { this.lifeTime = lifeTime; }

    public Deliveries getDeliveries() { return deliveries; }
    public void setDeliveries(Deliveries deliveries) { this.deliveries = deliveries; }

    public Notification getNotification() { return notification; }
    public void setNotification(Notification notification) { this.notification = notification; }
}
