package com.company.CyclicAlgorithms_4Presentation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // CLASS WORK


        /*int count = 0;
        while (count < 10) {
            System.out.println("Привет.");
            count++;
        }*/
        // Задача 1. Напишите программу, которая получает два целых числа A и B (0 < A < B)
        // и выводит квадраты всех натуральных чисел в интервале от A до B.
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 2 целых числа: ");
        int firstCount = scan.nextInt();
        int secondCount = scan.nextInt();
        while (firstCount<=secondCount) {
            System.out.println(firstCount + " * " + firstCount + " = " + firstCount*firstCount);
            firstCount++;
        }
        // Задача 2. Напишите программу, которая будет получать числа до тех пор пока полученное число позитивное.
       /* Scanner scan = new Scanner(System.in);
        int x;
        do {
            System.out.print("Введите число: ");
            x = scan.nextInt();
        } while (x >= 0);
        System.out.println("Всего доброго!");*/

        /*int number;
        while (true) {
            number = scan.nextInt();
            if (number < 0) {
                System.out.println("Bye");
                break;
            }
        }*/


        // HOME WORK

        // TASK B

        // Задача B. Напишите программу которая получает два целых числа и находит их произведение,
        // не используя операцию умножения. Учтите, что числа могут быть отрицательными.
        /*Scanner scan = new Scanner(System.in);
        System.out.print("Введите 2 числа: ");
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        boolean isNegative;
        if ((firstNumber < 0 && secondNumber >= 0) || (firstNumber >= 0 && secondNumber < 0)) {
            isNegative = true;
        } else {
            isNegative = false;
        }
        int max = 0;
        int min = 0;
        if (Math.abs(firstNumber) > Math.abs(secondNumber)) {
            max = Math.abs(firstNumber);
            min = Math.abs(secondNumber);
        } else {
            max = Math.abs(secondNumber);
            min = Math.abs(firstNumber);
        }
        int answer = 0;
        while (min > 0) {
            answer += max;
            min--;
        }
        if (isNegative) {
            answer = -answer;
        }
        if (firstNumber < 0) {
            System.out.println("(" + firstNumber + ")" + " * " + secondNumber + " = " + answer);
        } else if (secondNumber < 0) {
            System.out.println(firstNumber + " * " + "(" + secondNumber + ")" + " = " + answer);
        } else {
            System.out.println(firstNumber + " * " + secondNumber + " = " + answer);
        }*/

        // LAST TASK

        // Последняя задача в презентации 4. Ввести натуральное число и определить, верно ли,
        // что в его записи есть две одинаковые цифры, стоящие рядом.
        /*Scanner scan = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int naturalNumber = scan.nextInt();
        boolean isNear = false;
        while (naturalNumber > 0) {
            if (naturalNumber % 10 == naturalNumber / 10 % 10) {
                isNear = true;
                break;
            }
            naturalNumber /= 10;
        }
        if (isNear) {
            System.out.println("В данном числе есть 2 одинаковые цифры, стоящие рядом.");
        } else {
            System.out.println("В данном числе нет 2 одинаковых цифр, стоящих рядом.");
        }*/

    }
}
