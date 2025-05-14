package com.Java11PoliYHerencia.EjeVehiculo;

public class Coche extends Vehiculo{//me dice quemi papa es Vehiculo
    int numeroPuertas;

    public Coche() {
    }

    public Coche(String marca, String color, int modelo, int numeroPuertas) {
        super(marca, color, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void mostrarNumeroPuertas() {
        System.out.println("Número de puertas: " + numeroPuertas);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        mostrarNumeroPuertas();
    }
}
