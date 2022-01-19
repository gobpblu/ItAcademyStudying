package com.company.cycles_5Presentation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CLASS WORK

        /*for (int i = 1; i <= 10; i++) {
            System.out.println(5 + " * " + i + " = " + 5*i);
        }*/

        /*Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputNumber = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(inputNumber + " * " + i + " = " + inputNumber*i);
        }*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите диапазон чисел (2 числа): ");
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        if (secondNumber < firstNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        int sum = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех нечётных чисел в диапозоне от " + firstNumber + " до "
                + secondNumber + " = " + sum);
    }


    // HOME WORK

    // THE ONE AND ONLY TASK

    /*Scanner scan = new Scanner(System.in);
    int quantity = 0;
    int sum = 0;
    double arithmeticMean;
        for (int i;;) {
        System.out.print("Введите число: ");
        i = scan.nextInt();
        if (i == 0) break;
        else {
            quantity++;
            sum += i;
        }
    }
    arithmeticMean = (double) sum / quantity;
        System.out.println("Количество чисел: " + quantity);
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Среднее арифметическое: " + arithmeticMean);*/

}
