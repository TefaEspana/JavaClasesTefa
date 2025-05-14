package java7Funciones;

import java.util.Scanner;
import static java7Funciones.Metodos.aplicandoDescuento;
import static java7Funciones.Metodos.calcularTotalR;
import static java7Funciones.TallerJava7Metodos.promedio;
import static java7Funciones.TallerJava7Metodos.*; // Importa todos los métodos estáticos de TallerJava7Metodos

public class Main {
    public static void main(String[] args){

        //Metodos.saludarSinArgu();
        //Metodos.saludar("Ana");
        //Metodos.saludar("Tefa");
        //Metodos.saludarConEdad("Ana", 30);
        //Metodos.saludarConEdad("Tefa", 29);

//// comparacion entre void y return
//        // Void
//        Metodos.calcularTotal(100,3);
//        //return
//        double total = calcularTotalR(100,3);
//
//        double totlaDescuento = aplicandoDescuento(total,10);
//
//        System.out.println("Total sin descuento: $"+total);
//        System.out.println("Total con descuento: $"+totlaDescuento);

////Caculadora
//        //int a=10;int b=3;
//
//        int suma = suma(10,2);
//        int resta = resta(10,2);
//        int multi = multi(10,2);
//        int div = (int) div(10,2);
//
//        System.out.println("La suma es: "+suma);
//        System.out.println("La resta es: "+resta);
//        System.out.println("La multiplicacion es: "+multi);
//        System.out.println("La division es: "+div);


////Taller Metodos
//    //print punto #1
//        Scanner scanner = new Scanner(System.in);
//        //pregunto al usuario
//        System.out.println("Ingrese el valor que desea convertir:");
//        double valor = scanner.nextDouble(); // declaro la var valor
//
//        TallerJava7Metodos.resultado(valor); //llamo el metodo
//
//        scanner.close(); // ¡Importante cerrar el Scanner!
//
//     //print punto #2
//        Scanner scanner = new Scanner(System.in);
//        double nota1, nota2, nota3;
//        double promedio;
//
//        System.out.println("Ingrese las 3 notas:");
//        System.out.print("Nota 1: ");
//        nota1 = scanner.nextDouble();
//        System.out.print("Nota 2: ");
//        nota2 = scanner.nextDouble();
//        System.out.print("Nota 3: ");
//        nota3 = scanner.nextDouble();
//
//        promedio(nota1,nota2,nota3);
//
//        System.out.println("El promedio es: " + promedio(nota1,nota2,nota3));
//        if (promedio(nota1,nota2,nota3) >= 60) {
//            System.out.println("Aprobado 👍");
//        } else {
//            System.out.println("Reprobado ❌");
//        }
//        scanner.close();

//punto #3
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de la Calculadora ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();
                double resultado;

                switch (opcion) {
                    case 1:
                        resultado = suma((int) num1, (int) num2);
                        System.out.println("La suma es: " + resultado);
                        break;
                    case 2:
                        resultado = resta((int) num1, (int) num2);
                        System.out.println("La resta es: " + resultado);
                        break;
                    case 3:
                        resultado = multi((int) num1, (int) num2);
                        System.out.println("La multiplicación es: " + resultado);
                        break;
                    case 4:
                        resultado = div(num1, num2);
                        if (!Double.isNaN(resultado)) {
                            System.out.println("La división es: " + resultado);
                        }
                        break;
                    case 5:
                        resultado = pote(num1, num2);
                        System.out.println("La potencia es: " + resultado);
                        break;
                }
            } else if (opcion == 6) {
                System.out.println("¡Gracias por usar la calculadora!");
            } else {
                System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 6);
        scanner.close();
    }
}
