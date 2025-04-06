package chapter9.composite;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem(
                "Pasta", "Spaghetti with Marinara Sauce", true, 3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie", "Apple pie with a flaky crust", true, 1.59));

        pancakeHouseMenu.add(new MenuItem(
                "Pancakes", "Pancakes with syrup", true, 2.99));

        cafeMenu.add(new MenuItem(
                "Burger", "Beef burger with fries", false, 5.99));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
