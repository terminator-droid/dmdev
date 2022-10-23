package com.dudev.generics.practice.heroes;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warior = new Warior("Арагорн", 10);
        Hero mage = new Mage("Саруман", 5);
        Hero archer = new Archer("Леголас", 7);
        Enemy enemy = new Enemy(100, "Балрок");
        attackEnemy(enemy, warior, mage, archer);

    }
    public static void attackEnemy(Enemy enemy, Hero... heroes){
        while (enemy.isAlive()){

        }
    }
}
