package com.company.polymorphism.secondLesson;

public class Turtle implements Swimmable, Wearable {
    @Override
    public void swim() {
        System.out.println("Черепаха плавает");
    }

    @Override
    public void sound() {
        System.out.println("Черепаха издаёт звук");
    }

    @Override
    public void wear() {
        System.out.println("Черепаха носит панцирь");
    }
}
