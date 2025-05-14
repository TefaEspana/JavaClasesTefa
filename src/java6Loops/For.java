package java6Loops;

import java.util.Scanner;
import java.util.Random;

public class For {
    public static void ejercicio1For (){

        for (int contador = 10; contador >0; contador --){
            System.out.println("Esta en el For #: "+contador);
        }

        System.out.println("---------------------------------");

        for (int contador = 1; contador <11; contador ++){
            System.out.println("Esta en el segundo For #: "+contador);
        }
    }

    public static void ejercicio2For () {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0){
                System.out.println(i + "Es par");
            }else {
                System.out.println(i + "Es impar");
            }

        }
    }

    //No lo hice yo solo queria ver como era
    public static void juegoPPT (){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Opciones para el juego
        String[] opciones = {"piedra", "papel", "tijeras"};

        // Marcadores
        int puntajeJugador = 0;
        int puntajeComputadora = 0;

        // Puntos necesarios para ganar
        int puntosParaGanar = 3;

        // Bucle para jugar hasta que alguien alcance los puntos para ganar
        while (puntajeJugador < puntosParaGanar && puntajeComputadora < puntosParaGanar) {
            System.out.println("\nElige tu jugada:");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijeras");
            System.out.println("4. Salir");
            System.out.print("Ingresa tu opción (1-4): ");

            int opcionJugadorNumero = scanner.nextInt();

            if (opcionJugadorNumero == 4) {
                break; // Salir del juego
            }

            if (opcionJugadorNumero < 1 || opcionJugadorNumero > 3) {
                System.out.println("Opción no válida. Intenta de nuevo.");
                continue; // Volver al inicio del bucle
            }

            String jugadaJugador = opciones[opcionJugadorNumero - 1];

            // Generar la jugada de la computadora de forma aleatoria
            int opcionComputadoraNumero = random.nextInt(opciones.length);
            String jugadaComputadora = opciones[opcionComputadoraNumero];

            System.out.println("Tu elegiste: " + jugadaJugador);
            System.out.println("La computadora eligió: " + jugadaComputadora);

            // Determinar el ganador de la ronda
            if (jugadaJugador.equals(jugadaComputadora)) {
                System.out.println("¡Empate!");
            } else if ((jugadaJugador.equals("piedra") && jugadaComputadora.equals("tijeras")) ||
                    (jugadaJugador.equals("papel") && jugadaComputadora.equals("piedra")) ||
                    (jugadaJugador.equals("tijeras") && jugadaComputadora.equals("papel"))) {
                System.out.println("¡Ganaste esta ronda!");
                puntajeJugador++;
            } else {
                System.out.println("¡La computadora ganó esta ronda!");
                puntajeComputadora++;
            }

            System.out.println("Puntaje: Jugador " + puntajeJugador + " - Computadora " + puntajeComputadora);
        }

        // Mostrar el resultado final
        System.out.println("\n--- Resultado Final ---");
        System.out.println("Tu puntaje final: " + puntajeJugador);
        System.out.println("Puntaje final de la computadora: " + puntajeComputadora);

        if (puntajeJugador == puntosParaGanar) {
            System.out.println("¡Felicidades! ¡Ganaste el juego al alcanzar " + puntosParaGanar + " puntos!");
        } else if (puntajeComputadora == puntosParaGanar) {
            System.out.println("¡La computadora ganó el juego al alcanzar " + puntosParaGanar + " puntos!");
        } else {
            System.out.println("El juego terminó antes de alcanzar los " + puntosParaGanar + " puntos.");
        }

        scanner.close();
    }
}