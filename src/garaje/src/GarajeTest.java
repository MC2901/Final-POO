package garaje.src;

import java.util.ArrayList;

public class GarajeTest {
    public static void main(String[] args) {
        ArrayList<Client> clientes = new ArrayList<>();

// Creamos los clientes y los agregamos al ArrayList
        Client cliente1 = new Client("Matias", "AF005333", "River Plate");
        clientes.add(cliente1);

        Client cliente2 = new Client("Lucas", "AF005334", "Gimnasia y Esgrima");
        clientes.add(cliente2);

        Client cliente3 = new Client("Juan", "AF005234", "Boca Juniors");
        clientes.add(cliente3);

        Client cliente4 = new Client("Gandolfo", "AF005336", "Platense");
        clientes.add(cliente4);

        Garaje garaje = new Garaje(500, 5);
        Car car1 = new Car("Ford", 20000, "AF005333", cliente1,4 );
        Car car2 = new Car("BMW", 15000, "BD000123", cliente2, 3);
        Moto moto1 = new Moto("Yamaha", 10000, "CC002345", cliente3, 700);
        Moto moto2 = new Moto("Honda", 8000, "AF004342", cliente4, 1200);

        System.out.println("\n\n\n\n\n____//_]|________         ____//__][__][___|     ____//__][______||\n" +
                "(o _ |  -|   _  o|        (o  _|  -|     _ o|    (o _ |  -|   _   o|\n" +
                " `(_)-------(_)--'         `-(_)--------(_)-'     `(_)-------(_)---'");

        garaje.ingresarVehiculo(car1, cliente1);
        garaje.ingresarVehiculo(car2, cliente2);
        garaje.ingresarVehiculo(moto1, cliente3);
        garaje.ingresarVehiculo(moto2, cliente4);
    }
}
