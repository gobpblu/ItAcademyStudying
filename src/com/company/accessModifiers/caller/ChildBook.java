package com.company.accessModifiers.caller;

import com.company.accessModifiers.library.Book;

public class ChildBook extends Book {
    public static void main(String[] args) {
        Book book = new Book("Гоголь", "Мертвые души", 300, "Машей", true);
    }
}
