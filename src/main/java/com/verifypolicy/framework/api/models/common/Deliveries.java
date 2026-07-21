package com.verifypolicy.framework.api.models.common;

public class Deliveries {
    private int count;
    private Cooldown cooldown;

    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }

    public Cooldown getCooldown() { return cooldown; }
    public void setCooldown(Cooldown cooldown) { this.cooldown = cooldown; }
}
