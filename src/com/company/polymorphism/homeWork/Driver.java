package com.company.polymorphism.homeWork;

import java.util.Random;

public class Driver implements StartAble, Driveable{
    String name;
    int workExperience;
    Random rand = new Random();

    public Driver(String name, int workExperience) {
        this.name = name;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public void manage() {
        System.out.println("Водитель управляет " +
                "автомобилем");
        start();
        drive();
    }

    @Override
    public void start() {
        if (rand.nextBoolean()) {
            System.out.println("Водитель завёл автомобиль");
        } else {
            System.out.println("Водитель не сумел завести автомобиль");
        }
    }

    @Override
    public void drive() {
        if (rand.nextBoolean()) {
            System.out.println("Водитель едет на машине");
        } else {
            System.out.println("Водитель не может ехать на машине");
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", workExperience=" + workExperience + " years" +
                '}';
    }
}
