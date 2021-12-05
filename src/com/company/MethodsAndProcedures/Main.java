package com.company.MethodsAndProcedures;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Введите 4 целых числа: ");
        int firstCount = scan.nextInt();
        int secondCount = scan.nextInt();
        int thirdCount = scan.nextInt();
        int fourthCount = scan.nextInt();
        System.out.println("Сумма 4-ех чисел = "
                + sumFourCounts(firstCount, secondCount, thirdCount, fourthCount));
        sumFourCounts2(firstCount, secondCount, thirdCount, fourthCount);*/

        Random rand = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(101);
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("Сумма первого и последнего чисел в массиве = " + sumEnds(nums));

    }

    public static int sumFourCounts(int firstCount, int secondCount, int thirdCount, int fourthCount) {
        return firstCount+secondCount+thirdCount+fourthCount;
    }

    public static void sumFourCounts2(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        System.out.println("Сумма 4-ех чисел = " + sum);
    }

    public static void error() {
        System.out.println("Произошла ошибка!");
    }

    public static int sumEnds(int[] nums) {
        return nums[0] + nums[nums.length-1];
    }

}
