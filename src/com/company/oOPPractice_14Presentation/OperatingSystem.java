package com.company.oOPPractice_14Presentation;

public class OperatingSystem {
    String name;
    double version;

    public OperatingSystem(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public OperatingSystem() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public double getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String message = "Информация о операционной системе:\n" +
                "Название: " + this.name + "\n" +
                "Версия: " + this.version + "\n";
        return message;
    }
}
