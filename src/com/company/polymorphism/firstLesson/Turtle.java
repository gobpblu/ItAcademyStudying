package com.company.polymorphism.firstLesson;

public class Turtle extends Animal implements TurtleAble {
    int age;

    public Turtle(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void wear() {
        System.out.println("Черепаха умеет носить панцирь");
    }

    @Override
    public void postpone() {
        System.out.println("Черепаха умеет откладывать яйца.");
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "age=" + age +
                '}';
    }
}
