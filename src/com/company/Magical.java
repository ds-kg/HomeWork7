package com.company;

public class Magical extends Heroes implements Abilityable{
    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);
    }

    @Override
    public void Ability() {
        System.out.println("Magical`s damage increases to 18%");


    }
}
