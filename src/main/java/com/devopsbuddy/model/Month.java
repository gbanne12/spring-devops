package com.devopsbuddy.model;

public class Month {

    private String name;
    private int value;

    public Month(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
