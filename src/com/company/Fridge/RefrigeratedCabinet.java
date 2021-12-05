package com.company.Fridge;

public class RefrigeratedCabinet {
    PullOutShelf[] pullOutShelves = new PullOutShelf[2];
    StaticShelf[] staticShelves = new StaticShelf[4];
    SideShelf[] sideShelves = new SideShelf[3];
    int pullOutShelvesCounter = 0;
    int staticShelvesCounter = 0;
    int sideShelvesCounter = 0;

    public RefrigeratedCabinet(PullOutShelf[] pullOutShelf, StaticShelf[] staticShelf, SideShelf[] sideShelf) {
        for (int i = 0; i < pullOutShelves.length; i++) {
            this.pullOutShelves[i] = pullOutShelf[i];
            pullOutShelvesCounter++;
        }
        for (int i = 0; i < staticShelves.length; i++) {
            this.staticShelves[i] = staticShelf[i];
            staticShelvesCounter++;
        }
        for (int i = 0; i < sideShelves.length; i++) {
            this.sideShelves[i] = sideShelf[i];
            sideShelvesCounter++;
        }
    }

    public RefrigeratedCabinet() {

    }

    public void setPullOutShelves(PullOutShelf[] pullOutShelves) {
        this.pullOutShelves = pullOutShelves;
        pullOutShelvesCounter++;
    }

    public void setStaticShelves(StaticShelf[] staticShelves) {
        this.staticShelves = staticShelves;
        staticShelvesCounter++;
    }

    public void setSideShelves(SideShelf[] sideShelves) {
        this.sideShelves = sideShelves;
        sideShelvesCounter++;
    }

    public PullOutShelf[] getPullOutShelves() {
        return pullOutShelves;
    }

    public StaticShelf[] getStaticShelves() {
        return staticShelves;
    }

    public SideShelf[] getSideShelves() {
        return sideShelves;
    }

    @Override
    public String toString() {
        String message = "\nИнформация о холодильном шкафе:\n" +
                "Количество выдвижных полок: " + pullOutShelvesCounter + "\n";
        for (int i = 0; i < pullOutShelvesCounter; i++) {
            message += "\nИнформация о " + (i+1) + " выдвижной полке" + "\n";
            message += pullOutShelves[i];
        }
        message += "\nКоличество статичных полок: " + staticShelvesCounter + "\n";
        for (int i = 0; i < staticShelvesCounter; i++) {
            message += "\nИнформация о " + (i+1) + " статичной полке" + "\n";
            message += staticShelves[i];
        }
        message += "\nКоличество боковых полок: " + sideShelvesCounter + "\n";
        for (int i = 0; i < sideShelvesCounter; i++) {
            message += "\nИнформация о " + (i+1) + " боковой полке" + "\n";
            message += sideShelves[i];
        }
        return message;
    }
}