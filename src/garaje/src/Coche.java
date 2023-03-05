package garaje.src;

//Clase Hija Coche
public class Coche extends Vehiculo {
    private int numPuertas;
    public Coche(String marca, double kilometraje, int numPuertas) {
        super(marca, kilometraje);
        this.numPuertas = numPuertas;
    }
    public int getNumPuertas() {
        return numPuertas;
    }
}