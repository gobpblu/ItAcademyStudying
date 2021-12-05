package com.company.OOPPractice_14Presentation;

public class Processor {
    String model;
    int numberOfCores;
    double frequency;

    public Processor(String model, int numberOfCores, double frequency) {
        this.model = model;
        this.numberOfCores = numberOfCores;
        this.frequency = frequency;
    }

    public Processor() {

    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        String message = "Информация о процессоре:\n" +
                "Модель: " + getModel() + "\n" +
                "Частота: " + getFrequency() + "\n" +
                "Количество ядер: " + getNumberOfCores() + "\n";
        return message;
    }
}
