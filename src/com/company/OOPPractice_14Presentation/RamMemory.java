package com.company.OOPPractice_14Presentation;

public class RamMemory {
    int size;
    String model;

    public RamMemory(int size, String model) {
        this.size = size;
        this.model = model;
    }

    public RamMemory() {

    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        String message = "Информация о оперативной памяти:\n" +
                "Модель: " + getModel() + "\n" +
                "Размер: " + getSize() + "\n";
        return message;
    }
}
