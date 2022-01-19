package Dialogs;

import menuItems.Pancakes;

import java.util.ArrayList;
import java.util.Scanner;

public class PancakesDialog {
    public Scanner scan = new Scanner(System.in);

    public void choosePancake() {
        while (true) {
            System.out.println("Това са добавките ,от които можете да изберете!");
            System.out.println();
            Pancakes pancake = new Pancakes();
            pancake.printTopings();
            System.out.println("Искате ли добавки за вашата палачинка?");
            String[] toppings = new String[4];
            System.out.println("Моля изберете кашкавал: ");
            toppings[0] = scan.nextLine();
            System.out.println("Моля изберете месо: ");
            toppings[1] = scan.nextLine();
            System.out.println("Моля изберете сладко: ");
            toppings[2] = scan.nextLine();
            System.out.println("Моля изберете плодове: ");
            toppings[3] = scan.nextLine();
            System.out.println("Цената за вашата палачинка е бъде: " + pancake.chooseToppings(toppings));
            System.out.println("Това ли ще е вашата поръчка?");
            String ans = scan.next();
            ans.toLowerCase();
            if (ans.equalsIgnoreCase("да")) {
                break;
            } else {
                System.out.println("Искате ли да поръчате още една палачинка?");
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
                    choosePancake();
                }
            }
        }
    }
}
