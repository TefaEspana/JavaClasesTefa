package com.Java11PoliYHerencia.EjeVehiculo;

public class Vehiculo {
    //Declarar atributos
    String marca;
    String color;
    int modelo;
    //Constructures
    public Vehiculo() {
    }

    public Vehiculo(String marca, String color, int modelo) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }
    // Getter y Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    //Metodo
    public void mostrarInformacion(){
        System.out.println("Marca: "+marca);
        System.out.println("Color: "+color);
        System.out.println("Model: "+modelo);
    }
}
