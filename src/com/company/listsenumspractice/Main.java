package com.company.listsenumspractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PC> pcs = new ArrayList<>();
        LinkedList<Laptop> laptops = new LinkedList<>();
        int pcsPricesSum = 0;
        int laptopsPricesSum = 0;
        ComputerModel model = ComputerModel.DELL;
        for (int i = 0; i < 50; i++) {

            switch(i % 5) {
                case 0:
                    model = ComputerModel.DELL;
                    break;
                case 1:
                    model = ComputerModel.HP;
                    break;
                case 2:
                    model = ComputerModel.MAC;
                    break;
                case 3:
                    model = ComputerModel.Lenovo;
                    break;
                case 4:
                    model = ComputerModel.Sony;
                    break;
            }
                pcs.add(new PC(100_000 - i * 1000,
                        model.name(), 9 + i * 0.5));

            pcsPricesSum += pcs.get(i).getPriceKGS();
            laptops.add(new Laptop(100_000 - i * 1500, model.name()));
            laptopsPricesSum += laptops.get(i).getPriceKGS();
        }
        System.out.println("Итоговая сумма по компьютерам: " + pcsPricesSum);
        System.out.println("Итоговая сумма по ноутбукам: " + laptopsPricesSum);
        laptopsPricesSum = 0;
        for (Laptop i :
                laptops) {
            i.discount(20);
            laptopsPricesSum += i.getPriceKGSWithDiscount();
        }
        System.out.println("Итоговая сумма по ноутбукам с учётом " +
                "скидки в 20%: " + laptopsPricesSum);
        search(pcs, laptops, 85000, "DELL");
    }

    public static void search(ArrayList<PC> pcs, LinkedList<Laptop> laptops,
                              int priceKGS, String model) {
        int size = Math.min(pcs.size(), laptops.size());
        System.out.println("По запросу найдены:");
        for (int i = 0; i < size; i++) {
            if (pcs.get(i).getPriceKGS() == priceKGS
                    && pcs.get(i).getModel().equals(model)) {
                System.out.println(pcs.get(i));
            } else if (laptops.get(i).getPriceKGS() == priceKGS
                    && laptops.get(i).getModel().equals(model)) {
                System.out.println(laptops.get(i));
            }
        }
        if (size < pcs.size()) {
            for (int i = size; i < pcs.size(); i++) {
                if (pcs.get(i).getPriceKGS() == priceKGS
                        && pcs.get(i).getModel().equals(model)) {
                    System.out.println(pcs.get(i));
                }
            }
        } else if (size < laptops.size()) {
            for (int i = size; i < laptops.size(); i++) {
                if (laptops.get(i).getPriceKGS() == priceKGS
                        && laptops.get(i).getModel().equals(model)) {
                    System.out.println(pcs.get(i));
                }
            }
        }
    }
}
