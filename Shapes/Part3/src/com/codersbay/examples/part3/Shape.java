package com.codersbay.examples.part3;

public abstract class Shape {
    private String colorHex;
    private boolean isFilled;

    public Shape() {
        colorHex = "0x000000";
        isFilled = false;
    }

    public Shape(String colorHex, boolean isFilled) {
        this.colorHex = colorHex;
        this.isFilled = isFilled;
    }

    public String getColorHex() {
        return colorHex;
    }

    public void setColorHex(String colorHex) {
        this.colorHex = colorHex;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();
}
