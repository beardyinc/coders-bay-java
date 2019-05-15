package com.codersbay.examples.part2;

public class MovableSquare extends MovableRectangle /*implements Movable*/ {
    private double sideLength;

    public MovableSquare() {
    }

    public MovableSquare(int x, int y, double sideLength) {
        super(x, y, sideLength, sideLength); // both sides are equally long
        this.sideLength = sideLength;
    }

    public MovableSquare(String colorHex, boolean isFilled) {
        super(colorHex, isFilled);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
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
    double getArea() {
        return sideLength * sideLength;
    }

    @Override
    double getPerimeter() {
        return 4 * sideLength;
    }

    @Override
    public String toString() {
        String s = getLocation().toString();
        String format = String.format("MovableSquare (side=%.2f, topleft=%s)", sideLength, s);
        return format;
    }
}
