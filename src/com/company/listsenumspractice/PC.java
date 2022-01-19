package com.company.listsenumspractice;

public class PC implements Discountable {
    private int priceKGS;
    private String model;
    private double monitorDiagonal;
    private int priceKGSWithDiscount;

    public PC(int priceKGS, String model, double monitorDiagonal) {
        this.priceKGS = priceKGS;
        this.model = model;
        this.monitorDiagonal = monitorDiagonal;
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

    public double getMonitorDiagonal() {
        return monitorDiagonal;
    }

    public void setMonitorDiagonal(double monitorDiagonal) {
        this.monitorDiagonal = monitorDiagonal;
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
        String msg = "Персональный компьютер{" +
                "цена в сомах = " + priceKGS +
                ", модель = '" + model + '\'' +
                ", диагональ монитора = " + monitorDiagonal;
        if (priceKGSWithDiscount != priceKGS)
        msg += ", цена в сомах со скидкой = " + priceKGSWithDiscount +
                '}';
        else msg += ", скидки нет}";
        return msg;
    }
}
