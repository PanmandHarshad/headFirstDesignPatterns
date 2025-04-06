package chapter9.iterator.menu;

import chapter9.iterator.DinerMenuIterator;

import java.util.Iterator;

public class DinerMenu implements Menu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "Fake bacon with lettuce & tomato", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato", false, 2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Menu is full!");
            return;
        }
        menuItems[numberOfItems++] = new MenuItem(name, description, vegetarian, price);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
