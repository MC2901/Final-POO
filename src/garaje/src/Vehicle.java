package garaje.src;

public class Vehicle {
    private String marca; // Atributo para almacenar la marca del vehículo
    private double kilometraje; // Atributo para almacenar el kilometraje del vehículo
    private String matriculaCliente; // Atributo para almacenar la matrícula del cliente del vehículo
    private Client cliente; // Atributo para almacenar el cliente del vehículo

    // Constructor de la clase Vehicle
    public Vehicle(String marca, double kilometraje, String matriculaCliente, Client cliente) {
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.matriculaCliente = matriculaCliente;
        this.cliente = cliente;
    }

    // Método para obtener la marca del vehículo
    public String getMarca() {
        return marca;
    }

    // Método para obtener el kilometraje del vehículo
    public double getKilometraje() {
        return kilometraje;
    }

    // Método para obtener la matrícula del cliente del vehículo
    public String getMatriculaCliente() {
        return matriculaCliente;
    }

    // Método para establecer la matrícula del cliente del vehículo
    public void setMatriculaCliente(String matriculaCliente) {
        this.matriculaCliente = matriculaCliente;
    }

    // Método para obtener el cliente del vehículo
    public Client getCliente() {
        return cliente;
    }

    // Método para establecer el cliente del vehículo
    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }
}
