package com.faradars.entity;

public class Toyota implements ICar {
    @Override
    public String getName() {
        return "Toyota";
    }

    @Override
    public int getSpeed() {
        return 0;
    }
}
