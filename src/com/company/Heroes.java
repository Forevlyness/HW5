package com.company;

public class Heroes {
    private int health;
    private int damage;
    private String superAbility;

    public Heroes(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public Heroes(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHeroes() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " heroes=" + health +
                ", damage=" + damage +
                ", superAbility='" + superAbility;
    }
}
