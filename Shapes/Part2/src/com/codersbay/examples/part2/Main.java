package com.codersbay.examples.part2;

public class Main {

    public static void main(String[] args) {
        Shape s1 = new MovableCircle(15, 90, 15);
        print(s1);
        Shape s2 = new MovableRectangle(34, 8, 4.7, 9);
        s2.setColorHex("0xAABBCC");
        print(s2);

        MovableSquare s3 = new MovableSquare(10, 25, 45);
        try {
            s3.setWidth(15);
        } catch (UnsupportedOperationException ex) {
            ex.printStackTrace();
        }

        try {
            s3.setLength(15);
        } catch (UnsupportedOperationException ex) {
            ex.printStackTrace();
        }

        Shape s4 = s3; //change compile-time type, only Shape-methods are accessible
        s4.setFilled(true);
        print(s4);

        MovableRectangle r5 = new MovableSquare("0x0FF1BC", false);
        MovableSquare s6 = (MovableSquare) r5; // explicit typecast
        print(s6);

        Movable m1 = r5;
        m1.moveDown(10);
        m1.moveRight(20);
        s6.setSideLength(10);
        print(s6);

    }

    private static void print(Shape shape) {
        System.out.println("********************************");
        System.out.println(shape.toString());
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println("Color: " + shape.getColorHex());
        System.out.println("Is filled: " + shape.isFilled());
        System.out.println();
    }
}
