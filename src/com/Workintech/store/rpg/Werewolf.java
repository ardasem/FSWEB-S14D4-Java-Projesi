package com.Workintech.store.rpg;

public class Werewolf extends Monster implements Bleedable{

    public Werewolf(String name, int hitPoints, double health) {
        super(name, hitPoints, health);
    }

    @Override
    public double bleed() {
        return getHitPoints()*0.25;
    }

    @Override
    public double attack() {
        return getHitPoints()+bleed();
    }
}
