package com.company.abstractmodifier;

public class Cow extends AbstractAnimal {
    public Cow(String name, double weight, int age, String color) {
        super(name, weight, age, color);
    }
    public void submitVote() {
        System.out.println("Муууу");
    }

    public void sleep() {
        System.out.println("Корова спит.");
    }

    public void eat() {
        System.out.println("Корова ест.");
    }

    public void run() {
        System.out.println("Корова бежит.");
    }
}
