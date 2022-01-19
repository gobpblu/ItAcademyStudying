package com.company.taskForArray;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /*
        Задание.
        1. Заполнить массив из 100 элементов случайными числами, диапазон ввести с клавиатуры
        2. Найти все чётные и нечётные значения и записать их в отдельные массивы
        3. Найти наибольшее и наименьшее значения в обоих массивах
        4. Поменять первый и последний элементы массивов местами
         */
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("Введите первое число массива: ");
        int first = scan.nextInt();
        System.out.print("Введите второе число массива: ");
        int second = scan.nextInt();
        int min = 0;
        int max = 0;
        if (first > second) {
            max = first;
            min = second;
        } else {
            max = second;
            min = first;
        }

        int evenCounter = 0;
        int oddCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(max - min + 1) + min;
            if (arr[i] % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }

        int[] evenNumbers = new int[evenCounter];
        int[] oddNumbers = new int[oddCounter];

        for (int i = 0, j = 0, k = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNumbers[j] = arr[i];
                j++;
            } else {
                oddNumbers[k] = arr[i];
                k++;
            }
        }

        int maxOdd = arr[0];
        int minOdd = arr[0];
        System.out.print("\nНечётные числа: ");
        for (int i = 0; i < oddCounter; i++) {
            System.out.print(oddNumbers[i] + " ");
            if (oddNumbers[i] > maxOdd) maxOdd = oddNumbers[i];
            else if (oddNumbers[i] < minOdd) minOdd = oddNumbers[i];
        }
        System.out.println("\nМаксимальное значение среди " +
                "нечётных чисел: " + maxOdd + "\n" +
                "Минимальное значение среди " +
                "нечётных чисел: " + minOdd);
        int maxEven = arr[0];
        int minEven = arr[0];

        System.out.print("\nЧётные числа: ");
        for (int i = 0; i < evenCounter; i++) {
            System.out.print(evenNumbers[i] + " ");
            if (evenNumbers[i] > maxEven) maxEven = evenNumbers[i];
            else if (evenNumbers[i] < minEven) minEven = evenNumbers[i];
        }
        System.out.println("\nМаксимальное значение среди " +
                "чётных чисел: " + maxEven + "\n" +
                "Минимальное значение среди " +
                "чётных чисел: " + minEven);

        int temp = evenNumbers[0];
        evenNumbers[0] = evenNumbers[evenCounter - 1];
        evenNumbers[evenCounter - 1] = temp;
        temp = oddNumbers[0];
        oddNumbers[0] = oddNumbers[oddCounter - 1];
        oddNumbers[oddCounter - 1] = temp;
        System.out.print("\nМассив нечётных чисел с заменой " +
                "первого и последнего элементов: ");
        for (int i = 0; i < oddCounter; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.print("\nМассив чётных чисел с заменой " +
                "первого и последнего элементов: ");
        for (int i = 0; i < evenCounter; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
