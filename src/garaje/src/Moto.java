package garaje.src;

//Clase Hija Moto
public class Moto extends Vehiculo {
    private double cilindrada;

    public Moto(String marca, double kilometraje, String matriculaCliente, Client cliente, double cilindrada) {
        super(marca, kilometraje, matriculaCliente, cliente);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }
}