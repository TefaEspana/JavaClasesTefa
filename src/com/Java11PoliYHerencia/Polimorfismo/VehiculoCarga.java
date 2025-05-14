package com.Java11PoliYHerencia.Polimorfismo;

public class VehiculoCarga extends Vehiculo{
    private int cargaMax;

    public VehiculoCarga() {
    }

    public VehiculoCarga(String marca, String placa, int modelo, int cargaMax) {
        super(marca, placa, modelo);
        this.cargaMax = cargaMax;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    @Override
    public String mostarDatos() {
        return super.mostarDatos()+"\nCapacidad Max de carga: "+cargaMax;
    }
}
