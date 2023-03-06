package garaje.src;

//Clase Hija Moto
public class Moto extends Vehicle {
    // Atributo
    private double cilindrada;

    // Constructor
    public Moto(String marca, double kilometraje, String matriculaCliente, Client cliente, double cilindrada) {
        // Llamada al constructor de la clase padre para inicializar los atributos de Vehicle
        super(marca, kilometraje, matriculaCliente, cliente);
        // Inicialización del atributo específico de Moto
        this.cilindrada = cilindrada;
    }

    // Método getter para el atributo cilindrada
    public double getCilindrada() {
        return cilindrada;
    }
}