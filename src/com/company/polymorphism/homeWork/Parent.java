package com.company.polymorphism.homeWork;

import java.util.Random;

public class Parent implements Nurturable, Askable{
    String name;
    String gender;
    Random rand = new Random();

    public Parent(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void manage() {
        System.out.println("Родитель управляет" +
                " детьми");
        nurture();
        ask();
    }

    @Override
    public void nurture() {
        if (rand.nextBoolean()) {
            System.out.println("Дети поддаются воспитанию родителя");
        } else {
            System.out.println("Дети не поддаются воспитанию родителя");
        }
    }

    @Override
    public void ask() {
        if (rand.nextBoolean()) {
            System.out.println("Дети откликаются на просьбу родителя");
        } else {
            System.out.println("Дети не откликаются на просьбу родителя");
        }
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
