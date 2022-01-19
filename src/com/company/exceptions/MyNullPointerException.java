package com.company.exceptions;

public class MyNullPointerException extends NullPointerException{
    public MyNullPointerException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Обращение к нулевому объекту, исправьте :)";
    }
}
