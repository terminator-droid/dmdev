package com.dudev.collections.part2.homework;

import java.util.*;

public class CinemaDemo {
    public static void main(String[] args) {
        Cinema cinema = new Cinema(new TreeMap<Integer, Set<Film>>());
        Film film1 = new Film(1, 1994, 4, "Horror", 3.4);
        Film film5 = new Film(1, 1999, 4, "Horror", 3.4);
        Film film2 = new Film(2, 1999, 3, "drama", 3.5);
        Film film3 = new Film(3, 1956, 4, "drama", 2.3);
        Film film4 = new Film(3, 1953, 4, "drama", 2.3);
        cinema.addFilm(film1);
        cinema.addFilm(film5);
        cinema.addFilm(film2);
        cinema.addFilm(film3);
        cinema.addFilm(film4);
        System.out.println(cinema);
        System.out.println(cinema.getFilmsByYear(1994));
        System.out.println(cinema.getFilmsByYearAndMonth(1999, 9));
        System.out.println(cinema.getFilmsBeGenre("drama"));
        System.out.println(cinema.getTopFilms());
    }
}