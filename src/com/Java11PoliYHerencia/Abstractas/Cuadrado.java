package com.Java11PoliYHerencia.Abstractas;

public class Cuadrado extends Figura{
    private double lado;

    //#2
    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    //#1
    @Override
    public double calcularArea() {
        return lado * lado; //sobre escribe
    }
}
