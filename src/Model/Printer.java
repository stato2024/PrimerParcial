package Model;

import Interface.Offer;

public class Printer extends Input implements Offer {

    private Integer impressionsPerMinute;

    public Printer(Integer id, String name, Double price, Integer stock, String brand, Integer impressionsPerMinute) {
        super(id, name, price, stock, brand, TypeInput.EQUIPO_INFORMATICO);
        this.impressionsPerMinute = impressionsPerMinute;
    }

    public Integer getImpressionsPerMinute() {
        return impressionsPerMinute;
    }

    public void setImpressionsPerMinute(Integer impressionsPerMinute) {
        this.impressionsPerMinute = impressionsPerMinute;
    }


    @Override
    public Double calculatePrice(Double percentage) {
        return getPrice() * percentage;
    }

    @Override
    public String toString() {
        return super.toString() + "Printer{" +
                "impressionsPerMinute=" + impressionsPerMinute +
                '}';
    }

    @Override
    public Double apllyDiscount(Double percentage) {
        return getPrice() * (1 - percentage / 100);
    }
}
