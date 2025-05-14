package com.Java11PoliYHerencia.EjeVehiculo;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota","Rojo",2023,4);
        Motocicleta moto = new Motocicleta("Honda","Azul",2020,"Deportiva");

        System.out.println("--- Información del Coche ---");
        coche.mostrarInformacion();
        System.out.println("\n--- Información de la Moto ---");
        moto.mostrarInformacion();
    }
}
