package Java9POOFundamentos;

public class Main {
    public static void main(String[] args){
//        // ESTO ES DEL TALLER
//        //Ejercicio #1 Clase CuentaBancaria
//        //Crea una cuenta con el constructor vacío y usa setters para asignar datos
//        CuentaBancaria cuenta1 = new CuentaBancaria();
//        cuenta1.mostrarDatos();
//        cuenta1.setNombreTitular("Mauricio Prieto");
//        cuenta1.setNumeroCuenta("25021991");
//        cuenta1.setTipoCuenta("Corriente");
//        cuenta1.mostrarDatos();
//        //Crea otra cuenta con el constructor parametrizado.
//        CuentaBancaria cuenta2 =new CuentaBancaria("Estefania España","18051995",20,"Ahorros");
//        //Realiza depósitos y retiros (incluyendo casos inválidos como montos negativos)
//        System.out.println("--cuenta #1 deposito 1000--");
//        cuenta1.depositar(1000);
//        System.out.println("--cuenta #1 deposito -15--");
//        cuenta1.depositar(-15);
//        System.out.println("--cuenta #1 retiro 100--");
//        cuenta1.retirar(100);
//        System.out.println("--cuenta #1 retiro -10--");
//        cuenta1.retirar(-10);
//        System.out.println("--cuenta #1 retiro 1000--");
//        cuenta1.retirar(1000);
//        //Muestra los datos finales de ambas cuentas
//        cuenta1.mostrarDatos();
//        System.out.println("------------------------------------------");
//        cuenta2.mostrarDatos();
//        System.out.println("------------------------------------------");
//        //Ejercicio #2 Clase Libro
//        //Crea un libro con el constructor parametrizado
//        Libro libro1 = new Libro("La Biblia","Iglesia",2013);
//        libro1.mostrarDetalles();
//        System.out.println("------------------------------------------");
//        libro1.prestar();
//        System.out.println("------------------------------------------");
//        libro1.prestar();
//        System.out.println("------------------------------------------");
//        libro1.devolver();
//        System.out.println("------------------------------------------");
//        libro1.prestar();
//        System.out.println("------------------------------------------");
//        libro1.mostrarDetalles();
//        System.out.println("------------------------------------------");
        //Ejercicio #3 Clase Auto
        //Crea un coche con el constructor vacío y usa setters para asignar datos
        Auto carro1 = new Auto();
        System.out.println("------------------------------------------");
        carro1.mostrarInformacion();
        carro1.setMarca("Toyota");
        carro1.setModelo("Nuevo");
        carro1.setAnio(2025);
        System.out.println("El carro tiene "+carro1.kilometraje+" Km");
        System.out.println("------------------------------------------");
        carro1.mostrarInformacion();
        System.out.println("------------------------------------------");
        //Actualiza el kilometraje del primer coche (con valores válidos e inválidos).
        carro1.actualizarKilometraje(100);
        System.out.println("------------------------------------------");
        carro1.actualizarKilometraje(0);
        System.out.println("------------------------------------------");
        carro1.mostrarInformacion();

        //Ejercicio #4 Clase


//        //DE LA CLASE (Con la profe Ana
//
//        //clase estudiente
//        Estudiante estudiente1 =new Estudiante();
//        Estudiante estudiente2 =new Estudiante("Tefa","España",1234);
//
//        // no deberia darme aceso a los atributos, se deberia usar get y set
//        //System.out.println(estudiente2.nombre);
//
//        //usar GETTER obtener  & SETTER cambio o modifico
//
//        System.out.println("el nombre de estu2 es: "+estudiente2.getNombre());
//        System.out.println("el apellido de estu2 es: "+estudiente2.getApellido());
//
//        System.out.println("----------------");
//
//        //set modificar estu1
//        estudiente1.setNombre("Pedro");
//        estudiente1.setApellido("Picapiedras");
//        estudiente1.setCodigo(5678);
//
//        System.out.println("el nombre de estu1 es: "+estudiente1.getNombre());
//        System.out.println("el apellido de estu1 es: "+estudiente1.getApellido());
//
//        System.out.println("----------------");
//        System.out.println("el codigo #1 del estu2 es:"+estudiente2.getCodigo());
//        estudiente2.setCodigo(6789);
//        System.out.println("el codigo #2 del estu2 es:"+estudiente2.getCodigo());
//
//        System.out.println("----------------");
//        estudiente1.datosCompletos();
//        estudiente2.datosCompletos();
//
//        System.out.println("----------------");
//
//        //CLASE PERSONA
//        Persona amiga = new Persona("Tefa","España",29);
//        amiga.nombreCompleto();
//        amiga.saludar();
//
//        System.out.println("------------");
//
//        Persona amiga1 = new Persona("Tati","Casas",29);
//        amiga1.nombreCompleto();
//        amiga1.saludar();
//
//        System.out.println("--------------------");
//
//        Persona persona =new Persona();
//        persona.nombre ="Mapu";
//        persona.apellido="Morales";
//        persona.edad=20;
//        persona.nombreCompleto();
//        persona.saludar();
//        System.out.println("--------------------");
//
//        //CLASE AUTO
//        // Usamos el constructos vacío
//        Auto auto1 = new Auto();
//        System.out.println(auto1.marca);
//        // lo puedo llenar
//
//        System.out.println("------------------------");
//
//        // usamos el constructos llenito (con parametros)
//        Auto autoConParametro = new Auto("Rojo","Toyota",2023);
//        // me dice como lo debo llenar
//        System.out.println("Info auto con parametros: "+autoConParametro.modelo);
//        autoConParametro.mostrarDatos();
//
//        System.out.println("------------------------");
//
////        //creo un objeto  (Auto clase auto nombre del objeto)
////        Auto auto = new Auto();
////        //Asignamos valores (acsedemos al objeto var auto.)
////        auto.color = "Rojo";
////        auto.modelo = 2025;
////        auto.marca ="Tesla";
////
////        System.out.println(auto.marca);
////        System.out.println("Tu carro nuevo es: un "+ auto.marca+" color: "+ auto.color+" y es del año: "+auto.modelo);
////        System.out.println("--------------------------------");
////
////        Auto auto2 = new Auto();
////        //Asignamos valores (acsedemos al objeto var auto.)
////        auto2.color = "Gris";
////        auto2.modelo = 2020;
////        auto2.marca ="Toyota";
////
////        System.out.println(auto2.marca);
////        System.out.println("Tu carro nuevo es: un "+ auto2.marca+" color: "+ auto2.color+" y es del año: "+auto2.modelo);
////        System.out.println("--------------------------------");
////
////        // Usar medotos
////        auto.mostrarDatos();
////        auto.arrancar();
////
////        auto2.mostrarDatos();
////        auto2.arrancar();
    }
}
