package com.company.SettersAndGetters_12Presentation;

public class Rectangle {double width;
    double length;
    double square;

    public void setWidth(double width) {
        if (width > 0) this.width = width;
        else System.out.println("Ширина должна быть больше 0!");
    }

    public void setLength(double length) {
        if (length > 0) this.length = length;
        else System.out.println("Длина должна быть больше 0!");
    }

    public void setSquare(double width) {
        square = width * width;
    }

    public double getWidth() { return width; }

    public double getLength() { return length; }

    public double getSquare() {
        return square;
    }

    public double getRectangleSquare(double width, double length) {
        return width * length;
    }
}
