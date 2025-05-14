package com.Java11PoliYHerencia.Herencia;

public class Trabajador extends Persona{//me dice quemi papa es Persona extends Persona
    int codigoTrabajador;
    String cargo;

    //Constructores con Herencia-Persona
    public Trabajador() {//vacio en Persona y en Trabajador
    }

    public Trabajador(String pais, String nombre, String apellido, int codigoTrabajador, String cargo) {
        super(pais, nombre, apellido);
        this.codigoTrabajador = codigoTrabajador;
        this.cargo = cargo;
    }

    // Getter Setter
    public int getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(int codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Metodo
    public void mostrarDatos(){
        System.out.println(getNombre()+", "+getCargo());
    }
}
