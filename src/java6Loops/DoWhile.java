package java6Loops;

import java.util.Scanner;

public class DoWhile {
    //hacer mientras
    public static void ejercicio1DoWhile (){
        int num = 1; // que pasa si pongo un 11 (no hace el while)
        do {
            System.out.println(num);
            num ++;
        } while (num <= 10);
    }

    public static void ejercicio2DoWhile (){
        Scanner scanner = new Scanner(System.in);
        int opcion;


        do {
            System.out.println("Menú:");
            System.out.println("1 Pizza");
            System.out.println("2 Hamburguesa");
            System.out.println("3 Perro");
            System.out.println("5 Salir");
                opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(" Tu pizza va en camino");
                    break;
                case 2:
                    System.out.println(" Tu Hamburguesa va en camino");
                    break;
                case 3:
                    System.out.println(" Tu perro va en camino");
                    break;
                case 4:
                    System.out.println(" gracias por venir");
                    break;
                default:
                    System.out.println("Opción NO valida");
            }
        } while (opcion!=4);
        scanner.close();
    }
}
