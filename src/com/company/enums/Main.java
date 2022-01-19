package com.company.enums;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.MONDAY;
        switch(day) {
            case MONDAY:
            case WEDNESDAY:
            case FRIDAY:
                System.out.println(day.getDayInRussian() + ": Работаю");
                break;
            case TUESDAY:
            case THURSDAY:
                System.out.println(day.getDayInRussian() + ":Учусь");
                break;
            default:
                System.out.println(day.getDayInRussian() + ":Отдыхаю");
                break;
        }
    }
}
