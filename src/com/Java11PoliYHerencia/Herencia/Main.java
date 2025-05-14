package com.Java11PoliYHerencia.Herencia;

public class Main {
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador("Jhon","Restrepo","Colombia",1234,"Desarrollado");
        trabajador.mostrarDatos();
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getCargo());

        Persona persona = new Persona("Ana","Alvarado","Colombia");
        System.out.println(persona.nombre);

        Externo externo = new Externo("Moni","Calvo","Colombia","Gen",9999);
        externo.mostraDatos();
        System.out.println(externo.getNombre());
        System.out.println(externo.getEmpresaAsociada());


    }
}
