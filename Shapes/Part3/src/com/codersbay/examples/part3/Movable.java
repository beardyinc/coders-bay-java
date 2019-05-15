package com.codersbay.examples.part3;

public interface Movable {
    void moveUp(int amount);

    void moveDown(int amount);

    void moveLeft(int amount);

    void moveRight(int amount);

    MovablePoint getLocation();
}
