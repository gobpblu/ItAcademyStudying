package com.company.finalModifier.homeWork;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog ("Джон", 20.5);
        PitBull pitBull = new PitBull("Питбульчик", 13);
        ShepherdDog shepherdDog = new ShepherdDog("Рэкс", 15.3);
        pitBull.bark();
        System.out.println(pitBull);
        System.out.println("Количество собак: " + Dog.dogCounter);
    }
}
