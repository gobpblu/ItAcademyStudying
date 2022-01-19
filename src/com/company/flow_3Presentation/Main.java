package com.company.flow_3Presentation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // CLASS WORK


          /*Scanner scan = new Scanner(System.in);
//        Поиск наименьшего числа из 2-ух чисел.
        System.out.println("Введите два целые числа:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x < y) {
            System.out.println("Число " + x + " меньше.");
        } else {
            System.out.println("Число " + y + " меньше.");
        }*/

        // Задача А - Ввести три целых числа, найти максимальное из них.
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите три целых числа через пробел:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        // 1 вариант
        if ((x >= y) && (x >= z)) {
            System.out.println("Максимальное число " + x);
        } else if ((y >= x) && (y >= z)) {
            System.out.println("Максимальное число " + y);
        } else {
            System.out.println("Максимальное число " + z);
        }
        /*
        // 2 variant - дольше по времени, а значит хуже.
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите три целых числа через пробел:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int max = x;
        if (y>max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        System.out.println("Максимальное число " + max);*/
        // Задача B - Ввести пять целых чисел, найти максимальное из них.


        // HOME WORK


        // TASK D


            // Задача D. Напишите программу, которая получает три числа и выводит количество одинаковых чисел в этой цепочке.
            /*System.out.println("Введите три числа:");
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            if (x == y && x == z) {
                System.out.println("Все три числа одинаковые.");
            } else if (x == y || x == z || y == z) {
                System.out.println("Два числа одинаковые.");
            } else {
                System.out.println("Одинаковых чисел нет.");
            }*/


        // TASK E

        // Задача Е. Напишите программу, которая получает номер месяца
        // и выводит соответствующий ему месяц или сообщение об ошибке.
        /*System.out.println("Введите номер месяца:");
        Scanner scan = new Scanner(System.in);
        int monthNumber = scan.nextInt();*/

        /*if (monthNumber == 1) {
            System.out.println("Январь является " + 1 + " месяцем.");
        }
        else if (monthNumber == 2) {
            System.out.println("Февраль является " + 2 + " месяцем.");
        }
        else if (monthNumber == 3) {
            System.out.println("Март является " + 3 + " месяцем.");
        }
        else if (monthNumber == 4) {
            System.out.println("Апрель является " + 4 + " месяцем.");
        }
        else if (monthNumber == 5) {
            System.out.println("Май является " + 5 + " месяцем.");
        }
        else if (monthNumber == 6) {
            System.out.println("Июнь является " + 6 + " месяцем.");
        }
        else if (monthNumber == 7) {
            System.out.println("Июль является " + 7 + " месяцем.");
        }
        else if (monthNumber == 8) {
            System.out.println("Август является " + 8 + " месяцем.");
        }
        else if (monthNumber == 9) {
            System.out.println("Сентябрь является " + 9 + " месяцем.");
        }
        else if (monthNumber == 10) {
            System.out.println("Октябрь является " + 10 + " месяцем.");
        }
        else if (monthNumber == 11) {
            System.out.println("Ноябрь является " + 11 + " месяцем.");
        }
        else if (monthNumber == 12) {
            System.out.println("Декабрь является " + 12 + " месяцем.");
        } else {
            System.out.println("Месяца с данным номером не существует.");
        }*/

        /*switch(monthNumber) {
            case 1:
                System.out.println("Январь является " + 1 + " месяцем.");
                break;
            case 2:
                System.out.println("Февраль является " + 2 + " месяцем.");
                break;
            case 3:
                System.out.println("Март является " + 3 + " месяцем.");
                break;
            case 4:
                System.out.println("Апрель является " + 4 + " месяцем.");
                break;
            case 5:
                System.out.println("Май является " + 5 + " месяцем.");
                break;
            case 6:
                System.out.println("Июнь является " + 6 + " месяцем.");
                break;
            case 7:
                System.out.println("Июль является " + 7 + " месяцем.");
                break;
            case 8:
                System.out.println("Август является " + 8 + " месяцем.");
                break;
            case 9:
                System.out.println("Сентябрь является " + 9 + " месяцем.");
                break;
            case 10:
                System.out.println("Октябрь является " + 10 + " месяцем.");
                break;
            case 11:
                System.out.println("Ноябрь является " + 11 + " месяцем.");
                break;
            case 12:
                System.out.println("Декабрь является " + 12 + " месяцем.");
                break;
            default:
                System.out.println("Месяца с данным номером не существует.");
        }*/

        // TASK F

        // Задача F. Напишите программу, которая получает возраст человека
        // (целое число, не превышающее 120) и выводит этот возраст со словом
        // "год", "года" или "лет". Например, "21 год", "22 года", "25 лет".
        /*System.out.print("Введите ваш возраст (от 0 до 120): ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        int units = age % 10;
        int dozens = age / 10 % 10;
        if (age >= 0 && age <= 120 && units == 1 && dozens != 1) {
            System.out.println("Вам " + age + " год.");
        } else if (age >= 0 && age <= 120 && (units == 2 || units == 3 || units == 4) && dozens != 1) {
            System.out.println("Вам " + age + " года.");
        } else if (age >= 0 && age <= 120) {
            System.out.println("Вам " + age + " лет.");
        } else {
            System.out.println("Введён неправильный возраст.");
        }*/

    }
}
