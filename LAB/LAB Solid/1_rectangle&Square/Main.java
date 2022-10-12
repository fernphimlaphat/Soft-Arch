// package com.solid.lsp;

public class Main {

    private static int width = 4;
    private static int height = 5;
    private static int side = 5;

    
    public static void main(String[] args) {
        Rectangle reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());

        Rectangle reg2 = new Square(side);
        reg2.setWidth(side);
        reg2.setHeight(side);
        System.out.println("====   Square  ====");
        System.out.println("Width = " + side);
        System.out.println("Height = " + side);
        System.out.println("Area = " + reg2.getArea());
    }
}
