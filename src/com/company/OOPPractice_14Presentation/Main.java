package com.company.OOPPractice_14Presentation;

public class Main {
    public static void main(String[] args) {
        HardDrive hardDrive = new HardDrive("SSD", 128, 10, 60);
        RamMemory ramMemory = new RamMemory(8, "DDR3");
        OperatingSystem operatingSystem = new OperatingSystem("Windows", 10);
        Processor processor = new Processor("Intel Core i3", 8, 2.3);
        Laptop laptop = new Laptop("Lenovo", "W340", hardDrive, ramMemory,
                operatingSystem, processor);
        System.out.println(laptop);
        Processor processor1 = new Processor("Intel Core i9", 16, 3.0);
        laptop.setProcessor(processor1);
        HardDrive hardDrive1 = new HardDrive("HDD", 1024, 5, 30);
        laptop.setHardDrive(hardDrive1, 1);
        OperatingSystem operatingSystem1 = new OperatingSystem("Ubuntu", 16.04);
        laptop.setOperatingSystem(operatingSystem1, 1);
        laptop.setRamMemory(ramMemory, 1);
        laptop.setModel(laptop.getModel());
        laptop.setBrand(laptop.getBrand());
        laptop.setBuildNumber(1);
        System.out.println(laptop);
        HardDrive hardDrive2 = new HardDrive("SSD", 256, 12, 70);
        laptop.setHardDrive(hardDrive2, 2);
        laptop.setBuildNumber(2);
        System.out.println(laptop);
    }
}
