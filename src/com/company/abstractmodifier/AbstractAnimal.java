package com.company.abstractmodifier;

abstract public class AbstractAnimal {
    private String name;
    private double weight;
    private int age;
    private String color;

    public AbstractAnimal(String name, double weight, int age, String color) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void submitVote();

    abstract void sleep();

    abstract void eat();

    abstract void run();

    void live() {
        System.out.println(getName());
        eat();
        run();
    }

    void rest() {
        System.out.println(getName());
        sleep();
    }

    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
