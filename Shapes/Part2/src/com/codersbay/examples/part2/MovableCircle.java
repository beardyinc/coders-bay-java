package com.codersbay.examples.part2;

public class MovableCircle extends Shape implements Movable {
    private double radius;
    private MovablePoint center;


    public MovableCircle(int centerX, int centerY, double radius) {
        this.radius = radius;
        this.center = new MovablePoint(centerX, centerY);
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
        return String.format("MovableCircle (r=%.2f, center=%s)", radius, center.toString());
    }

    @Override
    public void moveUp(int amount) {
        int y = center.getY();
        center.setY(y - amount);
    }

    @Override
    public void moveDown(int amount) {
        int y = center.getY();
        center.setY(y + amount);
    }

    @Override
    public void moveLeft(int amount) {
        int x = center.getX();
        center.setX(x - amount);
    }

    @Override
    public void moveRight(int amount) {
        int x = center.getX();
        center.setX(x + amount);
    }

    @Override
    public MovablePoint getLocation() {
        return center;
    }
}
