package com.dudev.oop.common.practice;

public class Warior extends Hero {
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
