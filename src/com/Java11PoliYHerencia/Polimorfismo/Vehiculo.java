package com.Java11PoliYHerencia.Polimorfismo;

public class Vehiculo {
    protected String marca;
    protected String placa;
    protected int modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String placa, int modelo) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String mostarDatos(){
        return "Marca: "+marca+ " Placa: "+placa+" Modelo: "+modelo;
    }
}
