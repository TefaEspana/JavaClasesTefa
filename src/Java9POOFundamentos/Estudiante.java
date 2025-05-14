package Java9POOFundamentos;

public class Estudiante {
    //#1 crear atributos
    //se ponen private para que no puedan modificarlo tan facil
    private String nombre;
    private String apellido;
    private int codigo;

    //#2 crear constructores

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    //crear GETTER obtener  & SETTER cambio o modifico
    //click derecho Generate-->Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //------------------------------------------
    // metodo diga su nombre
    public void decirNombre(){
        System.out.println("mi nombre es: "+nombre);

    }

    public void datosCompletos(){
        System.out.println("Datos del estudientes");
        System.out.println("Nombre: " +nombre);
        System.out.println("Apellido: " +apellido);
        System.out.println("Codigo: " +codigo);
    }
}
