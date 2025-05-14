package com.Java11PoliYHerencia.Polimorfismo;

public class VehiculoDeportivo extends Vehiculo{
    private int hP;

    public VehiculoDeportivo() {
    }

    public VehiculoDeportivo(String marca, String placa, int modelo, int hP) {
        super(marca, placa, modelo);
        this.hP = hP;
    }

    public int gethP() {
        return hP;
    }

    public void sethP(int hP) {
        this.hP = hP;
    }

    @Override
    public String mostarDatos() {
        return super.mostarDatos()+"\nCaballos de fuerza: "+hP;
    }
}
