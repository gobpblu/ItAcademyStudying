package com.company.OOPPractice_14Presentation;

public class Laptop {
    String brand;
    String model;
    HardDrive[] hardDrive = new HardDrive[10];
    RamMemory[] ramMemory = new RamMemory[10];
    OperatingSystem[] operatingSystem = new OperatingSystem[10];
    Processor processor;
    int buildNumber;
    int j = 0;

    public Laptop(String brand, String model, HardDrive hardDrive, RamMemory ramMemory,
                  OperatingSystem operatingSystem, Processor processor) {
        this.brand = brand;
        this.model = model;
        this.hardDrive[j] = hardDrive;
        this.ramMemory[j] = ramMemory;
        this.operatingSystem[j] = operatingSystem;
        this.processor = processor;
        j++;
    }

    public Laptop() {

    }

    public void setBuildNumber(int buildNumber) {
        this.buildNumber = buildNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHardDrive(HardDrive hardDrive, int i) {
        this.hardDrive[i] = hardDrive;
    }

    public void setRamMemory(RamMemory ramMemory, int i) {
        this.ramMemory[i] = ramMemory;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem, int i) {
        this.operatingSystem[i] = operatingSystem;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public int getBuildNumber() {
        return buildNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public HardDrive getHardDrive(int i) {
        return hardDrive[i];
    }

    public RamMemory getRamMemory(int i) {
        return ramMemory[i];
    }

    public OperatingSystem getOperatingSystem(int i) {
        return operatingSystem[i];
    }

    public Processor getProcessor() {
        return processor;
    }

    @Override
    public String toString() {
        String message = "Информация о ноутбуке:\n" +
                "Бренд: " + getBrand() + "\n" +
                "Модель: " + getModel() + "\n";
        if (hardDrive[buildNumber] != null) message += hardDrive[buildNumber] + "\n";
        else message += hardDrive[0] + "\n";
        if (ramMemory[buildNumber] != null) message += ramMemory[buildNumber] + "\n";
        else message += ramMemory[0] + "\n";
        if (operatingSystem[buildNumber] != null) message += operatingSystem[buildNumber] + "\n";
        else message += operatingSystem[0] + "\n";
        message += processor + "\n";

        return message;
    }

}
