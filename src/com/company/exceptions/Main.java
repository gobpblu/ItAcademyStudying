package com.company.exceptions;

//import com.company.exceptions.Cat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Cat cat = new Cat("");
            cat = null;
            cat.getName();
        } catch (Exception exception) {
            System.out.println(exception);
        }
        try {
            int[] ar = new int[10];
            System.out.println(ar[11]);
        } catch (Exception exception) {
            System.out.println(exception);
        }
        /*Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите число, являющееся квадратом какого-то числа: ");
        double inputX = 9;
        while(inputX != 1) {
            inputX = scan1.nextDouble();
            if (Math.sqrt(inputX) % 1 != 0) {
                System.out.println("Вы ввели неверное число!");
                throw new Error();
            }
        }*/
        Cat[] cats = {new Cat("0"), null, new Cat("2"),
                new Cat("3"), null};

        for (int i = 0; i <= cats.length; i++) {
            try {
                System.out.println(cats[i].getName());
            } catch (MyNullPointerException exception) {
                System.out.println(exception.toString());
            } catch (IndexOutOfBoundsException exception) {
                System.out.println(exception);
            } catch (Exception exception) {
                System.out.println(exception);
            } finally {
                System.out.println("Я выполняюсь" + i + "раз");
            }
        }
    }
}
