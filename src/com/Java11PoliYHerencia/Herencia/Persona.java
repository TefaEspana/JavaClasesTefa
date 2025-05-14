package com.Java11PoliYHerencia.Herencia;

public class Persona {
    //Declarar atributos
    String nombre;
    String apellido;
    String pais;

    //Constructures
    public Persona() {
    }

    public Persona(String pais, String nombre, String apellido) {
        this.pais = pais;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
