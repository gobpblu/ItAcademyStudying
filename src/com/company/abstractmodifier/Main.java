package com.company.abstractmodifier;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Маруська", 3, 4, "Black",
                12, 10, 2, "покфы");
        Cow cow = new Cow("Марта", 300, 3, "White");
        Tiger tiger = new Tiger("Красавчик", 50, 2, "Orange",
                18, 20, 6);
        System.out.println(cat);
        System.out.println(cow);
        System.out.println(tiger);
        cat.rest();
        cow.rest();
        tiger.rest();
        cat.submitVote();
        tiger.submitVote();
        cat.purr();
        tiger.purr();
        cat.sharpenClaws();
        tiger.sharpenClaws();
        AbstractAnimal animal = new Cow("аошвоа", 124, 53, "gtser");
        AbstractAnimal animal1 = new Cat("Маруська", 3, 4, "Black",
                12, 10, 2, "покфы");
        AbstractAnimal animal2 = new Tiger("Красавчик", 50, 2, "Orange",
                18, 20, 6);
        AbstractFeline animal3 = new Tiger("Красавчик", 50, 2, "Orange",
                18, 20, 6);
        AbstractFeline animal4 = new Cat("Маруська", 3, 4, "Black",
                12, 10, 2, "покфы");
        AbstractAnimal[] abstractAnimals = new AbstractAnimal[10];
        abstractAnimals[0] = animal;
        abstractAnimals[1] = animal1;
        abstractAnimals[2] = animal2;
        abstractAnimals[3] = animal3;
        abstractAnimals[4] = animal4;
        System.out.println(Arrays.toString(abstractAnimals));
    }
}
