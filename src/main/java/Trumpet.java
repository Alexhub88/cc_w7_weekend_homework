public class Trumpet extends Instrument implements IPlay, ISell {

    private int valves;
    private double buyPrice;
    private double sellPrice;

    public Trumpet(String material, String colour, String type, int valves, double buyPrice, double sellPrice) {
        super(material, colour, type);
        this.valves = valves;
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
        return "Wah wah wah!";
    }

    public int getValves() {
        return valves;
    }

    public double calculateMarkUp(){
        return sellPrice - buyPrice;
    }

}
