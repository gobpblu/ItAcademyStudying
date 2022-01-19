package com.company.arraylist.listspractice;

public class Bear {
    Integer years;
    int weight;

    public Bear(int years, int weight) {
        this.years = years;
        this.weight = weight;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        else if (obj instanceof Bear) {
            return ((Bear) obj).years.equals(this.years) && ((Bear) obj).weight == this.weight;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bear{" +
                "years=" + years +
                ", weight=" + weight +
                '}';
    }
}
