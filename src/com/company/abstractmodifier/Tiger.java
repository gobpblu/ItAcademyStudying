package com.company.abstractmodifier;

public class Tiger extends AbstractFeline {
    public Tiger(String name,double weight, int age, String color, int clawNumber,
                 double tailLength, int moustachesNumber) {
        super(name, weight, age, color, clawNumber, tailLength, moustachesNumber);
    }

    public void submitVote() {
        System.out.println("Рррр");
    }

    public void sleep() {
        System.out.println("Тигр спит.");
    }

    public void eat() {
        System.out.println("Тигр ест.");
    }

    public void run() {
        System.out.println("Тигр бежит.");
    }
}
