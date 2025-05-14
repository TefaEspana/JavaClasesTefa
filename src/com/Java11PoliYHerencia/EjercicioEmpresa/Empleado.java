package com.Java11PoliYHerencia.EjercicioEmpresa;

public class Empleado {
    private String nombre;
    private int codigo;
    private String tipo;

    //Contructores
    public Empleado() {
    }

    public Empleado(String nombre, int codigo, String tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
    }

    //Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String mostrarDatos(){
        return "\nNombre: "+nombre+"\nCodigo: "+codigo+"\nTipo: "+tipo;
    }
    public double calcularSalario() {
        return 0.0;
    }
}
