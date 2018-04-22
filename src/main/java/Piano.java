public class Piano extends Instrument implements IPlay, ISell {

    private int keys;
    private double buyPrice;
    private double sellPrice;

    public Piano(String material, String colour, String type, int keys, double buyPrice, double sellPrice) {
        super(material, colour, type);
        this.keys = keys;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String play(){
        return "Plink, plink";
    }

    public int getKeys() {
        return keys;
    }

    public double calculateMarkUp(){
        return sellPrice - buyPrice;
    }
}
