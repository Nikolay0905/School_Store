package Dialogs;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientDialog {
    public Scanner scan = new Scanner(System.in);

    public void chooseLocation() {
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<String []> restaurants = new ArrayList<>();

        //Примерни стойности, защото нямаме достъп до базата
        cities.add("София");
        cities.add("Пловдив");
        cities.add("Правец");
        cities.add("Варна");

        System.out.print("Моля изберете град. ");
        for (String city : cities) {
            System.out.printf("[%s] ", city);
        }
        System.out.println();
        String city = scan.nextLine();
        city = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();

        restaurants.add(new String[]{"Ресторант 1","ул.'Перуша' 4"});
        restaurants.add(new String[]{"Ресторант 2","ул.'Перуша' 4"});
        restaurants.add(new String[]{"Ресторант 3","ул.'Перуша' 4"});
        System.out.println("Нашите ресторанти в "+ city );
        for (String[] res : restaurants){
            System.out.println(res[0] + "| адрес: " + res[1]);
        }
        System.out.println("Моля изберете ресторант");
        String restaurant = scan.nextLine();
        System.out.println("Добре дошли в " + restaurant);

        System.out.println("Нашето меню ");

        System.out.println("------------------------------");
        System.out.println("| Бургери | Пици | Палачинки |");
        System.out.println("------------------------------");

        System.out.println("Каква е вашата поръчка?");
        String order = scan.nextLine();

        if (order.equalsIgnoreCase("Бургери")){
            //to do
        }else if(order.equalsIgnoreCase("Пици")){
            PizzaDialog dialog = new PizzaDialog();
            dialog.choosePizza();
        }else if(order.equalsIgnoreCase("Палачинки")){
            PancakesDialog dialog = new PancakesDialog();
            dialog.choosePancake();
        }else{
            System.out.println("Съжаляваме, но не предлагаме този продукт.");
        }

    }
}
