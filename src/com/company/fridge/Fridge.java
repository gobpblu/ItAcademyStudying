package com.company.fridge;

public class Fridge {
    RefrigeratedCabinet refrigeratedCabinet;
    Freezer freezer;
    String name;
    String model;

    public Fridge(RefrigeratedCabinet refrigeratedCabinet, Freezer freezer, String name, String model) {
        this.refrigeratedCabinet = refrigeratedCabinet;
        this.freezer = freezer;
        this.name = name;
        this.model = model;
    }

    public Fridge() {

    }

    public void setRefrigeratedCabinet(RefrigeratedCabinet refrigeratedCabinet) {
        this.refrigeratedCabinet = refrigeratedCabinet;
    }

    public void setFreezer(Freezer freezer) {
        this.freezer = freezer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public RefrigeratedCabinet getRefrigeratedCabinet() {
        return refrigeratedCabinet;
    }

    public Freezer getFreezer() {
        return freezer;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        String message = "Информация о холодильнике:\n" +
                "Название холодильника: " + name + "\n" +
                "Модель холодильника: " + model + "\n" +
                refrigeratedCabinet + "\n"
                + freezer;
        return message;
    }
}
