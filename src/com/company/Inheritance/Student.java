package com.company.Inheritance;

import java.util.Scanner;

public class Student {
    String FIO;
    int age;
    int mark;
    Scanner scan = new Scanner(System.in);
    public Student(String FIO, int age, int mark) {
        this.FIO = FIO;
        this.age = age;
        this.mark = mark;
    }

    public Student() {
      /*  System.out.print("Введите имя студента: ");
        FIO = scan.nextLine();
        System.out.print("\nВведите возраст студента: ");
        FIO = scan.nextLine();
        System.out.print("\nВведите оценку студента: ");
        FIO = scan.nextLine();
        System.out.println();*/
    }

    public void setFIO(String name) {
        this.FIO = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getFIO() {
        return FIO;
    }

    public int getAge() {
        return age;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        String message = "ФИО: " + getFIO() + "\n" +
                "Количество лет: " + getAge() + "\n" +
                "Оценка: " + getMark() + "\n";
        return message;
    }
}
