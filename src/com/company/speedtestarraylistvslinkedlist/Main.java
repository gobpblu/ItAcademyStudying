package com.company.speedtestarraylistvslinkedlist;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        try(FileWriter fileWriter = new
                FileWriter("SpeedTestArrayListvsLinkedList.txt", true)) {
            int numberOfElements = 10000;
            testFunction(arrayList);
            long startTime = System.currentTimeMillis();
            testFunction2(arrayList, numberOfElements);
            long endTime = System.currentTimeMillis();
            long arrayListDifference = endTime - startTime;

            fileWriter.write("Время на получение " + numberOfElements + " элементов " +
                    " с конца списка в ArrayList: " + arrayListDifference + " мс. " +
                    "В секундах: " + (arrayListDifference/1000.0) + "\n");

            testFunction(linkedList);
            startTime = System.currentTimeMillis();
            testFunction2(linkedList, numberOfElements);
            endTime = System.currentTimeMillis();
            long linkedListDifference = endTime - startTime;
            String difference;
            fileWriter.write("Время на получение " + numberOfElements + " элементов " +
                    " с конца списка в LinkedList: " + linkedListDifference + " мс. " +
                    "В секундах: " + (linkedListDifference/1000.0) + "\n");

            if (arrayListDifference > linkedListDifference) {
                if (linkedListDifference != 0) {
                    difference = String.format("%.2f",
                            ((double) arrayListDifference / linkedListDifference));
                } else difference = String.format("%.2f", ((double)arrayListDifference));
                fileWriter.write("LinkedList быстрее ArrayList в данном случае в " +
                        difference + " раз(а)" + "\n\n");
            } else {
                if (arrayListDifference != 0) {
                    difference = String.format("%.2f",
                            ((double) linkedListDifference / arrayListDifference));
                } else difference = String.format("%.2f", ((double) linkedListDifference));
                fileWriter.write("ArrayList быстрее LinkedList в данном случае в " +
                        difference + " раз(а)" + "\n\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }

    }

    public static void testFunction(List<String> list) {
        for (int i = 0; i < 100000; i++) {
            list.add("" + i);
        }
    }

    public static void testFunction2(List<String> list, int numberOfElements) {
        for (int i = 0; i < numberOfElements; i++) {
            list.get(list.size() - i - 1);
        }
    }
}
