package com.dudev.oop.common.practice;

public class Archer extends Hero {
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
