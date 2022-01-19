package com.company.practiceRegistration;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Calculator implements Addable, Multipliable, Subtractable, Dividable {
    Scanner scanner = new Scanner(System.in);
    static String log = "";
    @Override
    public double add() throws IOException {
        System.out.print("Введите 1-ое слагаемое: ");
        double firstCount = scanner.nextDouble();
        System.out.print("Введите 2-ое слагаемое: ");
        double secondCount = scanner.nextDouble();
        log += firstCount + " + " + secondCount + " = " +
                (firstCount + secondCount) + "\n";
        return firstCount + secondCount;
    }

    @Override
    public double subtract() {
        System.out.print("Введите уменьшаемое число: ");
        double firstCount = scanner.nextDouble();
        System.out.println("Введите вычитаемое число: ");
        double secondCount = scanner.nextDouble();
        log += firstCount + " - " + secondCount + " = " +
                (firstCount - secondCount) + "\n";
        return firstCount - secondCount;
    }

    @Override
    public double multiply() {
        System.out.print("Введите 1-ый множитель: ");
        double firstCount = scanner.nextDouble();
        System.out.println("Введите 2-ой множитель: ");
        double secondCount = scanner.nextDouble();
        log += firstCount + " * " + secondCount + " = " +
                (firstCount * secondCount) + "\n";
        return firstCount * secondCount;
    }

    @Override
    public double divide() throws IOException {
        System.out.print("Введите делимое: ");
        double firstCount = scanner.nextDouble();
        System.out.print("Введите делитель: ");
        double secondCount = scanner.nextDouble();
            if (secondCount != 0) {
                log += firstCount + " / " + secondCount + " = " +
                        (firstCount / secondCount) + "\n";
                return firstCount / secondCount;
            }
            else {
                throw new DividedBy0Error();
            }
    }
}
