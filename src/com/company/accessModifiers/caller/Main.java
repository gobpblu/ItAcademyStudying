package com.company.accessModifiers.caller;

import com.company.accessModifiers.library.Book;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Гоголь", "Мертвые души", 300, "Машей", true);
        book.setAuthor("Пушкин");
        book.setPageCount(150);
        book.getPressMark();
        //book.setNeedsRepair(false);

    }
}
