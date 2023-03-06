package garaje.src;

import java.util.ArrayList;

public class Garaje {
    // Declaración de variables de instancia
    private double precioCambioRueda;
    private int capacidadMaxima;
    private int numVehiculosActuales = 0;
    private ArrayList<Vehicle> listaVehicles = new ArrayList<>();

    // Constructor de la clase Garaje
    public Garaje(double precioCambioRueda, int capacidadMaxima) {
        // Inicialización de variables de instancia con valores de argumentos de entrada
        this.precioCambioRueda = precioCambioRueda;
        this.capacidadMaxima = capacidadMaxima;
    }

    // Método para ingresar un vehículo al garaje
    public boolean ingresarVehiculo(Vehicle vehicle, Client cliente) {
        // Verifica si el número de vehículos actuales es menor que la capacidad máxima
        if (numVehiculosActuales < capacidadMaxima) {
            // Asigna al vehículo el cliente correspondiente y lo agrega a la lista de vehículos
            vehicle.setCliente(cliente);
            listaVehicles.add(vehicle);
            // Incrementa el contador de vehículos actuales y devuelve verdadero
            numVehiculosActuales++;
            return true;
        }
        // Si el número de vehículos actuales es igual o mayor que la capacidad máxima, devuelve falso
        return false;
    }

    // Método para retirar un vehículo del garaje
    public boolean retirarVehiculo(Vehicle vehicle) {
        // Verifica si el vehículo está en la lista de vehículos del garaje
        if (listaVehicles.contains(vehicle)) {
            // Remueve el vehículo de la lista y decrementa el contador de vehículos actuales
            listaVehicles.remove(vehicle);
            numVehiculosActuales--;
            return true;
        }
        // Si el vehículo no está en la lista, devuelve falso
        return false;
    }

    // Método para obtener el número de vehículos actuales en el garaje
    public int getNumVehiculosActuales() {
        return numVehiculosActuales;
    }

    // Método para obtener el precio de cambio de rueda del garaje
    public double getPrecioCambioRueda() {
        return precioCambioRueda;
    }

    // Método para obtener el precio total de cambio de ruedas en el garaje
    public double getPrecioCambioRuedasTotal() {
        // Calcula el precio total de cambio de ruedas multiplicando el precio de cambio de rueda por el número de vehículos actuales y por 4 (ya que cada vehículo tiene 4 ruedas)
        return precioCambioRueda * numVehiculosActuales * 4;
    }

    // Método para obtener el kilometraje medio de los vehículos en el garaje
    public double getKilometrajeMedio() {
        // Inicializa la variable para el kilometraje total en 0
        double kilometrajeTotal = 0;
        // Itera sobre la lista de vehículos y suma el kilometraje de cada uno
        for (Vehicle v : listaVehicles) {
            kilometrajeTotal += v.getKilometraje();
        }
        // Calcula el kilometraje medio dividiendo el kilometraje total por el número de vehículos actuales
        return kilometrajeTotal / numVehiculosActuales;
    }

    public void imprimirInformacionGaraje() {
        // Imprime información relevante del garaje
        System.out.println("Información del garaje:");
        System.out.println("Precio de cambio de rueda: " + precioCambioRueda);
        System.out.println("Capacidad máxima: " + capacidadMaxima);
        System.out.println("Vehículos actuales: " + numVehiculosActuales);

        // Imprime el precio total de cambio de ruedas para todos los vehículos del garaje
        System.out.println("Precio de cambio de ruedas total: " + getPrecioCambioRuedasTotal());

        // Imprime el kilometraje medio de todos los vehículos del garaje
        System.out.println("Kilometraje medio: " + getKilometrajeMedio());
    }

    public void imprimirInformacionVehiculos() {
        // Imprime la información de los vehículos del garaje
        System.out.println("Información de los vehículos:");
        for (Vehicle v : listaVehicles) {
            if (v instanceof Car) {
                Car c = (Car) v;
                // Imprime información detallada sobre el coche, incluyendo la marca, kilometraje y número de puertas
                System.out.println("Coche - Marca: " + c.getMarca() + ", Kilometraje: " + c.getKilometraje() + ", Número de puertas: " + c.getNumPuertas());
            } else if (v instanceof Moto) {
                Moto m = (Moto) v;
                // Imprime información detallada sobre la moto, incluyendo la marca, kilometraje y cilindrada
                System.out.println("Moto - Marca: " + m.getMarca() + ", Kilometraje: " + m.getKilometraje() + ", Cilindrada: " + m.getCilindrada());
            }
        }
    }
}
