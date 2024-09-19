package Model;

public class Notebook extends Input {

    private Integer memory;

    public Notebook(Integer id, String name, Double price, Integer stock, String brand, Integer memory) {
        super(id, name, price, stock, brand, TypeInput.EQUIPO_INFORMATICO);
        this.memory = memory;
    }


    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }


    @Override
    public Double calculatePrice(Double percentage) {
        return getPrice() * percentage;
    }

    @Override
    public String toString() {
        return super.toString() + "Notebook{" +
                "memory=" + memory +
                '}';
    }
}
