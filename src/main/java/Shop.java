import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStockItem(ISell item){
        stock.add(item);
    }

    public void removeStockItem(ISell item){
        stock.remove(item);
    }
}
