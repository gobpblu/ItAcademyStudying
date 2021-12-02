public class Main {
    public static void main(String[] args) {

        PullOutShelf[] pullOutFreezerShelves = new PullOutShelf[3];
        String[] pullOutShelfProducts1 = {"Мясо", "Рыба"};
        String[] pullOutShelfProducts2 = {};
        String[] pullOutShelfProducts3 = {"Вишня", "Клубника", "Абрикос"};
        pullOutFreezerShelves[0] = new PullOutShelf(pullOutShelfProducts1);
        pullOutFreezerShelves[1] = new PullOutShelf(pullOutShelfProducts2);
        pullOutFreezerShelves[2] = new PullOutShelf(pullOutShelfProducts3);

        Freezer freezer = new Freezer(pullOutFreezerShelves);

        PullOutShelf[] pullOutRefrigeratedCabinetShelves = new PullOutShelf[2];
        String[] pullOutShelfProducts4 = new String[] {"Банка малинового варенья", "Банка клубничного варенья"};
        String[] pullOutShelfProducts5 = new String[] {"Огурцы", "Помидоры"};
        pullOutRefrigeratedCabinetShelves[0] = new PullOutShelf(pullOutShelfProducts4);
        pullOutRefrigeratedCabinetShelves[1] = new PullOutShelf(pullOutShelfProducts5);

        StaticShelf[] staticShelves = new StaticShelf[4];
        String[] staticShelfProducts1 = new String[] {"Рисовая каша"};
        String[] staticShelfProducts2 = new String[] {"Суп", "Пюре"};
        String[] staticShelfProducts3 = new String[] {"Колбаса", "Сыр", "Масло"};
        String[] staticShelfProducts4 = new String[] {};
        staticShelves[0] = new StaticShelf(staticShelfProducts1);
        staticShelves[1] = new StaticShelf(staticShelfProducts2);
        staticShelves[2] = new StaticShelf(staticShelfProducts3);
        staticShelves[3] = new StaticShelf(staticShelfProducts4);

        SideShelf[] sideShelves = new SideShelf[3];
        String[] sideShelfProducts1 = new String[] {"Яйца"};
        String[] sideShelfProducts2 = new String[] {"Кефир", "Молоко"};
        String[] sideShelfProducts3 = new String[] {"Горчица"};
        sideShelves[0] = new SideShelf(sideShelfProducts1);
        sideShelves[1] = new SideShelf(sideShelfProducts2);
        sideShelves[2] = new SideShelf(sideShelfProducts3);

        RefrigeratedCabinet refrigeratedCabinet = new RefrigeratedCabinet(pullOutRefrigeratedCabinetShelves,
                staticShelves, sideShelves);

        Fridge fridge = new Fridge(refrigeratedCabinet, freezer, "LG", "GA-B459CESL");
        System.out.println(fridge);
    }
}
