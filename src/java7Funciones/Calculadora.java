package java7Funciones;

public class Calculadora {
    private static Math math;

    public static int suma(int a, int b){
        return a+b;
    }
    public static int resta(int a, int b){
        return a-b;
    }
    public static int multi(int a, int b){
        return a*b;
    }
    public static double div(int a, int b){
        if (b==0){
            System.out.println("No se puede /0");
            return 0;
        }
        return (double) a/b;
    }
    public static double pote(double a, double b){

        if (b==0){
            System.out.println("No se puede potenciar por 0");
            return 0;
        }
        return (double) math.pow (a,b);
    }
}
