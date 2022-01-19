package com.company.polymorphism.homeWork;

import java.util.Random;

public class Mayor implements Repairable, Buildable{
    String name;
    int age;
    Random rand = new Random();

    public Mayor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void buildRoad() {
        if (rand.nextBoolean()) {
            System.out.println("Мэр построил дорогу");
        } else {
            System.out.println("Мэр не сумел построить дорогу");
        }
    }

    public void repairTrafficLight() {
        if (rand.nextBoolean()) {
            System.out.println("Мэр отремонтировал светофор");
        } else {
            System.out.println("Мэр не сумел отремонтировать светофор");
        }
    }

    @Override
    public void manage() {
        System.out.println("Мэр управляет городом");
        buildRoad();
        repairTrafficLight();
    }

    @Override
    public String toString() {
        return "Mayor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
