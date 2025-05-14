package com.Java11PoliYHerencia.Abstractas;

public class Circulo extends Figura{//extends Figura el ser abstracts me obliga a llamar el metodo
    //#2 el atributo de circulo
    private  final double radio;

    //#3 llamar el constructos necesario para el metodo llamado antes
    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    //#1Traer el metodo click derecho implementar Override
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;//Sobre escribo en el metodo
    }

    public void desdeCirculo(){
        System.out.println("Desde el Circulo");
    }
}
