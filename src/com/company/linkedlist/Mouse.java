package com.company.linkedlist;

public class Mouse extends AbstractAnimal{

    public Mouse (int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "age=" + age +
                '}';
    }
}
