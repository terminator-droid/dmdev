package com.dudev.functional.lamda.homework;

public enum Scores {
    A(5), B(4), C(3), D(2);
    private int score;

    Scores(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
