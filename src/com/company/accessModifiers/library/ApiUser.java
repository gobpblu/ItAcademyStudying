package com.company.accessModifiers.library;

public class ApiUser{
    public static void main(String[] args) {
        Book book1 = new Book("Марк Твен", "Том Сойер", 200, "Женой", false);
        book1.setNeedsRepair(true);
    }
}
