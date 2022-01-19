package com.company.linkedlist;

public class Dog extends AbstractAnimal{
    public Dog(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }
}
