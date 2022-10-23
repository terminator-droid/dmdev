package com.dudev.generics.practice.heroes;

import com.dudev.generics.practice.weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {
    private int damage;

    public Archer(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " стреляет во врага " + enemy.getName() + " из лука " +"и наносит ему " + damage);
        enemy.takeDamage(damage);
    }
}
