package com.Java11PoliYHerencia.Anulacion;

public class Main {//va cambiar en comportamiento del metodo
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.comer();

        Perro perro = new Perro();
        perro.comer();

        Loro loro = new Loro();
        loro.comer();

    }
}
