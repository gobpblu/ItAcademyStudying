package com.company.polymorphism.secondLesson;

public class Shark implements Swimmable, Huntable{
    @Override
    public void swim() {
        System.out.println("Акула плавает");
    }

    @Override
    public void sound() {
        System.out.println("Акула издаёт звук");
    }

    @Override
    public void hunt() {
        System.out.println("Акула вышла на охоту!");
    }
}
