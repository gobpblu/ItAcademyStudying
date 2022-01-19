package com.company.inheritance;

public class FrenchBaguette extends Bread {
    double length;

    public FrenchBaguette(double weight, int priceKGS, String companyProducer, double length) {
        super(weight, priceKGS, companyProducer);
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    void scarring() {
        System.out.println("Багет зарубцован");
    }

    @Override
    void pack() {
        super.pack();
        System.out.println("Только в экологичный пакет!");
    }

    @Override
    public String toString() {
        String message = "Вес французского багета = " + getWeight() + "\n" +
                "Цена французского багета в сомах = " + getPriceKGS() + "\n" +
                "Компания-производитель французского багета " + getCompanyProducer() + "\n" +
                "Длина французского багета = " + getLength() + "\n";
        return message;
    }
}
