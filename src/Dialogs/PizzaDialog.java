package Dialogs;

import java.util.Scanner;
import menuItems.Pizza;

public class PizzaDialog {
    public Scanner scan = new Scanner(System.in);
    public void choosePizza(){
        System.out.println("Kаква пица искате [Малка] [Средна] [Голяма]");
        String size = scan.nextLine();
        Pizza pizza = new Pizza(size);
        pizza.printTopings();
    }
}
