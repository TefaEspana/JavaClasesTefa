package com.Veterinaria.Animales;

public class Perro {
    //Atributo con encapsulamiento (privados)

    public String nombre;
    private String raza;
    private int edad;
    private double peso;
    private String historiarMedico;

    //constructoers

    public Perro() {
    }
    public Perro(String nombre, String raza, int edad, double peso, String historiarMedico) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.historiarMedico = historiarMedico;
    }

    // Setter y Getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHistoriarMedico() {
        return historiarMedico;
    }

    public void setHistoriarMedico(String historiarMedico) {
        this.historiarMedico = historiarMedico;
    }

    //metodo registro
    public void mostrarFichaRegistro(){
        System.out.println("FICHA DE REGISTRO");
        System.out.println("Nombre: "+nombre);
        System.out.println("Raza: "+raza);
        System.out.println("Edad: "+edad+" años");
        System.out.println("Peso: "+peso+" Kg");
        System.out.println("Historial Medico: ("+historiarMedico+")");
    }
}
