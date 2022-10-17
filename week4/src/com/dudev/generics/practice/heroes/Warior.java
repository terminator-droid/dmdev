package com.dudev.generics.practice.heroes;

import com.dudev.generics.practice.weapon.MeleeWeapon;

public class Warior<T extends MeleeWeapon> extends Hero<T> {
    private int damage;

    public Warior(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " наносит удар мечом врагу " + enemy.getName() + " и наносит урон" + damage);
        enemy.takeDamage(damage);
    }

}
