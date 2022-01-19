package com.company.linkedlist;

public class AbstractAnimal {
    int age;

    public AbstractAnimal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "age=" + age +
                '}';
    }
}
