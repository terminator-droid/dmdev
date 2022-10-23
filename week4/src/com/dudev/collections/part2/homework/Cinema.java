package com.dudev.collections.part2.homework;

import java.util.*;

public class Cinema {
    private final Map<Integer, Set<Film>> films;

    public Cinema(Map<Integer, Set<Film>> films) {
        this.films = films;
    }

    public List<Film> getTopFilms() {
        Set<Film> topFilms = new TreeSet<>(new FilmsComparator().reversed());
        for (Set<Film> filmsByYear : films.values()) {
            topFilms.addAll(filmsByYear);
        }
        return List.copyOf(topFilms).subList(0, Math.min(topFilms.size(), 9));
    }

    public Set<Film> getFilmsBeGenre(String genre) {
        Set<Film> filmsByGenre = new HashSet<>();
        for (Set<Film> filmList : this.films.values()) {
            for (Film film : filmList) {
                if (film.getGenre().equals(genre)) {
                    filmsByGenre.add(film);
                }
            }
        }
        return filmsByGenre;
    }

    public Set<Film> getFilmsByYearAndMonth(int year, int month) {
        Set<Film> filmsByYearMonth = new HashSet<>();
        for (Film film : this.films.get(year)) {
            if (film.getMonth() == month) {
                filmsByYearMonth.add(film);
            }
        }
        return filmsByYearMonth;
    }

    public Set<Film> getFilmsByYear(int year) {
        return films.get(year);
    }

    public void addFilm(Film film) {
        Set<Film> filmsOfYear = films.getOrDefault(film.getYear(), new LinkedHashSet<>());
        filmsOfYear.add(film);
        films.put(film.getYear(), filmsOfYear);
    }

    private static class FilmsComparator implements Comparator<Film> {
        @Override
        public int compare(Film o1, Film o2) {
            return Double.compare(o1.getRating(), o2.getRating());
        }

        @Override
        public Comparator<Film> reversed() {
            return Comparator.super.reversed();
        }
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "films=" + films +
                '}';
    }

    public Map<Integer, Set<Film>> getFilms() {
        return films;
    }
}
