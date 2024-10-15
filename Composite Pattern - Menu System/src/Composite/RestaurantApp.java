package Composite;

public class RestaurantApp {
    public static void main(String[] args) {
        // Create menu components
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");

        // Create the composite menu that contains all other menus
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        // Add the sub-menus to the composite menu
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // Add menu items to the pancake house menu
        pancakeHouseMenu.add(new MenuItem("Pancake", "Delicious pancake", 2.99));

        // Add menu items to the diner menu
        dinerMenu.add(new MenuItem("Burger", "Tasty beef burger", 5.99));

        // Add menu items to the cafe menu
        cafeMenu.add(new MenuItem("Coffee", "Hot brewed coffee", 1.99));

        // Print all menus
        allMenus.print();
    }
}
