package com.dudev.oop.hometask;

import java.util.Random;

/**
 * Представить в виде классов и их композиции следующую модель.
 * <p>
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * <p>
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * <p>
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * <p>
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * <p>
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 * <p>
 * Например, метод print класса этаж должен выводить на консоль:
 * <p>
 * “Этаж 2, количество квартир 18”
 * <p>
 * Создание всех объектов вынести в отдельный класс с методом main.
 * <p>
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */
public class HouseRunner {
    final private static int HOUSE_NUMBER = 1;
    final private static int FLOORS_AMOUNT = 5;
    final private static int APARTMENT_AMOUNT = 3;
    final private static int ROOMS_AMOUNT = 3;
    public static void main(String[] args) {
        House house = generateHouse(HOUSE_NUMBER, FLOORS_AMOUNT, APARTMENT_AMOUNT, ROOMS_AMOUNT);
        house.printAllInformation();
    }

    private static House generateHouse(int houseNumber, int floorsAmount, int apartmentsAmount, int roomsAmount) {
        Random random = new Random();
        int apartmenNumber = 1;
        int floorsNumber = 1;
        Floor[] floors = new Floor[floorsAmount];
        for (int i = 0; i < floorsAmount; i++) {
            Apartment[] apartments = new Apartment[apartmentsAmount];
            for (int j = 0; j < apartmentsAmount; j++) {
                Room[] rooms = new Room[roomsAmount];
                for (int k = 0; k < roomsAmount; k++) {
                    rooms[k] = new Room(random.nextBoolean());
                }
                apartments[j] = new Apartment(apartmenNumber++, rooms);
            }
            floors[i] = new Floor(floorsNumber++, apartments);
        }
        return new House(houseNumber, floors);
    }
}
