package com.dudev.oop.common.practice;

public abstract class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void attackEnemy(Enemy enemy);
}
