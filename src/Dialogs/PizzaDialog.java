package Dialogs;

import java.util.Scanner;
import menuItems.Pizza;

public class PizzaDialog {
    public Scanner scan = new Scanner(System.in);
    public void choosePizza() {
        while (true) {
            System.out.println("Kаква пица искате [Малка] [Средна] [Голяма]");
            String size = scan.nextLine();
            Pizza pizza = new Pizza(size);
            pizza.printToppings();
            System.out.println("Моля изберете добавки за вашата пица.");
            String[] toppings = new String[4];
            System.out.println("Моля изберете кашкавал: ");
            toppings[0] = scan.nextLine();
            System.out.println("Моля изберете месо: ");
            toppings[1] = scan.nextLine();
            System.out.println("Моля изберете зеленчуци: ");
            toppings[2] = scan.nextLine();
            System.out.println("Моля изберете други добавки: ");
            toppings[3] = scan.nextLine();
            System.out.println("Цената за вашата пица е бъде: " + pizza.choseToppings(toppings));
            System.out.println("Това ли ще е вашата поръчка?");
            String ans = scan.next();
            ans.toLowerCase();
            if (ans.equalsIgnoreCase("да")){
                break;
            }else{
                System.out.println("Искате ли да поръчате още една пица?");
                ans = scan.next();
                ans.toLowerCase();
                if (ans.contains("не")){
                    System.out.println("Искате ли да поръчате нещо друго oт нашето меню?");
                    ans = scan.next();
                    ans.toLowerCase();
                    if(ans.contains("да")){
                        ClientDialog dialog = new ClientDialog();
                        dialog.chooseProduct();
                    }
                    break;
                }
                if (ans.contains("да")){
                    choosePizza();
                }
            }
        }
    }
}
