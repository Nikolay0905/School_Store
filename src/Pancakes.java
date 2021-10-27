public class Pancakes {
    private ArrayList<Pancakes> pancakes = new ArrayList<>();
    private float initialPrice;
    private int stock;


    public Pancakes(float initialPrice, int stock){
        this.initialPrice = initialPrice;
        this.stock = stock;
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
