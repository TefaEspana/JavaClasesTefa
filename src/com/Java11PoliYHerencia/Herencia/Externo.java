package com.Java11PoliYHerencia.Herencia;

public class Externo extends Persona{ // mi padre es Persona extends
    String empresaAsociada;           // se puede con Trabajador como papa y Persona como abuelo (pero noes buena prctica si se rompe Persona,maximo 2)
    int rut;

    //Constructores
    public Externo() {
    }

    public Externo(String pais, String nombre, String apellido, String empresaAsociada, int rut) {
        super(pais, nombre, apellido);
        this.empresaAsociada = empresaAsociada;
        this.rut = rut;
    }

    //Getter y Setter

    public String getEmpresaAsociada() {
        return empresaAsociada;
    }

    public void setEmpresaAsociada(String empresaAsociada) {
        this.empresaAsociada = empresaAsociada;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    //metodo
    public void mostraDatos(){
        System.out.println("Nombre "+getNombre()+" Rut: "+getRut());
    }
}
