package com.company.inheritance;

public class Main {
    public static void main(String[] args) {
        /*Student[] students = new Student[5];
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        double sum = 0;

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setFIO("Человек " + (i + 1));
            students[i].setAge(rand.nextInt(101));
            students[i].setMark(rand.nextInt(5) + 1);
            sum += students[i].getMark();
        }
        for (Student i : students) {
            System.out.println(i);
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("Среднее арифметическое оценок студентов: " + sum / students.length);*/

        Bread bread = new Bread(1, 19, "Kyrgyzstan");
        bread.bake();
        bread.pack();
        TandoorTortilla tandoorTortilla = new TandoorTortilla(0.4, 25, "Russia", 10);
        tandoorTortilla.drawPrints();
        tandoorTortilla.bake();
        tandoorTortilla.varnish();
        tandoorTortilla.pack();
        ArmenianLavash armenianLavash = new ArmenianLavash(0.3, 30,
                "Turkey", 5, 2);
        armenianLavash.bake();
        armenianLavash.wrap();
        FrenchBaguette frenchBaguette = new FrenchBaguette(0.2, 50, "France",
                20);
        frenchBaguette.pack();
        System.out.println(bread);
    }
}
