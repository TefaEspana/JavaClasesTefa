package java7Funciones;

import java.util.Scanner;
import static java7Funciones.Calculadora.*;

public class TallerJava7Metodos {
//punto#1
    public static double convMetros(double a) {
        return a * 100;
    }

    public static double convLibras(double a) {
        return a * 2.2;
    }

    public static double convCelsius(double a) {
        return (a * 1.8) + 32;
    }

    public static void resultado(double valor) {
        System.out.println("Metros a CM: " + convMetros(valor));
        System.out.println("Kilos a Libras: " + convLibras(valor));
        System.out.println("Celsius a Fahrenheit: " + convCelsius(valor));
    }


//punto#2

    public static double promedio(double nota1, double nota2, double nota3) {
        int notas = 3; // La cantidad de notas
        return (nota1 + nota2 + nota3) / notas;
    }
//punto #3
    // Operaciones matemáticas
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("¡Error! No se puede dividir por cero.");
            return Double.NaN; // NaN (Not a Number) para indicar un error
        }
        return a / b;
    }

    public static double pote(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}