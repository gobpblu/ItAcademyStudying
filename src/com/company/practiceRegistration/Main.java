package com.company.practiceRegistration;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner1 = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int inputNumber;
        do {
            System.out.println("Введите одну из цифр, чтобы выполнить " +
                    "следующие действия:" + "\n" +
                    "0. Выйти из приложения" + "\n" +
                    "1. Зарегистрироваться" + "\n" +
                    "2. Войти в систему" + "\n" +
                    "3. Посмотреть последнее использование калькулятора");
            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 0:
                    return;
                case 1:
                    Person person = register();
                    if (person != null) {
                        FileWriter fileWriter = new FileWriter("RegistrationInfo.txt");
                        fileWriter.write(person.getLogin() + "\n");
                        fileWriter.write(person.getPassword());
                        fileWriter.close();
                    }
                    break;
                case 2:
                    System.out.println("Введите логин: ");
                    String username = scanner1.nextLine();
                    System.out.println("Введите пароль: ");
                    String password = scanner1.nextLine();
                    if (logIn(username, password)) {
                        System.out.println("Вы вошли в систему и можете " +
                                "пользоваться калькулятором!");
                        calculate();
                        FileWriter fileWriter = new FileWriter("CalculatorLog.txt");
                        fileWriter.write(Calculator.log);
                        fileWriter.close();
                    }
                    else {
                        //System.out.println("Вы ввели неправильный логин или пароль!");
                        throw new LogInError();
                    }
                    break;
                case 3:
                    FileReader fileReader = new FileReader("CalculatorLog.txt");
                    Scanner fileScanner = new Scanner(fileReader);
                    int i = 1;
                    while(fileScanner.hasNextLine()) {
                        String fileLine = fileScanner.nextLine();
                            System.out.println(i + " действие: " + fileLine);
                            i++;
                    }
                    fileReader.close();
                    break;
                default:
                    System.out.println("Вы ввели некорректную цифру");
                    break;
            }
        } while (inputNumber != 0);

    }

    static Person register() {
        Scanner scan = new Scanner(System.in);
        Person person = new Person();
        // ЛОГИН
        System.out.print("Имя пользователя должно содержать только " +
                "латинские буквы и цифры.\n" +
                "Введите имя пользователя: ");
        String username = scan.nextLine();
        // System.out.println(usernameChars[i]);
        if (numbersAndLettersCheck(username)) {
            person.setLogin(username);
        } else {
            throw new WrongDataError();
        }

        // ПАРОЛЬ
        System.out.print("Пароль должен содержать только " +
                "латинские буквы и цифры.\n" +
                "Введите пароль: ");
        String password = scan.nextLine();
        if (numbersAndLettersCheck(password)) {
            person.setPassword(password);
        } else {
            throw new WrongDataError();
        }


        // НОМЕР ТЕЛЕФОНА
        System.out.print("Можно оставить поле пустым.\n" +
                "Номер телефона должен содержать только 10 цифр.\n" +
                "Введите номер телефона: ");
        String phoneNumber = scan.nextLine();
        System.out.println(phoneNumber);
        if (phoneNumber == "" || numbersCheck(phoneNumber)) {
            person.setPhoneNumber(phoneNumber);
        } else {
            throw new WrongDataError();
        }
        // ВОЗРАСТ
        System.out.print("Возраст может быть больше 0 и меньше 120.\n" +
                "Введите возраст: ");
        int age = scan.nextInt();
        if (age > 0 && age < 120) {
            person.setAge(age);
        } else {
            throw new WrongDataError();
        }
        return person;
    }

    static boolean logIn(String username, String password) throws IOException {
        FileReader fileReader = new FileReader("RegistrationInfo.txt");
        Scanner scan = new Scanner(fileReader);
        // boolean isCorrect = true;
        if (scan.hasNextLine()) {
            String fileLine = scan.nextLine();
            if (!fileLine.equals(username)) return false;
        } else {
            System.out.println("Данные отсутствуют");
            return false;
        }
        if (scan.hasNextLine()) {
            String fileLine = scan.nextLine();
            if (!fileLine.equals(password)) return false;
        } else {
            System.out.println("Данные отсутствуют");
            return false;
        }
        fileReader.close();
        return true;
    }

    static boolean numbersAndLettersCheck(String sentence) {
        byte[] sentenceChars = sentence.getBytes();
        for (byte i = 0; i < sentence.length(); i++) {
            // System.out.println(sentenceChars[i]);
            if (sentenceChars[i] < 48 ||
                    sentenceChars[i] > 57 && sentenceChars[i] < 65 ||
                    sentenceChars[i] > 90 && sentenceChars[i] < 97 ||
                    sentenceChars[i] > 122) {
                return false;
            }
        }
        return true;
    }

    static boolean numbersCheck(String sentence) {
        byte[] sentenceChars = sentence.getBytes();
        if (sentence.length() != 10) return false;
        for (byte i = 0; i < sentence.length(); i++) {
            // System.out.println(sentenceChars[i]);
            if (sentenceChars[i] < 48 || sentenceChars[i] > 57) {
                return false;
            }
        }
        return true;
    }

    static void calculate() throws IOException {
        Calculator calculator = new Calculator();
        int calculateNumber = 0;
        do {
            System.out.println("Введите одну из цифр, чтобы выполнить " +
                    "следующие действия:" + "\n" +
                    "0. Выйти из приложения" + "\n" +
                    "1. Сложение" + "\n" +
                    "2. Вычитание" + "\n" +
                    "3. Умножение" + "\n" +
                    "4. Деление");
            calculateNumber = scanner.nextInt();
            double result = 0;
            switch (calculateNumber) {
                case 0:
                    return;
                case 1:
                    result = calculator.add();
                    System.out.println("Результат сложения: " + result);
                    break;
                case 2:
                    result = calculator.subtract();
                    System.out.println("Результат вычитания: " + result);
                    break;
                case 3:
                    result = calculator.multiply();
                    System.out.println("Результат умножения: " + result);
                    break;
                case 4:
                    result = calculator.divide();
                    System.out.println("Результат деления: " + result);
                    break;
                default:
                    System.out.println("Вы ввели некорректную цифру");
                    break;
            }
        } while (calculateNumber != 0);
        }

}

