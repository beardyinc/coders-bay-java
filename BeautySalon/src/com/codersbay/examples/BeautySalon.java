package com.codersbay.examples;

public class BeautySalon implements Visitable {
    private String name;

    public BeautySalon(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getDiscount() {
        return 0.1;
    }

    @Override
    public String toString() {
        return getName();
    }
}
