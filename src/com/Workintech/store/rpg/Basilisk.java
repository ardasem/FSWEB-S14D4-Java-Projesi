package com.Workintech.store.rpg;

public class Basilisk extends Monster implements Poisonable{
    public Basilisk(String name, int hitPoints, double health) {
        super(name, hitPoints, health);
    }


    @Override
    public double attack() {
        return getHitPoints()+poison();
    }

}
