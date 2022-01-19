package com.company.polymorphism.secondLesson;

public class Duck implements Swimmable, Flyable{
    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }

    @Override
    public void sound() {
        System.out.println("Кря");
    }

    public void fly() {
        System.out.println("Утка летает");
    }
}
