package com.Java11PoliYHerencia.Polimorfismo;

public class Main {
    public static void main(String[] args) {
//        Vehiculo[] misCarros = new Vehiculo[3];
//
//        misCarros[0]=new Vehiculo("Chevrolet","abc123",2020);
//        misCarros[1]=new VehiculoCarga("Renult","BCD234",2023,1000);
//        misCarros[2]=new VehiculoDeportivo("Toyota","ACB213",2025,500);
//
//        for (Vehiculo vehiculo : misCarros){
//            System.out.println(vehiculo.mostarDatos());
//            System.out.println(" ");
//        }

       Vehiculo misCarros1=new Vehiculo("Chevrolet","abc123",2020);
       Vehiculo  misCarros2=new VehiculoCarga("Renult","BCD234",2023,1000);
       Vehiculo misCarros3=new VehiculoDeportivo("Toyota","ACB213",2025,500);

        System.out.println(misCarros1.mostarDatos());
        System.out.println(misCarros2.mostarDatos());
        System.out.println(misCarros3.mostarDatos());


    }
}
