package menuItems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Burger extends Product{

    ArrayList<HashMap<String, Float>> toppings = new ArrayList<>();

    public Burger(){
        ingridients.add("Питка");
        ingridients.add("Кюфтенце");
        ingridients.add("Пържени Картофки");
        initialPrice = 3.00F;
    }


    public void allToppings(){
        HashMap<String, Float> cheeses = new HashMap<>();
        cheeses.put("Моцарела", 1.60F);;
        cheeses.put("Топено сирене", 2.80F);

        HashMap<String, Float> meats = new HashMap<>();
        meats.put("Екстра Пилешко",2.80F);
        meats.put("Екстра Свинско",2.90F);
        meats.put("Екстра Телешко",3.90F);

        HashMap<String, Float> vegetables = new HashMap<>();
        vegetables.put("Гъби", 1.20F);
        vegetables.put("Чушка", 0.80F);
        vegetables.put("Маслини", 1.80F);

        HashMap<String, Float> others = new HashMap<>();
        others.put("Яйце", 1.00F);

        toppings.add(cheeses);
        toppings.add(meats);
        toppings.add(vegetables);
        toppings.add(others);

    }

    public void printTopings(){
        for (HashMap<String, Float> map: toppings){
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                System.out.println(entry.getKey()+"  цена: "+entry.getValue() + "лв.");
            }
            System.out.println("---------");
        }
    }

    public float choseToppings(String[] chоsenToppings) {

        for (int i = 0; i < chоsenToppings.length; i++) {
            try {
                String[] items = chоsenToppings[i].split(" ");
                for (String curItem : items) {
                    curItem = curItem.substring(0, 1).toUpperCase() +
                            curItem.substring(1).toLowerCase();
                    if (toppings.get(i).containsKey(curItem)) {
                        price += toppings.get(i).get(curItem);
                    } else {
                        price += 0;
                    }
                }
            } catch (Exception e) {

            }
        }
        price += initialPrice;
        return price;
    }
}

