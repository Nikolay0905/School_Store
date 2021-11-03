package Dialogs;

import menuItems.Pancakes;

import java.util.Scanner;

public class PancakesDialog{
    public Scanner scan = new Scanner(System.in);
    public void  choosePancake(){
        System.out.println("Kаква палачинка искате [Солена] [Сладка]?");
        String type = scan.nextLine();
        Pancakes pancake = new Pancakes();
        pancake.printTopings();

    }

    public void choosenToppings(){
        System.out.println();
        System.out.println("Моля изберете топинги : ");
        String type = scan.nextLine();
//        Pancakes toppings = new Pancakes();
//        toppings.printTopings();
        System.out.println("Избраните от Вас топинги са : " + type);
    }
}
