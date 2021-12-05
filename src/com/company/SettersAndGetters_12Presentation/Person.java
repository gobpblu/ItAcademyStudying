package com.company.SettersAndGetters_12Presentation;

public class Person {
    int ID;
    String name;
    double weight;
    int height;

    public void setID(int ID) {
        if (ID <= 0) {
            System.out.println("Введён некорректный ID!");
        } else this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        if (weight > 0)  this.weight = weight;
        else System.out.println("Введен некорректный вес!");
    }

    public void setHeight(int height) {
        if (height > 0) this.height = height;
        else System.out.println("Введена некорректная высота!");
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
