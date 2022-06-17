package com.ntqsolution.entity;

public class Animals implements Run {

    String name;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public int getRandomDistance() {
        return 0;
    }
}
