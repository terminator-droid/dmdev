package com.dudev.oop.common.practice;

public class Mage extends Hero{
    private int damage;
    public Mage(String name, int damage) {
        super(name);
        this.damage = damage;
    }
    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println(getName() + " кидает огненный шар во врага " + enemy.getName() + " и наносит ему " + damage);
        enemy.takeDamage(damage);
    }
}
