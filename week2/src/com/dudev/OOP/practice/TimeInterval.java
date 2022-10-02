package com.dudev.OOP.practice;

public class TimeInterval {
    int seconds;
    int minutes;
    int hours;

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimeInterval(int totalSeconds) {
        this.minutes = totalSeconds % 3600 / 60;
        this.hours = totalSeconds / 3600;
        this.seconds = totalSeconds % 3600 % 60;
    }
    public TimeInterval sum(TimeInterval timeInterval) {
        return new TimeInterval(totalSeconds() + timeInterval.totalSeconds());
    }
    public int totalSeconds(){
        return seconds + minutes * 60 + hours * 3600;
    }
    public void print(){

    }
}
