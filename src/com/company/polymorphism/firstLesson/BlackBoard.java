package com.company.polymorphism.firstLesson;

public class BlackBoard extends Board implements Writeable {

    @Override
    public void write() {
        System.out.println("Пишем мелом!");
    }
}
