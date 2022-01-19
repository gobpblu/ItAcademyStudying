package com.company.inheritance;

public class Chamomile extends Bread {
    int numberOfPetals;

    public Chamomile(double weight, int priceKGS, String companyProducer, int numberOfPetals) {
        super(weight, priceKGS, companyProducer);
        this.numberOfPetals = numberOfPetals;
    }

    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    @Override
    public String toString() {
        String message = "Вес ромашки = " + getWeight() + "\n" +
                "Цена ромашки в сомах = " + getPriceKGS() + "\n" +
                "Компания-производитель ромашки " + getCompanyProducer() + "\n" +
                "Радиус ромашки = " + getNumberOfPetals() + "\n";
        return message;
    }
}
