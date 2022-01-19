package com.company.polymorphism.firstLesson;

public class Chicken extends Animal implements Ovipositable{
    public Chicken(String name) {
        super(name);
    }

    @Override
    public void postpone() {
        System.out.println("Курица откладывает яйца");
    }
}
