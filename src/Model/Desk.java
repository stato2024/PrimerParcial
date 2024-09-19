package Model;

public class Desk extends Input {
    private Double height;
    private Double weight;

    public Desk(Integer id, String name, Double price, Integer stock, String brand, Double height, Double weight) {
        super(id, name, price, stock, brand, TypeInput.MUEBLE);
        this.height = height;
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }


    @Override
    public Double calculatePrice(Double percentage) {
        return getPrice() * percentage;
    }

    @Override
    public String toString() {
        return super.toString() + "Desk{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
