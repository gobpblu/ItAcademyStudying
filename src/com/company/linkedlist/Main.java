package com.company.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<AbstractAnimal> animals = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            animals.add(new Cat(i));
            animals.add(new Dog(i));
        }
        // System.out.println(animals.contains(animals.get(5)));
        animals.add(new Dog(50));
        System.out.println("Список до пункта 2 включительно: " + animals);
        int catCounter = 0;
        int dogCounter = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat) catCounter++;
            else if (animals.get(i) instanceof Dog) dogCounter++;
            if (catCounter == 5) {
                animals.remove(i); // cat1, dog1, cat2, dog2, cat3, dog3, mouse1, cat4,
                // dog4 (10), (11), dog5, cat6, dog6, mouse2(15)
                i--;
                catCounter = 0;
            }
            if (dogCounter == 3) {
                //System.out.println(i);
                animals.add(i + 1, new Mouse(i));
                dogCounter = 0;
            }
        }
        System.out.println("Список до пункта 4 включительно: " + animals);
        LinkedList<AbstractAnimal> animals2 = new LinkedList<>();
        if (animals.get(0) instanceof Cat && animals.get(1) instanceof Mouse ||
                animals.get(0) instanceof Mouse && animals.get(1) instanceof Cat) {
            animals2.add(animals.get(0));
        }


        for (int i = 1; i < animals.size() - 1; i++) {
            if (animals.get(i) instanceof Cat &&
                    (animals.get(i - 1) instanceof Mouse || animals.get(i + 1) instanceof Mouse) ||
                    animals.get(i) instanceof Mouse &&
                            (animals.get(i - 1) instanceof Cat || animals.get(i + 1) instanceof Cat)) {
                animals2.add(animals.get(i));
            }
            if (animals.get(animals.size() - 1) instanceof Cat && animals.get(animals.size() - 1) instanceof Mouse ||
                    animals.get(animals.size() - 1) instanceof Mouse && animals.get(animals.size() - 1) instanceof Cat) {
                animals2.add(animals.get(animals.size() - 1));
            }
        }
        System.out.println("Список пункта 5: " + animals2);
        ArrayList<AbstractAnimal> animals3 = new ArrayList<>(animals);
        System.out.println("Списочный массив из пункта 6: " + animals3);
        int mouseAgeCounter = 0;
        int catAgeCounter = 0;
        int dogAgeCounter = 0;
        for (AbstractAnimal animal :
                animals3) {
            if (animal instanceof Cat) catAgeCounter += animal.getAge();
            else if (animal instanceof Dog) dogAgeCounter += animal.getAge();
            else if (animal instanceof Mouse) mouseAgeCounter += animal.getAge();
        }
        System.out.println("Сумма возрастов мышек: " + mouseAgeCounter);
        System.out.println("Сумма возрастов кошек: " + catAgeCounter);
        System.out.println("Сумма возрастов собак: " + dogAgeCounter);
        LinkedList<AbstractAnimal> animals4 = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            for (AbstractAnimal animal : animals) {
                if (i == 0 && animal instanceof Cat) {
                    animals4.add(animal);
                } else if (i == 1 && animal instanceof Dog) {
                    animals4.add(animal);
                } else if (i == 2 && animal instanceof Mouse) animals4.add(animal);
            }
        }
        System.out.println("Список без конфликта кошек и мышей: " + animals4);
    }
}
