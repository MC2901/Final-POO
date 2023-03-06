package garaje.src;

//Clase Hija Coche
public class Car extends Vehicle {
    // Atributo privado: cantidad de puertas del coche
    private int doorCant;

    // Constructor
    public Car(String marca, double kilometraje, String matriculaCliente, Client cliente, int doorCant) {
        super(marca, kilometraje, matriculaCliente, cliente); // Llamada al constructor de la Clase Padre
        this.doorCant = doorCant; // Asignación del valor del atributo privado "doorCant"
    }

    // Método público: devuelve la cantidad de puertas del coche
    public int getNumPuertas() {
        return doorCant;
    }
}