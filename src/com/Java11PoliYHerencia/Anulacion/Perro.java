package com.Java11PoliYHerencia.Anulacion;

public class Perro extends Animal{//anulo el otro metodo @Override
    @Override
    public void comer() {
        //super.comer(); //si dejo este salen los dos textos
        System.out.println("Soy un perro y como pepitas.");
    }
}
