package com.company.inheritance;

public class TandoorTortilla extends Bread {
    double radius;

    public TandoorTortilla(double weight, int priceKGS, String companyProducer, double radius) {
        super(weight, priceKGS, companyProducer);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    void drawPrints() {
        System.out.println("Нанесли узоры");
    }

    void varnish() {
        System.out.println("Лакировали");
    }

    @Override
    public String toString() {
        String message = "Вес тандырной лепёшки = " + getWeight() + "\n" +
                "Цена тандырной лепёшки в сомах = " + getPriceKGS() + "\n" +
                "Компания-производитель тандырной лепёшки " + getCompanyProducer() + "\n" +
                "Длина тандырной лепёшки = " + getRadius() + "\n";
        return message;
    }
}
