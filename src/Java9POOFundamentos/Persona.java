package Java9POOFundamentos;

public class Persona {
    //#1 creo los atributos (caracteristicas
    String nombre;
    String apellido;
    int edad;

    //#2 Constructores:


    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }

    //#3 metodo nombre + apellido
    public void nombreCompleto(){
        System.out.println("__El nombre completo es:__");
        System.out.println(nombre+" "+apellido);
    }
    //#4 saludar a la persona
    public void saludar(){
        System.out.println("Hola, "+nombre+" Como estas hoy?");
    }
}
