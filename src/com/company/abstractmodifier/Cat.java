package com.company.abstractmodifier;

class Cat extends AbstractFeline {
    private String breed;

    public Cat(String name, double weight, int age, String color, int clawNumber, double tailLength, int moustachesNumber, String breed) {
        super(name, weight, age, color, clawNumber, tailLength, moustachesNumber);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void submitVote() {
        System.out.println("Мяу");
    }

    public void sleep() {
        System.out.println("Кошка спит.");
    }

    public void eat() {
        System.out.println("Кошка ест.");
    }

    public void run() {
        System.out.println("Кошка бежит.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
