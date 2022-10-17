package com.dudev.generics.practice;

import com.dudev.generics.practice.heroes.Archer;
import com.dudev.generics.practice.heroes.Hero;
import com.dudev.generics.practice.heroes.Warior;
import com.dudev.generics.practice.weapon.Bow;
import com.dudev.generics.practice.weapon.Sword;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> legolise = new Archer<>("Legolise", 10);
        legolise.setWeapon(new Bow());

        Warior<Sword> boromir = new Warior<>("boromir", 12);
        boromir.setWeapon(new Sword());
    }
    public static void printWeaponDamage(Hero hero){
        System.out.println(hero.getWeapon().getDamdge());
    }
}
