package com.Workintech.store.rpg;

public abstract class Monster {

    private String name;
    private int hitPoints;
    private double health;

    public Monster(String name, int hitPoints, double health) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getHealth() {
        return health;
    }
    public abstract double attack();
}
