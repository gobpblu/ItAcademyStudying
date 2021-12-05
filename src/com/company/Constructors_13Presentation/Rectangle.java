package com.company.Constructors_13Presentation;

public class Rectangle {
    double width;
    double length;
    double square;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        if (width > 0) this.width = width;
        else {
            System.out.println("Ширина должна быть больше 0!");
            this.width = 0;
        }
    }

    public void setLength(double length) {
        if (length > 0) this.length = length;
        else {
            System.out.println("Длина должна быть больше 0!");
            this.length = 0;
        }
    }

    public void setSquare(double width, double length) {
        if (width > 0 && length > 0)
            square = width * length;
    }

    public double getWidth() { return width; }

    public double getLength() { return length; }

    public double getSquare() {
        return square;
    }

    public double getRectangleSquare(double width, double length) {
        return width * length;
    }

    public void print() {
        System.out.println("Width = " + getWidth() + "\n" +
                "Length = " + getLength() + "\n" +
                "Square = " + getSquare() + "\n");
    }

}
