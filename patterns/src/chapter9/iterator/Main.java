package chapter9.iterator;

import chapter9.iterator.menu.DinerMenu;
import chapter9.iterator.menu.PancakeHouseMenu;

public class Main {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
