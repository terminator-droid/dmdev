package com.dudev.oop.common.practice;

public class Enemy implements Mortal{
    private int health;
    private String name;
    public Enemy(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void printHealth() {
        System.out.println("Здоровье врага " + name +": "+ health);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
