public class Guitar extends Instrument implements IPlay, ISell {

    private int numStrings;
    private double buyPrice;
    private double sellPrice;

    public Guitar(String material, String colour, String type, int numStrings, double buyPrice, double sellPrice) {
        super(material, colour, type);
        this.numStrings = numStrings;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String play(){
        return "Strum, strum";
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public int getNumStrings() {
        return numStrings;
    }



    public double calculateMarkUp(){
        return sellPrice - buyPrice;
    }

}
