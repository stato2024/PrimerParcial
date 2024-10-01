import Model.Chair;
import Model.Desk;
import Model.Notebook;
import Model.Printer;
import Service.ServiceInput;

public class Main {
    public static void main(String[] args) {

        ServiceInput serviceInput = new ServiceInput();


        Chair chair = new Chair(1, "Silla de Oficina", 150.0, 10, "Ergonomica", true);
        Desk desk = new Desk(2, "Escritorio Moderno", 350.0, 5, "OfficePro", 1.2, 0.8);
        Printer printer = new Printer(3, "Impresora Laser", 500.0, 3, "HP", 30);
        Notebook notebook = new Notebook(4, "Notebook Gaming", 1200.0, 2, "Dell", 16);
        Printer printer1 = new Printer(5, "Impresora tonner", 900.0, 3, "Ricoh", 20);

        serviceInput.addInput(chair);
        serviceInput.addInput(desk);
        serviceInput.addInput(printer);
        serviceInput.addInput(printer1);
        serviceInput.addInput(notebook);


        serviceInput.showInputs();

        serviceInput.apllyDiscount(10.0);

        serviceInput.newPrice();
        serviceInput.showInputs();

    }
}
