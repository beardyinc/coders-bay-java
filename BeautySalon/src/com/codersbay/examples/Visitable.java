package com.codersbay.examples;

public abstract class Visitable {

    private String name;
    private double discount;

    protected Visitable(String name, double discount) {

        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return getName();
    }
}
