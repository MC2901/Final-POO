//Clase Hija Moto
public class Moto extends Vehiculo {
    private double cilindrada;
    public Moto(String marca, double kilometraje, double cilindrada) {
        super(marca, kilometraje);
        this.cilindrada = cilindrada;
    }
    public double getCilindrada() {
        return cilindrada;
    }
}