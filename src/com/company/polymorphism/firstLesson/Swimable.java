package com.company.polymorphism.firstLesson;

public interface Swimable {
    boolean isSwim = true;
    int maxDepth = 11000;

    default void swim() {
        System.out.println("Умею плавать");
    };

}