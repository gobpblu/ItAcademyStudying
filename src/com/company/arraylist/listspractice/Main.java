package com.company.arraylist.listspractice;

import com.company.exceptions.Cat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Bear[] bears = new Bear[200];
        ArrayList<Bear> youngBearsAge = new ArrayList();
        ArrayList<Bear> oldBearsAge = new ArrayList();
        ArrayList<Bear> littleBearsWeight = new ArrayList();
        ArrayList<Bear> bigBearsWeight = new ArrayList();
        for (int i = 0; i < bears.length; i++) {
            bears[i] = new Bear(random.nextInt(41),
                    random.nextInt(500 - 30 + 1)+30);
            if (bears[i].getYears() > 20) {
                oldBearsAge.add(bears[i]);
            } else {
                youngBearsAge.add(bears[i]);
            }
            if (bears[i].getWeight() < 150) {
                littleBearsWeight.add(bears[i]);
            } else {
                bigBearsWeight.add(bears[i]);
            }
        }
        if (oldBearsAge.contains(bears[3])) System.out.println("Четвертый медведь старый!");
        System.out.println(bigBearsWeight.indexOf(bears[3]));
        System.out.println(bigBearsWeight);
        System.out.println(littleBearsWeight);
        System.out.println(oldBearsAge);
        System.out.println(youngBearsAge);
        for (int i = 0; i < oldBearsAge.size(); i++) {
            for (int j = i + 1; j < bigBearsWeight.size(); j++) {
                if (oldBearsAge.get(i).equals(bigBearsWeight.get(j))) {
                    System.out.println("Медведь[" + i + "] схож с медведем[" + j + "]");
                    //System.out.println("Медведь[" + i + "]:" + oldBearsAge.get(i));
                    //System.out.println("Медведь[" + j + "]:" + bigBearsWeight.get(j));
                }

            }

        }
        Bear[] bigBearsWeightArray = new Bear[bigBearsWeight.size()];
        bigBearsWeight.toArray(bigBearsWeightArray);
        for (Bear i:
             bigBearsWeightArray) {
            System.out.println(i);
        }

    }
}
