package com.dudev.multithreading.homework;

import com.dudev.multithreading.homework.model.CrystalPlanet;
import com.dudev.multithreading.homework.model.Mages;
import com.dudev.multithreading.homework.model.Race;
import com.dudev.multithreading.homework.threads.CrystalFactory;
import com.dudev.multithreading.homework.threads.Day;
import com.dudev.multithreading.homework.threads.MageRocket;
import com.dudev.multithreading.homework.util.ThreadUtil;

public class CrystalDemo {

    public static void main(String[] args) throws InterruptedException {

        Day day = new Day();
        CrystalPlanet crystalPlanet = new CrystalPlanet();
        CrystalFactory crystalFactory = new CrystalFactory(crystalPlanet, day);
        MageRocket mageRocketFireMages = new MageRocket(day, new Mages(Race.FIRE), crystalPlanet);
        MageRocket mageRocketWaterMages = new MageRocket(day, new Mages(Race.WATER), crystalPlanet);

        ThreadUtil.startThreads(day, crystalFactory, mageRocketFireMages, mageRocketWaterMages);
        ThreadUtil.joinThreads(day, crystalFactory, mageRocketFireMages, mageRocketWaterMages);
    }
}