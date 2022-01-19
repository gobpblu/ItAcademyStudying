package com.company.listsenumspractice;

public class Laptop implements Discountable {
    private int priceKGS;
    private String model;
    private int priceKGSWithDiscount;

    public Laptop(int priceKGS, String model) {
        this.priceKGS = priceKGS;
        this.model = model;
        this.priceKGSWithDiscount = priceKGS;
    }

    public int getPriceKGS() {
        return priceKGS;
    }

    public void setPriceKGS(int priceKGS) {
        this.priceKGS = priceKGS;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPriceKGSWithDiscount() {
        return priceKGSWithDiscount;
    }

    public void setPriceKGSWithDiscount(int priceKGSWithDiscount) {
        this.priceKGSWithDiscount = priceKGSWithDiscount;
    }

    @Override
    public void discount(int discountAmount) {
        setPriceKGSWithDiscount(getPriceKGS() - discountAmount * getPriceKGS() / 100);
    }

    @Override
    public String toString() {
        String msg = "Ноутбук{" +
                "цена в сомах = " + priceKGS +
                ", модель: '" + model + '\'';
        if (priceKGSWithDiscount != priceKGS)
            msg += ", цена в сомах со скидкой = " + priceKGSWithDiscount +
                    '}';
        else msg += ", скидки нет}";
        return msg;
    }
}
