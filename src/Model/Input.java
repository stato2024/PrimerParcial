package Model;

public abstract class Input {
    private Integer id;
    private String name;
    private Double price;
    private Integer stock;
    private String brand;
    private TypeInput typeInput;

    public Input(Integer id, String name, Double price, Integer stock, String brand, TypeInput typeInput) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.brand = brand;
        this.typeInput = typeInput;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public TypeInput getTypeInput() {
        return typeInput;
    }

    public void setTypeInput(TypeInput typeInput) {
        this.typeInput = typeInput;
    }

    public abstract Double calculatePrice(Double percentage);

    @Override
    public String toString() {
        return "Input{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", brand='" + brand + '\'' +
                ", typeInput=" + typeInput +
                '}';
    }
}
