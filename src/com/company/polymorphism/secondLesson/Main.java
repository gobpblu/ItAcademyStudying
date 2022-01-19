package com.company.polymorphism.secondLesson;

public class Main {
    public static void main(String[] args) {
        Swimmable[] oceanarium = new Swimmable[15];
        for (int i = 0; i < 5; i++) {
            oceanarium[i] = new Turtle();
            oceanarium[i+5] = new Shark();
            oceanarium[i+10] = new Duck();
        }

        for (int i = 0; i < 15; i++) {
            oceanarium[i].swim();
            oceanarium[i].sound();
            if (oceanarium[i] instanceof Shark) {
                ((Shark) (oceanarium[i])).hunt();
            }
            if (oceanarium[i] instanceof Duck) {
                ((Duck) (oceanarium[i])).fly();
            }
            if (oceanarium[i] instanceof Turtle) {
                ((Turtle) (oceanarium[i])).wear();
            }
        }
        Shark[] sharks = new Shark[5];
        Duck[] ducks = new Duck[5];
        Turtle[] turtles = new Turtle[5];

        for (int i = 0, sharkCounter = 0, duckCounter = 0, turtleCounter = 0;
             i < oceanarium.length; i++) {
            if (oceanarium[i] instanceof Shark) {
                sharks[sharkCounter++] = (Shark) oceanarium[i];
            }
            if (oceanarium[i] instanceof Duck) {
                ducks[duckCounter++] = (Duck) oceanarium[i];
            }
            if (oceanarium[i] instanceof Turtle) {
                turtles[turtleCounter++] = (Turtle) oceanarium[i];
            }
        }

        for (int i = 0; i < sharks.length; i++) {
            sharks[i].sound();
        }
    }
}
