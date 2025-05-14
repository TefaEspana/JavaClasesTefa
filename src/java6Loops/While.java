package java6Loops;

import java.util.Scanner;

public class While {
    public static void ejercicio1While (){
        //controlado por contador
        int contador = 0;
        while (contador < 10){
            System.out.println("Esta en la vualta (el conador): " + contador);
            contador ++;
        }
        System.out.println("Así que la variable al final del while dentro del metodo "+ contador);
    }

    public static void ejercicio2While (){
        boolean bandera = true;
            Scanner scanner = new Scanner(System.in);
            String decision;
        while (bandera){
            System.out.println("¿Desea pasar el curso(si/no)?: ");
            decision = scanner.nextLine();

            if (decision.equalsIgnoreCase("si")){
                System.out.println("ESOO!");
                bandera = false;
            } else {
                System.out.println("Pero siga intentando");
                break;
            }
        }
        System.out.println("Genial");
    }

    public static void ejercicio3While (){
        boolean bandera = true;
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        while (bandera){
            System.out.println("ingresa un numero para sumar:");
            int numero = scanner.nextInt();

            suma += numero;

            if (numero == 0){
                bandera = false;
            }

        }
        System.out.println("la suma es: " +suma);
    }
}
