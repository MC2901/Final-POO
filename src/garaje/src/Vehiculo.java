package garaje.src;

//Clase Padre Vehiculo
public class Vehiculo {
    private String marca;
    private double kilometraje;
    public Vehiculo(String marca, double kilometraje) {
        this.marca = marca;
        this.kilometraje = kilometraje;
    }
    public String getMarca() {
        return marca;
    }
    public double getKilometraje() {
        return kilometraje;
    }
}

