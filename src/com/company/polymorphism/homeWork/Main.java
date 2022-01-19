package com.company.polymorphism.homeWork;

public class Main {
    public static void main(String[] args) {
        ManagementAble[] managementAbles = {new Mayor("Костя", 45),
        new Driver("Касым", 5),
        new Parent("Галина", "Женский")};
        managementAbles[0].manage();
        managementAbles[1].manage();
        managementAbles[2].manage();
        ((Mayor)managementAbles[0]).buildRoad();
        System.out.println(managementAbles[2].getClass());
    }
}
