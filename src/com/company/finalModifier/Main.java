package com.company.finalModifier;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        final int[] ARR = new int[10];
        for (int i = 0; i < ARR.length; i++) {
            ARR[i] = rand.nextInt(11);
            System.out.print(ARR[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < ARR.length; i++) {
            ARR[i] = rand.nextInt(11);
            System.out.print(ARR[i] + " ");
        }
        System.out.println();
        //ARR = new int[20];
    }
}
