package com.example.user.myapplication;

public class Game {
    private String name;
    private int hour;
    private int min;

    public Game(String name, int hour, int min) {
        this.name = name;
        this.hour = hour;
        this.min = min;
    }

    public Game(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", hour=" + hour +
                ", min=" + min +
                '}';
    }
}
