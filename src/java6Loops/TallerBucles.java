package java6Loops;

import java.util.Scanner;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class TallerBucles {
    // Punto 1
    public static void registradora (){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int cuenta = 0;

        do {
            System.out.println("Menú:");
            System.out.println("1 Hamburguesa 🍔 $50");
            System.out.println("2 Papas 🍟 $30");
            System.out.println("3 Refresco 🥤 $20");
            System.out.println("4 Salir");
            System.out.println("Elije tu comida de hoy!");
            opcion = scanner.nextInt();
            scanner.nextLine(); // pone el cuadro de respuesta en la misma linea

            switch (opcion){
                case 1:
                    System.out.println("Haz pedido una Hamburguesa.");
                    cuenta += 50;
                    System.out.println("Tu cuenta es: $" +cuenta);
                    break;
                case 2:
                    System.out.println("Haz pedido unas papas.");
                    cuenta += 30;
                    System.out.println("Tu cuenta es: $" +cuenta);
                    break;
                case 3:
                    System.out.println("Haz pedido un refresco.");
                    cuenta += 20;
                    System.out.println("Tu cuenta es: $" +cuenta);
                    break;
                case 4:
                    System.out.println("gracias por venir, tu total es: $" + cuenta);
                    System.out.println("Con que billete pagaras hoy?: ");
                    int pago = scanner.nextInt();
                    int cambio = pago - cuenta;
                    System.out.println("Tu cambio es de: $" + cambio);
                    break;
                default:
                    System.out.println("Opción NO valida");
            }
        } while (opcion != 4);
        scanner.close();

    }

    // Punto 2
    public static void descuento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // pone el cuadro de respuesta en la misma linea
        double descuento = 0.90;
        double nuevoPrecio;

        for (int contador = 0; contador <= 4; contador++){
            nuevoPrecio = precio * descuento;
            System.out.printf("El precio con descuento: %.2f\n", nuevoPrecio);  // %.2f limita a 2 decimales
            descuento -= 0.10;
        }
        scanner.close();
    }

    // Punto 3
    public static void tablas (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("De que numero quieres ver la tabla (Solo del 1 al 10)🤓: ");
        int num = scanner.nextInt();
        scanner.nextLine(); // pone el cuadro de respuesta en la misma linea
        int i = 1;

        while (i <= 10){
            if (num <= 10 && num > 0){
                System.out.println("🧮"+num+"x"+i+"="+(num*i));
                i++;
            }else{
                System.out.println("el número no es válido ⚠");
                break;
            }
        }
        scanner.close();
    }

    // Punto 4
    public static void cajero (){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1 Consultar Saldo");
            System.out.println("2 Retirar");
            System.out.println("3 Depositar");
            System.out.println("4 Salir");
            System.out.println("En que tramite necesitas ayuda hoy.");
            opcion = scanner.nextInt();
            scanner.nextLine(); // pone el cuadro de respuesta en la misma linea

            switch (opcion){
                case 1:
                    System.out.println("Tu saldo es $500.000 🤑");
                    break;
                case 2:
                    System.out.println("Hoy los cajeros de estan cerrados ❌");
                    break;
                case 3:
                    System.out.println("Ve al corresponsal de la esquina ✔");
                    break;
                case 4:
                    System.out.println("gracias por consultarnos hoy ❤");
                    break;
                default:
                    System.out.println("Opción NO valida ⚠");
            }
        } while (opcion != 4);
        scanner.close();
    }

    // Punto 5
    public static void generador (){
        Random random = new Random();
        int longitud = 12;
        String contrasena = "";

        //  Definimos los caracteres permitidos
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";

        // Creamos la contraseña aleatoria
        for (int i = 0; i < longitud; i++) {
            int posicion = random.nextInt(caracteres.length());
            contrasena += caracteres.charAt(posicion);
        }

        // Validamos si la contraseña cumple con los requisitos
        if (validarContrasena(contrasena)) {
            System.out.println("Tu contraseña aleatoria es: " + contrasena + " (Cumple con los requisitos)");
        } else {
            System.out.println("La contraseña generada (" + contrasena + ") no cumple con los requisitos. Intenta generar otra.");
            // hasta que cumpla los requisitos
        }
    }

    public static boolean validarContrasena(String contrasena) {
        // Expresiones regulares para verificar cada tipo de carácter
        Pattern mayuscula = Pattern.compile("[A-Z]");
        Pattern minuscula = Pattern.compile("[a-z]");
        Pattern numero = Pattern.compile("[0-9]");
        Pattern especial = Pattern.compile("[!@#$%&*]");

        Matcher tieneMayuscula = mayuscula.matcher(contrasena);
        Matcher tieneMinuscula = minuscula.matcher(contrasena);
        Matcher tieneNumero = numero.matcher(contrasena);
        Matcher tieneEspecial = especial.matcher(contrasena);

        // Devuelve true si todos los patrones se encuentran en la contraseña
        return tieneMayuscula.find() && tieneMinuscula.find() && tieneNumero.find() && tieneEspecial.find();
    }

    public static void main(String[] args) {
        generador();
    }

    // punto 6
    public static void asistencia() {
        Scanner scanner = new Scanner(System.in);
        List<String> listaAsistencia = new ArrayList<>();

        // vamos a preguntas el # de estudientes
        System.out.print("Dime cuantos estudientes son en tu clase?: ");
        int estudiantes = scanner.nextInt();
        scanner.nextLine(); // pone el cuadro de respuesta en la misma linea

        //for que da inicio por el # de estudientes
        for (int i = 1; i <= estudiantes; i++) {
            System.out.print("Ingresa el nombre del estudiante #" + i + ": ");
            String nombre = scanner.nextLine();

            System.out.print("¿Está presente o ausente el estudiante " + nombre + " (✔/❌)?: ");
            String estado = scanner.nextLine();

            listaAsistencia.add("Estudiante #" + i + " " + nombre + " " + estado);
        }

        // print la lista de asistencia
        System.out.println("\n--- Lista de asistencia del día de hoy 💙 ---");
        for (String registro : listaAsistencia) {
            System.out.println(registro);
        }

        scanner.close();
    }

    // punto 7
        public static void promedioNotas() {
        Scanner scanner = new Scanner(System.in);
        // Pide el # de notas que se desea promediar
        System.out.print("¿Cuantas NOTAS deseas promediar?: ");
        int notas = scanner.nextInt();
        //otras var
        int total = 0; // var de control para las notas
        double promedio = 0.0; // var promedio

        // if para pedir las notas 1x1
        if (notas < 2) {
            System.out.print("Entrada inválida.");
        } else {
            for (int i = 1; i <= notas; i ++) {
                // pedir la nota 1x1
                System.out.println("Nota #" + i);
                total += scanner.nextInt();
                promedio = (double) total / notas;
            }
            if (promedio >= 8) { // si tengo un promedio le pongo la calificación
                System.out.println("Excelente! ✔");
            } else if (promedio >= 6 && promedio < 8) {
                System.out.println("Aprobado 👍");
            } else {
                System.out.println("Reprobado ❌");
            }
        }
        scanner.close();
    }
}