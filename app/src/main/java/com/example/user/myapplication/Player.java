package com.example.user.myapplication;

import java.io.Serializable;

public class Player implements Serializable{

    private String name;
    private String age;
    private String weight;
    private String height;
    private String Grandslams;
    private int image;

    public Player(String name, String age, String weight, String height, String grandslams, int image) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        Grandslams = grandslams;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getGrandslams() {
        return Grandslams;
    }

    public void setGrandslams(String grandslams) {
        Grandslams = grandslams;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
