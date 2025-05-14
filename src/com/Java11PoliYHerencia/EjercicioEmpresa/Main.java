package com.Java11PoliYHerencia.EjercicioEmpresa;

public class Main {
    public static void main(String[] args) {
        EmpleadoSueldoFijo empleadoSueldoFijo = new EmpleadoSueldoFijo("Tefa",1,"Fijo",800,2);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Tati",2,"Horas",48,20.5);

        System.out.println("--- Empleado a Sueldo Fijo ---");
        System.out.println("Información: " + empleadoSueldoFijo.mostrarDatos());
        System.out.println("Salario: $" + empleadoSueldoFijo.calcularSalario());

        System.out.println("\n--- Empleado por Horas ---");
        System.out.println("Información: " + empleadoPorHoras.mostrarDatos());
        System.out.println("Salario: $" + empleadoPorHoras.calcularSalario());
    }
}
