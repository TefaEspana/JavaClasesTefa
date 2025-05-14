package com.Java11PoliYHerencia.EjercicioEmpresa;

public class EmpleadoPorHoras extends Empleado{
    private double horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras() {
        super();
        this.setTipo("Por Horas");
    }

    public EmpleadoPorHoras(String nombre, int codigo, String tipo, double horasTrabajadas, double valorHora) {
        super(nombre, codigo,"Por Horas");
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }
}
