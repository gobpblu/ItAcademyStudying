package com.company.practiceRegistration;

public class WrongDataError extends Error {
    @Override
    public String toString() {
        return "Введены некорректные данные!";
    }
}
