package com.company.practiceRegistration;

public class LogInError extends Error{
    @Override
    public String toString() {
        return "Введены неправильный логин или пароль!";
    }
}
