package com.Java11PoliYHerencia.SobreCarga;

import java.util.logging.SocketHandler;

public class EjercicioSobreCarga {
    //Overload del metodo

    public int suma (int a, int b){
        return a+b;
    }
    public int suma (int a, int b, int c){//Sobrecarga por parametros
        return a+b+c;
    }
    public double suma (double a, double b){//sobre carga de tipo de parametro
        return a + b ;
    }
    public String suma (String a, String b){//sobre carga de tipo de parametro
        return a + b ;
    }

    public static void main(String[] args) {
        EjercicioSobreCarga opcion = new EjercicioSobreCarga();

        System.out.println("con 2: "+ opcion.suma(4,5));
        System.out.println("con 3: "+ opcion.suma(4,5,5));
        System.out.println("con doble: "+ opcion.suma(4.1,5.1));
        System.out.println("con string: "+ opcion.suma("4","5"));
    }
}
