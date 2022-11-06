package com.dudev.multithreading.homework;

import com.dudev.multithreading.homework.model.Crystal;
import com.dudev.multithreading.homework.model.CrystalPlanet;
import com.dudev.multithreading.homework.model.Mages;
import com.dudev.multithreading.homework.threads.CrystalFactory;
import com.dudev.multithreading.homework.threads.Day;
import com.dudev.multithreading.homework.threads.MageRocket;
import com.dudev.multithreading.homework.util.ThreadUtil;

import java.util.Arrays;
import java.util.List;

public class CrystalDemo {

    public static void main(String[] args) throws InterruptedException {

        Day day = new Day();
        CrystalPlanet crystalPlanet = new CrystalPlanet();
        CrystalFactory crystalFactory = new CrystalFactory(crystalPlanet, day);
        MageRocket mageRocketFireMages = new MageRocket(day, Mages.FIRE_MAGES, crystalPlanet);
        MageRocket mageRocketWaterMages = new MageRocket(day, Mages.WATER_MAGES, crystalPlanet);

        ThreadUtil.startThreads(day, crystalFactory, mageRocketFireMages, mageRocketWaterMages);
        ThreadUtil.joinThreads(day, crystalFactory, mageRocketFireMages, mageRocketWaterMages);

    }
}
