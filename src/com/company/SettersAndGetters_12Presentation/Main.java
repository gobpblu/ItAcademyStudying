package com.company.SettersAndGetters_12Presentation;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Rectangle rct = new Rectangle();
        rct.setWidth(-1);
        rct.setLength(5);
        rct.setSquare(rct.getWidth());
        System.out.println("Площадь квадрата: " + rct.getSquare());
        System.out.println("Площадь прямоугольника: " + rct.getRectangleSquare(rct.getWidth(), rct.getLength()));
        /*ID, name, weight, height, геттеры, сеттеры, несколько экземпляров класса, задать значения через сеттеры и
                получить значения через геттеры.*/
        Person person1 = new Person();
        person1.setID(1);
        person1.setName("Василий");
        person1.setWeight(55.5);
        person1.setHeight(160);
        Person person2 = new Person();
        person2.setID(2);
        person2.setName("Марина");
        person2.setWeight(50);
        person2.setHeight(157);
        Person person3 = new Person();
        person3.setID(3);
        person3.setName("Константин");
        person3.setWeight(79.9);
        person3.setHeight(177);

        System.out.println("Информация о первом человеке:\nID: " + person1.getID() + "\nИмя: " +
                person1.getName() + "\nВес: " + person1.getWeight() + " кг.\nРост: " +
                person1.getHeight() + " см.");
        System.out.println("Информация о втором человеке:\nID: " + person2.getID() + "\nИмя: " +
                person2.getName() + "\nВес: " + person2.getWeight() + " кг.\nРост: " +
                person2.getHeight() + " см.");
        System.out.println("Информация о третьем человеке:\nID: " + person3.getID() + "\nИмя: " +
                person3.getName() + "\nВес: " + person3.getWeight() + " кг.\nРост: " +
                person3.getHeight() + " см.");
    }
}
