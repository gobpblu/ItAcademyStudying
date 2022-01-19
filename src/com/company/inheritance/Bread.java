package com.company.inheritance;

public class Bread {
    double weight;
    int priceKGS;
    String companyProducer;
    public static int breadCounter = 0;

    public Bread(double weight, int priceKGS, String companyProducer) {
        if (weight > 0) this.weight = weight;
        this.priceKGS = priceKGS;
        this.companyProducer = companyProducer;
        breadCounter++;
    }

    public void setWeight(double weight) {
        if (weight > 0) this.weight = weight;
        else System.out.println("Хлеб не может ничего не весить!");
    }

    public void setPriceKGS(int priceKGS) {
        this.priceKGS = priceKGS;
    }

    public void setCompanyProducer(String companyProducer) {
        this.companyProducer = companyProducer;
    }

    public double getWeight() {
        if (weight > 0) return weight;
        else return 0;
    }

    public int getPriceKGS() {
        return priceKGS;
    }

    public String getCompanyProducer() {
        return companyProducer;
    }

    public static int getBreadCounter() {
        return breadCounter;
    }

    void bake() {
        System.out.println("Хлеб готов!");
    }

    void pack() {
        System.out.println("Хлеб запакован!");
    }

    @Override
    public String toString() {
        String message = "Вес хлеба = " + getWeight() + "\n" +
                "Цена хлеба в сомах = " + getPriceKGS() + "\n" +
                "Компания-производитель хлеба: " + getCompanyProducer() + "\n" +
                "Количество испечённого хлеба: " + getBreadCounter();
        return message;
    }
}
