package com.company.calculations_2Presentation;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите максимальное число >0 и <=10.");
        int inputMax = scan.nextInt();
        System.out.println("Введите минимальное число >0 и <=10");
        int inputMin = scan.nextInt();
        Random rand = new Random();
        int generatedNumber = rand.nextInt((inputMax - inputMin) + 1) + inputMin;
        System.out.println("Сгенерированное число = " + generatedNumber);
    }
}
