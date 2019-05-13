package com.codersbay.examples;

public class Service {
    private final String name;
    private double cost;

    public Service(String name, double cost) {

        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }
}
