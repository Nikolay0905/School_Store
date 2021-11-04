package Dialogs;

import menuItems.Burger;

import java.util.Scanner;

public class BurgerDialog {
    public Scanner scan = new Scanner(System.in);
    public void  chooseBurger() {
        System.out.println("Какъв бургер бихте поръчал [Chicken Burger] [Pork Burger] [Beef Burger] " +
                "[Filet-O-Fish Burger] [Cheese Burger] [Double cheese Burger]");
        String type = scan.nextLine();
        Burger burgers = new Burger();
        burgers.printTopings();

    }
}
