package Model;

import Interface.Offer;

public class Chair extends Input implements Offer {

    private boolean whells;

    public Chair(Integer id, String name, Double price, Integer stock, String brand, boolean whells) {
        super(id, name, price, stock, brand, TypeInput.MUEBLE);
        this.whells = whells;
    }


    public boolean isWhells() {
        return whells;
    }

    public void setWhells(boolean whells) {
        this.whells = whells;
    }


    @Override
    public Double calculatePrice(Double percentage) {
        return getPrice() * percentage;
    }

    @Override
    public String toString() {
        return super.toString() + "Chair{" +
                "whells=" + whells +
                '}';
    }

    @Override
    public Double apllyDiscount(Double percentage) {
        return getPrice() * (1 - percentage / 100);
    }
}
