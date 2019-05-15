package com.codersbay.examples;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle (r=%.2f)",radius);
    }
}
