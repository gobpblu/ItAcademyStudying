package com.company.introductionToOOP_11Presentation;

public class Main {

    public static void main(String[] args) {
        Dog sheepdog = new Dog();
        Dog caucasianSheperdDog = new Dog();
        Dog tibetanMastiff = new Dog();
        sheepdog.name = "Rex";
        sheepdog.years = 1;
        sheepdog.months = 5;
        sheepdog.color = "Black";
        sheepdog.height = 85;
        caucasianSheperdDog.name = "Guffy";
        caucasianSheperdDog.years = 2;
        caucasianSheperdDog.months = 0;
        caucasianSheperdDog.height = 120;
        caucasianSheperdDog.color = "Brown";
        tibetanMastiff.name = "BigBoy";
        tibetanMastiff.years = 3;
        tibetanMastiff.months = 7;
        tibetanMastiff.color = "Gray";
        tibetanMastiff.height = 150;
        System.out.println("1. Немецкая овчарка.\nИмя: " + sheepdog.name + "\nЦвет собаки: " + sheepdog.color
                + "\nРост: " + sheepdog.height + "\nПрожито лет жизни: " + sheepdog.years
                + "\nПрожито месяцев жизни: " + sheepdog.months);
        System.out.println();
        System.out.println("2. Кавказская овчарка.\nИмя: " + caucasianSheperdDog.name +
                "\nЦвет собаки: " + caucasianSheperdDog.color + "\nРост: " + caucasianSheperdDog.height +
                "\nПрожито лет жизни: " + caucasianSheperdDog.years
                + "\nПрожито месяцев жизни: " + caucasianSheperdDog.months);
        System.out.println();
        System.out.println("3. Тибетский мастифф.\nИмя: " + tibetanMastiff.name +
                "\nЦвет собаки: " + tibetanMastiff.color + "\nРост: " + tibetanMastiff.height +
                "\nПрожито лет жизни: " + tibetanMastiff.years +
                "\nПрожито месяцев жизни: " + tibetanMastiff.months);

        Product XiaomiRedmiNote8 = new Product();
        XiaomiRedmiNote8.name = "Xiaomi Redmi Note 8";
        XiaomiRedmiNote8.priceKGS = 12000;
        XiaomiRedmiNote8.priceUSD = 140;
        System.out.println("\nПервый товар:\nНаименование продукта: " + XiaomiRedmiNote8.name +
                ".\nЦена в сомах: " + XiaomiRedmiNote8.priceKGS + ".\nЦена в долларах: " +
                XiaomiRedmiNote8.priceUSD + ".\n");
        Product Airpods2 = new Product();
        Airpods2.name = "Airpods 2";
        Airpods2.priceKGS = 3150;
        Airpods2.priceUSD = 37;
        System.out.println("Первый товар:\nНаименование продукта: " + Airpods2.name +
                ".\nЦена в сомах: " + Airpods2.priceKGS + ".\nЦена в долларах: " +
                Airpods2.priceUSD + ".\n");
    }

}
