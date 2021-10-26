public class Pancakes {
    private String ingridients;
    private float initialPrice;
    private int stock;


    public Pancakes(String ingridients, float initialPrice, int stock){
        this.ingridients = ingridients;
        this.initialPrice = initialPrice;
        this.stock = stock;
    }


    public String getIngridients() {
        return ingridients;
    }

    public void setIngridients(String ingridients) {
        this.ingridients = ingridients;
    }

    public float getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(float initialPrice) {
        this.initialPrice = initialPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
