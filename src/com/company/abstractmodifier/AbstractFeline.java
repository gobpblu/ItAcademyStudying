package com.company.abstractmodifier;

abstract public class AbstractFeline extends AbstractAnimal {
    private int clawNumber;
    private double tailLength;
    private int moustachesNumber;

    public AbstractFeline(String name, double weight, int age, String color, int clawNumber,
                          double tailLength, int moustachesNumber) {
        super(name, weight, age, color);
        this.clawNumber = clawNumber;
        this.tailLength = tailLength;
        this.moustachesNumber = moustachesNumber;
    }

    public int getClawNumber() {
        return clawNumber;
    }

    public void setClawNumber(int clawNumber) {
        this.clawNumber = clawNumber;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public int getMoustachesNumber() {
        return moustachesNumber;
    }

    public void setMoustachesNumber(int moustachesNumber) {
        this.moustachesNumber = moustachesNumber;
    }

    public void sharpenClaws() {
        System.out.println(getName() + " точит когти.");
    }

    public void landingOnFeet() {
        System.out.println(getName() + " приземлился на ноги.");
    }

    public void purr() {
        System.out.println(getName() + " мурлыкает.");
    }

    @Override
    public String toString() {
        return "AbstractFeline{" +
                "clawNumber=" + clawNumber +
                ", tailLength=" + tailLength +
                ", moustachesNumber=" + moustachesNumber +
                '}';
    }
}
