package com.codersbay.examples.part1;

public class Square extends Rectangle {
    private double sideLength;

    public Square() {
    }

    public Square(double sideLength) {
        super(sideLength, sideLength); // both sides are equally long
        this.sideLength = sideLength;
    }

    public Square(String colorHex, boolean isFilled) {
        super(colorHex, isFilled);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double getArea() {
        return sideLength * sideLength;
    }

    @Override
    double getPerimeter() {
        return 4 * sideLength;
    }

    @Override
    public void setWidth(double width) {
        throw new UnsupportedOperationException("Use setSideLength!");
    }

    @Override
    public void setLength(double length) {
        throw new UnsupportedOperationException("Use setSideLength!");
    }

    @Override
    public String toString() {
        return String.format("Square (side=%.2f)", sideLength);
    }
}
