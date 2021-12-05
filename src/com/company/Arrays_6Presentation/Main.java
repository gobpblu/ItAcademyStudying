package com.company.Arrays_6Presentation;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.println(arr[i]);
        }*/
        // Задача: Создать массив длиной в 20, записать в массив случайные значения роста от 170 до 220 см.
        // Сколько из них имеет рост больше 180 см, но меньше 190 см? Подсчитать, вывести эти значения и вывести
        // их (баскетболистов чей рост больше 180, но меньше 190) средний рост.
        /*Random rand = new Random();
        int x = 20;
        int max = 220;
        int min = 170;
        int[] randHeight = new int[x];
        int numberPlayers = 0;
        double middleHeight;
        int sumHeights = 0;
        for (int i = 0; i < randHeight.length; i++) {
            randHeight[i] = rand.nextInt((max-min)+1)+min;
            if (randHeight[i] > 180 && randHeight[i] < 190) {
                numberPlayers++;
                sumHeights += randHeight[i];
                System.out.println("Рост баскетболиста под номером " + i + " = " + randHeight[i]);
            }
        }
        if (numberPlayers == 1) {
            System.out.println(numberPlayers + " баскетболист имеет рост больший 180 см., но меньший 190 см.");
        } else if (numberPlayers >= 2 && numberPlayers <= 4) {
            System.out.println(numberPlayers + " баскетболиста имеют рост больший 180 см., но меньший 190 см.");
        }
        else {
            System.out.println(numberPlayers + " баскетболистов имеют рост больший 180 см., но меньший 190 см.");
        }
        middleHeight = (double) sumHeights / numberPlayers;
        System.out.println("Средний рост баскетболистов с ростом большим 180 см., " +
                "но меньшим 190 см. = " + middleHeight);*/
        Random rand = new Random();
        int size = 10;
        int[] arr = new int[size];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101);
            sum += arr[i];
            System.out.println(arr[i]);
        }
        float middleCount = sum / size;
        System.out.println("Среднее арифметическое значение " + size + " чисел = " + middleCount);
    }

}
