package com.Java11PoliYHerencia.EjercicioEmpresa;

public class EmpleadoSueldoFijo extends Empleado{
    private double sueldoBase;
    private int numeroMeses;

    public EmpleadoSueldoFijo() {
        super();
        this.setTipo("Sueldo Fijo");
    }

    public EmpleadoSueldoFijo(String nombre, int codigo, String tipo, double sueldoBase, int numeroMeses) {
        super(nombre, codigo,"Sueldo Fijo" );
        this.sueldoBase = sueldoBase;
        this.numeroMeses = numeroMeses;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getNumeroMeses() {
        return numeroMeses;
    }

    public void setNumeroMeses(int numeroMeses) {
        this.numeroMeses = numeroMeses;
    }

    @Override
    public double calcularSalario() {
        return sueldoBase * numeroMeses;
    }
}
