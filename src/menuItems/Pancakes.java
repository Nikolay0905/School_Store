package menuItems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pancakes extends Product {
    //    public String type;
    ArrayList<HashMap<String, Float>> toppings = new ArrayList<>();

    public Pancakes() {
        ingridients.add("Палачинка");
        initialPrice = 2.00F;
//     this.type = this.type;
        Toppings();
    }

    public void Toppings() {
        HashMap<String, Float> sweetTopping = new HashMap<>();
        sweetTopping.put("Течен шоколад", 1.30F);
        sweetTopping.put("Сладко от боровинки", 1.10F);
        sweetTopping.put("Сладко от малини", 1.00F);

        HashMap<String, Float> cheeseTopping = new HashMap<>();
        cheeseTopping.put("Кашкавал", 0.90F);
        cheeseTopping.put("Сирене", 0.80F);

        HashMap<String, Float> meatTopping = new HashMap<>();
        meatTopping.put("Шунка", 1.00F);
        meatTopping.put("Бекон", 1.00F);

        HashMap<String, Float> fruitTopping = new HashMap<>();
        fruitTopping.put("Ягоди", 0.80F);
        fruitTopping.put("Банан", 0.50F);

        toppings.add(sweetTopping);
        toppings.add(cheeseTopping);
        toppings.add(meatTopping);
        toppings.add(fruitTopping);

    }

    public void printTopings() {
        for (HashMap<String, Float> map : toppings) {
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "  цена: " + entry.getValue() + "лв.");
            }
            System.out.println("---------");
        }
    }

    public float chooseToppings(String[] chоsenToppings) {

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
            price += initialPrice;
        }
        return price;
    }
 }


