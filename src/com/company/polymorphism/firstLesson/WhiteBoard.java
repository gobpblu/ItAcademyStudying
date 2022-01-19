package com.company.polymorphism.firstLesson;

public class WhiteBoard extends Board implements Writeable {

    @Override
    public void write() {
        System.out.println("Пишем маркером!");
    }
}
