package com.dudev.generics.practice.heroes;

import com.dudev.generics.practice.weapon.Weapon;

public abstract class Hero<T extends Weapon> {
    private String name;
    private T weapon;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void attackEnemy(Enemy enemy);

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
