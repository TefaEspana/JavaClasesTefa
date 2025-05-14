package com.Veterinaria.Recepcion;

import com.Veterinaria.Animales.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
//        //crear una instancia de Perro
//        Perro primerPerro = new Perro("Lucy","Criolla",5,15,"Vacunas al dia");
//
//        System.out.println(primerPerro.nombre);
//        System.out.println(primerPerro.getRaza());
//        System.out.println("-------------------------");
//        primerPerro.mostrarFichaRegistro();

        //Ejercicio
        Scanner scanner = new Scanner(System.in);
        ArrayList<Perro> listaPacientes = new ArrayList<>();
        boolean bandera = true;
        int opcion;

        do {
            System.out.println("Registro de Perros");
            System.out.println("1. Registrar un nuevo perro \n2. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consume la nueva línea pendiente después de nextInt()

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del perro: ");
                    String nombrePerro = scanner.nextLine();
                    System.out.println("Ingrese la raza del perro: ");
                    String razaPerro = scanner.nextLine();
                    System.out.println("Ingrese la edad del perro: ");
                    String edadPerroStr = scanner.nextLine();
                    int edadPerro = Integer.parseInt(edadPerroStr);
                    System.out.println("Ingrese el peso del perro: ");
                    String pesoPerroStr = scanner.nextLine();
                    double pesoPerro = Double.parseDouble(pesoPerroStr);
                    System.out.println("Ingrese el historial medico del perro: ");
                    String historialPerro = scanner.nextLine();

                    Perro perroBase = new Perro();

                    perroBase.setNombre(nombrePerro);
                    perroBase.setRaza(razaPerro);
                    perroBase.setEdad(edadPerro);
                    perroBase.setPeso(pesoPerro);
                    perroBase.setHistoriarMedico(historialPerro);

                    listaPacientes.add(perroBase);
                    System.out.println("Registro exitoso:");
                    perroBase.mostrarFichaRegistro();
                    break;
                case 2:
                    bandera = false;
                    System.out.println("Esta saliendo del registro...\n");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (bandera);

        int contador = 1;

        for (Perro perro : listaPacientes){
            System.out.println("Registro del paciente " + contador);
            perro.mostrarFichaRegistro();
            System.out.println("\n");
            contador++;
        }
    }
}
