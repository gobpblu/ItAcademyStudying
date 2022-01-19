package com.company.enums;

public enum DaysOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");
    private String dayInRussian;
    DaysOfWeek(String dayInRussian) {
        this.dayInRussian = dayInRussian;
    }

    public String getDayInRussian() {
        return dayInRussian;
    }
}
