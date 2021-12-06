package com.company.Inheritance;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        double sum = 0;

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setFIO("Человек " + (i + 1));
            students[i].setAge(rand.nextInt(101));
            students[i].setMark(rand.nextInt(5) + 1);
            sum += students[i].getMark();
        }
        for (Student i : students) {
            System.out.println(i);
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("Среднее арифметическое оценок студентов: " + sum / students.length);
    }
}
