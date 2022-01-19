package com.company.linkedlist;

public class Cat extends AbstractAnimal{
    public Cat(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
