package com.company.inheritance;

public class ArmenianLavash extends Bread {
    double radius;
    double thickness;
    int numberOfLongitudinalScars;

    public ArmenianLavash(double weight, int priceKGS, String companyProducer, double radius, double thickness) {
        super(weight, priceKGS, companyProducer);
        this.radius = radius;
        this.thickness = thickness;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void setNumberOfLongitudinalScars(int numberOfLongitudinalScars) {
        this.numberOfLongitudinalScars = numberOfLongitudinalScars;
    }

    public double getRadius() {
        return radius;
    }

    public double getThickness() {
        return thickness;
    }

    public int getNumberOfLongitudinalScars() {
        return numberOfLongitudinalScars;
    }

    void wrap() {
        System.out.println("Лаваш завёрнут");
    }

    @Override
    void bake() {
        super.bake();
        System.out.println("Я лаваш, меня испекли :)");
    }

    @Override
    public String toString() {
        String message = "Вес армянского лаваша = " + getWeight() + "\n" +
                "Цена армянского лаваша в сомах = " + getPriceKGS() + "\n" +
                "Компания-производитель армянского лаваша " + getCompanyProducer() + "\n" +
                "Радиус армянского лаваша = " + getRadius() + "\n" +
                "Толщина армянского лаваша = " + getThickness() + "\n" +
                "Количество продольных рубцов армянского лаваша = " + getThickness() + "\n";
        return message;
    }
}
