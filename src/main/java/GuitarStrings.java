public class GuitarStrings implements ISell {

    private String description;
    private double buyPrice;
    private double sellPrice;

    public GuitarStrings(String description, double buyPrice, double sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkUp(){
        return sellPrice - buyPrice;
    }
}

