package com.company.polymorphism.firstLesson;

public class Main {
    //Board board = new Board();
    public static void main(String[] args) {
        Writeable whiteBoard = new WhiteBoard();
        Board blackBoard = new BlackBoard();
        WhiteBoard blackBoard2 = new WhiteBoard();
        blackBoard2.write();
        Swimable turtle1 = new Turtle("Донателло", 5);
        Chicken chicken = new Chicken("Петух");
        TurtleAble turtle2 = new Turtle("Леонардо", 1);
        Ovipositable[] ovipositables = new Ovipositable[2];
        ovipositables[0] = chicken;
        ovipositables[1] = turtle2;
        System.out.println(Swimable.isSwim);
        System.out.println(Swimable.maxDepth);
    }
}
