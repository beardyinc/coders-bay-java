package com.codersbay.examples.part3;

public class MovableRectangle extends Shape implements Movable, Resizable {
    private MovablePoint topLeft;
    private double width;
    private double length;

    public MovableRectangle() {
    }

    public MovableRectangle(int x, int y, double width, double length) {
        this.width = width;
        this.length = length;
        this.topLeft = new MovablePoint(x, y);
    }

    public MovableRectangle(String colorHex, boolean isFilled) {
        super(colorHex, isFilled);
        this.topLeft = new MovablePoint(0, 0);
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("MovableRectangle (l=%.2f, w=%.2f, topleft=%s)", length, width, topLeft.toString());
    }

    @Override
    public void moveUp(int amount) {
        topLeft.setY(topLeft.getY() - amount);
    }

    @Override
    public void moveDown(int amount) {
        topLeft.setY(topLeft.getY() + amount);
    }

    @Override
    public void moveLeft(int amount) {
        topLeft.setX(topLeft.getX() - amount);
    }

    @Override
    public void moveRight(int amount) {
        topLeft.setX(topLeft.getX() + amount);

    }

    @Override
    public MovablePoint getLocation() {
        return topLeft;
    }

    @Override
    public void resize(double percent) {
        width *= percent / 100;
        length *= percent / 100;
    }
}
