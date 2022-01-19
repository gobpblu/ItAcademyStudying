package com.company.finalModifier.homeWork;

public class Dog {
    protected String name;
    protected double weight;
    protected static int dogCounter;

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
        dogCounter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public final void bark() {
        System.out.println("Гав-гав!");
    }

    @Override
    public String toString() {
        String message = "Информация о собаке:\n" +
                "Имя собаки: " + name + "\n" +
                "Вес собаки: " + weight + " кг.";
        return message;
    }
}
