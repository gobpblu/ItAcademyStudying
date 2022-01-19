package com.company.oOPPractice_14Presentation;

public class HardDrive {
    String type;
    double capacity;
    int writeSpeed;
    int readSpeed;

    public HardDrive(String type, double capacity, int writeSpeed, int readSpeed) {
        this.type = type;
        this.capacity = capacity;
        this.writeSpeed = writeSpeed;
        this.readSpeed = readSpeed;
    }

    public HardDrive() {

    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setWriteSpeed(int writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    public void setReadSpeed(int readSpeed) {
        this.readSpeed = readSpeed;
    }

    public String getType() {
        return type;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getWriteSpeed() {
        return writeSpeed;
    }

    public int getReadSpeed() {
        return readSpeed;
    }

    @Override
    public String toString() {
        String message = "Информация о жестком диске:\n" +
                "Тип: " + getType() + "\n" +
                "Размер: " + getCapacity() + "\n" +
                "Скорость записи: " + getWriteSpeed() + "\n" +
                "Скорость чтения: " + getReadSpeed() + "\n";
        return message;
    }
}
