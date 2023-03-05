import java.util.ArrayList;

public class Garaje {


        private double precioCambioRueda;
        private int capacidadMaxima;
        private int numVehiculosActuales = 0;
        private ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        public Garaje(double precioCambioRueda, int capacidadMaxima) {
            this.precioCambioRueda = precioCambioRueda;
            this.capacidadMaxima = capacidadMaxima;
        }

        public boolean ingresarVehiculo(Vehiculo vehiculo) {
            if (numVehiculosActuales < capacidadMaxima) {
                listaVehiculos.add(vehiculo);
                numVehiculosActuales++;
                return true;
            }
            return false;
        }

        public boolean retirarVehiculo(Vehiculo vehiculo) {
            if (listaVehiculos.contains(vehiculo)) {
                listaVehiculos.remove(vehiculo);
                numVehiculosActuales--;
                return true;
            }
            return false;
        }

        public int getNumVehiculosActuales() {
            return numVehiculosActuales;
        }

        public double getPrecioCambioRueda() {
            return precioCambioRueda;
        }

        public double getPrecioCambioRuedasTotal() {
            return precioCambioRueda * numVehiculosActuales * 4;
        }

        public double getKilometrajeMedio() {
            double kilometrajeTotal = 0;
            for (Vehiculo v : listaVehiculos) {
                kilometrajeTotal += v.getKilometraje();
            }
            return kilometrajeTotal / numVehiculosActuales;
        }

        public void imprimirInformacionGaraje() {
            System.out.println("Información del garaje:");
            System.out.println("Precio de cambio de rueda: " + precioCambioRueda);
            System.out.println("Capacidad máxima: " + capacidadMaxima);
            System.out.println("Vehículos actuales: " + numVehiculosActuales);
            System.out.println("Precio de cambio de ruedas total: " + getPrecioCambioRuedasTotal());
            System.out.println("Kilometraje medio: " + getKilometrajeMedio());
        }

        public void imprimirInformacionVehiculos() {
            System.out.println("Información de los vehículos:");
            for (Vehiculo v : listaVehiculos) {
                if (v instanceof Coche) {
                    Coche c = (Coche) v;
                    System.out.println("Coche - Marca: " + c.getMarca() + ", Kilometraje: " + c.getKilometraje() + ", Número de puertas: " + c.getNumPuertas());
                } else if (v instanceof Moto) {
                    Moto m = (Moto) v;
                    System.out.println("Moto - Marca: " + m.getMarca() + ", Kilometraje: " + m.getKilometraje() + ", Cilindrada: " + m.getCilindrada());
                }
            }
        }
    }


