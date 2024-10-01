package Service;

import Interface.Offer;
import Model.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ServiceInput {

    private List<Input> inventary;

    public ServiceInput() {
        this.inventary = new ArrayList<>();
    }

    public void addInput(Input input) {
        inventary.add(input);
    }

    public void showInputs() {
        for (Input insumo : inventary) {
            System.out.println(insumo);
        }
    }


    public void apllyDiscount(double percentage) {
        for (Input input : inventary) {
            if (input instanceof Chair) {
                double priceWithDiscount =  ((Chair) input).apllyDiscount(percentage);
                System.out.println("Descuento aplicado a " + input.getName() + ": " + priceWithDiscount);
            }
            if (input instanceof Printer){
                double priceWithDiscount =  ((Printer) input).apllyDiscount(percentage);
                System.out.println("Descuento aplicado a " + input.getName() + ": " + priceWithDiscount);

            }
        }
    }

    public void newPrice() {
        DecimalFormat df = new DecimalFormat("#.00");
        for (Input i : inventary) {
            Double percentage = 0d;
            Double aux = 0d;
            if (i instanceof Printer) {
                percentage = 1.15;
                aux = i.getPrice();
            }
            if (i instanceof Notebook) {
                percentage = 1.20;
                aux = i.getPrice();
            }
            if (i instanceof Desk) {
                percentage = 1.10;
                aux = i.getPrice();
            }
            if (i instanceof Chair) {
                percentage = 1.05;
                aux = i.getPrice();
            }
            i.setPrice(i.calculatePrice(percentage));
            System.out.println("Precio sin aumento : " + aux + " || " + "Precio con aumento : " + df.format(i.getPrice()) + " Producto: " + i.getName() + " Marca: " + i.getBrand());
        }
    }


}
