package com.company.firstHomeWork_2Presentation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String userName = scan.nextLine();
        System.out.println("Привет, " + userName + ".");
    }
}
