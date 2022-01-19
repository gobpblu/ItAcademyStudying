package com.company.arraylist;

import com.company.taskForArray.Array;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<Integer> numsMultipliesOf2Or3 = new ArrayList<>();
        for (int i = 0; i <= 1000; i++) {
            if (Math.sqrt(i) % 1 == 0)
            integerArrayList.add(i);
            if (i % 2 == 0 || i % 3 == 0) numsMultipliesOf2Or3.add(i);
        }
        //integerArrayList.add()
       /* for (int i: integerArrayList) {
            System.out.println(i);
        }*/

        int oddIndex = 0;
        ArrayList<Integer> integerArrayList2 = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) integerArrayList2.add(i);
            else {
                integerArrayList2.add(oddIndex, i);
                oddIndex++;
            }
        }
        System.out.println(integerArrayList2);
        int i = 0;
        do {
            if (integerArrayList2.get(i) % 2 == 0) {
                integerArrayList2.remove(i);
            }
            else i++;
        } while (i < integerArrayList2.size());

        /*for (int i = 0; i < integerArrayList2.size(); i++) {
            if (integerArrayList2.get(i) % 2 == 0)
                System.out.println(i + " " + integerArrayList2.get(i));
                integerArrayList2.remove(i);
                i--;
        }*/
        System.out.println(integerArrayList2);
        /*for (int i:
                integerArrayList2) {
            System.out.println(i);
        }*/
    }
}
