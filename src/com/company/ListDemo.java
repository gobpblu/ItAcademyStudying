package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {


    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        /*arrayList.add("05-09");
        arrayList.add("01-04");*/
        arrayList.add("20-06");
        arrayList.add("03-05");
        //arrayList.add("E");
        /*arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add("F");
        arrayList.add(1, "A2");
        arrayList.set(0, "C2");

        System.out.println("Содержимое arrayList: " + arrayList);
        System.out.println("Размер arrayList после добавления: "
                + arrayList.size());

        arrayList.remove("F");
        arrayList.remove(2);

        System.out.println("Размер arrayList после удаления: "
                + arrayList.size());
        System.out.println("Содержимое of arrayList: " + arrayList);*/

        System.out.println(getResult(arrayList));
    }

    public static boolean getResult(List<String> time) {
        for (int i = 0; i < time.size() - 1; i++) {
            //System.out.println(time.get(i));
            int a = Integer.parseInt(time.get(i), 0, 2, 10);
            int b = Integer.parseInt(time.get(i), 3, 5, 10);
            for (int j = i + 1; j < time.size(); j++) {
                int c = Integer.parseInt(time.get(j), 0, 2, 10);
                int d = Integer.parseInt(time.get(j), 3, 5, 10);
                System.out.println(a + " " + b + " " + c + " " + d);
                if ((a > c && a < d || b > c && b < d) ||
                        (c > a && c < b || d > a && d < b)) return false;
                else if (b < a) {
                    int tempB = b + 24;
                    c += 24;
                    d += 24;
                    if ((a >= c && a <= d || tempB >= c && tempB <= d) ||
                            (c >= a && c <= tempB || d >= a && d <= tempB)) return false;
                }
                else if (d < c) {
                    int tempB = b + 24;
                    int tempA = a + 24;
                    d += 24;
                    if ((tempA >= c && tempA <= d || tempB >= c && tempB <= d) ||
                            (c >= tempA && c <= tempB || d >= tempA && d <= tempB)) return false;
                }
                }
            }


        return true;
    }
}
