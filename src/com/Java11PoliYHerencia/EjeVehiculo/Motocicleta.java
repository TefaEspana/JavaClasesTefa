package com.Java11PoliYHerencia.EjeVehiculo;

public class Motocicleta extends Vehiculo{
    String tipo;

    public Motocicleta() {
    }

    public Motocicleta(String marca, String color, int modelo, String tipo) {
        super(marca, color, modelo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarTipo() {
        System.out.println("Tipo de motocicleta: " + tipo);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        mostrarTipo();
    }
}
