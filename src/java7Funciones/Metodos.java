package java7Funciones;

public class Metodos {
    public static void saludarSinArgu(){
        System.out.println("hola, sin argumentos");
    }
    public static void saludar(String nombre){
        System.out.println("hola, "+ nombre);
    }
    public static void saludarConEdad(String nombre,int edad){
        System.out.println("hola, "+ nombre+ " tienes: "+edad);
    }


// METODOS CON RETURN

    public static String generarSaludo (String nombre){
            return "Hola " +nombre;

    }

    public static void calcularTotal(double precio, int cantidad){
        double total = precio * cantidad;
        System.out.println("El total de su compra es: $"+total);
    }

    public static double calcularTotalR(double precio, int cantidad){
        return precio*cantidad;
    }

    public static double aplicandoDescuento(double total, double porcentaje){
        return total-(total*porcentaje/100);
    }
}
