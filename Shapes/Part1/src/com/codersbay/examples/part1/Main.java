package com.codersbay.examples.part1;

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Circle(15);
        print(s1);
        Shape s2 = new Rectangle(4.7, 9);
        s2.setColorHex("0xAABBCC");
        print(s2);

        Square s3 = new Square(45);
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

        Rectangle s5 = new Square("0x0FF1BC", false);
        Square s6 = (Square) s5; // explicit typecast
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
