package com.Workintech.store.rpg;

public class Boss extends Monster implements Poisonable,Bleedable{
    public Boss(String name, int hitPoints, double health) {
        super(name, hitPoints, health);
    }

    @Override
    public double bleed() {
        return getHitPoints()*0.25;
    }

    @Override
    public double attack() {
        return getHealth()+bleed()+(getHitPoints()*poison());
    }

}
