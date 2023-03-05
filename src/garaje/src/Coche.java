package garaje.src;

//Clase Hija Coche
public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, double kilometraje, String matriculaCliente, Client cliente, int numPuertas) {
        super(marca, kilometraje, matriculaCliente, cliente);
        this.numPuertas = numPuertas;

    }

    public int getNumPuertas() {
        return numPuertas;
    }
}