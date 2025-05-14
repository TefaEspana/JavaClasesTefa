package com.Java11PoliYHerencia.Abstractas;

public abstract class Figura {//palabra reservada abstract
    protected double x;
    protected double y;

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //No tiene implemantacion en esta class
    public abstract double calcularArea();//solo se nombre no tiene {}

    public void verDatos (){
        System.out.println("Salgo desde Clase Abstracta");
    }
}
