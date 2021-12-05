package com.company.Constructors_13Presentation;

public class Main {
    public static void main(String[] args) {
        Rectangle rct = new Rectangle(1, 5);
        rct.setSquare(rct.getWidth(), rct.getLength());
        //System.out.println(rct.getSquare());
        rct.print();
    }
}
