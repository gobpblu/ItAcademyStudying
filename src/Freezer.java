public class Freezer {
    PullOutShelf[] pullOutShelves = new PullOutShelf[3];
    int pullOutShelvesCounter = 0;

    public Freezer(PullOutShelf[] pullOutShelf) {
        for (int i = 0; i < pullOutShelves.length; i++) {
            this.pullOutShelves[i] = pullOutShelf[i];
            pullOutShelvesCounter++;
        }
    }

    public Freezer() {

    }

    public void setPullOutShelves(PullOutShelf[] pullOutShelves) {
        this.pullOutShelves = pullOutShelves;
        pullOutShelvesCounter++;
    }

    public PullOutShelf[] getPullOutShelves() {
        return pullOutShelves;
    }

    @Override
    public String toString() {
        String message = "\nИнформация о морозильнике:\n" +
                "Количество непустых выдвижных полок: " + pullOutShelvesCounter + "\n";
        for (int i = 0; i < pullOutShelvesCounter; i++) {
            message += "\nИнформация о " + (i+1) + " выдвижной полке:" + "\n";
            message += pullOutShelves[i];
        }
        return message;
    }

}
