package com.dudev.generics.practice.heroes;

import com.dudev.generics.practice.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T> {
    private int damage;

    public Mage(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " кидает огненный шар во врага " + enemy.getName() + " и наносит ему " + damage);
        enemy.takeDamage(damage);
    }
}
