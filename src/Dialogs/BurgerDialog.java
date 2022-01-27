package Dialogs;

import menuItems.Burger;
import java.util.Scanner;

public class BurgerDialog {
    public Scanner scan = new Scanner(System.in);
    public void chooseBurger() {
        while (true) {
        System.out.println("Моля добавете вашите добавки за бургера: ");
        Burger burgers = new Burger();
        burgers.printTopings();
        String[] toppings = new String[4];
        System.out.println("Моля изберете кашкавал: ");
        toppings[0] = scan.nextLine();
        System.out.println("Моля изберете месо: ");
        toppings[1] = scan.nextLine();
        System.out.println("Моля изберете зеленчуци: ");
        toppings[2] = scan.nextLine();
        System.out.println("Моля изберете други добавки: ");
        toppings[3] = scan.nextLine();
        System.out.println("Цената за вашия бургер е бъде: " + burgers.choseToppings(toppings));
        System.out.println("Това ли ще е вашата поръчка?");
        String ans = scan.next();
        ans.toLowerCase();
        if (ans.equalsIgnoreCase("да")) {
            break;
        } else {
            System.out.println("Искате ли да поръчате още един бургер?");
            ans = scan.next();
            ans.toLowerCase();
            if (ans.contains("не")) {
                System.out.println("Искате ли да поръчате нещо друго oт нашето меню?");
                ans = scan.next();
                ans.toLowerCase();
                if (ans.contains("да")) {
                    ClientDialog dialog = new ClientDialog();
                    dialog.chooseProduct();
                }
                break;
            }
            if (ans.contains("да")) {
                chooseBurger();
            }
        }
    }
 }
}

