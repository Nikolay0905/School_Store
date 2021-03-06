package menuItems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Pizza extends Product {
    public String size; //small, medium, large
    ArrayList<HashMap<String, Float>> toppings = new ArrayList<>();

    public Pizza(String size){
        //Add basic ingredients
        switch (size) {
            case "Mалка" -> price += 0.5;
            case "Средна" -> price += 1.5;
            case "Голяма" -> price += 2.5;
            default -> {
            }
        }
        ingridients.add("Тесто");
        ingridients.add("Сос");
        initialPrice = 3.00F;
        this.size = size;
        allToppings();
    }

    public void allToppings(){
        HashMap<String, Float> cheeses = new HashMap<>();
        cheeses.put("Моцарела", 1.60F);
        cheeses.put("Пармезан", 3.20F);
        cheeses.put("Ементал", 2.80F);

        HashMap<String, Float> meats = new HashMap<>();
        meats.put("Пеперони",2.80F);
        meats.put("Бекон",3.40F);
        meats.put("Прошуто",2.90F);

        HashMap<String, Float> vegetables = new HashMap<>();
        vegetables.put("Гъби", 1.20F);
        vegetables.put("Чушка", 0.80F);
        vegetables.put("Маслини", 1.80F);

        HashMap<String, Float> others = new HashMap<>();
        others.put("Яйце", 1.00F);
        others.put("Ананас", 1.50F);
        others.put("Сирене", 2.00F);

        toppings.add(cheeses);
        toppings.add(meats);
        toppings.add(vegetables);
        toppings.add(others);

    }

    public void printToppings(){
        for (HashMap<String, Float> map: toppings){
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                System.out.println(entry.getKey()+"  цена: "+entry.getValue() + "лв.");
            }
            System.out.println("---------");
        }
    }

    public float choseToppings(String [] chosenToppings){
        for (int i = 0; i < chosenToppings.length; i++) {
            String [] items = chosenToppings[i].split(" ");
            for (String curItem:items) {
                curItem = curItem.substring(0,1).toUpperCase() +
                        curItem.substring(1).toLowerCase();
                if (toppings.get(i).containsKey(curItem)){
                    price+=toppings.get(i).get(curItem);
                }else {
                    price += 0;
                }
            }
        }
        price += initialPrice;
        return price;
    }
}
