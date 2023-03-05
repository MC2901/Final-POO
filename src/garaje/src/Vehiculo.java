package garaje.src;

import garaje.src.Client;

public class Vehiculo {
    private String marca;
    private double kilometraje;
    private String matriculaCliente;
    private Client cliente;

    public Vehiculo(String marca, double kilometraje, String matriculaCliente, Client cliente) {
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.matriculaCliente = matriculaCliente;
        this.cliente = cliente;
    }

    public String getMarca() {
        return marca;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public String getMatriculaCliente() {
        return matriculaCliente;
    }

    public void setMatriculaCliente(String matriculaCliente) {
        this.matriculaCliente = matriculaCliente;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }
}